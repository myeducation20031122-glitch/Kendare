package e0;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public w f12454a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f12455b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f12456c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12457d = false;

    public void a(Bundle bundle) {
        if (this.f12457d) {
            bundle.putCharSequence("android.summaryText", this.f12456c);
        }
        CharSequence charSequence = this.f12455b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(g0 g0Var);

    public abstract String c();
}