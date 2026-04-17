package y1;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19213b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i10) {
        this.f19212a = i10;
        this.f19213b = viewPager2;
    }

    @Override // y1.j
    public final void a(int i10) {
        switch (this.f19212a) {
            case 0:
                if (i10 == 0) {
                    this.f19213b.d();
                    break;
                }
                break;
        }
    }

    @Override // y1.j
    public final void c(int i10) {
        int i11 = this.f19212a;
        ViewPager2 viewPager2 = this.f19213b;
        switch (i11) {
            case 0:
                if (viewPager2.f1769j != i10) {
                    viewPager2.f1769j = i10;
                    viewPager2.W.x();
                    break;
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.M.requestFocus(2);
                    break;
                }
                break;
        }
    }
}