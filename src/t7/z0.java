package t7;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class z0 {
    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = fc.t.P(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                i0.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                i0.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                i0.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void c(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (m7.h hVar : (Set) it2.next()) {
                        for (m7.j jVar : hVar.f15199a.f15185b) {
                            if (jVar.f15206c == 0) {
                                Set<m7.h> set = (Set) map.get(new m7.i(jVar.f15204a, jVar.f15205b == 2));
                                if (set != null) {
                                    for (m7.h hVar2 : set) {
                                        hVar.f15200b.add(hVar2);
                                        hVar2.f15201c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    m7.h hVar3 = (m7.h) it4.next();
                    if (hVar3.f15201c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    m7.h hVar4 = (m7.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i10++;
                    Iterator it5 = hVar4.f15200b.iterator();
                    while (it5.hasNext()) {
                        m7.h hVar5 = (m7.h) it5.next();
                        hVar5.f15201c.remove(hVar4);
                        if (hVar5.f15201c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    m7.h hVar6 = (m7.h) it6.next();
                    if (!hVar6.f15201c.isEmpty() && !hVar6.f15200b.isEmpty()) {
                        arrayList2.add(hVar6.f15199a);
                    }
                }
                throw new m7.k(arrayList2);
            }
            m7.a aVar = (m7.a) it.next();
            m7.h hVar7 = new m7.h(aVar);
            for (Class cls : aVar.f15184a) {
                boolean z7 = !(aVar.f15187d == 0);
                m7.i iVar = new m7.i(cls, z7);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set2 = (Set) map.get(iVar);
                if (!set2.isEmpty() && !z7) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(hVar7);
            }
        }
    }

    public static final boolean d(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static n2.q e(Context context) {
        n2.q qVar = new n2.q(new com.android.volley.toolbox.d(new n3(context.getApplicationContext(), 15)), new g.e(new com.android.volley.toolbox.g()));
        n2.c cVar = qVar.f15335i;
        if (cVar != null) {
            cVar.b();
        }
        for (n2.h hVar : qVar.f15334h) {
            if (hVar != null) {
                hVar.f15314m = true;
                hVar.interrupt();
            }
        }
        n2.c cVar2 = new n2.c(qVar.f15329c, qVar.f15330d, qVar.f15331e, qVar.f15333g);
        qVar.f15335i = cVar2;
        cVar2.start();
        for (int i10 = 0; i10 < qVar.f15334h.length; i10++) {
            n2.h hVar2 = new n2.h(qVar.f15330d, qVar.f15332f, qVar.f15331e, qVar.f15333g);
            qVar.f15334h[i10] = hVar2;
            hVar2.start();
        }
        return qVar;
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = fc.t.P(drawable).mutate();
        i0.a.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void g(fc.y yVar, Continuation continuation, boolean z7) {
        Object objD;
        Object objF = yVar.f();
        Throwable thC = yVar.c(objF);
        if (thC != null) {
            int i10 = Result.f14078b;
            objD = ResultKt.a(thC);
        } else {
            int i11 = Result.f14078b;
            objD = yVar.d(objF);
        }
        if (!z7) {
            continuation.resumeWith(objD);
            return;
        }
        kotlinx.coroutines.internal.c cVar = (kotlinx.coroutines.internal.c) continuation;
        Continuation continuation2 = cVar.m;
        CoroutineContext context = continuation2.getContext();
        Object objC = kotlinx.coroutines.internal.t.c(context, cVar.t);
        if (objC != kotlinx.coroutines.internal.t.a) {
            com.bumptech.glide.f.w(continuation2, context);
        }
        try {
            cVar.m.resumeWith(objD);
            Unit unit = Unit.f14090a;
        } finally {
            kotlinx.coroutines.internal.t.a(context, objC);
        }
    }

    public static void h(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = o0.c1.f15515a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z7 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z7;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z7);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static void i(Activity activity, String str) {
        Intrinsics.f(activity, "<this>");
        wh0 wh0Var = new wh0(activity, "Alert", str);
        wh0Var.d("Ok", false, u9.i.f18308e);
        wh0Var.a().show();
    }

    public static void j(Fragment fragment) {
        Intrinsics.f(fragment, "<this>");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.e(contextRequireContext, "this.requireContext()");
        wh0 wh0Var = new wh0(contextRequireContext, "Alert", "Network connection not available.");
        wh0Var.d("Ok", false, u9.i.f18309f);
        wh0Var.a().show();
    }

    public static final void k(Context context, String str) {
        Intrinsics.f(context, "context");
        Toast.makeText(context, str, 0).show();
    }
}