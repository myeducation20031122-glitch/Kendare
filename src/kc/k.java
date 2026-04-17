package kc;

import java.io.Serializable;
import java.lang.reflect.Array;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k implements Serializable {
    public double b;
    public double f;
    public double j;
    public final double[] e = new double[2];
    public final double[][] m = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);

    public final void a() {
        this.b = 0.0d;
        this.f = 0.0d;
        this.j = 0.0d;
        int i = 0;
        while (true) {
            double[] dArr = this.e;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = 0.0d;
            i++;
        }
        int i2 = 0;
        while (true) {
            double[][] dArr2 = this.m;
            if (i2 >= dArr2.length) {
                return;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = dArr2[i2];
                if (i3 < dArr3.length) {
                    dArr3[i3] = 0.0d;
                    i3++;
                }
            }
            i2++;
        }
    }
}