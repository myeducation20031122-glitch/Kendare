package t8;

import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18027b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Class f18028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Class f18029f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f18030j;

    public /* synthetic */ w(Class cls, Class cls2, a0 a0Var, int i10) {
        this.f18027b = i10;
        this.f18028e = cls;
        this.f18029f = cls2;
        this.f18030j = a0Var;
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        int i10 = this.f18027b;
        a0 a0Var = this.f18030j;
        Class cls = this.f18029f;
        Class cls2 = this.f18028e;
        switch (i10) {
            case 0:
                Class cls3 = aVar.f19110a;
                if (cls3 != cls2 && cls3 != cls) {
                    break;
                }
                break;
            default:
                Class cls4 = aVar.f19110a;
                if (cls4 != cls2 && cls4 != cls) {
                    break;
                }
                break;
        }
        return null;
    }

    public final String toString() {
        int i10 = this.f18027b;
        a0 a0Var = this.f18030j;
        Class cls = this.f18029f;
        Class cls2 = this.f18028e;
        switch (i10) {
            case 0:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + a0Var + "]";
            default:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + a0Var + "]";
        }
    }
}