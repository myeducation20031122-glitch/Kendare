package g;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class o0 extends androidx.activity.o implements q {

    /* renamed from: j, reason: collision with root package name */
    public m0 f12882j;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f12883m;

    /* JADX WARN: Type inference failed for: r2v2, types: [g.n0] */
    public o0(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903452, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f12883m = new o0.m() { // from class: g.n0
            @Override // o0.m
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f12880b.f(keyEvent);
            }
        };
        x xVarD = d();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130903452, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((m0) xVarD).f12874w0 = i10;
        xVarD.d();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m0 m0Var = (m0) d();
        m0Var.x();
        ((ViewGroup) m0Var.f12855d0.findViewById(R.id.content)).addView(view, layoutParams);
        m0Var.P.a(m0Var.O.getCallback());
    }

    public final x d() {
        if (this.f12882j == null) {
            v vVar = x.f12919b;
            this.f12882j = new m0(getContext(), getWindow(), this, this);
        }
        return this.f12882j;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.d.p(this.f12883m, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        com.bumptech.glide.c.g(getWindow().getDecorView(), this);
        com.bumptech.glide.e.L(getWindow().getDecorView(), this);
        g5.a.y(getWindow().getDecorView(), this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        m0 m0Var = (m0) d();
        m0Var.x();
        return m0Var.O.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        m0 m0Var = (m0) d();
        m0Var.C();
        b bVar = m0Var.R;
        if (bVar != null) {
            bVar.s(false);
        }
    }

    @Override // g.q
    public final void onSupportActionModeFinished(k.b bVar) {
    }

    @Override // g.q
    public final void onSupportActionModeStarted(k.b bVar) {
    }

    @Override // g.q
    public final k.b onWindowStartingSupportActionMode(k.a aVar) {
        return null;
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void setContentView(int i10) {
        e();
        d().i(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        d().l(getContext().getString(i10));
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().j(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().k(view, layoutParams);
    }
}