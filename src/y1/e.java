package y1;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19211b;

    public e(Object obj, int i10) {
        this.f19210a = i10;
        this.f19211b = obj;
    }

    @Override // androidx.recyclerview.widget.a1
    public final void a() {
        int i10 = this.f19210a;
        Object obj = this.f19211b;
        switch (i10) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.f1770m = true;
                viewPager2.O.f19208l = true;
                break;
            default:
                ((k) obj).x();
                break;
        }
    }
}