package h1;

import a0.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.emoji2.text.a0;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import kc.r;
import o5.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f13170b;

    /* renamed from: e, reason: collision with root package name */
    public final long f13171e;

    /* renamed from: f, reason: collision with root package name */
    public final File f13172f;

    /* renamed from: j, reason: collision with root package name */
    public final RandomAccessFile f13173j;

    /* renamed from: m, reason: collision with root package name */
    public final FileChannel f13174m;

    /* renamed from: n, reason: collision with root package name */
    public final FileLock f13175n;

    public e(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f13170b = file;
        this.f13172f = file2;
        this.f13171e = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f13173j = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f13174m = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f13175n = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                a(this.f13174m);
                throw e;
            } catch (Error e11) {
                e = e11;
                a(this.f13174m);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                a(this.f13174m);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            a(this.f13173j);
            throw e;
        } catch (Error e14) {
            e = e14;
            a(this.f13173j);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            a(this.f13173j);
            throw e;
        }
    }

    public static void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(h.v("tmp-", str), ".zip", dVar.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i10);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + dVar.getPath());
                if (fileCreateTempFile.renameTo(dVar)) {
                    a(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            a(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            a0 a0VarH = u.h(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = a0VarH.f840b;
            randomAccessFile.seek(a0VarH.f839a);
            byte[] bArr = new byte[16384];
            int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            while (i10 != -1) {
                crc32.update(bArr, 0, i10);
                j10 -= i10;
                if (j10 == 0) {
                    break;
                }
                i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void g(Context context, long j10, long j11, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j10);
        editorEdit.putLong("crc", j11);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            editorEdit.putLong(r.d("dex.crc.", i10), dVar.f13169b);
            editorEdit.putLong("dex.time." + i10, dVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13175n.release();
        this.f13174m.close();
        this.f13173j.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(Context context, boolean z7) throws Throwable {
        ArrayList arrayListF;
        long jLastModified;
        ArrayList arrayListE;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.f13170b;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z7);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (!this.f13175n.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z7) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            long j10 = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if (j10 == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.f13171e) {
                try {
                    arrayListE = e(context);
                } catch (IOException e10) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                    arrayListF = f();
                    jLastModified = file.lastModified();
                    if (jLastModified == -1) {
                        jLastModified--;
                    }
                }
            } else {
                Log.i("MultiDex", z7 ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
                arrayListF = f();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
            }
            g(context, jLastModified, this.f13171e, arrayListF);
            arrayListE = arrayListF;
        }
        Log.i("MultiDex", "load found " + arrayListE.size() + " secondary dex files");
        return arrayListE;
    }

    public final ArrayList e(Context context) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.f13170b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            d dVar = new d(this.f13172f, str + i11 + ".zip");
            if (!dVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
            dVar.f13169b = c(dVar);
            long j10 = sharedPreferences.getLong("dex.crc." + i11, -1L);
            long j11 = sharedPreferences.getLong("dex.time." + i11, -1L);
            long jLastModified = dVar.lastModified();
            if (j11 != jLastModified || j10 != dVar.f13169b) {
                throw new IOException("Invalid extracted dex: " + dVar + " (key \"\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + dVar.f13169b);
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public final ArrayList f() throws Throwable {
        Throwable th;
        boolean z7;
        StringBuilder sb = new StringBuilder();
        File file = this.f13170b;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        c cVar = new c();
        File file2 = this.f13172f;
        File[] fileArrListFiles = file2.listFiles(cVar);
        String str = "MultiDex";
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (file3.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                d dVar = new d(file2, string + i10 + ".zip");
                arrayList.add(dVar);
                Log.i(str, "Extraction is needed for file " + dVar);
                int i11 = 0;
                boolean z10 = false;
                while (i11 < 3 && !z10) {
                    int i12 = i11 + 1;
                    b(zipFile, entry, dVar, string);
                    String str2 = str;
                    try {
                        dVar.f13169b = c(dVar);
                        z7 = true;
                        str = str2;
                    } catch (IOException e10) {
                        try {
                            str = str2;
                            Log.w(str, "Failed to read crc from " + dVar.getAbsolutePath(), e10);
                            z7 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                            th = th;
                            try {
                                zipFile.close();
                                throw th;
                            } catch (IOException e11) {
                                Log.w(str, "Failed to close resource", e11);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                        zipFile.close();
                        throw th;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z7 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(dVar.getAbsolutePath());
                    sb2.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str3 = string;
                    sb2.append(dVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(dVar.f13169b);
                    Log.i(str, sb2.toString());
                    if (!z7) {
                        dVar.delete();
                        if (dVar.exists()) {
                            Log.w(str, "Failed to delete corrupted secondary dex '" + dVar.getPath() + "'");
                        }
                    }
                    string = str3;
                    entry = zipEntry;
                    z10 = z7;
                    i11 = i12;
                }
                String str4 = string;
                if (!z10) {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
                string = str4;
            }
            try {
                zipFile.close();
            } catch (IOException e12) {
                Log.w(str, "Failed to close resource", e12);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}