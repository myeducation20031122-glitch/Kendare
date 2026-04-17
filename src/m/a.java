package m;

import androidx.appcompat.widget.ActionBarContextView;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements o0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14701a;

    /* renamed from: b, reason: collision with root package name */
    public int f14702b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14703c;

    public a(SimpleType simpleType, int i10, boolean z7) {
        this.f14703c = simpleType;
        this.f14702b = i10;
        this.f14701a = z7;
    }

    @Override // o0.p1
    public final void a() {
        if (this.f14701a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f14703c;
        actionBarContextView.f637n = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f14702b);
    }

    @Override // o0.p1
    public final void b() {
        this.f14701a = true;
    }

    @Override // o0.p1
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f14701a = false;
    }
}