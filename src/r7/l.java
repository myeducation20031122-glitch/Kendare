package r7;

import android.util.Log;
import com.google.android.gms.internal.measurement.l9;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16596b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f16597e;

    public /* synthetic */ l(m mVar, int i10) {
        this.f16596b = i10;
        this.f16597e = mVar;
    }

    public final Boolean a() {
        int i10 = this.f16596b;
        m mVar = this.f16597e;
        switch (i10) {
            case 0:
                try {
                    l9 l9Var = mVar.f16602e;
                    v7.b bVar = (v7.b) l9Var.f10882f;
                    String str = (String) l9Var.f10881e;
                    bVar.getClass();
                    boolean zDelete = new File((File) bVar.f18510e, str).delete();
                    if (!zDelete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                    return Boolean.FALSE;
                }
            default:
                j jVar = mVar.f16604g;
                l9 l9Var2 = jVar.f16582c;
                v7.b bVar2 = (v7.b) l9Var2.f10882f;
                String str2 = (String) l9Var2.f10881e;
                bVar2.getClass();
                boolean zExists = new File((File) bVar2.f18510e, str2).exists();
                boolean z7 = true;
                if (zExists) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    v7.b bVar3 = (v7.b) l9Var2.f10882f;
                    String str3 = (String) l9Var2.f10881e;
                    bVar3.getClass();
                    new File((File) bVar3.f18510e, str3).delete();
                } else {
                    NavigableSet navigableSetC = jVar.f16590k.f16637b.c();
                    String str4 = navigableSetC.isEmpty() ? null : (String) navigableSetC.first();
                    if (str4 == null || !((o7.b) jVar.f16588i).c(str4)) {
                        z7 = false;
                    }
                }
                return Boolean.valueOf(z7);
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f16596b) {
        }
        return a();
    }
}