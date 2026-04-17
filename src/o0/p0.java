package o0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public m2 f15602a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f15604c;

    public p0(View view, z zVar) {
        this.f15603b = view;
        this.f15604c = zVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m2 m2VarG = m2.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        z zVar = this.f15604c;
        if (i10 < 30) {
            q0.a(windowInsets, this.f15603b);
            if (m2VarG.equals(this.f15602a)) {
                return zVar.i(view, m2VarG).f();
            }
        }
        this.f15602a = m2VarG;
        m2 m2VarI = zVar.i(view, m2VarG);
        if (i10 >= 30) {
            return m2VarI.f();
        }
        WeakHashMap weakHashMap = c1.f15515a;
        o0.c(view);
        return m2VarI.f();
    }
}