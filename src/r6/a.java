package r6;

import android.R;
import android.content.res.ColorStateList;
import m.i0;
import t5.j4;
import u0.b;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final int[][] f16554t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f16555m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16556n;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16555m == null) {
            int iL = j4.l(this, 2130903314);
            int iL2 = j4.l(this, 2130903333);
            int iL3 = j4.l(this, 2130903356);
            this.f16555m = new ColorStateList(f16554t, new int[]{j4.F(iL3, 1.0f, iL), j4.F(iL3, 0.54f, iL2), j4.F(iL3, 0.38f, iL2), j4.F(iL3, 0.38f, iL2)});
        }
        return this.f16555m;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16556n && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f16556n = z7;
        b.c(this, z7 ? getMaterialThemeColorsTintList() : null);
    }
}