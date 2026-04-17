package z0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends v6.e {

    /* renamed from: j, reason: collision with root package name */
    public final h f19441j;

    public i(TextView textView) {
        super(10, (Object) null);
        this.f19441j = new h(textView);
    }

    @Override // v6.e
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        return (l.f867k != null) ^ true ? inputFilterArr : this.f19441j.i(inputFilterArr);
    }

    @Override // v6.e
    public final boolean q() {
        return this.f19441j.f19440n;
    }

    @Override // v6.e
    public final void t(boolean z7) {
        if (!(l.f867k != null)) {
            return;
        }
        this.f19441j.t(z7);
    }

    @Override // v6.e
    public final void w(boolean z7) {
        boolean z10 = !(l.f867k != null);
        h hVar = this.f19441j;
        if (z10) {
            hVar.f19440n = z7;
        } else {
            hVar.w(z7);
        }
    }

    @Override // v6.e
    public final TransformationMethod y(TransformationMethod transformationMethod) {
        return (l.f867k != null) ^ true ? transformationMethod : this.f19441j.y(transformationMethod);
    }
}