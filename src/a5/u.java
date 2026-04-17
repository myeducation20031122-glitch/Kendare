package a5;

import android.app.Activity;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f416b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f418f = 2;

    public u(Activity activity, Intent intent) {
        this.f416b = intent;
        this.f417e = activity;
    }

    @Override // a5.w
    public final void a() {
        Intent intent = this.f416b;
        if (intent != null) {
            this.f417e.startActivityForResult(intent, this.f418f);
        }
    }
}