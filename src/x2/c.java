package x2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;
import m.p0;
import q2.n;
import t1.i0;
import w2.t;
import w2.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements e {
    public static final String[] N = {"_data"};
    public volatile e M;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18899b;

    /* renamed from: e, reason: collision with root package name */
    public final u f18900e;

    /* renamed from: f, reason: collision with root package name */
    public final u f18901f;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f18902j;

    /* renamed from: m, reason: collision with root package name */
    public final int f18903m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18904n;

    /* renamed from: t, reason: collision with root package name */
    public final n f18905t;

    /* renamed from: u, reason: collision with root package name */
    public final Class f18906u;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f18907w;

    public c(Context context, u uVar, u uVar2, Uri uri, int i10, int i11, n nVar, Class cls) {
        this.f18899b = context.getApplicationContext();
        this.f18900e = uVar;
        this.f18901f = uVar2;
        this.f18902j = uri;
        this.f18903m = i10;
        this.f18904n = i11;
        this.f18905t = nVar;
        this.f18906u = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f18906u;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        e eVar = this.M;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return q2.a.f16113b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f18907w = true;
        e eVar = this.M;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(i iVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVarE = e();
            if (eVarE == null) {
                dVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.f18902j));
            } else {
                this.M = eVarE;
                if (this.f18907w) {
                    cancel();
                } else {
                    eVarE.d(iVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.e(e10);
        }
    }

    public final e e() throws Throwable {
        t tVarA;
        boolean zF = i0.f();
        Cursor cursor = null;
        n nVar = this.f18905t;
        int i10 = this.f18904n;
        int i11 = this.f18903m;
        Context context = this.f18899b;
        if (zF) {
            Uri uri = this.f18902j;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, N, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            tVarA = this.f18900e.a(file, i11, i10, nVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int iA = p0.a(context);
            Uri uriC = this.f18902j;
            if (iA == 0) {
                uriC = i0.c(uriC);
            }
            tVarA = this.f18901f.a(uriC, i11, i10, nVar);
        }
        if (tVarA != null) {
            return tVarA.f18589c;
        }
        return null;
    }
}