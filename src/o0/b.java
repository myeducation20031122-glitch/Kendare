package o0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.gms.internal.ads.ic1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f15503c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f15504a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15505b;

    public b() {
        this(f15503c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f15504a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public p8.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f15504a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new p8.c(accessibilityNodeProvider, 9);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f15504a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, p0.h hVar) {
        this.f15504a.onInitializeAccessibilityNodeInfo(view, hVar.f15862a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f15504a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f15504a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(2131296898);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z7 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listEmptyList.size()) {
                break;
            }
            p0.c cVar = (p0.c) listEmptyList.get(i11);
            if (cVar.a() == i10) {
                p0.r rVar = cVar.f15859d;
                if (rVar != null) {
                    Class cls = cVar.f15858c;
                    if (cls != null) {
                        try {
                            ic1.v(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    zPerformAccessibilityAction = rVar.e(view);
                }
            } else {
                i11++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f15504a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != 2131296287 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131296899);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z7 = true;
                    break;
                }
                i13++;
            }
        }
        return z7;
    }

    public void h(View view, int i10) {
        this.f15504a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f15504a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f15504a = accessibilityDelegate;
        this.f15505b = new a(this);
    }
}