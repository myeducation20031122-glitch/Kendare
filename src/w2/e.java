package w2;

import g.v0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18551b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f18550a = i10;
        this.f18551b = obj;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        int i12 = this.f18550a;
        Object obj2 = this.f18551b;
        switch (i12) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new t(new h3.d(bArr), new d(bArr, (c) obj2));
            case QueueFuseable.SYNC /* 1 */:
                return new t(new h3.d(obj), new h(0, obj.toString(), (v0) obj2));
            default:
                File file = (File) obj;
                return new t(new h3.d(file), new h(1, file, (j) obj2));
        }
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        switch (this.f18550a) {
            case 0:
                return true;
            case QueueFuseable.SYNC /* 1 */:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}