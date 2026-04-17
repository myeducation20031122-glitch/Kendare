package j9;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.isprid.kendare.MyApplication;
import com.isprid.kendare.network.NetworkConfig;
import g.p;
import kotlin.jvm.internal.Intrinsics;
import s9.h;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b extends p implements NetworkConfig.AuthenticatorCallBack {

    /* renamed from: b, reason: collision with root package name */
    public Dialog f13871b;

    /* renamed from: e, reason: collision with root package name */
    public h f13872e;

    public final h h() {
        h hVar = this.f13872e;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("sharedPref");
        throw null;
    }

    public final void i() {
        Dialog dialog;
        Dialog dialog2 = this.f13871b;
        if (dialog2 == null || !dialog2.isShowing() || (dialog = this.f13871b) == null) {
            return;
        }
        dialog.dismiss();
    }

    public final void j() {
        i();
        Dialog dialog = this.f13871b;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        dialog.show();
    }

    @Override // androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Dialog dialog = new Dialog(this, 2131952004);
        dialog.setContentView(2131492939);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        this.f13871b = dialog;
        if (h.f16959c == null) {
            h.f16959c = new h();
        }
        h hVar = h.f16959c;
        Intrinsics.e(hVar, "getInstance(this)");
        this.f13872e = hVar;
        NetworkConfig.INSTANCE.setAuthCallBackListener(this);
    }

    @Override // g.p, androidx.fragment.app.d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i();
    }

    @Override // com.isprid.kendare.network.NetworkConfig.AuthenticatorCallBack
    public final void onUnAuthorizedResponse(Integer num) {
        final int i10 = 0;
        if (num == null || num.intValue() != 401) {
            if (num != null && num.intValue() == 500) {
                runOnUiThread(new Runnable(this) { // from class: j9.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ b f13870e;

                    {
                        this.f13870e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        b this$0 = this.f13870e;
                        switch (i11) {
                            case 0:
                                Intrinsics.f(this$0, "this$0");
                                z0.i(this$0, "Oops, something went wrong. Let's try it again.");
                                break;
                            default:
                                Intrinsics.f(this$0, "this$0");
                                z0.k(this$0, "Something went wrong. Please try again");
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        final int i11 = 1;
        runOnUiThread(new Runnable(this) { // from class: j9.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f13870e;

            {
                this.f13870e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                b this$0 = this.f13870e;
                switch (i112) {
                    case 0:
                        Intrinsics.f(this$0, "this$0");
                        z0.i(this$0, "Oops, something went wrong. Let's try it again.");
                        break;
                    default:
                        Intrinsics.f(this$0, "this$0");
                        z0.k(this$0, "Something went wrong. Please try again");
                        break;
                }
            }
        });
        Context contextQ = MyApplication.f11640b.q();
        SharedPreferences sharedPreferences = contextQ.getSharedPreferences(contextQ.getPackageName() + "_preferences", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.e(editor, "editor");
            editor.clear().apply();
            editor.apply();
        }
    }
}