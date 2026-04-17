package l4;

import android.util.Log;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.wr;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b0 extends wr {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            Iterator itJ = wr.f9579a.j(str);
            boolean z7 = true;
            while (itJ.hasNext()) {
                String str2 = (String) itJ.next();
                if (z7) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return wr.j(2) && ((Boolean) lf.f6296a.k()).booleanValue();
    }
}