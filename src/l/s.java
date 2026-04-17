package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s extends FrameLayout implements k.c {

    /* renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f14413b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(View view) {
        super(view.getContext());
        this.f14413b = (CollapsibleActionView) view;
        addView(view);
    }
}