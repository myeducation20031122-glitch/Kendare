package kc;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class x implements Serializable {
    public static final String a0;
    public static final int[] b0;
    public final c P;
    public final c Q;
    public final k R;
    public final k S;
    public final k T;
    public final b0 U;
    public final o V;
    public double W;
    public int X;
    public String Y;
    public final f w;
    public boolean b = false;
    public e e = null;
    public String f = ".:./ephe:/users/ephe2/:/users/ephe/";
    public String j = "de431.eph";
    public int m = 0;
    public boolean n = false;
    public boolean t = false;
    public final d[] u = new d[7];
    public final l[] M = new l[18];
    public final l[] N = new l[6];
    public final n[] O = new n[24];
    public final int[] Z = new int[20];

    static {
        a0 = System.getProperty("file.separator") == null ? "/" : System.getProperty("file.separator");
        b0 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 12, 13, 14, 15, 16, 17};
    }

    public x() {
        for (int i = 0; i < 7; i++) {
            d[] dVarArr = this.u;
            d dVar = new d();
            dVar.j = null;
            dVar.m = 1.0d;
            dVar.n = 0.0d;
            dVar.w = new int[50];
            dVar.M = null;
            dVarArr[i] = dVar;
        }
        this.w = new f();
        for (int i2 = 0; i2 < 18; i2++) {
            this.M[i2] = new l();
        }
        for (int i3 = 0; i3 < 6; i3++) {
            this.N[i3] = new l();
        }
        for (int i4 = 0; i4 < 24; i4++) {
            n[] nVarArr = this.O;
            n nVar = new n();
            nVar.e = 0.0d;
            nVar.j = new double[24];
            nVarArr[i4] = nVar;
        }
        this.P = new c();
        this.Q = new c();
        this.R = new k();
        this.S = new k();
        this.T = new k();
        b0 b0Var = new b0();
        b0Var.e = new double[6];
        this.U = b0Var;
        o oVar = new o();
        oVar.b = 0;
        oVar.e = 0.0d;
        oVar.f = 0.0d;
        this.V = oVar;
    }
}