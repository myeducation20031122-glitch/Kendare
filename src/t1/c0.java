package t1;

import android.view.View;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public final View f17018b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17017a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17019c = new ArrayList();

    public c0(View view) {
        this.f17018b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f17018b == c0Var.f17018b && this.f17017a.equals(c0Var.f17017a);
    }

    public final int hashCode() {
        return this.f17017a.hashCode() + (this.f17018b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = ic1.o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbO.append(this.f17018b);
        sbO.append("\n");
        String strF = a0.h.F(sbO.toString(), "    values:");
        HashMap map = this.f17017a;
        for (String str : map.keySet()) {
            strF = strF + "    " + str + ": " + map.get(str) + "\n";
        }
        return strF;
    }
}