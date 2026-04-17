package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f12416a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f12417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12420e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f12421f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f12422g;

    public q(int i10, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = i10 == 0 ? null : IconCompat.b(i10);
        Bundle bundle = new Bundle();
        this.f12419d = true;
        this.f12417b = iconCompatB;
        if (iconCompatB != null && iconCompatB.e() == 2) {
            this.f12420e = iconCompatB.d();
        }
        this.f12421f = w.b(str);
        this.f12422g = pendingIntent;
        this.f12416a = bundle;
        this.f12418c = true;
        this.f12419d = true;
    }
}