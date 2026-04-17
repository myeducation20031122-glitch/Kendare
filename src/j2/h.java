package j2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13589a = z1.o.t("ProcessUtils");

    public static boolean a(Context context, z1.b bVar) {
        String strP;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            strP = a3.a.p();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, h.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
            } catch (Throwable th) {
                z1.o.r().p(f13589a, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                strP = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
                    strP = null;
                } else {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            strP = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    strP = null;
                }
            }
        }
        bVar.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(strP, null) : TextUtils.equals(strP, context.getApplicationInfo().processName);
    }
}