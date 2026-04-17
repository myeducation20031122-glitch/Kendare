package r2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f16375b;

    /* renamed from: e, reason: collision with root package name */
    public final e f16376e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f16377f;

    public c(Uri uri, e eVar) {
        this.f16375b = uri;
        this.f16376e = eVar;
    }

    public static c e(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.b(context).f2232f.a().f(), dVar, com.bumptech.glide.b.b(context).f2233j, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() throws IOException {
        InputStream inputStream = this.f16377f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return q2.a.f16113b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(i iVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.f16377f = inputStreamF;
            dVar.g(inputStreamF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            dVar.e(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:38), block:B:10:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r6
      0x002c: PHI (r6v7 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v9 android.database.Cursor) binds: [B:23:0x004b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream f() throws Throwable {
        Cursor cursorA;
        ?? r62;
        String string;
        InputStream inputStreamOpenInputStream;
        int iK;
        Uri uri = this.f16375b;
        e eVar = this.f16376e;
        eVar.getClass();
        ?? r52 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = eVar.f16378a.a(uri);
            } catch (Throwable th) {
                th = th;
                r52 = r62;
                if (r52 != 0) {
                    r52.close();
                }
                throw th;
            }
        } catch (SecurityException e10) {
            e = e10;
            cursorA = null;
        } catch (Throwable th2) {
            th = th2;
            if (r52 != 0) {
            }
            throw th;
        }
        if (cursorA != null) {
            try {
            } catch (SecurityException e11) {
                e = e11;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursorA != null) {
                }
                string = null;
                if (TextUtils.isEmpty(string)) {
                }
                if (inputStreamOpenInputStream != null) {
                }
                if (iK != -1) {
                }
            }
            if (cursorA.moveToFirst()) {
                string = cursorA.getString(0);
                cursorA.close();
                if (TextUtils.isEmpty(string)) {
                    inputStreamOpenInputStream = null;
                } else {
                    File file = new File(string);
                    if (file.exists() && 0 < file.length()) {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = eVar.f16380c.openInputStream(uriFromFile);
                        } catch (NullPointerException e12) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e12));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    eVar.getClass();
                    try {
                        try {
                            inputStreamOpenInputStream2 = eVar.f16380c.openInputStream(uri);
                            iK = y.k(eVar.f16379b, inputStreamOpenInputStream2, eVar.f16381d);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                try {
                                    r52.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | NullPointerException e13) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e13);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                inputStreamOpenInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    }
                } else {
                    iK = -1;
                }
                return iK != -1 ? new j(inputStreamOpenInputStream, iK) : inputStreamOpenInputStream;
            }
        }
        if (cursorA != null) {
            cursorA.close();
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
        }
        if (inputStreamOpenInputStream != null) {
        }
        if (iK != -1) {
        }
    }
}