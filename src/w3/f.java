package w3;

import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f18617b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3.i f18618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18619f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Runnable f18620j;

    public /* synthetic */ f(k kVar, r3.i iVar, int i10, Runnable runnable) {
        this.f18617b = kVar;
        this.f18618e = iVar;
        this.f18619f = i10;
        this.f18620j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3.i iVar = this.f18618e;
        int i10 = this.f18619f;
        Runnable runnable = this.f18620j;
        k kVar = this.f18617b;
        m mVar = kVar.f18637d;
        y3.c cVar = kVar.f18639f;
        try {
            try {
                x3.d dVar = kVar.f18636c;
                Objects.requireNonNull(dVar);
                ((x3.l) cVar).f(new e0.g(dVar, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) kVar.f18634a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    x3.l lVar = (x3.l) cVar;
                    SQLiteDatabase sQLiteDatabaseA = lVar.a();
                    lVar.e(new e0.g(sQLiteDatabaseA, 8), new o0.h(12));
                    try {
                        ((d) mVar).a(iVar, i10 + 1, false);
                        sQLiteDatabaseA.setTransactionSuccessful();
                    } finally {
                        sQLiteDatabaseA.endTransaction();
                    }
                } else {
                    kVar.a(iVar, i10);
                }
            } catch (y3.a unused) {
                ((d) mVar).a(iVar, i10 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}