package p0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15860a;

    public g(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f15860a = collectionItemInfo;
    }

    public static g a(int i10, int i11, int i12, int i13, boolean z7) {
        return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z7));
    }
}