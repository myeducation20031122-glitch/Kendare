package jc;

import a0.g;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.onesignal.v0;
import e0.h;
import ic.d;
import m0.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends j {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i) {
        super(obj);
        this.e = i;
    }

    public final void f(String[] strArr, int i) {
        switch (this.e) {
            case 0:
                h.e((Activity) ((j) this).b, strArr, i);
                return;
            default:
                throw new IllegalStateException("Should never be requesting permissions on API < 23!");
        }
    }

    public final Context g() {
        Object obj = ((j) this).b;
        switch (this.e) {
            case 0:
                return (Context) obj;
            default:
                if (obj instanceof Activity) {
                    return (Context) obj;
                }
                if (obj instanceof Fragment) {
                    return ((Fragment) obj).getContext();
                }
                throw new IllegalStateException("Unknown host: " + obj);
        }
    }

    public final boolean m(String str) {
        switch (this.e) {
            case 0:
                return h.f((Activity) ((j) this).b, str);
            default:
                return false;
        }
    }

    public final void n(String str, String str2, String str3, int i, int i2, String... strArr) {
        switch (this.e) {
            case 0:
                FragmentManager fragmentManager = ((Activity) ((j) this).b).getFragmentManager();
                if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof d) {
                    Log.d("ActPermissionHelper", "Found existing fragment, not showing rationale.");
                    return;
                }
                d dVar = new d();
                dVar.setArguments(new g(str2, str3, str, i, i2, strArr).e());
                if ((Build.VERSION.SDK_INT < 26 || !v0.x(fragmentManager)) && !dVar.e) {
                    dVar.show(fragmentManager, "RationaleDialogFragment");
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Should never be requesting permissions on API < 23!");
        }
    }
}