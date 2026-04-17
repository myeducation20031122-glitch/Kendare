package o0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.measurement.n3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v1 extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final f6.d f15635a;

    /* renamed from: b, reason: collision with root package name */
    public List f15636b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15637c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15638d;

    public v1(f6.d dVar) {
        super(0);
        this.f15638d = new HashMap();
        this.f15635a = dVar;
    }

    public final y1 a(WindowInsetsAnimation windowInsetsAnimation) {
        y1 y1Var = (y1) this.f15638d.get(windowInsetsAnimation);
        if (y1Var == null) {
            y1Var = new y1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                y1Var.f15646a = new w1(windowInsetsAnimation);
            }
            this.f15638d.put(windowInsetsAnimation, y1Var);
        }
        return y1Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        f6.d dVar = this.f15635a;
        a(windowInsetsAnimation);
        dVar.f12702b.setTranslationY(0.0f);
        this.f15638d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        f6.d dVar = this.f15635a;
        a(windowInsetsAnimation);
        View view = dVar.f12702b;
        int[] iArr = dVar.f12705e;
        view.getLocationOnScreen(iArr);
        dVar.f12703c = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f15637c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f15637c = arrayList2;
            this.f15636b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM = a9.m(list.get(size));
            y1 y1VarA = a(windowInsetsAnimationM);
            y1VarA.f15646a.d(windowInsetsAnimationM.getFraction());
            this.f15637c.add(y1VarA);
        }
        f6.d dVar = this.f15635a;
        m2 m2VarG = m2.g(null, windowInsets);
        dVar.a(m2VarG, this.f15636b);
        return m2VarG.f();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        f6.d dVar = this.f15635a;
        a(windowInsetsAnimation);
        n3 n3Var = new n3(bounds);
        View view = dVar.f12702b;
        int[] iArr = dVar.f12705e;
        view.getLocationOnScreen(iArr);
        int i10 = dVar.f12703c - iArr[1];
        dVar.f12704d = i10;
        view.setTranslationY(i10);
        a9.p();
        return a9.k(((h0.c) n3Var.f10909e).d(), ((h0.c) n3Var.f10910f).d());
    }
}