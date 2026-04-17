package d9;

import android.content.Context;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements a9.d {

    /* renamed from: b, reason: collision with root package name */
    public static final q6.b f12363b = new q6.b(12, 0);

    /* renamed from: c, reason: collision with root package name */
    public static volatile a9.d f12364c;

    /* renamed from: a, reason: collision with root package name */
    public final b f12365a;

    public a(Context context) {
        this.f12365a = new b(context);
        Intrinsics.e(PreferenceManager.getDefaultSharedPreferences(context), "getDefaultSharedPreferences(context)");
    }
}