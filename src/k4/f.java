package k4;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public final l4.j f13991b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13992e;

    public f(Activity activity, String str, String str2, String str3) {
        super(activity);
        l4.j jVar = new l4.j(activity);
        jVar.f14608c = str;
        this.f13991b = jVar;
        jVar.f14610e = str2;
        jVar.f14609d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13992e) {
            return false;
        }
        this.f13991b.a(motionEvent);
        return false;
    }
}