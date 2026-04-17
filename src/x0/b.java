package x0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o0.c1;
import p0.h;
import t.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b extends o0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f18856n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final v6.e f18857o = new v6.e(5, (Object) null);

    /* renamed from: p, reason: collision with root package name */
    public static final g8.e f18858p = new g8.e();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f18863h;

    /* renamed from: i, reason: collision with root package name */
    public final View f18864i;

    /* renamed from: j, reason: collision with root package name */
    public a f18865j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f18859d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f18860e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f18861f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f18862g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f18866k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f18867l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f18868m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f18864i = view;
        this.f18863h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = c1.f15515a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // o0.b
    public final p8.c b(View view) {
        if (this.f18865j == null) {
            this.f18865j = new a(this);
        }
        return this.f18865j;
    }

    @Override // o0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // o0.b
    public final void d(View view, h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f15504a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f15862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((j6.d) this).f13801q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        hVar.i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            hVar.m(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i10) {
        if (this.f18867l != i10) {
            return false;
        }
        this.f18867l = Integer.MIN_VALUE;
        j6.d dVar = (j6.d) this;
        if (i10 == 1) {
            Chip chip = dVar.f13801q;
            chip.P = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final h k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        h hVar = new h(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        hVar.i("android.view.View");
        Rect rect = f18856n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        hVar.f15863b = -1;
        View view = this.f18864i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i10, hVar);
        if (hVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f18860e;
        hVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        hVar.f15864c = i10;
        accessibilityNodeInfoObtain.setSource(view, i10);
        if (this.f18866k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            hVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            hVar.a(64);
        }
        boolean z7 = this.f18867l == i10;
        if (z7) {
            hVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            hVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z7);
        int[] iArr = this.f18862g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f18859d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            hVar.f(rect3);
            if (hVar.f15863b != -1) {
                h hVar2 = new h(AccessibilityNodeInfo.obtain());
                for (int i11 = hVar.f15863b; i11 != -1; i11 = hVar2.f15863b) {
                    hVar2.f15863b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = hVar2.f15862a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i11, hVar2);
                    hVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f18861f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                hVar.f15862a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return hVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i10, Rect rect) {
        Object obj;
        h hVar;
        int i11;
        int i12;
        int iWidth;
        int i13;
        int i14;
        int i15;
        int iHeight;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            lVar.e(((Integer) arrayList.get(i16)).intValue(), k(((Integer) arrayList.get(i16)).intValue()));
        }
        int i17 = this.f18867l;
        int i18 = Integer.MIN_VALUE;
        h hVar2 = i17 == Integer.MIN_VALUE ? null : (h) lVar.d(i17, null);
        v6.e eVar = f18857o;
        g8.e eVar2 = f18858p;
        View view = this.f18864i;
        if (i10 == 1 || i10 == 2) {
            WeakHashMap weakHashMap = c1.f15515a;
            boolean z7 = view.getLayoutDirection() == 1;
            eVar2.getClass();
            int i19 = lVar.f17009f;
            ArrayList arrayList2 = new ArrayList(i19);
            for (int i20 = 0; i20 < i19; i20++) {
                arrayList2.add((h) lVar.f17008e[i20]);
            }
            Collections.sort(arrayList2, new c(z7, eVar));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (hVar2 != null) {
                    size = arrayList2.indexOf(hVar2);
                }
                int i21 = size - 1;
                if (i21 >= 0) {
                    obj = arrayList2.get(i21);
                }
                hVar = (h) obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (hVar2 == null ? -1 : arrayList2.lastIndexOf(hVar2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                hVar = (h) obj;
            }
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i22 = this.f18867l;
            if (i22 != Integer.MIN_VALUE) {
                n(i22).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i10 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i10 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i10 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i10 == 17) {
                    if (i10 == 33) {
                        i15 = 0;
                        iHeight = rect2.height() + 1;
                    } else if (i10 == 66) {
                        i12 = 0;
                        iWidth = -(rect2.width() + 1);
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        iHeight = -(rect2.height() + 1);
                        i15 = 0;
                    }
                    rect3.offset(i15, iHeight);
                    eVar2.getClass();
                    i13 = lVar.f17009f;
                    Rect rect4 = new Rect();
                    hVar = null;
                    for (i14 = 0; i14 < i13; i14++) {
                        h hVar3 = (h) lVar.f17008e[i14];
                        if (hVar3 != hVar2) {
                            eVar.getClass();
                            hVar3.f(rect4);
                            if (com.bumptech.glide.d.s(i10, rect2, rect4)) {
                                if (com.bumptech.glide.d.s(i10, rect2, rect3) && !com.bumptech.glide.d.a(i10, rect2, rect4, rect3)) {
                                    if (!com.bumptech.glide.d.a(i10, rect2, rect3, rect4)) {
                                        int iT = com.bumptech.glide.d.t(i10, rect2, rect4);
                                        int iU = com.bumptech.glide.d.u(i10, rect2, rect4);
                                        int i23 = (iU * iU) + (iT * 13 * iT);
                                        int iT2 = com.bumptech.glide.d.t(i10, rect2, rect3);
                                        int iU2 = com.bumptech.glide.d.u(i10, rect2, rect3);
                                        if (i23 < (iU2 * iU2) + (iT2 * 13 * iT2)) {
                                            rect3.set(rect4);
                                            hVar = hVar3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i12 = 0;
                    iWidth = rect2.width() + 1;
                }
                rect3.offset(iWidth, i12);
                eVar2.getClass();
                i13 = lVar.f17009f;
                Rect rect42 = new Rect();
                hVar = null;
                while (i14 < i13) {
                }
            }
            Rect rect32 = new Rect(rect2);
            if (i10 == 17) {
            }
            rect32.offset(iWidth, i12);
            eVar2.getClass();
            i13 = lVar.f17009f;
            Rect rect422 = new Rect();
            hVar = null;
            while (i14 < i13) {
            }
        }
        h hVar4 = hVar;
        if (hVar4 != null) {
            int i24 = 0;
            while (true) {
                if (i24 >= lVar.f17009f) {
                    i11 = -1;
                    break;
                }
                if (lVar.f17008e[i24] == hVar4) {
                    i11 = i24;
                    break;
                }
                i24++;
            }
            i18 = lVar.f17007b[i11];
        }
        return p(i18);
    }

    public final h n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        View view = this.f18864i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        h hVar = new h(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = c1.f15515a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            hVar.f15862a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return hVar;
    }

    public abstract void o(int i10, h hVar);

    public final boolean p(int i10) {
        int i11;
        View view = this.f18864i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f18867l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f18867l = i10;
        j6.d dVar = (j6.d) this;
        if (i10 == 1) {
            Chip chip = dVar.f13801q;
            chip.P = true;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final void q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f18863h.isEnabled() || (parent = (view = this.f18864i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            h hVarN = n(i10);
            accessibilityEventObtain.getText().add(hVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = hVarN.f15862a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}