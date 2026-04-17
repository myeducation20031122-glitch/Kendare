package p6;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public float f16052c;

    /* renamed from: d, reason: collision with root package name */
    public float f16053d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f16055f;

    /* renamed from: g, reason: collision with root package name */
    public s6.d f16056g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f16050a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j6.b f16051b = new j6.b(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f16054e = true;

    public j(i iVar) {
        this.f16055f = new WeakReference(null);
        this.f16055f = new WeakReference(iVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f16050a;
        this.f16052c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f16053d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f16054e = false;
    }

    public final void b(s6.d dVar, Context context) {
        if (this.f16056g != dVar) {
            this.f16056g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f16050a;
                j6.b bVar = this.f16051b;
                dVar.f(context, textPaint, bVar);
                i iVar = (i) this.f16055f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f16054e = true;
            }
            i iVar2 = (i) this.f16055f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}