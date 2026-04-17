package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import io.reactivex.internal.fuseable.QueueFuseable;
import k3.a;
import m3.f;
import n3.c;
import n3.d;
import n3.g;
import n3.i;
import v.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class SpinKitView extends ProgressBar {

    /* renamed from: b, reason: collision with root package name */
    public int f2399b;

    /* renamed from: e, reason: collision with root package name */
    public f f2400e;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        f iVar;
        super(context, attributeSet, 2130903042, 2131952098);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13980a, 2130903042, 2131952098);
        int i10 = 1;
        int i11 = 0;
        int i12 = h.c(15)[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.f2399b = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        switch (h.b(i12)) {
            case 0:
                iVar = new i(i10);
                break;
            case QueueFuseable.SYNC /* 1 */:
                iVar = new c(2);
                break;
            case 2:
                iVar = new c(7);
                break;
            case 3:
                iVar = new c(6);
                break;
            case 4:
                iVar = new g(0);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                iVar = new c(i11);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                iVar = new c(5);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                iVar = new d(0);
                break;
            case 8:
                iVar = new c(i10);
                break;
            case 9:
                iVar = new d(1);
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                iVar = new n3.f();
                break;
            case 11:
                iVar = new g(1);
                break;
            case 12:
                iVar = new c(3);
                break;
            case y4.g.ERROR /* 13 */:
                iVar = new n3.h();
                break;
            case y4.g.INTERRUPTED /* 14 */:
                iVar = new c(4);
                break;
            default:
                iVar = null;
                break;
        }
        iVar.e(this.f2399b);
        setIndeterminateDrawable(iVar);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        f fVar;
        super.onScreenStateChanged(i10);
        if (i10 != 0 || (fVar = this.f2400e) == null) {
            return;
        }
        fVar.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7 && this.f2400e != null && getVisibility() == 0) {
            this.f2400e.start();
        }
    }

    public void setColor(int i10) {
        this.f2399b = i10;
        f fVar = this.f2400e;
        if (fVar != null) {
            fVar.e(i10);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof f)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((f) drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }

    @Override // android.widget.ProgressBar
    public f getIndeterminateDrawable() {
        return this.f2400e;
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f2400e = fVar;
        if (fVar.c() == 0) {
            this.f2400e.e(this.f2399b);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f2400e.start();
        }
    }
}