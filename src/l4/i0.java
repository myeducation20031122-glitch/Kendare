package l4;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.sr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class i0 extends h0 {
    @Override // w2.k
    public final boolean l(Activity activity, Configuration configuration) {
        ce ceVar = ge.Y3;
        j4.q qVar = j4.q.f13781d;
        if (!((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
            return false;
        }
        ce ceVar2 = ge.f4639a4;
        fe feVar = qVar.f13784c;
        if (((Boolean) feVar.a(ceVar2)).booleanValue()) {
            return d2.c.t(activity);
        }
        sr srVar = j4.o.f13771f.f13772a;
        int i10 = sr.i(activity.getResources().getDisplayMetrics(), configuration.screenHeightDp);
        int i11 = sr.i(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        g0 g0Var = i4.k.A.f13348c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i12 = displayMetrics.heightPixels;
        int i13 = displayMetrics.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) feVar.a(ge.W3)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return !(Math.abs(i12 - (i10 + dimensionPixelSize)) <= iIntValue) || Math.abs(i13 - i11) > iIntValue;
    }
}