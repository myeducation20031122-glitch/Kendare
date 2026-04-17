package m0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import l4.j0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f15041a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f15042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15043c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15044d;

    public f(PrecomputedText.Params params) {
        this.f15041a = a3.a.o(params);
        this.f15042b = a3.a.n(params);
        this.f15043c = a3.a.d(params);
        this.f15044d = a3.a.A(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (this.f15043c == fVar.f15043c && this.f15044d == fVar.f15044d) {
                TextPaint textPaint = this.f15041a;
                if (textPaint.getTextSize() != fVar.f15041a.getTextSize()) {
                    z7 = false;
                } else {
                    float textScaleX = textPaint.getTextScaleX();
                    TextPaint textPaint2 = fVar.f15041a;
                    if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i10 >= 24) {
                            if (d2.c.x(d2.c.e(textPaint2), d2.c.e(textPaint))) {
                                if (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) {
                                    z7 = true;
                                }
                            }
                        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                        }
                    }
                }
            }
        }
        return z7 && this.f15042b == fVar.f15042b;
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f15044d;
        int i12 = this.f15043c;
        TextDirectionHeuristic textDirectionHeuristic = this.f15042b;
        TextPaint textPaint = this.f15041a;
        return i10 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), d2.c.e(textPaint), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        StringBuilder sb;
        Object textLocale;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f15041a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            sb = new StringBuilder(", textLocale=");
            textLocale = d2.c.e(textPaint);
        } else {
            sb = new StringBuilder(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        sb.append(textLocale);
        sb2.append(sb.toString());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + j0.n(textPaint));
        }
        sb2.append(", textDir=" + this.f15042b);
        sb2.append(", breakStrategy=" + this.f15043c);
        sb2.append(", hyphenationFrequency=" + this.f15044d);
        sb2.append("}");
        return sb2.toString();
    }

    public f(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            a3.a.v(a3.a.l(a3.a.C(a3.a.k(a3.a.m(textPaint), i10), i11), textDirectionHeuristic));
        }
        this.f15041a = textPaint;
        this.f15042b = textDirectionHeuristic;
        this.f15043c = i10;
        this.f15044d = i11;
    }
}