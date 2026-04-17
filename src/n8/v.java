package n8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f15447d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15448a;

    /* renamed from: b, reason: collision with root package name */
    public m2.b f15449b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f15450c;

    public v(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f15450c = scheduledExecutorService;
        this.f15448a = sharedPreferences;
    }

    public final synchronized u a() {
        u uVar;
        String strB = this.f15449b.b();
        Pattern pattern = u.f15443d;
        uVar = null;
        if (!TextUtils.isEmpty(strB)) {
            String[] strArrSplit = strB.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }

    public final synchronized void b() {
        this.f15449b = m2.b.a(this.f15448a, this.f15450c);
    }

    public final synchronized void c(u uVar) {
        this.f15449b.c(uVar.f15446c);
    }
}