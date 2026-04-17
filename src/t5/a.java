package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17156b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17158f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t1 f17159j;

    public /* synthetic */ a(t1 t1Var, String str, long j10, int i10) {
        this.f17156b = i10;
        this.f17159j = t1Var;
        this.f17157e = str;
        this.f17158f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objValueOf;
        int i10 = this.f17156b;
        long j10 = this.f17158f;
        String str = this.f17157e;
        t1 t1Var = this.f17159j;
        switch (i10) {
            case 0:
                t1Var.o();
                fc.t.g(str);
                t.b bVar = t1Var.f17611f;
                if (bVar.isEmpty()) {
                    t1Var.f17612j = j10;
                }
                Integer num = (Integer) bVar.getOrDefault(str, null);
                if (num != null) {
                    objValueOf = Integer.valueOf(num.intValue() + 1);
                } else if (bVar.f17005f >= 100) {
                    i3 i3Var = ((b4) t1Var.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.f17400w.a("Too many ads visible");
                    break;
                } else {
                    bVar.put(str, 1);
                    bVar = t1Var.f17610e;
                    objValueOf = Long.valueOf(j10);
                }
                bVar.put(str, objValueOf);
                break;
            default:
                t1Var.o();
                fc.t.g(str);
                t.b bVar2 = t1Var.f17611f;
                Integer num2 = (Integer) bVar2.getOrDefault(str, null);
                b4 b4Var = (b4) t1Var.f15046b;
                if (num2 == null) {
                    i3 i3Var2 = b4Var.f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17397n.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    b5 b5Var = b4Var.R;
                    b4.h(b5Var);
                    y4 y4VarW = b5Var.w(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        bVar2.put(str, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        bVar2.remove(str);
                        t.b bVar3 = t1Var.f17610e;
                        Long l10 = (Long) bVar3.getOrDefault(str, null);
                        i3 i3Var3 = b4Var.f17251w;
                        if (l10 == null) {
                            b4.i(i3Var3);
                            i3Var3.f17397n.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = l10.longValue();
                            bVar3.remove(str);
                            t1Var.t(str, j10 - jLongValue, y4VarW);
                        }
                        if (bVar2.isEmpty()) {
                            long j11 = t1Var.f17612j;
                            if (j11 != 0) {
                                t1Var.s(j10 - j11, y4VarW);
                                t1Var.f17612j = 0L;
                                break;
                            } else {
                                b4.i(i3Var3);
                                i3Var3.f17397n.a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}