package d2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12293b = o.t("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f12294a;

    public a(Context context) {
        this.f12294a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}