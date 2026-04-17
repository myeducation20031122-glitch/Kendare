package t5;

import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17548a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17549b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17550c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q3 f17552e;

    public p3(q3 q3Var, String str, boolean z7) {
        this.f17552e = q3Var;
        fc.t.g(str);
        this.f17548a = str;
        this.f17549b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor editorEdit = this.f17552e.s().edit();
        editorEdit.putBoolean(this.f17548a, z7);
        editorEdit.apply();
        this.f17551d = z7;
    }

    public final boolean b() {
        if (!this.f17550c) {
            this.f17550c = true;
            this.f17551d = this.f17552e.s().getBoolean(this.f17548a, this.f17549b);
        }
        return this.f17551d;
    }
}