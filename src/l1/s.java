package l1;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.g1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements p1.d {

    /* renamed from: b, reason: collision with root package name */
    public final Context f14523b;

    /* renamed from: e, reason: collision with root package name */
    public final String f14524e;

    /* renamed from: f, reason: collision with root package name */
    public final File f14525f;

    /* renamed from: j, reason: collision with root package name */
    public final int f14526j;

    /* renamed from: m, reason: collision with root package name */
    public final p1.d f14527m;

    /* renamed from: n, reason: collision with root package name */
    public a f14528n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14529t;

    public s(Context context, String str, File file, int i10, p1.d dVar) {
        this.f14523b = context;
        this.f14524e = str;
        this.f14525f = file;
        this.f14526j = i10;
        this.f14527m = dVar;
    }

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        Context context = this.f14523b;
        String str = this.f14524e;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f14525f;
            if (file2 == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(file2).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(channel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[g1.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int i10 = inputStreamNewInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            }
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    public final void b() {
        String databaseName = this.f14527m.getDatabaseName();
        Context context = this.f14523b;
        File databasePath = context.getDatabasePath(databaseName);
        n1.a aVar = new n1.a(databaseName, context.getFilesDir(), this.f14528n == null);
        try {
            aVar.f15256b.lock();
            if (aVar.f15257c) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.f15255a).getChannel();
                    aVar.f15258d = channel;
                    channel.lock();
                } catch (IOException e10) {
                    throw new IllegalStateException("Unable to grab copy lock.", e10);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar.a();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            }
            if (this.f14528n == null) {
                aVar.a();
                return;
            }
            try {
                int iF = com.bumptech.glide.c.f(databasePath);
                int i10 = this.f14526j;
                if (iF == i10) {
                    aVar.a();
                    return;
                }
                if (this.f14528n.a(iF, i10)) {
                    aVar.a();
                    return;
                }
                if (context.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e12) {
                        Log.w("ROOM", "Unable to copy database file.", e12);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.a();
                return;
            } catch (IOException e13) {
                Log.w("ROOM", "Unable to read database version.", e13);
                aVar.a();
                return;
            }
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
        aVar.a();
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f14527m.close();
        this.f14529t = false;
    }

    @Override // p1.d
    public final String getDatabaseName() {
        return this.f14527m.getDatabaseName();
    }

    @Override // p1.d
    public final synchronized p1.a i() {
        try {
            if (!this.f14529t) {
                b();
                this.f14529t = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14527m.i();
    }

    @Override // p1.d
    public final void setWriteAheadLoggingEnabled(boolean z7) {
        this.f14527m.setWriteAheadLoggingEnabled(z7);
    }
}