package o5;

import android.app.Application;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import g.v0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static c f15706n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15707a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15708b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15709c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15710d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15711e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15712f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15713g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15714h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f15715i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f15716j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f15717k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f15718l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f15719m;

    public c(Application application) {
        this.f15707a = this;
        if (application == null) {
            throw new NullPointerException("instance cannot be null");
        }
        d9.c cVar = new d9.c(application);
        this.f15708b = cVar;
        int i10 = 0;
        c0 c0VarA = a0.a(new g(cVar, i10));
        this.f15709c = c0VarA;
        c0 c0VarA2 = a0.a(u.f15794b);
        this.f15710d = c0VarA2;
        v0 v0Var = new v0(this, 27);
        this.f15711e = v0Var;
        c0 c0VarA3 = a0.a(new l(v0Var, i10));
        this.f15712f = c0VarA3;
        v vVar = new v(cVar);
        this.f15713g = vVar;
        h0 h0Var = new h0(cVar, vVar, c0VarA);
        this.f15714h = h0Var;
        c0 c0VarA4 = a0.a(new l(y.f15802b, 1));
        this.f15715i = c0VarA4;
        e eVar = new e(cVar, c0VarA);
        this.f15716j = eVar;
        a aVar = new a(c0VarA4, eVar, c0VarA);
        this.f15717k = aVar;
        this.f15719m = a0.a(new d(c0VarA, new j0(cVar, c0VarA2, c0VarA, c0VarA3, h0Var, aVar, c0VarA4), c0VarA3, 2));
    }

    public static c a(Context context) {
        c cVar;
        synchronized (c.class) {
            try {
                if (f15706n == null) {
                    a5.x xVar = new a5.x(0);
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    xVar.f423e = application;
                    f15706n = new c(application);
                }
                cVar = f15706n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public c(ConstraintLayout constraintLayout, TextView textView, EditText editText, TextView textView2, EditText editText2, TextView textView3, EditText editText3, Button button, TextView textView4, EditText editText4, FrameLayout frameLayout, ConstraintLayout constraintLayout2, NativeAdView nativeAdView) {
        this.f15707a = constraintLayout;
        this.f15708b = textView;
        this.f15709c = editText;
        this.f15710d = textView2;
        this.f15711e = editText2;
        this.f15712f = textView3;
        this.f15713g = editText3;
        this.f15714h = button;
        this.f15715i = textView4;
        this.f15716j = editText4;
        this.f15717k = frameLayout;
        this.f15719m = nativeAdView;
    }
}