package p0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f15844a;

    /* renamed from: b, reason: collision with root package name */
    public final h f15845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15846c;

    public a(int i10, h hVar, int i11) {
        this.f15844a = i10;
        this.f15845b = hVar;
        this.f15846c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f15844a);
        this.f15845b.f15862a.performAction(this.f15846c, bundle);
    }
}