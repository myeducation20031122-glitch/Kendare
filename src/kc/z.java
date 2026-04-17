package kc;

import com.google.android.gms.internal.ads.ic1;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class z implements Serializable {
    public static final double[][] Q = {new double[]{8134.017132d, 84028.206305d}, new double[]{5043.0520035d, 0.3624445d}, new double[]{-0.00710733d, -4.039E-5d}, new double[]{2.71E-7d, -1.1E-7d}};
    public static final double[][] R = {new double[]{409.9d, 396.15d, 537.22d, 402.9d, 417.15d, 288.92d, 4043.0d, 306.0d, 277.0d, 203.0d}, new double[]{-6908.287473d, -3198.706291d, 1453.674527d, -857.748557d, 1173.231614d, -156.981465d, 371.83655d, -216.61904d, 193.691479d, 11.891524d}, new double[]{753.87278d, -247.805823d, 379.471484d, -53.880558d, -90.109153d, -353.60019d, -63.115353d, -28.248187d, 17.703387d, 38.911307d}, new double[]{-2845.175469d, 449.844989d, -1255.915323d, 886.736783d, 418.887514d, 997.912441d, -240.97971d, 76.541307d, -36.788069d, -170.964086d}, new double[]{-1704.720302d, -862.308358d, 447.832178d, -889.571909d, 190.402846d, -56.564991d, -296.222622d, -75.859952d, 67.473503d, 3.014055d}};
    public static final double[][] S = {new double[]{5851.607687d, -1600.8863d}, new double[]{-0.1189d, 1.1689818d}, new double[]{-2.8913E-4d, -2.0E-7d}, new double[]{1.01E-7d, -4.37E-7d}};
    public static final double[][] T = {new double[]{708.15d, 2309.0d, 1620.0d, 492.2d, 1183.0d, 622.0d, 882.0d, 547.0d}, new double[]{-5486.751211d, -17.127623d, -617.517403d, 413.44294d, 78.614193d, -180.732815d, -87.676083d, 46.140315d}, new double[]{-684.66156d, 2446.28388d, 399.671049d, -356.652376d, -186.387003d, -316.80007d, 198.296701d, 101.135679d}, new double[]{667.66673d, -2354.886252d, -428.152441d, 376.202861d, 184.778874d, 335.321713d, -185.138669d, -120.97283d}, new double[]{-5523.863691d, -549.74745d, -310.998056d, 421.535876d, -36.776172d, -145.278396d, -34.74445d, 22.885731d}};
    public static final double[][] U = {new double[]{5453.282155d, -73750.93035d}, new double[]{0.4252841d, -0.7675452d}, new double[]{-3.7173E-4d, -1.8725E-4d}, new double[]{-1.52E-7d, 2.31E-7d}};
    public static final double[][] V = {new double[]{256.75d, 708.15d, 274.2d, 241.45d, 2309.0d, 492.2d, 396.1d, 288.9d, 231.1d, 1610.0d, 620.0d, 157.87d, 220.3d, 1200.0d}, new double[]{-819.940624d, -8444.676815d, 2600.009459d, 2755.17563d, -167.659835d, 871.855056d, 44.769698d, -512.313065d, -819.415595d, -538.071099d, -189.793622d, -402.922932d, 179.516345d, -9.814756d}, new double[]{75004.344875d, 624.033993d, 1251.136893d, -1102.212834d, -2660.66498d, 699.291817d, 153.16722d, -950.865637d, 499.754645d, -145.18821d, 558.116553d, -23.923029d, -165.405086d, 9.344131d}, new double[]{81491.287984d, 787.163481d, 1251.296102d, -1257.950837d, -2966.79973d, 639.744522d, 131.600209d, -445.040117d, 584.522874d, -89.756563d, 524.42963d, -13.549067d, -210.157124d, -44.919798d}, new double[]{1558.515853d, 7774.939698d, -2219.534038d, -2523.969396d, 247.850422d, -846.485643d, -1393.124055d, 368.526116d, 749.045012d, 444.704518d, 235.934465d, 374.049623d, -171.33018d, -22.899655d}};
    public static final short[] W = {0, 0, 0, 0, 2, 2062, 2, -895, 5, -2, 0, 2, 0, 1, 46, 0, -24, 0, 2, 0, -2, 0, 0, 11, 0, 0, 0, -2, 0, 2, 0, 2, -3, 0, 1, 0, 1, -1, 0, -1, 0, -3, 0, 0, 0, 0, -2, 2, -2, 1, -2, 0, 1, 0, 2, 0, -2, 0, 1, 1, 0, 0, 0, 0, 0, 2, -2, 2, -13187, -16, 5736, -31, 0, 1, 0, 0, 0, 1426, -34, 54, -1, 0, 1, 2, -2, 2, -517, 12, 224, -6, 0, -1, 2, -2, 2, 217, -5, -95, 3, 0, 0, 2, -2, 1, 129, 1, -70, 0, 2, 0, 0, -2, 0, 48, 0, 1, 0, 0, 0, 2, -2, 0, -22, 0, 0, 0, 0, 2, 0, 0, 0, 17, -1, 0, 0, 0, 1, 0, 0, 1, -15, 0, 9, 0, 0, 2, 2, -2, 2, -16, 1, 7, 0, 0, -1, 0, 0, 1, -12, 0, 6, 0, -2, 0, 0, 2, 1, -6, 0, 3, 0, 0, -1, 2, -2, 1, -5, 0, 3, 0, 2, 0, 0, -2, 1, 4, 0, -2, 0, 0, 1, 2, -2, 1, 4, 0, -2, 0, 1, 0, 0, -1, 0, -4, 0, 0, 0, 2, 1, 0, -2, 0, 1, 0, 0, 0, 0, 0, -2, 2, 1, 1, 0, 0, 0, 0, 1, -2, 2, 0, -1, 0, 0, 0, 0, 1, 0, 0, 2, 1, 0, 0, 0, -1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 2, -2, 0, -1, 0, 0, 0, 0, 0, 2, 0, 2, -2274, -2, 977, -5, 1, 0, 0, 0, 0, 712, 1, -7, 0, 0, 0, 2, 0, 1, -386, -4, 200, 0, 1, 0, 2, 0, 2, -301, 0, 129, -1, 1, 0, 0, -2, 0, -158, 0, -1, 0, -1, 0, 2, 0, 2, 123, 0, -53, 0, 0, 0, 0, 2, 0, 63, 0, -2, 0, 1, 0, 0, 0, 1, 63, 1, -33, 0, -1, 0, 0, 0, 1, -58, -1, 32, 0, -1, 0, 2, 2, 2, -59, 0, 26, 0, 1, 0, 2, 0, 1, -51, 0, 27, 0, 0, 0, 2, 2, 2, -38, 0, 16, 0, 2, 0, 0, 0, 0, 29, 0, -1, 0, 1, 0, 2, -2, 2, 29, 0, -12, 0, 2, 0, 2, 0, 2, -31, 0, 13, 0, 0, 0, 2, 0, 0, 26, 0, -1, 0, -1, 0, 2, 0, 1, 21, 0, -10, 0, -1, 0, 0, 2, 1, 16, 0, -8, 0, 1, 0, 0, -2, 1, -13, 0, 7, 0, -1, 0, 2, 2, 1, -10, 0, 5, 0, 1, 1, 0, -2, 0, -7, 0, 0, 0, 0, 1, 2, 0, 2, 7, 0, -3, 0, 0, -1, 2, 0, 2, -7, 0, 3, 0, 1, 0, 2, 2, 2, -8, 0, 3, 0, 1, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 2, -2, 2, 6, 0, -3, 0, 0, 0, 0, 2, 1, -6, 0, 3, 0, 0, 0, 2, 2, 1, -7, 0, 3, 0, 1, 0, 2, -2, 1, 6, 0, -3, 0, 0, 0, 0, -2, 1, -5, 0, 3, 0, 1, -1, 0, 0, 0, 5, 0, 0, 0, 2, 0, 2, 0, 1, -5, 0, 3, 0, 0, 1, 0, -2, 0, -4, 0, 0, 0, 1, 0, -2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, -4, 0, 0, 0, 1, 1, 0, 0, 0, -3, 0, 0, 0, 1, 0, 2, 0, 0, 3, 0, 0, 0, 1, -1, 2, 0, 2, -3, 0, 1, 0, -1, -1, 2, 2, 2, -3, 0, 1, 0, -2, 0, 0, 0, 1, -2, 0, 1, 0, 3, 0, 2, 0, 2, -3, 0, 1, 0, 0, -1, 2, 2, 2, -3, 0, 1, 0, 1, 1, 2, 0, 2, 2, 0, -1, 0, -1, 0, 2, -2, 1, -2, 0, 1, 0, 2, 0, 0, 0, 1, 2, 0, -1, 0, 1, 0, 0, 0, 2, -2, 0, 1, 0, 3, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 2, 2, 0, -1, 0, -1, 0, 0, 0, 2, 1, 0, -1, 0, 1, 0, 0, -4, 0, -1, 0, 0, 0, -2, 0, 2, 2, 2, 1, 0, -1, 0, -1, 0, 2, 4, 2, -2, 0, 1, 0, 2, 0, 0, -4, 0, -1, 0, 0, 0, 1, 1, 2, -2, 2, 1, 0, -1, 0, 1, 0, 2, 2, 1, -1, 0, 1, 0, -2, 0, 2, 4, 2, -1, 0, 1, 0, -1, 0, 4, 0, 2, 1, 0, 0, 0, 1, -1, 0, -2, 0, 1, 0, 0, 0, 2, 0, 2, -2, 1, 1, 0, -1, 0, 2, 0, 2, 2, 2, -1, 0, 0, 0, 1, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, 4, -2, 2, 1, 0, 0, 0, 3, 0, 2, -2, 2, 1, 0, 0, 0, 1, 0, 2, -2, 0, -1, 0, 0, 0, 0, 1, 2, 0, 1, 1, 0, 0, 0, -1, -1, 0, 2, 1, 1, 0, 0, 0, 0, 0, -2, 0, 1, -1, 0, 0, 0, 0, 0, 2, -1, 2, -1, 0, 0, 0, 0, 1, 0, 2, 0, -1, 0, 0, 0, 1, 0, -2, -2, 0, -1, 0, 0, 0, 0, -1, 2, 0, 1, -1, 0, 0, 0, 1, 1, 0, -2, 1, -1, 0, 0, 0, 1, 0, -2, 2, 0, -1, 0, 0, 0, 2, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 2, 4, 2, -1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 101, 0, 0, 0, 1, -725, 0, 213, 0, 101, 1, 0, 0, 0, 523, 0, 208, 0, 101, 0, 2, -2, 2, 102, 0, -41, 0, 101, 0, 2, 0, 2, -81, 0, 32, 0, 102, 0, 0, 0, 1, 417, 0, 224, 0, 102, 1, 0, 0, 0, 61, 0, -24, 0, 102, 
    0, 2, -2, 2, -118, 0, -47, 0, -99};
    public static final int[] X = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, -2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 1, 0, -8, 12, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, 2, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, 2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, -13, 0, 0, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public final x b;
    public final double[] e = {36.726d, 36.627d, 36.595d, 36.578d, 36.64d, 36.659d, 36.731d, 36.765d, 36.662d, 36.555d, 36.335d, 36.321d, 36.354d, 36.227d, 36.289d, 36.348d, 36.257d, 36.163d, 35.979d, 35.896d, 35.842d, 35.825d, 35.912d, 35.95d, 36.093d, 36.191d, 36.009d, 35.943d, 35.875d, 35.771d, 35.788d, 35.753d, 35.822d, 35.866d, 35.771d, 35.732d, 35.543d, 35.498d, 35.449d, 35.409d, 35.497d, 35.556d, 35.672d, 35.76d, 35.596d, 35.565d, 35.51d, 35.394d, 35.385d, 35.375d, 35.415d};
    public final double[] f = {-8.66E-10d, -4.759E-8d, 2.424E-7d, 1.3095E-5d, 1.7451E-4d, -0.0018055d, -0.235316d, 0.076d, 110.5407d, 50287.7d};
    public final double[] j = {6.6402E-16d, -2.69151E-15d, -1.547021E-12d, 7.521313E-12d, 1.9E-10d, -3.54E-9d, -1.8103E-7d, 1.26E-7d, 7.436169E-5d, -0.04207794833d, 3.052115282424d};
    public final double[] m = {1.2147E-16d, 7.3759E-17d, -8.26287E-14d, 2.50341E-13d, 2.4650839E-11d, -5.4000441E-11d, 1.32115526E-9d, -6.012E-7d, -1.62442E-5d, 0.00227850649d, 0.0d};
    public final double[] n = {-8.66E-10d, -4.759E-8d, 2.424E-7d, 1.3095E-5d, 1.7451E-4d, -0.0018055d, -0.235316d, 0.07732d, 111.2022d, 50288.2d};
    public final double[] t = {6.6402E-16d, -2.69151E-15d, -1.547021E-12d, 7.521313E-12d, 1.9E-10d, -3.54E-9d, -1.8103E-7d, 2.579E-8d, 7.4379679E-5d, -0.04207829d, 3.0521126906d};
    public final double[] u = {1.2147E-16d, 7.3759E-17d, -8.26287E-14d, 2.50341E-13d, 2.4650839E-11d, -5.4000441E-11d, 1.32115526E-9d, -5.99908E-7d, -1.624383E-5d, 0.002278492868d, 0.0d};
    public final double[] w = {-8.66E-10d, -4.759E-8d, 2.424E-7d, 1.3095E-5d, 1.7451E-4d, -0.0018055d, -0.235316d, 0.07732d, 111.1971d, 50290.966d};
    public final double[] M = {6.6402E-16d, -2.69151E-15d, -1.547021E-12d, 7.521313E-12d, 6.3190131E-10d, -3.48388152E-9d, -1.813065896E-7d, 2.75036225E-8d, 7.4394531426E-5d, -0.042078604317d, 3.052112654975d};
    public final double[] N = {1.2147E-16d, 7.3759E-17d, -8.26287E-14d, 2.50341E-13d, 2.4650839E-11d, -5.4000441E-11d, 1.32115526E-9d, -5.998737027E-7d, -1.6242797091E-5d, 0.002278495537d, 0.0d};
    public final double[] O = {-51.257d, -51.103d, -51.065d, -51.503d, -51.224d, -50.796d, -51.161d, -51.181d, -50.932d, -51.064d, -51.182d, -51.386d, -51.416d, -51.428d, -51.586d, -51.766d, -52.038d, -52.37d, -52.553d, -52.397d, -52.34d, -52.676d, -52.348d, -51.964d, -52.444d, -52.364d, -51.988d, -52.212d, -52.37d, -52.523d, -52.541d, -52.496d, -52.59d, -52.629d, -52.788d, -53.014d, -53.053d, -52.902d, -52.85d, -53.087d, -52.635d, -52.185d, -52.588d, -52.292d, -51.796d, -51.961d, -52.055d, -52.134d, -52.165d, -52.141d, -52.255d};
    public final double[] P = {2640.96d, -0.39d, 63.52d, -0.02d, 11.75d, 0.01d, 11.21d, 0.01d, -4.55d, 0.0d, 2.02d, 0.0d, 1.98d, 0.0d, -1.72d, 0.0d, -1.41d, -0.01d, -1.26d, -0.01d, -0.63d, 0.0d, -0.63d, 0.0d, 0.46d, 0.0d, 0.45d, 0.0d, 0.36d, 0.0d, -0.24d, -0.12d, 0.32d, 0.0d, 0.28d, 0.0d, 0.27d, 0.0d, 0.26d, 0.0d, -0.21d, 0.0d, 0.19d, 0.0d, 0.18d, 0.0d, -0.1d, 0.05d, 0.15d, 0.0d, -0.14d, 0.0d, 0.14d, 0.0d, -0.14d, 0.0d, 0.14d, 0.0d, 0.13d, 0.0d, -0.11d, 0.0d, 0.11d, 0.0d, 0.11d, 0.0d};

    public z(x xVar) {
        this.b = xVar;
        if (xVar == null) {
            this.b = new x();
        }
    }

    public static void A(double d, double[] dArr, double[] dArr2) {
        double d2 = (d - 2451545.0d) / 36525.0d;
        double dB = 0.0d;
        double dB2 = 0.0d;
        for (int i = 0; i < 10; i++) {
            double[][] dArr3 = R;
            double d3 = (6.283185307179586d * d2) / dArr3[0][i];
            double dSin = Math.sin(d3);
            double dCos = Math.cos(d3);
            dB = r.b(dSin, dArr3[3][i], dCos * dArr3[1][i], dB);
            dB2 = r.b(dSin, dArr3[4][i], dCos * dArr3[2][i], dB2);
        }
        double d4 = 1.0d;
        for (int i2 = 0; i2 < 4; i2++) {
            double[] dArr4 = Q[i2];
            dB += dArr4[0] * d4;
            dB2 = (dArr4[1] * d4) + dB2;
            d4 *= d2;
        }
        double d5 = dB * 4.848136811095361E-6d;
        double d6 = dB2 * 4.848136811095361E-6d;
        if (dArr != null && dArr.length > 0) {
            dArr[0] = d5;
        }
        if (dArr2 == null || dArr2.length <= 0) {
            return;
        }
        dArr2[0] = d6;
    }

    public static double B(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 < 0.0d ? d2 + 6.283185307179586d : d2;
    }

    public static void E(double[] dArr, int i, double[] dArr2, int i2) {
        int i3 = i + 1;
        double dCos = Math.cos(dArr[i3]);
        int i4 = i + 2;
        double[] dArr3 = {Math.cos(dArr[i]) * dArr[i4] * dCos, Math.sin(dArr[i]) * dArr[i4] * dCos, Math.sin(dArr[i3]) * dArr[i4]};
        dArr2[i2] = dArr3[0];
        dArr2[i2 + 1] = dArr3[1];
        dArr2[i2 + 2] = dArr3[2];
    }

    public static void F(double[] dArr, double[] dArr2, int i) {
        double[] dArr3 = new double[6];
        if (dArr[3] == 0.0d && dArr[4] == 0.0d && dArr[5] == 0.0d) {
            dArr2[i + 5] = 0.0d;
            dArr2[i + 4] = 0.0d;
            dArr2[i + 3] = 0.0d;
            E(dArr, 0, dArr2, i);
            return;
        }
        double dCos = Math.cos(dArr[0]);
        double dSin = Math.sin(dArr[0]);
        double dCos2 = Math.cos(dArr[1]);
        double dSin2 = Math.sin(dArr[1]);
        double d = dArr[2];
        double d2 = d * dCos2 * dCos;
        dArr3[0] = d2;
        double d3 = d * dCos2 * dSin;
        dArr3[1] = d3;
        dArr3[2] = d * dSin2;
        double d4 = dArr[2];
        double dSqrt = Math.sqrt((d3 * d3) + (d2 * d2));
        double d5 = dArr[5];
        dArr3[5] = d5;
        double d6 = dArr[4] * d4;
        dArr3[4] = d6;
        dArr2[i + 5] = (d6 * dCos2) + (d5 * dSin2);
        double d7 = (dCos2 * dArr3[5]) - (dSin2 * dArr3[4]);
        dArr3[3] = d7;
        double d8 = dArr[3] * dSqrt;
        dArr3[4] = d8;
        dArr2[i + 3] = (d7 * dCos) - (d8 * dSin);
        dArr2[i + 4] = (dCos * dArr3[4]) + (dSin * dArr3[3]);
        dArr2[i] = dArr3[0];
        dArr2[i + 1] = dArr3[1];
        dArr2[i + 2] = dArr3[2];
    }

    public static synchronized double a(String str) {
        try {
            String strTrim = str.trim();
            int i = 0;
            while (i < strTrim.length() && (Character.isDigit(strTrim.charAt(i)) || strTrim.charAt(i) == '.')) {
                i++;
            }
            String strTrim2 = strTrim.substring(0, i).trim();
            if (strTrim2.length() != 0 && strTrim2.replace('.', ' ').trim().length() != 0) {
                return Double.valueOf(strTrim2).doubleValue();
            }
            return 0.0d;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized int b(String str) {
        try {
            String strTrim = str.trim();
            int i = 0;
            while (i < strTrim.length() && Character.isDigit(strTrim.charAt(i))) {
                i++;
            }
            String strTrim2 = strTrim.substring(0, i).trim();
            if (strTrim2.length() != 0 && strTrim2.replace('.', ' ').trim().length() != 0) {
                return Integer.valueOf(strTrim2).intValue();
            }
            return 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static double c(double d, int i) {
        if (d <= 0.0d || d >= i - 1) {
            throw null;
        }
        Math.floor(d);
        throw null;
    }

    public static void d(double[] dArr, int i, double d, int i2, int i3) {
        double d2;
        double d3;
        double d4;
        double d5;
        double[] dArr2 = new double[3];
        if (d == 2451545.0d) {
            return;
        }
        double d6 = (d - 2451545.0d) / 36525.0d;
        if (i3 == 1) {
            d2 = ((((((0.017998d * d6) + 0.30188d) * d6) + 2306.2181d) * d6) * 0.0174532925199433d) / 3600.0d;
            d3 = ((((((0.018203d * d6) + 1.09468d) * d6) + 2306.2181d) * d6) * 0.0174532925199433d) / 3600.0d;
            d4 = (((-0.041833d) * d6) - 0.42665d) * d6;
            d5 = 2004.3109d;
        } else if (i3 == 2) {
            d2 = ((((((((((((-2.0E-7d) * d6) - 3.27E-5d) * d6) + 0.0179663d) * d6) + 0.3019015d) * d6) + 2306.0809506d) * d6) + 2.5976176d) * 0.0174532925199433d) / 3600.0d;
            d3 = ((((((((((((-3.0E-7d) * d6) - 4.7E-5d) * d6) + 0.0182237d) * d6) + 1.094779d) * d6) + 2306.0803226d) * d6) - 2.5976176d) * 0.0174532925199433d) / 3600.0d;
            d4 = (((((((-1.0E-7d) * d6) - 6.01E-5d) * d6) - 0.0418251d) * d6) - 0.4269353d) * d6;
            d5 = 2004.1917476d;
        } else if (i3 == 3) {
            d2 = ((((((((((((-3.173E-7d) * d6) - 5.971E-6d) * d6) + 0.01801828d) * d6) + 0.2988499d) * d6) + 2306.083227d) * d6) + 2.650545d) * 0.0174532925199433d) / 3600.0d;
            d3 = ((((((((((((-2.904E-7d) * d6) - 2.8596E-5d) * d6) + 0.01826837d) * d6) + 1.0927348d) * d6) + 2306.077181d) * d6) - 2.650545d) * 0.0174532925199433d) / 3600.0d;
            d4 = (((((((-1.1274E-7d) * d6) - 7.089E-6d) * d6) - 0.04182264d) * d6) - 0.4294934d) * d6;
            d5 = 2004.191903d;
        } else {
            if (i3 != 4) {
                return;
            }
            d2 = ((((((((((((((-1.3E-10d) * d6) - 3.04E-7d) * d6) - 5.708E-6d) * d6) + 0.01801752d) * d6) + 0.3023262d) * d6) + 2306.080472d) * d6) + 2.72767d) * 0.0174532925199433d) / 3600.0d;
            d3 = ((((((((((((((-5.0E-11d) * d6) - 2.486E-7d) * d6) - 2.8276E-5d) * d6) + 0.01826676d) * d6) + 1.0956768d) * d6) + 2306.07607d) * d6) - 2.72767d) * 0.0174532925199433d) / 3600.0d;
            d4 = ((((((((((9.0E-12d * d6) + 3.6E-10d) * d6) - 1.127E-7d) * d6) - 7.291E-6d) * d6) - 0.04182364d) * d6) - 0.426698d) * d6;
            d5 = 2004.190936d;
        }
        double d7 = (((d4 + d5) * d6) * 0.0174532925199433d) / 3600.0d;
        double dSin = Math.sin(d7);
        double dCos = Math.cos(d7);
        double dSin2 = Math.sin(d2);
        double dCos2 = Math.cos(d2);
        double dSin3 = Math.sin(d3);
        double dCos3 = Math.cos(d3);
        double d8 = dCos2 * dCos;
        double d9 = dSin2 * dCos;
        double d10 = (d8 * dCos3) - (dSin2 * dSin3);
        if (i2 < 0) {
            int i4 = i + 1;
            int i5 = i + 2;
            dArr2[0] = ((d10 * dArr[i]) - (((dCos2 * dSin3) + (d9 * dCos3)) * dArr[i4])) - ((dSin * dCos3) * dArr[i5]);
            dArr2[1] = ((((dSin2 * dCos3) + (d8 * dSin3)) * dArr[i]) - (((d9 * dSin3) - (dCos3 * dCos2)) * dArr[i4])) - ((dSin3 * dSin) * dArr[i5]);
            dArr2[2] = (dCos * dArr[i5]) + (((dCos2 * dSin) * dArr[i]) - ((dSin2 * dSin) * dArr[i4]));
        } else {
            double d11 = (dSin2 * dCos3) + (d8 * dSin3);
            int i6 = i + 1;
            int i7 = i + 2;
            dArr2[0] = (dCos2 * dSin * dArr[i7]) + (d11 * dArr[i6]) + (d10 * dArr[i]);
            dArr2[1] = (((-((dCos2 * dSin3) + (d9 * dCos3))) * dArr[i]) - (((d9 * dSin3) - (dCos2 * dCos3)) * dArr[i6])) - ((dSin2 * dSin) * dArr[i7]);
            dArr2[2] = (dCos * dArr[i7]) + ((((-dSin) * dCos3) * dArr[i]) - ((dSin * dSin3) * dArr[i6]));
        }
        for (int i8 = 0; i8 < 3; i8++) {
            dArr[i8 + i] = dArr2[i8];
        }
    }

    public static double f(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = (d2 * d2) + (d * d);
        double d4 = dArr[2];
        return (d4 * d4) + d3;
    }

    public static void g(double[] dArr, double[] dArr2, double d) {
        double[] dArr3 = new double[6];
        double d2 = d * 0.0174532925199433d;
        for (int i = 0; i <= 1; i++) {
            dArr3[i] = dArr[i];
        }
        dArr3[0] = dArr3[0] * 0.0174532925199433d;
        dArr3[1] = dArr3[1] * 0.0174532925199433d;
        dArr3[2] = 1.0d;
        for (int i2 = 3; i2 <= 5; i2++) {
            dArr3[i2] = 0.0d;
        }
        E(dArr3, 0, dArr3, 0);
        q(d2, dArr3, dArr3);
        o(dArr3, 0, dArr3, 0);
        dArr2[0] = dArr3[0] * 57.2957795130823d;
        dArr2[1] = dArr3[1] * 57.2957795130823d;
        dArr2[2] = dArr[2];
    }

    public static double h(double d) {
        double d2 = d % 360.0d;
        if (Math.abs(d2) < 1.0E-13d) {
            d2 = 0.0d;
        }
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static double i(double d, double d2) {
        double dH = h(d - d2);
        return dH >= 180.0d ? dH - 360.0d : dH;
    }

    public static double j(double d, double d2) {
        double dK = k(d - d2);
        return dK >= 3.141592653589793d ? dK - 6.283185307179586d : dK;
    }

    public static double k(double d) {
        double d2 = d % 6.283185307179586d;
        if (Math.abs(d2) < 1.0E-13d) {
            d2 = 0.0d;
        }
        return d2 < 0.0d ? d2 + 6.283185307179586d : d2;
    }

    public static void o(double[] dArr, int i, double[] dArr2, int i2) {
        double[] dArr3 = new double[3];
        double d = dArr[i];
        if (d == 0.0d && dArr[i + 1] == 0.0d && dArr[i + 2] == 0.0d) {
            dArr2[i2 + 2] = 0.0d;
            dArr2[i2 + 1] = 0.0d;
            dArr2[i2] = 0.0d;
            return;
        }
        int i3 = i + 1;
        double d2 = dArr[i3];
        double d3 = (d2 * d2) + (d * d);
        int i4 = i + 2;
        double d4 = dArr[i4];
        dArr3[2] = Math.sqrt((d4 * d4) + d3);
        double dSqrt = Math.sqrt(d3);
        double dAtan2 = Math.atan2(dArr[i3], dArr[i]);
        dArr3[0] = dAtan2;
        if (dAtan2 < 0.0d) {
            dArr3[0] = dAtan2 + 6.283185307179586d;
        }
        dArr3[1] = Math.atan(dArr[i4] / dSqrt);
        dArr2[i2] = dArr3[0];
        dArr2[i2 + 1] = dArr3[1];
        dArr2[i2 + 2] = dArr3[2];
    }

    public static void p(double[] dArr, int i, double[] dArr2, int i2) {
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[6];
        double d = dArr[i];
        if (d == 0.0d && dArr[i + 1] == 0.0d && dArr[i + 2] == 0.0d) {
            dArr2[i2 + 4] = 0.0d;
            dArr2[i2 + 3] = 0.0d;
            dArr2[i2 + 1] = 0.0d;
            dArr2[i2] = 0.0d;
            int i3 = i + 3;
            double d2 = dArr[i3];
            double d3 = dArr[i + 4];
            double d4 = (d3 * d3) + (d2 * d2);
            double d5 = dArr[i + 5];
            dArr2[i2 + 5] = Math.sqrt((d5 * d5) + d4);
            o(dArr, i3, dArr2, i2);
            dArr2[i2 + 2] = 0.0d;
            return;
        }
        int i4 = i + 3;
        if (dArr[i4] == 0.0d && dArr[i + 4] == 0.0d && dArr[i + 5] == 0.0d) {
            dArr2[i2 + 5] = 0.0d;
            dArr2[i2 + 4] = 0.0d;
            dArr2[i2 + 3] = 0.0d;
            o(dArr, i, dArr2, i2);
            return;
        }
        int i5 = i + 1;
        double d6 = dArr[i5];
        double d7 = (d6 * d6) + (d * d);
        int i6 = i + 2;
        double d8 = dArr[i6];
        dArr4[2] = Math.sqrt((d8 * d8) + d7);
        double dSqrt = Math.sqrt(d7);
        double dAtan2 = Math.atan2(dArr[i5], dArr[i]);
        dArr4[0] = dAtan2;
        if (dAtan2 < 0.0d) {
            dArr4[0] = dAtan2 + 6.283185307179586d;
        }
        dArr4[1] = Math.atan(dArr[i6] / dSqrt);
        double d9 = dArr[i] / dSqrt;
        double d10 = dArr[i5] / dSqrt;
        double d11 = dArr4[2];
        double d12 = dSqrt / d11;
        double d13 = dArr[i6] / d11;
        int i7 = i + 4;
        dArr3[3] = (dArr[i7] * d10) + (dArr[i4] * d9);
        double d14 = (dArr[i7] * d9) + ((-dArr[i4]) * d10);
        dArr3[4] = d14;
        dArr2[i2 + 3] = d14 / dSqrt;
        double d15 = dArr3[3];
        int i8 = i + 5;
        double d16 = (dArr[i8] * d12) + ((-d13) * d15);
        dArr3[4] = d16;
        dArr3[5] = (d13 * dArr[i8]) + (d12 * d15);
        dArr2[i2 + 4] = d16 / dArr4[2];
        dArr2[i2 + 5] = dArr3[5];
        dArr2[i2] = dArr4[0];
        dArr2[i2 + 1] = dArr4[1];
        dArr2[i2 + 2] = dArr4[2];
    }

    public static void q(double d, double[] dArr, double[] dArr2) {
        r(dArr, 0, dArr2, 0, d);
    }

    public static void r(double[] dArr, int i, double[] dArr2, int i2, double d) {
        double dSin = Math.sin(d);
        double dCos = Math.cos(d);
        double d2 = dArr[i];
        int i3 = i + 1;
        int i4 = i + 2;
        double[] dArr3 = {d2, (dArr[i4] * dSin) + (dArr[i3] * dCos), (dArr[i4] * dCos) + ((-dArr[i3]) * dSin)};
        dArr2[i2] = d2;
        dArr2[i2 + 1] = dArr3[1];
        dArr2[i2 + 2] = dArr3[2];
    }

    public static void s(double[] dArr, int i, double[] dArr2, int i2, double d, double d2) {
        double d3 = dArr[i];
        int i3 = i + 1;
        int i4 = i + 2;
        double[] dArr3 = {d3, (dArr[i4] * d) + (dArr[i3] * d2), (dArr[i4] * d2) + ((-dArr[i3]) * d)};
        dArr2[i2] = d3;
        dArr2[i2 + 1] = dArr3[1];
        dArr2[i2 + 2] = dArr3[2];
    }

    public static void t(double[] dArr, double[] dArr2, int i, double[] dArr3) {
        int i2 = i + 2;
        double d = dArr[1] * dArr2[i2];
        double d2 = dArr[2];
        int i3 = i + 1;
        dArr3[0] = d - (dArr2[i3] * d2);
        double d3 = d2 * dArr2[i];
        double d4 = dArr[0];
        dArr3[1] = d3 - (dArr2[i2] * d4);
        dArr3[2] = (d4 * dArr2[i3]) - (dArr[1] * dArr2[i]);
    }

    public static int u(String str, String str2, String[] strArr) {
        if (str.indexOf(10) >= 0) {
            str = str.substring(0, str.indexOf(10));
        }
        if (str.indexOf(13) >= 0) {
            str = str.substring(0, str.indexOf(13));
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2, true);
        int i = 0;
        while (stringTokenizer.hasMoreTokens() && i < 20) {
            String strNextToken = stringTokenizer.nextToken();
            while (strNextToken.endsWith("\\") && stringTokenizer.hasMoreTokens()) {
                strNextToken = strNextToken.substring(0, strNextToken.length() - 1) + stringTokenizer.nextToken();
                if (stringTokenizer.hasMoreTokens()) {
                    StringBuilder sbN = ic1.n(strNextToken);
                    sbN.append(stringTokenizer.nextToken());
                    strNextToken = sbN.toString();
                }
            }
            strArr[i] = strNextToken;
            i++;
            if (stringTokenizer.hasMoreTokens()) {
                stringTokenizer.nextToken();
            }
        }
        strArr[19] = HttpUrl.FRAGMENT_ENCODE_SET;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[19] = strArr[19] + stringTokenizer.nextToken();
        }
        if (i < 20) {
            strArr[i] = null;
        }
        return i;
    }

    public static double v(double[] dArr, double[] dArr2) {
        double d = dArr[0];
        double d2 = dArr2[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr2[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr2[2] * d5) + d4;
        double dSqrt = Math.sqrt((d5 * d5) + (d3 * d3) + (d * d));
        double d7 = dArr2[0];
        double d8 = dArr2[1];
        double d9 = dArr2[2];
        double d10 = d6 / dSqrt;
        double dSqrt2 = d10 / Math.sqrt((d9 * d9) + ((d8 * d8) + (d7 * d7)));
        if (dSqrt2 > 1.0d) {
            dSqrt2 = 1.0d;
        }
        if (dSqrt2 < -1.0d) {
            return -1.0d;
        }
        return dSqrt2;
    }

    public static double w(double d, int i, int i2, double[] dArr) {
        double d2 = d * 2.0d;
        int i3 = i2 - 1;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        while (i3 >= 0) {
            double d6 = ((d2 * d3) - d5) + dArr[i3 + i];
            i3--;
            d4 = d5;
            d5 = d3;
            d3 = d6;
        }
        return (d3 - d4) * 0.5d;
    }

    public static double x(double d, int i, int i2, double[] dArr) {
        double d2 = 2.0d * d;
        int i3 = i2 - 1;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        while (i3 >= 1) {
            double d9 = (dArr[i3 + i] * (i3 + i3)) + d5;
            d3 = ((d2 * d6) - d7) + d9;
            i3--;
            d5 = d8;
            d8 = d9;
            d4 = d7;
            d7 = d6;
            d6 = d3;
        }
        return (d3 - d4) * 0.5d;
    }

    public static String z(int i, double d) {
        String str;
        String str2;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "sepl";
                break;
            case 1:
                str = "semo";
                break;
            case 11:
            default:
                StringBuilder sb2 = new StringBuilder("00000");
                int i2 = i - 10000;
                sb2.append(i2);
                String strSubstring = sb2.toString().substring(r8.length() - 6);
                if (i2 <= 99999) {
                    strSubstring = strSubstring.substring(1);
                    str2 = "se";
                } else {
                    str2 = "s";
                }
                StringBuilder sb3 = new StringBuilder("ast");
                sb3.append(i2 / 1000);
                return r.h(sb3, x.a0, str2, strSubstring, ".se1");
            case 12:
            case 13:
            case 14:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
                str = "seas";
                break;
        }
        p pVar = new p();
        pVar.u = false;
        boolean z = 2299160.5d <= d;
        pVar.b = d;
        pVar.e = z;
        h hVarH = pVar.h(d, z);
        pVar.f = hVarH.b;
        pVar.j = hVarH.e;
        pVar.m = hVarH.f;
        pVar.n = hVarH.j;
        if (pVar.b >= 2305447.5d) {
            pVar.f(true);
        } else {
            pVar.f(false);
        }
        int i3 = pVar.f;
        int i4 = i3 / 100;
        if ((i3 < 0 ? (char) 65535 : (char) 1) < 0 && i3 % 100 != 0) {
            i4--;
        }
        while (i4 % 6 != 0) {
            i4--;
        }
        String strConcat = str.concat(i4 < 0 ? "m" : "_");
        int iAbs = Math.abs(i4);
        StringBuilder sbN = ic1.n(strConcat);
        sbN.append(iAbs < 10 ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        sbN.append(iAbs);
        sbN.append(".se1");
        return sbN.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0479 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(double d, int i, double[] dArr) {
        int i2;
        int i3;
        z zVar = this;
        double d2 = d;
        int[] iArr = zVar.b.Z;
        int i4 = iArr[2];
        int i5 = iArr[5];
        int i6 = iArr[6];
        int i7 = i4 == 0 ? 4 : i4;
        if (i6 == 0) {
            i6 = 1;
        }
        int i8 = i & 262144;
        if (i8 != 0) {
            zVar.D(d2, dArr);
        } else {
            if (i7 == 1) {
                i2 = i8;
                zVar = this;
                d2 = d;
            } else {
                if (i7 != 2) {
                    if (i7 == 3 || i7 == 4) {
                        double d3 = (d2 - 2451545.0d) / 36525.0d;
                        if (i4 == 0) {
                            i4 = 4;
                        }
                        double dH = h((((((((((-2.447E-4d) * d3) + 0.051635d) * d3) + 31.8792d) * d3) + 1.7179159232178E9d) * d3) + 485868.249036d) / 3600.0d) * 0.0174532925199433d;
                        double dH2 = h((((((((((-1.149E-5d) * d3) + 1.36E-4d) * d3) - 0.5532d) * d3) + 1.295965810481E8d) * d3) + 1287104.79305d) / 3600.0d) * 0.0174532925199433d;
                        double dH3 = h(((((((((4.17E-6d * d3) - 0.001037d) * d3) - 12.7512d) * d3) + 1.7395272628478E9d) * d3) + 335779.526232d) / 3600.0d) * 0.0174532925199433d;
                        double dH4 = h((((((((((-3.169E-5d) * d3) + 0.006593d) * d3) - 6.3706d) * d3) + 1.602961601209E9d) * d3) + 1072260.70369d) / 3600.0d) * 0.0174532925199433d;
                        double dH5 = h((((((((((-5.939E-5d) * d3) + 0.007702d) * d3) + 7.4722d) * d3) - 6962890.5431d) * d3) + 450160.398036d) / 3600.0d) * 0.0174532925199433d;
                        int i9 = (i4 == 4 ? 77 : 678) - 1;
                        double dB = 0.0d;
                        double dB2 = 0.0d;
                        while (i9 >= 0) {
                            int i10 = i9 * 5;
                            int[] iArr2 = t.N;
                            double dK = k((iArr2[i10 + 4] * dH5) + (iArr2[i10 + 3] * dH4) + (iArr2[i10 + 2] * dH3) + (iArr2[i10 + 1] * dH2) + (iArr2[i10] * dH));
                            double dSin = Math.sin(dK);
                            double dCos = Math.cos(dK);
                            int i11 = i9 * 6;
                            int[] iArr3 = t.O;
                            dB = r.b(iArr3[i11 + 2], dCos, ((iArr3[i11 + 1] * d3) + iArr3[i11]) * dSin, dB);
                            dB2 = r.b(iArr3[i11 + 5], dSin, ((iArr3[i11 + 4] * d3) + iArr3[i11 + 3]) * dCos, dB2);
                            i9--;
                            i8 = i8;
                        }
                        i2 = i8;
                        char c = 0;
                        dArr[0] = dB * 2.7777777777777777E-11d;
                        dArr[1] = dB2 * 2.7777777777777777E-11d;
                        if (i4 == 3) {
                            double dK2 = k((8328.6914269554d * d3) + 2.35555598d);
                            double dK3 = k((628.301955d * d3) + 6.24006013d);
                            double dK4 = k((8433.466158131d * d3) + 1.627905234d);
                            double dK5 = k((7771.3771468121d * d3) + 5.198466741d);
                            double dK6 = k(2.1824392d - (33.757045d * d3));
                            double dK7 = k((2608.7903141574d * d3) + 4.402608842d);
                            double dK8 = k((1021.3285546211d * d3) + 3.176146697d);
                            double dK9 = k((628.3075849991d * d3) + 1.753470314d);
                            double dK10 = k((334.06124267d * d3) + 6.203480913d);
                            double dK11 = k((52.9690962641d * d3) + 0.599546497d);
                            double dK12 = k((21.329910496d * d3) + 0.874016757d);
                            double dK13 = k((7.4781598567d * d3) + 5.481293871d);
                            double dK14 = k((3.8127774d * d3) + 5.321159d);
                            double d4 = ((5.38691E-6d * d3) + 0.02438175d) * d3;
                            int i12 = 686;
                            double dB3 = 0.0d;
                            double dB4 = 0.0d;
                            while (i12 >= 0) {
                                int i13 = i12 * 14;
                                short[] sArr = t.P;
                                double d5 = dK2;
                                double dK15 = k((sArr[i13 + 13] * d4) + (sArr[i13 + 12] * dK14) + (sArr[i13 + 11] * dK13) + (sArr[i13 + 10] * dK12) + (sArr[i13 + 9] * dK11) + (sArr[i13 + 8] * dK10) + (sArr[i13 + 7] * dK9) + (sArr[i13 + 6] * dK8) + (sArr[i13 + 5] * dK7) + (sArr[i13 + 4] * dK6) + (sArr[i13 + 3] * dK5) + (sArr[i13 + 2] * dK4) + (sArr[i13 + 1] * dK3) + (sArr[i13] * dK2));
                                int i14 = i12 * 4;
                                double dSin2 = Math.sin(dK15);
                                double dCos2 = Math.cos(dK15);
                                int[] iArr4 = t.M;
                                dB3 = r.b(iArr4[i14 + 1], dCos2, iArr4[i14] * dSin2, dB3);
                                dB4 = r.b(iArr4[i14 + 3], dCos2, iArr4[i14 + 2] * dSin2, dB4);
                                i12--;
                                dK2 = d5;
                                dK3 = dK3;
                            }
                            dArr[0] = (dB3 * 2.7777777777777777E-11d) + dArr[0];
                            dArr[1] = (dB4 * 2.7777777777777777E-11d) + dArr[1];
                            double d6 = dH3 * 2.0d;
                            double d7 = 2.0d * dH5;
                            double d8 = (d6 - (dH4 * 2.0d)) + d7;
                            double dSin3 = ((((Math.sin(d6 + d7) * 0.6d) + ic1.i(d8, 3.7d, Math.sin(dH5) * 47.8d)) - (Math.sin(d7) * 0.6d)) * d3) + ((Math.sin(dH5) * (-8.1d)) - (Math.sin(d8) * 0.6d));
                            double dCos3 = ((Math.cos(dH5) * (-25.6d)) - (Math.cos(d8) * 1.6d)) * d3;
                            c = 0;
                            dArr[0] = (dSin3 / 3.6E9d) + dArr[0];
                            i3 = 1;
                            dArr[1] = (dCos3 / 3.6E9d) + dArr[1];
                        } else {
                            i3 = 1;
                        }
                        double d9 = dArr[c] * 0.0174532925199433d;
                        dArr[c] = d9;
                        double d10 = dArr[i3] * 0.0174532925199433d;
                        dArr[i3] = d10;
                        if ((i & 524288) != 0 && i6 != i3) {
                            dArr[c] = d9 - 2.0253091528350866E-7d;
                            dArr[i3] = d10 - 3.306041454222148E-8d;
                        }
                        d2 = d;
                    }
                    if (i2 != 0) {
                        int i15 = (int) 1.0E-6d;
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        c(d2 - 0.0d, i15 + 1);
                        throw null;
                    }
                    return;
                }
                i2 = i8;
            }
            zVar.D(d2, dArr);
            if (i2 != 0) {
            }
        }
        i2 = i8;
        if (i2 != 0) {
        }
    }

    public final void D(double d, double[] dArr) {
        int i;
        double[][] dArr2;
        double d2;
        double d3;
        double d4;
        int i2;
        int i3 = 5;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, 5, 8);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, 5, 8);
        double[] dArr5 = new double[5];
        int[] iArr = new int[5];
        int i4 = 2;
        int i5 = this.b.Z[2];
        if (i5 == 0) {
            i5 = 4;
        }
        double d5 = (d - 2451545.0d) / 36525.0d;
        double d6 = d5 * d5;
        double dH = h(((((0.008d * d5) + 7.455d) * d6) + (((-6962890.539d) * d5) + 450160.28d)) / 3600.0d) * 0.0174532925199433d;
        double dH2 = h((((1.29596581224E8d * d5) + 1287099.804d) - (((0.012d * d5) + 0.577d) * d6)) / 3600.0d) * 0.0174532925199433d;
        double dH3 = h(((((0.064d * d5) + 31.31d) * d6) + ((1.717915922633E9d * d5) + 485866.733d)) / 3600.0d) * 0.0174532925199433d;
        double dH4 = h(((((0.011d * d5) - 13.257d) * d6) + ((1.739527263137E9d * d5) + 335778.877d)) / 3600.0d) * 0.0174532925199433d;
        double dH5 = h(((((0.019d * d5) - 6.891d) * d6) + ((1.602961601328E9d * d5) + 1072261.307d)) / 3600.0d) * 0.0174532925199433d;
        dArr5[0] = dH3;
        iArr[0] = 3;
        dArr5[1] = dH2;
        iArr[1] = 2;
        dArr5[2] = dH4;
        iArr[2] = 4;
        dArr5[3] = dH5;
        iArr[3] = 4;
        dArr5[4] = dH;
        iArr[4] = 2;
        for (int i6 = 0; i6 <= 4; i6++) {
            double d7 = dArr5[i6];
            int i7 = iArr[i6];
            double dSin = Math.sin(d7);
            double dCos = Math.cos(d7);
            double[] dArr6 = dArr3[i6];
            dArr6[0] = dSin;
            double[] dArr7 = dArr4[i6];
            dArr7[0] = dCos;
            double d8 = 2.0d * dSin * dCos;
            double d9 = (dCos * dCos) - (dSin * dSin);
            dArr6[1] = d8;
            dArr7[1] = d9;
            int i8 = 2;
            while (i8 < i7) {
                double d10 = (dCos * d8) + (dSin * d9);
                d9 = (d9 * dCos) - (d8 * dSin);
                dArr3[i6][i8] = d10;
                dArr4[i6][i8] = d9;
                i8++;
                d8 = d10;
            }
        }
        double d11 = (((-0.01742d) * d5) - 17.1996d) * dArr3[4][0];
        double d12 = ((8.9E-4d * d5) + 9.2025d) * dArr4[4][0];
        int i9 = 0;
        while (true) {
            short[] sArr = W;
            short s = sArr[i9];
            if (s == -99) {
                dArr[0] = (d11 * 0.0174532925199433d) / 3600.0d;
                dArr[1] = (d12 * 0.0174532925199433d) / 3600.0d;
                return;
            }
            if (i5 == i4 || !(s == 101 || s == 102)) {
                double d13 = 0.0d;
                double d14 = 0.0d;
                int i10 = 0;
                boolean z = false;
                while (i10 < i3) {
                    short s2 = sArr[i9 + i10];
                    if (s2 > 100) {
                        s2 = 0;
                    }
                    if (s2 != 0) {
                        int i11 = (s2 < 0 ? -s2 : s2) - 1;
                        i2 = i5;
                        double d15 = dArr3[i10][i11];
                        if (s2 < 0) {
                            d15 = -d15;
                        }
                        double d16 = dArr4[i10][i11];
                        if (z) {
                            double d17 = (d16 * d14) + (d15 * d13);
                            d13 = (d16 * d13) - (d15 * d14);
                            d14 = d17;
                        } else {
                            d14 = d15;
                            d13 = d16;
                            z = true;
                        }
                    } else {
                        i2 = i5;
                    }
                    i10++;
                    i5 = i2;
                    i3 = 5;
                }
                i = i5;
                double d18 = sArr[i9 + 5] * 1.0E-4d;
                short s3 = sArr[i9 + 6];
                if (s3 != 0) {
                    dArr2 = dArr4;
                    d18 = (d5 * 1.0E-5d * s3) + d18;
                } else {
                    dArr2 = dArr4;
                }
                double d19 = sArr[i9 + 7] * 1.0E-4d;
                short s4 = sArr[i9 + 8];
                if (s4 != 0) {
                    d2 = d5;
                    d19 = (1.0E-5d * d5 * s4) + d19;
                } else {
                    d2 = d5;
                }
                short s5 = sArr[i9];
                if (s5 >= 100) {
                    d18 *= 0.1d;
                    d19 *= 0.1d;
                }
                if (s5 != 102) {
                    d3 = (d18 * d14) + d11;
                    d4 = d19 * d13;
                } else {
                    d3 = (d18 * d13) + d11;
                    d4 = d19 * d14;
                }
                d12 = d4 + d12;
                d11 = d3;
            } else {
                dArr2 = dArr4;
                i = i5;
                d2 = d5;
            }
            i9 += 9;
            dArr4 = dArr2;
            i5 = i;
            d5 = d2;
            i3 = 5;
            i4 = 2;
        }
    }

    public final void G(double[] dArr, int i, double d, int i2, int i3) {
        double d2 = (d - 2451545.0d) / 36525.0d;
        int[] iArr = this.b.Z;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[5];
        if (i4 == 0) {
            i4 = 8;
        }
        if (i5 == 0) {
            i5 = 8;
        }
        if ((i2 & 262144) != 0) {
            d(dArr, i, d, i3, 1);
            return;
        }
        if (i5 == 1 && Math.abs(d2) <= 2.0d) {
            d(dArr, i, d, i3, 1);
            return;
        }
        if (i4 == 1) {
            d(dArr, i, d, i3, 1);
            return;
        }
        if (i5 == 2 && Math.abs(d2) <= 2.0d) {
            d(dArr, i, d, i3, 2);
            return;
        }
        if (i4 == 2) {
            d(dArr, i, d, i3, 2);
            return;
        }
        if (i5 == 3 && Math.abs(d2) <= 75.0d) {
            d(dArr, i, d, i3, 3);
            return;
        }
        if (i4 == 3) {
            d(dArr, i, d, i3, 3);
            return;
        }
        if (i4 == 4) {
            d(dArr, i, d, i3, 4);
            return;
        }
        if (i4 == 5) {
            e(dArr, i, d, i2, i3, 5);
            return;
        }
        if (i4 == 6) {
            e(dArr, i, d, i2, i3, 6);
            return;
        }
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[9];
        if (d == 2451545.0d) {
            return;
        }
        double[] dArr4 = new double[3];
        double[] dArr5 = new double[3];
        double[] dArr6 = new double[3];
        double[] dArr7 = new double[3];
        double dB = 0.0d;
        double dB2 = 0.0d;
        for (int i7 = 0; i7 < 14; i7++) {
            double[][] dArr8 = V;
            double d3 = (6.283185307179586d * d2) / dArr8[0][i7];
            double dSin = Math.sin(d3);
            double dCos = Math.cos(d3);
            dB = r.b(dSin, dArr8[3][i7], dCos * dArr8[1][i7], dB);
            dB2 = r.b(dSin, dArr8[4][i7], dCos * dArr8[2][i7], dB2);
        }
        double d4 = 1.0d;
        for (int i8 = 0; i8 < 4; i8++) {
            double[] dArr9 = U[i8];
            dB = (dArr9[0] * d4) + dB;
            dB2 = (dArr9[1] * d4) + dB2;
            d4 *= d2;
        }
        double d5 = dB * 4.848136811095361E-6d;
        double d6 = dB2 * 4.848136811095361E-6d;
        dArr4[0] = d5;
        dArr4[1] = d6;
        double d7 = (d6 * d6) + (d5 * d5);
        if (d7 < 1.0d) {
            dArr4[2] = Math.sqrt(1.0d - d7);
        } else {
            dArr4[2] = 0.0d;
        }
        double dB3 = 0.0d;
        double dB4 = 0.0d;
        int i9 = 0;
        for (int i10 = 8; i9 < i10; i10 = 8) {
            double[][] dArr10 = T;
            double d8 = (d2 * 6.283185307179586d) / dArr10[0][i9];
            double dSin2 = Math.sin(d8);
            double dCos2 = Math.cos(d8);
            dB3 = r.b(dSin2, dArr10[3][i9], dCos2 * dArr10[1][i9], dB3);
            dB4 = r.b(dSin2, dArr10[4][i9], dCos2 * dArr10[2][i9], dB4);
            i9++;
        }
        double d9 = 1.0d;
        for (int i11 = 0; i11 < 4; i11++) {
            double[] dArr11 = S[i11];
            dB3 = (dArr11[0] * d9) + dB3;
            dB4 = (dArr11[1] * d9) + dB4;
            d9 *= d2;
        }
        double d10 = dB3 * 4.848136811095361E-6d;
        double d11 = dB4 * 4.848136811095361E-6d;
        double d12 = (1.0d - (d10 * d10)) - (d11 * d11);
        double dSqrt = d12 >= 0.0d ? Math.sqrt(d12) : 0.0d;
        double dSin3 = Math.sin(0.40909260060058295d);
        double dCos3 = Math.cos(0.40909260060058295d);
        dArr5[0] = d10;
        double d13 = -d11;
        dArr5[1] = (d13 * dCos3) - (dSqrt * dSin3);
        dArr5[2] = (dSqrt * dCos3) + (d13 * dSin3);
        t(dArr4, dArr5, 0, dArr6);
        double d14 = dArr6[0];
        double d15 = dArr6[1];
        double d16 = (d15 * d15) + (d14 * d14);
        double d17 = dArr6[2];
        double dSqrt2 = Math.sqrt((d17 * d17) + d16);
        dArr7[0] = dArr6[0] / dSqrt2;
        dArr7[1] = dArr6[1] / dSqrt2;
        dArr7[2] = dArr6[2] / dSqrt2;
        t(dArr4, dArr7, 0, dArr6);
        dArr3[0] = dArr7[0];
        dArr3[1] = dArr7[1];
        dArr3[2] = dArr7[2];
        dArr3[3] = dArr6[0];
        dArr3[4] = dArr6[1];
        dArr3[5] = dArr6[2];
        dArr3[6] = dArr4[0];
        dArr3[7] = dArr4[1];
        dArr3[8] = dArr4[2];
        if (i3 == -1) {
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 2) {
                dArr2[i12] = (dArr[i + 2] * dArr3[i13 + 2]) + (dArr[i + 1] * dArr3[i13 + 1]) + (dArr[i] * dArr3[i13]);
                i12++;
                i13 = i12 * 3;
            }
        } else {
            for (int i14 = 0; i14 <= 2; i14++) {
                dArr2[i14] = (dArr[i + 2] * dArr3[i14 + 6]) + (dArr[i + 1] * dArr3[i14 + 3]) + (dArr[i] * dArr3[i14]);
            }
        }
        for (int i15 = 0; i15 < 3; i15++) {
            dArr[i15 + i] = dArr2[i15];
        }
    }

    public final void e(double[] dArr, int i, double d, int i2, int i3, int i4) {
        double[] dArr2 = new double[3];
        if (d == 2451545.0d) {
            return;
        }
        double[] dArr3 = this.N;
        double[] dArr4 = this.M;
        double[] dArr5 = this.w;
        if (i4 != 5) {
            if (i4 == 6) {
                dArr5 = this.n;
                dArr4 = this.t;
                dArr3 = this.u;
            } else if (i4 == 7) {
                dArr5 = this.f;
                dArr4 = this.j;
                dArr3 = this.m;
            }
        }
        double d2 = (d - 2451545.0d) / 36525.0d;
        double dY = i3 == 1 ? y(i2, d) : y(i2, 2451545.0d);
        double dSin = Math.sin(dY);
        double dCos = Math.cos(dY);
        dArr2[0] = dArr[i];
        double d3 = dArr[i + 1];
        double d4 = dArr[i + 2];
        dArr2[2] = (dCos * d4) + ((-dSin) * d3);
        dArr2[1] = (dSin * d4) + (dCos * d3);
        double d5 = d2 / 10.0d;
        double d6 = dArr5[0];
        int i5 = 1;
        for (int i6 = 0; i6 < 9; i6++) {
            d6 = (d6 * d5) + dArr5[i5];
            i5++;
        }
        double d7 = 4.848136811095361E-6d * d5 * d6;
        double d8 = dArr4[0];
        int i7 = 1;
        for (int i8 = 0; i8 < 10; i8++) {
            d8 = (d8 * d5) + dArr4[i7];
            i7++;
        }
        double d9 = i3 == 1 ? d8 + d7 : d8;
        double dCos2 = Math.cos(d9);
        double dSin2 = Math.sin(d9);
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        dArr2[1] = (dCos2 * d11) + ((-dSin2) * d10);
        dArr2[0] = (dSin2 * d11) + (dCos2 * d10);
        double d12 = dArr3[0];
        int i9 = 1;
        for (int i10 = 0; i10 < 10; i10++) {
            d12 = (d12 * d5) + dArr3[i9];
            i9++;
        }
        if (i3 == 1) {
            d12 = -d12;
        }
        double dCos3 = Math.cos(d12);
        double dSin3 = Math.sin(d12);
        double d13 = dArr2[1];
        double d14 = dArr2[2];
        dArr2[2] = (dCos3 * d14) + ((-dSin3) * d13);
        dArr2[1] = (dSin3 * d14) + (dCos3 * d13);
        double d15 = -d8;
        if (i3 != 1) {
            d15 -= d7;
        }
        double dCos4 = Math.cos(d15);
        double dSin4 = Math.sin(d15);
        double d16 = dArr2[0];
        double d17 = dArr2[1];
        dArr2[1] = (dCos4 * d17) + ((-dSin4) * d16);
        dArr2[0] = (dSin4 * d17) + (dCos4 * d16);
        double dY2 = i3 == 1 ? y(i2, 2451545.0d) : y(i2, d);
        double dSin5 = Math.sin(dY2);
        double dCos5 = Math.cos(dY2);
        double d18 = dArr2[1];
        double d19 = dArr2[2];
        dArr2[2] = (dCos5 * d19) + (dSin5 * d18);
        dArr2[1] = (dCos5 * d18) - (dSin5 * d19);
        for (int i11 = 0; i11 < 3; i11++) {
            dArr[i11 + i] = dArr2[i11];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double l(double d, double d2, double d3) {
        double d4;
        double d5;
        double dB;
        double d6;
        int[] iArr = this.b.Z;
        int i = iArr[1];
        int i2 = iArr[3];
        if (i == 0) {
            i = 8;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 != 1 || (d > 2396758.5d && d < 2469807.5d)) {
            double dFloor = Math.floor(d);
            double d7 = d - dFloor;
            if (d7 < 0.5d) {
                d4 = dFloor - 0.5d;
                d5 = d7 + 0.5d;
            } else {
                d4 = dFloor + 0.5d;
                d5 = d7 - 0.5d;
            }
            double d8 = d5 * 86400.0d;
            double d9 = (d4 - 2451545.0d) / 36525.0d;
            if (i2 == 2) {
                double dB2 = ((p.b(d) + d) - 2451545.0d) / 36525.0d;
                double dH = ((((((((((((-3.68E-8d) * dB2) - 2.9956E-5d) * dB2) - 4.4E-7d) * dB2) + 1.3915817d) * dB2) + 4612.156534d) * dB2) + 0.014506d) / 3600.0d) + h((((d - 2451545.0d) * 1.0027378119113546d) + 0.779057273264d) * 360.0d);
                double[] dArr = {k((8328.6914269554d * dB2) + 2.35555598d), k((628.301955d * dB2) + 6.24006013d), k((8433.466158131d * dB2) + 1.627905234d), k((7771.3771468121d * dB2) + 5.198466741d), k(2.1824392d - (33.757045d * dB2)), k((2608.7903141574d * dB2) + 4.402608842d), k((1021.3285546211d * dB2) + 3.176146697d), k((628.3075849991d * dB2) + 1.753470314d), k((334.06124267d * dB2) + 6.203480913d), k((52.9690962641d * dB2) + 0.599546497d), k((21.329910496d * dB2) + 0.874016757d), k((7.4781598567d * dB2) + 5.481293871d), k((3.8127774d * dB2) + 5.321159d), ((5.38691E-6d * dB2) + 0.02438175d) * dB2};
                double dSin = Math.sin(dArr[4]) * (-0.87d) * dB2;
                for (int i3 = 0; i3 < 33; i3++) {
                    double d10 = 0.0d;
                    for (int i4 = 0; i4 < 14; i4++) {
                        d10 += X[(i3 * 14) + i4] * dArr[i4];
                    }
                    int i5 = i3 * 2;
                    double[] dArr2 = this.P;
                    dSin += (Math.cos(d10) * dArr2[i5 + 1]) + (Math.sin(d10) * dArr2[i5]);
                }
                dB = (h((dSin / 3.6E9d) + dH) / 15.0d) * 3600.0d;
            } else if (i >= 3) {
                double dB3 = ((p.b(d4) + d4) - 2451545.0d) / 36525.0d;
                dB = ((((((((((((-1.227E-8d) * dB3) - 7.98832E-6d) * dB3) - 8.778E-7d) * dB3) + 0.18554422d) * dB3) + 8640184.79447825d) / 3.15576E9d) + 1.0d) * d8) + r.b(d9, 8640184.79447825d, ((dB3 - d9) * 307.4771013d) + ((((((((-2.454E-9d) * dB3) - 1.99708E-6d) * dB3) - 2.926E-7d) * dB3) + 0.09277211d) * dB3 * dB3), 24110.5493771d);
            } else {
                dB = ((((((-6.2E-6d) * d9) + 0.093104d) * d9) + 8640184.812866d) * d9) + 24110.54841d + ((((((((-1.86E-5d) * d9) + 0.186208d) * d9) + 8640184.812866d) / 3.15576E9d) + 1.0d) * d8);
            }
            double dCos = (Math.cos(0.0174532925199433d * d2) * 240.0d * d3) + dB;
            return (dCos - (Math.floor(dCos / 86400.0d) * 86400.0d)) / 3600.0d;
        }
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[2];
        double d11 = d2 * 57.2957795130823d;
        double d12 = d3 * 57.2957795130823d;
        double dB4 = p.b(d) + d;
        double d13 = (dB4 - 2451545.0d) / 365250.0d;
        double d14 = d13 * d13;
        double[] dArr5 = {h((((((d13 * 1.29597742283429E9d) - (d14 * 2.04411d)) - ((d13 * d14) * 0.00523d)) / 3600.0d) + 100.46645683d) - 0.005692619558765017d) * 0.0174532925199433d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d};
        dArr3[0] = 23.45d;
        dArr3[1] = 23.45d;
        dArr3[1] = y(0, p.b(2451545.0d) + 2451545.0d) * 57.2957795130823d;
        E(dArr5, 0, dArr5, 0);
        q((-dArr3[1]) * 0.0174532925199433d, dArr5, dArr5);
        G(dArr5, 0, dB4, 0, -1);
        dArr3[1] = y(0, dB4) * 57.2957795130823d;
        C(dB4, 0, dArr4);
        double d15 = dArr3[1];
        dArr3[0] = (dArr4[1] * 57.2957795130823d) + d15;
        dArr3[2] = dArr4[0] * 57.2957795130823d;
        q(d15 * 0.0174532925199433d, dArr5, dArr5);
        o(dArr5, 0, dArr5, 0);
        double d16 = dArr5[0] * 57.2957795130823d;
        dArr5[0] = d16;
        double d17 = ((d - 0.5d) % 1.0d) * 360.0d;
        if (d11 == 0.0d) {
            dArr5[0] = (Math.cos(dArr3[0] * 0.0174532925199433d) * dArr3[2]) + d16;
        } else {
            dArr5[0] = (Math.cos(d11 * 0.0174532925199433d) * d12) + d16;
        }
        double dH2 = h(dArr5[0] + d17);
        dArr5[0] = dH2;
        double d18 = dH2 / 15.0d;
        if (d > 2396758.5d) {
            d6 = d >= 2469807.5d ? -0.0043595532666666666d : 0.0021885756666666666d;
            if (d18 >= 24.0d) {
                d18 -= 24.0d;
            }
            return d18 >= 0.0d ? d18 + 24.0d : d18;
        }
        d18 -= d6;
        if (d18 >= 24.0d) {
        }
        if (d18 >= 0.0d) {
        }
    }

    public final void m(double[] dArr, double d, int i, boolean z) {
        double d2;
        double d3 = (d - 2437846.5d) / 365.25d;
        int[] iArr = this.b.Z;
        int i2 = iArr[5];
        int i3 = iArr[6];
        if (i3 == 0) {
            i3 = 1;
        }
        if ((i & 524288) != 0 && i3 == 1) {
            double[] dArr2 = this.O;
            if (d3 < 0.0d) {
                d2 = dArr2[0];
            } else if (d3 >= 50.0d) {
                d2 = dArr2[50];
            } else {
                double d4 = (int) d3;
                double d5 = dArr2[(int) d4];
                d2 = ((d5 - dArr2[(int) (1.0d + d4)]) * (d3 - d4)) + d5;
            }
            double d6 = d2 / 3600000.0d;
            o(dArr, 0, dArr, 0);
            if (z) {
                dArr[0] = dArr[0] - (d6 * 0.0174532925199433d);
            } else {
                dArr[0] = (d6 * 0.0174532925199433d) + dArr[0];
            }
            E(dArr, 0, dArr, 0);
        }
    }

    public final void n(double[] dArr, double d, int i) {
        double[] dArr2 = new double[6];
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
        int[] iArr = this.b.Z;
        int i2 = iArr[4];
        int i3 = iArr[5];
        int i4 = iArr[6];
        if (i2 == 0) {
            i2 = 2;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        if ((524288 & i) == 0 || i4 == 1) {
            if (i2 == 2) {
                double[] dArr4 = dArr3[0];
                dArr4[0] = 0.9999999999999941d;
                double[] dArr5 = dArr3[1];
                dArr5[0] = -7.078368961E-8d;
                double[] dArr6 = dArr3[2];
                dArr6[0] = 8.056213978E-8d;
                dArr4[1] = 7.078368695E-8d;
                dArr5[1] = 0.999999999999997d;
                dArr6[1] = 3.306428553E-8d;
                dArr4[2] = -8.056214212E-8d;
                dArr5[2] = -3.306427981E-8d;
                dArr6[2] = 0.9999999999999963d;
            } else {
                double[] dArr7 = dArr3[0];
                dArr7[0] = 0.9999999999999942d;
                double[] dArr8 = dArr3[1];
                dArr8[0] = -7.07827974E-8d;
                double[] dArr9 = dArr3[2];
                dArr9[0] = 8.05621715E-8d;
                dArr7[1] = 7.07827948E-8d;
                dArr8[1] = 0.9999999999999969d;
                dArr9[1] = 3.30604145E-8d;
                dArr7[2] = -8.05621738E-8d;
                dArr8[2] = -3.30604088E-8d;
                dArr9[2] = 0.9999999999999962d;
            }
            for (int i5 = 0; i5 <= 2; i5++) {
                double d2 = dArr[0];
                double[] dArr10 = dArr3[0];
                double d3 = d2 * dArr10[i5];
                double d4 = dArr[1];
                double[] dArr11 = dArr3[1];
                double d5 = (d4 * dArr11[i5]) + d3;
                double d6 = dArr[2];
                double[] dArr12 = dArr3[2];
                dArr2[i5] = (d6 * dArr12[i5]) + d5;
                if ((i & 256) != 0) {
                    dArr2[i5 + 3] = (dArr[5] * dArr12[i5]) + (dArr[4] * dArr11[i5]) + (dArr[3] * dArr10[i5]);
                }
            }
            m(dArr2, d, i, false);
            for (int i6 = 0; i6 <= 2; i6++) {
                dArr[i6] = dArr2[i6];
            }
            if ((i & 256) != 0) {
                for (int i7 = 3; i7 <= 5; i7++) {
                    dArr[i7] = dArr2[i7];
                }
            }
        }
    }

    public final double y(int i, double d) {
        int i2;
        double d2;
        double d3;
        double d4;
        double d5;
        int[] iArr = this.b.Z;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[5];
        int i6 = iArr[6];
        if (i3 == 0) {
            i3 = 8;
        }
        if (i4 == 0) {
            i4 = 8;
        }
        if (i6 == 0) {
            i6 = 1;
        }
        double d6 = (d - 2451545.0d) / 36525.0d;
        if ((i & 262144) != 0 || (((i2 = i & 524288) != 0 && i6 != 1) || ((i4 == 1 && Math.abs(d6) <= 2.0d) || i3 == 1))) {
            d5 = (((((0.001813d * d6) - 5.9E-4d) * d6) - 46.815d) * d6) + 84381.448d;
        } else {
            if ((i4 != 2 || Math.abs(d6) > 2.0d) && i3 != 2) {
                if ((i4 == 3 && Math.abs(d6) <= 75.0d) || i3 == 3) {
                    return ((((((((((((-4.34E-8d) * d6) - 5.76E-7d) * d6) + 0.0020034d) * d6) - 1.831E-4d) * d6) - 46.836769d) * d6) + 84381.406d) * 0.0174532925199433d) / 3600.0d;
                }
                if (i3 == 4) {
                    d3 = (((((((((((-3.0E-11d) * d6) - 2.48E-8d) * d6) - 5.23E-7d) * d6) + 0.00199911d) * d6) - 1.667E-4d) * d6) - 46.836051d) * d6;
                    d4 = 84381.4088d;
                } else if (i3 == 6) {
                    d3 = ((((((((2.5E-8d * d6) - 5.1E-7d) * d6) + 0.0019989d) * d6) - 1.52E-4d) * d6) - 46.80927d) * d6;
                    d4 = 84381.412d;
                } else {
                    if (i3 != 7) {
                        if (i3 == 5) {
                            double d7 = d6 / 10.0d;
                            return ((((((((((((((((((((2.45E-10d * d7) + 5.79E-9d) * d7) + 2.787E-7d) * d7) + 7.12E-7d) * d7) - 3.905E-5d) * d7) - 0.0024967d) * d7) - 0.005138d) * d7) + 1.99925d) * d7) - 0.0155d) * d7) - 468.093d) * d7) + 84381.448d) * 4.848136811095361E-6d;
                        }
                        double[] dArr = new double[1];
                        A(d, null, dArr);
                        double d8 = dArr[0];
                        if (i2 == 0 || i6 != 1) {
                            return d8;
                        }
                        double d9 = (d - 2437846.5d) / 365.25d;
                        double[] dArr2 = this.e;
                        if (d9 < 0.0d) {
                            d2 = dArr2[0];
                        } else if (d9 >= 50.0d) {
                            d2 = dArr2[50];
                        } else {
                            double d10 = (int) d9;
                            double d11 = dArr2[(int) d10];
                            d2 = ((d11 - dArr2[(int) (1.0d + d10)]) * (d9 - d10)) + d11;
                        }
                        return ((d2 / 3600000.0d) * 0.0174532925199433d) + d8;
                    }
                    d3 = (((((((-1.0E-6d) * d6) + 0.002d) * d6) - 1.74E-4d) * d6) - 46.83396d) * d6;
                    d4 = 84381.409d;
                }
                return ((d3 + d4) * 0.0174532925199433d) / 3600.0d;
            }
            d5 = (((((0.001813d * d6) - 5.9E-4d) * d6) - 46.84024d) * d6) + 84381.406d;
        }
        return (d5 * 0.0174532925199433d) / 3600.0d;
    }
}