package x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f18853a = new boolean[3];

    public static void a(e eVar, v.d dVar, d dVar2) {
        dVar2.f18794o = -1;
        dVar2.f18796p = -1;
        int i10 = eVar.f18797p0[0];
        int[] iArr = dVar2.f18797p0;
        if (i10 != 2 && iArr[0] == 4) {
            c cVar = dVar2.I;
            int i11 = cVar.f18763g;
            int iR = eVar.r();
            c cVar2 = dVar2.K;
            int i12 = iR - cVar2.f18763g;
            cVar.f18765i = dVar.k(cVar);
            cVar2.f18765i = dVar.k(cVar2);
            dVar.d(cVar.f18765i, i11);
            dVar.d(cVar2.f18765i, i12);
            dVar2.f18794o = 2;
            dVar2.Y = i11;
            int i13 = i12 - i11;
            dVar2.U = i13;
            int i14 = dVar2.f18769b0;
            if (i13 < i14) {
                dVar2.U = i14;
            }
        }
        if (eVar.f18797p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar3 = dVar2.J;
        int i15 = cVar3.f18763g;
        int iL = eVar.l();
        c cVar4 = dVar2.L;
        int i16 = iL - cVar4.f18763g;
        cVar3.f18765i = dVar.k(cVar3);
        cVar4.f18765i = dVar.k(cVar4);
        dVar.d(cVar3.f18765i, i15);
        dVar.d(cVar4.f18765i, i16);
        if (dVar2.f18767a0 > 0 || dVar2.f18779g0 == 8) {
            c cVar5 = dVar2.M;
            v.i iVarK = dVar.k(cVar5);
            cVar5.f18765i = iVarK;
            dVar.d(iVarK, dVar2.f18767a0 + i15);
        }
        dVar2.f18796p = 2;
        dVar2.Z = i15;
        int i17 = i16 - i15;
        dVar2.V = i17;
        int i18 = dVar2.f18771c0;
        if (i17 < i18) {
            dVar2.V = i18;
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}