package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.h1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f19346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f19348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f19349e;

    public p(r rVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f19349e = rVar;
        this.f19345a = i10;
        this.f19346b = textView;
        this.f19347c = i11;
        this.f19348d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var;
        int i10 = this.f19345a;
        r rVar = this.f19349e;
        rVar.f19364n = i10;
        rVar.f19362l = null;
        TextView textView = this.f19346b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f19347c == 1 && (h1Var = rVar.f19368r) != null) {
                h1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f19348d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f19348d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}