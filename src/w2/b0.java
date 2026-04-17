package w2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b0 implements v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18543b;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f18544e;

    public /* synthetic */ b0(Resources resources, int i10) {
        this.f18543b = i10;
        this.f18544e = resources;
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        int i10 = this.f18543b;
        Resources resources = this.f18544e;
        switch (i10) {
            case 0:
                return new y(resources, a0Var.c(Uri.class, AssetFileDescriptor.class));
            default:
                return new y(resources, f0.f18555a);
        }
    }
}