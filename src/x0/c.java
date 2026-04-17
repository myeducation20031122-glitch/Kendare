package x0;

import android.graphics.Rect;
import java.util.Comparator;
import p0.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f18869b = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f18870e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18871f;

    /* renamed from: j, reason: collision with root package name */
    public final v6.e f18872j;

    public c(boolean z7, v6.e eVar) {
        this.f18871f = z7;
        this.f18872j = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f18872j.getClass();
        Rect rect = this.f18869b;
        ((h) obj).f(rect);
        Rect rect2 = this.f18870e;
        ((h) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z7 = this.f18871f;
        if (i12 < i13) {
            return z7 ? 1 : -1;
        }
        if (i12 > i13) {
            return z7 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z7 ? 1 : -1;
        }
        if (i16 > i17) {
            return z7 ? -1 : 1;
        }
        return 0;
    }
}