package a5;

import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f419b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z4.j f420e;

    public v(Intent intent, z4.j jVar) {
        this.f419b = intent;
        this.f420e = jVar;
    }

    @Override // a5.w
    public final void a() {
        Intent intent = this.f419b;
        if (intent != null) {
            this.f420e.startActivityForResult(intent, 2);
        }
    }
}