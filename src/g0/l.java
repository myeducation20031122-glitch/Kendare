package g0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f12964a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f12965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12966c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f12964a = colorStateList;
        this.f12965b = configuration;
        this.f12966c = theme == null ? 0 : theme.hashCode();
    }
}