package jc;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import e0.h;
import m0.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends c {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i) {
        super(obj);
        this.e = i;
    }

    public final void f(String[] strArr, int i) {
        Object obj = ((j) this).b;
        switch (this.e) {
            case 0:
                h.e((Activity) obj, strArr, i);
                break;
            default:
                ((Fragment) obj).requestPermissions(strArr, i);
                break;
        }
    }

    public final Context g() {
        Object obj = ((j) this).b;
        switch (this.e) {
            case 0:
                return (Context) obj;
            default:
                return ((Fragment) obj).getActivity();
        }
    }

    public final boolean m(String str) {
        Object obj = ((j) this).b;
        switch (this.e) {
            case 0:
                return h.f((Activity) obj, str);
            default:
                return ((Fragment) obj).shouldShowRequestPermissionRationale(str);
        }
    }
}