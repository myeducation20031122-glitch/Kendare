package j8;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f13865b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13866c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f13867d;

    /* renamed from: a, reason: collision with root package name */
    public final n7.c f13868a;

    public j(n7.c cVar) {
        this.f13868a = cVar;
    }

    public final boolean a(k8.a aVar) {
        if (TextUtils.isEmpty(aVar.f14032c)) {
            return true;
        }
        long j10 = aVar.f14035f + aVar.f14034e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f13868a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f13865b;
    }
}