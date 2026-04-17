package p0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.g1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f15848e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f15849f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f15850g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f15851h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f15852i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f15853j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f15854k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f15855l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15857b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f15858c;

    /* renamed from: d, reason: collision with root package name */
    public final r f15859d;

    static {
        new c(1);
        new c(2);
        new c(4);
        new c(8);
        f15848e = new c(16);
        new c(32);
        new c(64);
        new c(128);
        new c(256, k.class);
        new c(512, k.class);
        new c(1024, l.class);
        new c(g1.FLAG_MOVED, l.class);
        f15849f = new c(g1.FLAG_APPEARED_IN_PRE_LAYOUT);
        f15850g = new c(8192);
        new c(16384);
        new c(32768);
        new c(65536);
        new c(131072, p.class);
        f15851h = new c(262144);
        f15852i = new c(524288);
        f15853j = new c(1048576);
        new c(2097152, q.class);
        int i10 = Build.VERSION.SDK_INT;
        new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, n.class);
        f15854k = new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        f15855l = new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        new c(i10 >= 24 ? d2.c.i() : null, R.id.accessibilityActionSetProgress, null, null, o.class);
        new c(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, m.class);
        new c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i10 >= 34 ? f.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i10) {
        this(null, i10, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f15856a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f15856a;
        Object obj3 = this.f15856a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f15856a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = h.d(this.f15857b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f15856a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public c(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public c(Object obj, int i10, String str, r rVar, Class cls) {
        this.f15857b = i10;
        this.f15859d = rVar;
        this.f15856a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, str) : obj;
        this.f15858c = cls;
    }
}