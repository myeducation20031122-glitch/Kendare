package m9;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.d0;
import com.isprid.kendare.model.DSetting;
import com.isprid.kendare.network.util.Resource;
import com.isprid.kendare.network.util.ResourceState;
import com.isprid.kendare.ui.main.MainActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m.s3;
import o5.f0;
import o5.g0;
import o5.x;
import p5.m;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class g implements d0, g7.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15236b;

    public /* synthetic */ g(MainActivity mainActivity) {
        this.f15236b = mainActivity;
    }

    @Override // g7.c
    public final void b(o5.j jVar) {
        int i10 = MainActivity.f11666w;
        MainActivity this$0 = this.f15236b;
        Intrinsics.f(this$0, "this$0");
        g0 g0Var = this$0.f11672u;
        if (g0Var == null) {
            Intrinsics.n("consentInformation");
            throw null;
        }
        if (g0Var.f15733a.f15728b.getInt("consent_status", 0) == 2) {
            h hVar = new h();
            Handler handler = x.f15799a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Method must be call on main thread.");
            }
            if (!jVar.f15753h.compareAndSet(false, true)) {
                new f0(3, "ConsentForm#show can only be invoked once.").a();
                n7.c.w("consent_information");
                return;
            }
            o5.h hVar2 = new o5.h(jVar, this$0);
            jVar.f15746a.registerActivityLifecycleCallbacks(hVar2);
            jVar.f15756k.set(hVar2);
            jVar.f15747b.f15776a = this$0;
            Dialog dialog = new Dialog(this$0, R.style.Theme.Translucent.NoTitleBar);
            dialog.setContentView(jVar.f15752g);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            if (window == null) {
                new f0(3, "Activity with null windows is passed in.").a();
                n7.c.w("consent_information");
                return;
            }
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            jVar.f15755j.set(hVar);
            dialog.show();
            jVar.f15751f = dialog;
            jVar.f15752g.a("UMP_messagePresented", "");
        }
    }

    @Override // androidx.lifecycle.d0
    public final void onChanged(Object obj) throws Resources.NotFoundException {
        s3 s3Var;
        MainActivity this$0 = this.f15236b;
        Resource it = (Resource) obj;
        int i10 = MainActivity.f11666w;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.e(it, "it");
        ResourceState state = it.getState();
        if (Intrinsics.a(state, ResourceState.LOADING.INSTANCE)) {
            return;
        }
        if (!Intrinsics.a(state, ResourceState.SUCCESS.INSTANCE)) {
            if (!Intrinsics.a(state, ResourceState.ERROR.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            n7.c.w("Server_Connect_Fail");
            Log.e("MainActivity", "Fail to load about");
            return;
        }
        DSetting dSetting = (DSetting) it.getData();
        if (dSetting != null) {
            d9.b bVar = this$0.f11669m;
            if (bVar == null) {
                Intrinsics.n("dbHelper");
                throw null;
            }
            bVar.a(dSetting);
        }
        if (!g5.a.f13047s) {
            String string = this$0.getResources().getString(2131886987);
            Intrinsics.e(string, "resources.getString(R.string.sorry)");
            new c9.d(string, new j(this$0)).k(this$0.getSupportFragmentManager(), "InitDialogFragment");
            return;
        }
        if (g5.a.f13045q) {
            n7.c.w("display_update");
            Log.e("android_version", q6.b.d(this$0));
            Log.e("release_version", g5.a.f13044p);
            Context applicationContext = this$0.getApplicationContext();
            synchronized (c7.b.class) {
                try {
                    if (c7.b.f2149a == null) {
                        m mVar = new m(0);
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        if (applicationContext2 != null) {
                            applicationContext = applicationContext2;
                        }
                        mVar.f15961e = new a2.f(applicationContext, 3);
                        c7.b.f2149a = mVar.q();
                    }
                    s3Var = c7.b.f2149a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c7.e eVar = (c7.e) ((d7.c) s3Var.f14933t).zza();
            Intrinsics.e(eVar, "create(applicationContext)");
            this$0.f11668j = eVar;
            eVar.a(this$0);
            this$0.m(g5.a.f13046r);
        }
    }
}