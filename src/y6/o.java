package y6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f19341a;

    /* renamed from: b, reason: collision with root package name */
    public final n f19342b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19343c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f19344d;

    public o(n nVar) {
        this.f19341a = nVar.f19331b;
        this.f19342b = nVar;
        this.f19343c = nVar.getContext();
        this.f19344d = nVar.f19338t;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public e0.g h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(p0.h hVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z7) {
    }

    public final void q() {
        this.f19342b.f(false);
    }

    public abstract void r();

    public void s() {
    }
}