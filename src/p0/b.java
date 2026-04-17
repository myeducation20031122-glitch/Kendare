package p0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final e0.g f15847a;

    public b(e0.g gVar) {
        this.f15847a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f15847a.equals(((b) obj).f15847a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15847a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z7) {
        y6.k kVar = (y6.k) this.f15847a.f12372e;
        AutoCompleteTextView autoCompleteTextView = kVar.f19316h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        int i10 = z7 ? 2 : 1;
        WeakHashMap weakHashMap = c1.f15515a;
        kVar.f19344d.setImportantForAccessibility(i10);
    }
}