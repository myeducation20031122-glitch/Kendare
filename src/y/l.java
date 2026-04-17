package y;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public p f19161a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f19162b;

    public static long a(f fVar, long j10) {
        p pVar = fVar.f19149d;
        if (pVar instanceof j) {
            return j10;
        }
        ArrayList arrayList = fVar.f19156k;
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f19149d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f19151f + j10));
                }
            }
        }
        if (fVar != pVar.f19187i) {
            return jMin;
        }
        long j11 = pVar.j();
        long j12 = j10 - j11;
        return Math.min(Math.min(jMin, a(pVar.f19186h, j12)), j12 - r9.f19151f);
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f19149d;
        if (pVar instanceof j) {
            return j10;
        }
        ArrayList arrayList = fVar.f19156k;
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f19149d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f19151f + j10));
                }
            }
        }
        if (fVar != pVar.f19186h) {
            return jMax;
        }
        long j11 = pVar.j();
        long j12 = j10 + j11;
        return Math.max(Math.max(jMax, b(pVar.f19187i, j12)), j12 - r9.f19151f);
    }
}