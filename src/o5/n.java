package o5;

import android.os.Handler;
import android.webkit.WebView;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends WebView {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15770j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15771b;

    /* renamed from: e, reason: collision with root package name */
    public final android.support.v4.media.b f15772e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15773f;

    public n(p pVar, Handler handler, android.support.v4.media.b bVar) {
        super(pVar);
        this.f15773f = false;
        this.f15771b = handler;
        this.f15772e = bVar;
    }

    public final void a(String str, String str2) {
        this.f15771b.post(new u0(this, kc.r.h(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"), 3));
    }
}