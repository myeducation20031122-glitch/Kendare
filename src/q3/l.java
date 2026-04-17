package q3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Object f16188a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16189b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16190c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16191d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16192e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16193f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16194g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16195h;

    /* renamed from: i, reason: collision with root package name */
    public Object f16196i;

    /* renamed from: j, reason: collision with root package name */
    public Object f16197j;

    /* renamed from: k, reason: collision with root package name */
    public Object f16198k;

    /* renamed from: l, reason: collision with root package name */
    public Object f16199l;

    public l(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f16188a = new v6.i();
        this.f16189b = new v6.i();
        this.f16190c = new v6.i();
        this.f16191d = new v6.i();
        this.f16192e = new v6.a(0.0f);
        this.f16193f = new v6.a(0.0f);
        this.f16194g = new v6.a(0.0f);
        this.f16195h = new v6.a(0.0f);
        this.f16196i = j4.g();
        this.f16197j = j4.g();
        this.f16198k = j4.g();
        this.f16199l = j4.g();
    }

    public static void b(c4.c cVar) {
        Object obj;
        if (cVar instanceof v6.i) {
            obj = (v6.i) cVar;
        } else if (!(cVar instanceof v6.d)) {
            return;
        } else {
            obj = (v6.d) cVar;
        }
        obj.getClass();
    }

    public final v6.j a() {
        v6.j jVar = new v6.j();
        jVar.f18450a = (c4.c) this.f16188a;
        jVar.f18451b = (c4.c) this.f16189b;
        jVar.f18452c = (c4.c) this.f16190c;
        jVar.f18453d = (c4.c) this.f16191d;
        jVar.f18454e = (v6.c) this.f16192e;
        jVar.f18455f = (v6.c) this.f16193f;
        jVar.f18456g = (v6.c) this.f16194g;
        jVar.f18457h = (v6.c) this.f16195h;
        jVar.f18458i = (v6.e) this.f16196i;
        jVar.f18459j = (v6.e) this.f16197j;
        jVar.f18460k = (v6.e) this.f16198k;
        jVar.f18461l = (v6.e) this.f16199l;
        return jVar;
    }

    public /* synthetic */ l(ViewGroup viewGroup, View view, View view2, View view3, ConstraintLayout constraintLayout, View view4, View view5, TextView textView, TextView textView2, TextView textView3, View view6, ViewGroup viewGroup2) {
        this.f16188a = viewGroup;
        this.f16189b = view;
        this.f16190c = view2;
        this.f16191d = view3;
        this.f16192e = constraintLayout;
        this.f16193f = view4;
        this.f16194g = view5;
        this.f16195h = textView;
        this.f16196i = textView2;
        this.f16197j = textView3;
        this.f16198k = view6;
        this.f16199l = viewGroup2;
    }
}