package a0;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.bx;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.kf1;
import com.google.android.gms.internal.ads.la0;
import com.google.android.gms.internal.ads.qf1;
import com.google.android.gms.internal.ads.s70;
import com.google.android.gms.internal.ads.sf1;
import com.google.android.gms.internal.ads.ta1;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.z0;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract /* synthetic */ class h {
    public static StringBuilder A(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder B(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static /* synthetic */ void C(View view) {
        if (view != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void D(Object obj) {
        throw new ClassCastException();
    }

    public static int E(int i10, int i11, int i12, int i13) {
        return ta1.j0(i10) + i11 + i12 + i13;
    }

    public static String F(String str, String str2) {
        return str + str2;
    }

    public static String G(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String H(int i10) {
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return "UNKNOWN_PREFIX";
            case 2:
                return "TINK";
            case 3:
                return "LEGACY";
            case 4:
                return "RAW";
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return "CRUNCHY";
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return "UNRECOGNIZED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String I(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String J(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String K(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static final void a(int i10, View view) {
        int i11;
        if (i10 == 0) {
            throw null;
        }
        int i12 = i10 - 1;
        if (i12 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            i11 = 0;
        } else if (i12 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i11 = 8;
        } else {
            if (i12 != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 4) {
            return 4;
        }
        if (i10 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(kc.r.d("Unknown visibility ", i10));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static final int d(int i10) {
        if (i10 != 6) {
            return i(i10);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int e(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 == 1) {
            return "htmlDisplay";
        }
        if (i10 == 2) {
            return "nativeDisplay";
        }
        if (i10 == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 == 1) {
            return "beginToRender";
        }
        if (i10 == 2) {
            return "definedByJavascript";
        }
        if (i10 == 3) {
            return "onePixel";
        }
        if (i10 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int h(int i10) {
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return 4;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int i(int i10) {
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return 4;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return -1;
            default:
                throw null;
        }
    }

    public static int j(int i10, int i11, int i12) {
        return ta1.j0(i10) + i11 + i12;
    }

    public static int k(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static Bundle l(j1 j1Var, f0 f0Var, int i10, long j10) {
        j1Var.b(new z0(j1Var, f0Var, i10));
        return f0Var.A(j10);
    }

    public static RemoteException m(String str, Throwable th) {
        wr.e(str, th);
        return new RemoteException();
    }

    public static sf1 n(qf1 qf1Var, int i10) {
        return kf1.b(new bx(qf1Var, i10));
    }

    public static sf1 o(sf1 sf1Var, la0 la0Var, int i10) {
        return kf1.b(new s70(sf1Var, la0Var, i10));
    }

    public static sf1 p(sf1 sf1Var, la0 la0Var, sf1 sf1Var2, int i10) {
        return kf1.b(new gq(sf1Var, la0Var, sf1Var2, i10));
    }

    public static sf1 q(sf1 sf1Var, sf1 sf1Var2, int i10) {
        return kf1.b(new xq(sf1Var, sf1Var2, i10));
    }

    public static String r(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String s(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String t(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String u(String str, Class cls) {
        return str + cls;
    }

    public static String v(String str, String str2) {
        return str + str2;
    }

    public static String w(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String x(StringBuilder sb, long j10, String str) {
        sb.append(j10);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder y(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder z(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i11);
        sb.append(str3);
        return sb;
    }
}