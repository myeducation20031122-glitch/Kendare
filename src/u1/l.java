package u1;

import o5.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public h0.g[] f18187a;

    /* renamed from: b, reason: collision with root package name */
    public String f18188b;

    /* renamed from: c, reason: collision with root package name */
    public int f18189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18190d;

    public l() {
        this.f18187a = null;
        this.f18189c = 0;
    }

    public h0.g[] getPathData() {
        return this.f18187a;
    }

    public String getPathName() {
        return this.f18188b;
    }

    public void setPathData(h0.g[] gVarArr) {
        if (!u.b(this.f18187a, gVarArr)) {
            this.f18187a = u.g(gVarArr);
            return;
        }
        h0.g[] gVarArr2 = this.f18187a;
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            gVarArr2[i10].f13151a = gVarArr[i10].f13151a;
            int i11 = 0;
            while (true) {
                float[] fArr = gVarArr[i10].f13152b;
                if (i11 < fArr.length) {
                    gVarArr2[i10].f13152b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f18187a = null;
        this.f18189c = 0;
        this.f18188b = lVar.f18188b;
        this.f18190d = lVar.f18190d;
        this.f18187a = u.g(lVar.f18187a);
    }
}