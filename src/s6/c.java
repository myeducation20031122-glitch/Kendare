package s6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends dq0 {
    public final /* synthetic */ Context B;
    public final /* synthetic */ TextPaint C;
    public final /* synthetic */ dq0 D;
    public final /* synthetic */ d E;

    public c(d dVar, Context context, TextPaint textPaint, dq0 dq0Var) {
        this.E = dVar;
        this.B = context;
        this.C = textPaint;
        this.D = dq0Var;
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void r(int i10) {
        this.D.r(i10);
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void s(Typeface typeface, boolean z7) {
        this.E.g(this.B, this.C, typeface);
        this.D.s(typeface, z7);
    }
}