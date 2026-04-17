package kc;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class l implements Serializable {
    public final double[] b = new double[6];
    public final double[] e = new double[24];
    public int f = 0;
    public int j = 0;
    public int m = 0;
    public long n = 0;
    public double t = 0.0d;
    public double u = 0.0d;
    public double w = 0.0d;
    public double M = 0.0d;
    public double N = 0.0d;
    public double O = 0.0d;
    public double P = 0.0d;
    public double Q = 0.0d;
    public double R = 0.0d;
    public double S = 0.0d;
    public double[] T = null;
    public double U = 0.0d;
    public double V = 0.0d;
    public double[] W = null;
    public int X = 0;
    public double Y = 0.0d;
    public int Z = 0;
    public int a0 = 0;

    public l() {
        int i = 0;
        while (true) {
            double[] dArr = this.b;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = 0.0d;
            i++;
        }
        for (int i2 = 0; i2 < this.b.length; i2++) {
            this.e[i2] = 0.0d;
        }
    }

    public final void a() {
        int i = 0;
        this.f = 0;
        this.j = 0;
        this.m = 0;
        this.n = 0L;
        this.t = 0.0d;
        this.u = 0.0d;
        this.w = 0.0d;
        this.M = 0.0d;
        this.N = 0.0d;
        this.O = 0.0d;
        this.P = 0.0d;
        this.Q = 0.0d;
        this.R = 0.0d;
        this.S = 0.0d;
        this.U = 0.0d;
        this.V = 0.0d;
        this.X = 0;
        this.Y = 0.0d;
        this.Z = 0;
        this.a0 = 0;
        int i2 = 0;
        while (true) {
            double[] dArr = this.b;
            if (i2 >= dArr.length) {
                break;
            }
            dArr[i2] = 0.0d;
            i2++;
        }
        while (true) {
            double[] dArr2 = this.e;
            if (i >= dArr2.length) {
                this.T = null;
                this.W = null;
                return;
            } else {
                dArr2[i] = 0.0d;
                i++;
            }
        }
    }
}