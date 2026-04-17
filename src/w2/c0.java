package w2;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 implements v, c3.a {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f18545b;

    public c0(Resources resources, int i10) {
        if (i10 != 1) {
            this.f18545b = resources;
        } else {
            this.f18545b = resources;
        }
    }

    @Override // c3.a
    public final s2.e0 c(s2.e0 e0Var, q2.n nVar) {
        if (e0Var == null) {
            return null;
        }
        return new z2.d(this.f18545b, e0Var);
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        return new y(this.f18545b, a0Var.c(Uri.class, ParcelFileDescriptor.class));
    }
}