package o0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f15515a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f15516b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15517c = false;

    /* renamed from: d, reason: collision with root package name */
    public static ThreadLocal f15518d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f15519e = {2131296288, 2131296289, 2131296300, 2131296311, 2131296314, 2131296315, 2131296316, 2131296317, 2131296318, 2131296319, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296295, 2131296296, 2131296297, 2131296298, 2131296299, 2131296301, 2131296302, 2131296303, 2131296304, 2131296305, 2131296306, 2131296307, 2131296308, 2131296309, 2131296310, 2131296312, 2131296313};

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f15520f = new k0();

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f15521g = new m0();

    public static o1 a(View view) {
        if (f15515a == null) {
            f15515a = new WeakHashMap();
        }
        o1 o1Var = (o1) f15515a.get(view);
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1Var2 = new o1(view);
        f15515a.put(view, o1Var2);
        return o1Var2;
    }

    public static m2 b(View view, m2 m2Var) {
        WindowInsets windowInsetsF = m2Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = o0.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return m2.g(view, windowInsetsA);
            }
        }
        return m2Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = b1.f15506d;
        b1 b1Var = (b1) view.getTag(2131296908);
        if (b1Var == null) {
            b1Var = new b1();
            b1Var.f15507a = null;
            b1Var.f15508b = null;
            b1Var.f15509c = null;
            view.setTag(2131296908, b1Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = b1Var.f15507a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = b1.f15506d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (b1Var.f15507a == null) {
                            b1Var.f15507a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = b1.f15506d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                b1Var.f15507a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    b1Var.f15507a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = b1Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (b1Var.f15508b == null) {
                    b1Var.f15508b = new SparseArray();
                }
                b1Var.f15508b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return w0.a(view);
        }
        if (f15517c) {
            return null;
        }
        if (f15516b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f15516b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f15517c = true;
                return null;
            }
        }
        Object obj = f15516b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = v0.b(view);
        } else {
            tag = view.getTag(2131296901);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131296898);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131296898, arrayList2);
        return arrayList2;
    }

    public static Rect g() {
        if (f15518d == null) {
            f15518d = new ThreadLocal();
        }
        Rect rect = (Rect) f15518d.get();
        if (rect == null) {
            rect = new Rect();
            f15518d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] h(View view) {
        return Build.VERSION.SDK_INT >= 31 ? y0.a(view) : (String[]) view.getTag(2131296904);
    }

    public static m2 i(View view) {
        return Build.VERSION.SDK_INT >= 23 ? r0.a(view) : q0.j(view);
    }

    public static void j(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z7 ? 32 : androidx.recyclerview.widget.g1.FLAG_MOVED);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z7) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void k(View view, int i10) {
        boolean z7;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect rectG = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectG.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z7 = !rectG.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z7 = false;
        }
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                u((View) parent2);
            }
        }
        if (z7 && rectG.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectG);
        }
    }

    public static void l(View view, int i10) {
        boolean z7;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect rectG = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectG.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z7 = !rectG.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z7 = false;
        }
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                u((View) parent2);
            }
        }
        if (z7 && rectG.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectG);
        }
    }

    public static m2 m(View view, m2 m2Var) {
        WindowInsets windowInsetsF = m2Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsB = o0.b(view, windowInsetsF);
            if (!windowInsetsB.equals(windowInsetsF)) {
                return m2.g(view, windowInsetsB);
            }
        }
        return m2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g n(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return y0.b(view, gVar);
        }
        a0 a0Var = (a0) view.getTag(2131296903);
        b0 b0Var = f15520f;
        if (a0Var == null) {
            if (view instanceof b0) {
                b0Var = (b0) view;
            }
            return b0Var.a(gVar);
        }
        g gVarA = ((u0.r) a0Var).a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (view instanceof b0) {
            b0Var = (b0) view;
        }
        return b0Var.a(gVarA);
    }

    public static void o(View view, int i10) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((p0.c) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void p(View view, p0.c cVar, p0.r rVar) {
        if (rVar == null) {
            o(view, cVar.a());
            j(view, 0);
            return;
        }
        p0.c cVar2 = new p0.c(null, cVar.f15857b, null, rVar, cVar.f15858c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        b bVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f15496a : new b(accessibilityDelegateD);
        if (bVar == null) {
            bVar = new b();
        }
        r(view, bVar);
        o(view, cVar2.a());
        f(view).add(cVar2);
        j(view, 0);
    }

    public static void q(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            w0.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void r(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f15505b);
    }

    public static void s(View view, CharSequence charSequence) {
        new l0(2131296901, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        m0 m0Var = f15521g;
        if (charSequence == null) {
            m0Var.f15580b.remove(view);
            view.removeOnAttachStateChangeListener(m0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(m0Var);
        } else {
            m0Var.f15580b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(m0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(m0Var);
            }
        }
    }

    public static void t(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        q0.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z7 = (q0.g(view) == null && q0.h(view) == null) ? false : true;
            if (background == null || !z7) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static void u(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}