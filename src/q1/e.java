package q1;

import android.content.Context;
import android.os.Build;
import java.io.File;
import m.c0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements p1.d {

    /* renamed from: b, reason: collision with root package name */
    public final Context f16104b;

    /* renamed from: e, reason: collision with root package name */
    public final String f16105e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f16106f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16107j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16108m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public d f16109n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16110t;

    public e(Context context, String str, c0 c0Var, boolean z7) {
        this.f16104b = context;
        this.f16105e = str;
        this.f16106f = c0Var;
        this.f16107j = z7;
    }

    public final d a() {
        d dVar;
        synchronized (this.f16108m) {
            try {
                if (this.f16109n == null) {
                    b[] bVarArr = new b[1];
                    if (Build.VERSION.SDK_INT < 23 || this.f16105e == null || !this.f16107j) {
                        this.f16109n = new d(this.f16104b, this.f16105e, bVarArr, this.f16106f);
                    } else {
                        this.f16109n = new d(this.f16104b, new File(this.f16104b.getNoBackupFilesDir(), this.f16105e).getAbsolutePath(), bVarArr, this.f16106f);
                    }
                    this.f16109n.setWriteAheadLoggingEnabled(this.f16110t);
                }
                dVar = this.f16109n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // p1.d
    public final String getDatabaseName() {
        return this.f16105e;
    }

    @Override // p1.d
    public final p1.a i() {
        return a().b();
    }

    @Override // p1.d
    public final void setWriteAheadLoggingEnabled(boolean z7) {
        synchronized (this.f16108m) {
            try {
                d dVar = this.f16109n;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z7);
                }
                this.f16110t = z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}