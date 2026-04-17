package x2;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import q2.n;
import w2.t;
import w2.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18908a;

    /* renamed from: b, reason: collision with root package name */
    public final u f18909b;

    /* renamed from: c, reason: collision with root package name */
    public final u f18910c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f18911d;

    public d(Context context, u uVar, u uVar2, Class cls) {
        this.f18908a = context.getApplicationContext();
        this.f18909b = uVar;
        this.f18910c = uVar2;
        this.f18911d = cls;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, n nVar) {
        Uri uri = (Uri) obj;
        return new t(new h3.d(uri), new c(this.f18908a, this.f18909b, this.f18910c, uri, i10, i11, nVar, this.f18911d));
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && fc.t.x((Uri) obj);
    }
}