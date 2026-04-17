package s2;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f16832b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16833e = true;

    public z(Appendable appendable) {
        this.f16832b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        boolean z7 = this.f16833e;
        Appendable appendable = this.f16832b;
        if (z7) {
            this.f16833e = false;
            appendable.append("  ");
        }
        this.f16833e = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z7 = this.f16833e;
        Appendable appendable = this.f16832b;
        boolean z10 = false;
        if (z7) {
            this.f16833e = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z10 = true;
        }
        this.f16833e = z10;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}