package t1;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17100c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.f17098a = i10;
        this.f17100c = obj;
        this.f17099b = obj2;
    }

    @Override // t1.r
    public final void a(t tVar) {
        int i10 = this.f17098a;
        Object obj = this.f17099b;
        switch (i10) {
            case 0:
                ((ArrayList) ((t.b) obj).getOrDefault(((w) this.f17100c).f17102e, null)).remove(tVar);
                tVar.A(this);
                break;
            default:
                ((t) obj).D();
                tVar.A(this);
                break;
        }
    }
}