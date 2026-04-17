package o5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 implements c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15703f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile c0 f15704b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f15705e;

    public static c0 a(b0 b0Var) {
        if (b0Var instanceof a0) {
            return b0Var;
        }
        a0 a0Var = new a0();
        a0Var.f15705e = f15703f;
        a0Var.f15704b = b0Var;
        return a0Var;
    }

    @Override // o5.c0
    public final Object zzb() {
        Object objZzb = this.f15705e;
        Object obj = f15703f;
        if (objZzb == obj) {
            synchronized (this) {
                try {
                    objZzb = this.f15705e;
                    if (objZzb == obj) {
                        objZzb = this.f15704b.zzb();
                        Object obj2 = this.f15705e;
                        if (obj2 != obj && obj2 != objZzb) {
                            String strValueOf = String.valueOf(obj2);
                            String strValueOf2 = String.valueOf(objZzb);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(strValueOf);
                            sb.append(" & ");
                            sb.append(strValueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                        this.f15705e = objZzb;
                        this.f15704b = null;
                    }
                } finally {
                }
            }
        }
        return objZzb;
    }
}