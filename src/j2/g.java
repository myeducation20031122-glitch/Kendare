package j2;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13588a = z1.o.t("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z7) {
        String str = f13588a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z7 ? 1 : 2, 1);
            z1.o oVarR = z1.o.r();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z7 ? "enabled" : "disabled";
            oVarR.p(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            z1.o oVarR2 = z1.o.r();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z7 ? "enabled" : "disabled";
            oVarR2.p(str, String.format("%s could not be %s", objArr2), e10);
        }
    }
}