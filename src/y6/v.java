package y6;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f19386e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f19387f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f19388g;

    public v(n nVar, int i10) {
        super(nVar);
        this.f19386e = 2131165352;
        this.f19388g = new com.google.android.material.datepicker.m(this, 3);
        if (i10 != 0) {
            this.f19386e = i10;
        }
    }

    @Override // y6.o
    public final void b() {
        q();
    }

    @Override // y6.o
    public final int c() {
        return 2131886840;
    }

    @Override // y6.o
    public final int d() {
        return this.f19386e;
    }

    @Override // y6.o
    public final View.OnClickListener f() {
        return this.f19388g;
    }

    @Override // y6.o
    public final boolean k() {
        return true;
    }

    @Override // y6.o
    public final boolean l() {
        EditText editText = this.f19387f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // y6.o
    public final void m(EditText editText) {
        this.f19387f = editText;
        q();
    }

    @Override // y6.o
    public final void r() {
        EditText editText = this.f19387f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f19387f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // y6.o
    public final void s() {
        EditText editText = this.f19387f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}