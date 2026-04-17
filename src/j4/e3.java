package j4;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.sr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3 f13679a = new e3();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c3 a(Context context, c2 c2Var) {
        boolean z7;
        String str;
        int i10;
        String className;
        Date date = c2Var.f13645a;
        long time = date != null ? date.getTime() : -1L;
        int i11 = c2Var.f13647c;
        Set set = c2Var.f13648d;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        c4.p pVar = (c4.p) i2.f().f13745h;
        sr srVar = o.f13771f.f13772a;
        String strM = sr.m(context);
        if (!c2Var.f13651g.contains(strM)) {
            pVar.getClass();
            z7 = new ArrayList(pVar.f2126d).contains(strM);
        }
        Bundle bundle = c2Var.f13649e.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i12 = 0;
            while (true) {
                i10 = i12 + 1;
                if (i10 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i12];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (sr.f8513c.equalsIgnoreCase(className2) || sr.f8514d.equalsIgnoreCase(className2) || sr.f8515e.equalsIgnoreCase(className2) || sr.f8516f.equalsIgnoreCase(className2) || sr.f8517g.equalsIgnoreCase(className2) || sr.f8518h.equalsIgnoreCase(className2))) {
                    break;
                }
                i12 = i10;
            }
            className = stackTrace[i10].getClassName();
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    for (int i13 = 2; i13 > 0 && stringTokenizer.hasMoreElements(); i13--) {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
                str = className;
            }
        } else {
            str = null;
        }
        boolean z10 = c2Var.f13654j;
        c4.p pVar2 = (c4.p) i2.f().f13745h;
        int iMax = Math.max(c2Var.f13650f, pVar2.f2123a);
        int iMax2 = Math.max(-1, pVar2.f2124b);
        String[] strArr = new String[2];
        strArr[0] = null;
        String str2 = pVar2.f2125c;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        return new c3(8, time, bundle, i11, listUnmodifiableList, z7, iMax, false, null, null, null, null, c2Var.f13649e, c2Var.f13652h, Collections.unmodifiableList(new ArrayList(c2Var.f13653i)), null, str, z10, null, iMax2, (String) Collections.max(Arrays.asList(strArr), d3.f13671b), new ArrayList(c2Var.f13646b), c2Var.f13655k, null);
    }
}