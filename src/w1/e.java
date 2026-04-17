package w1;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.g1;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import io.reactivex.internal.fuseable.QueueFuseable;
import x6.j;
import x6.m;
import z8.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends o0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18532e;

    public /* synthetic */ e(Object obj, int i10) {
        this.f18531d = i10;
        this.f18532e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // o0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z7;
        ViewPager viewPager;
        a aVar;
        int i10 = this.f18531d;
        Object obj = this.f18532e;
        switch (i10) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                a aVar2 = ((ViewPager) obj).f1720m;
                if (aVar2 != null) {
                    z7 = ((h) aVar2).f19777a.length > 1;
                }
                accessibilityEvent.setScrollable(z7);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = (viewPager = (ViewPager) obj).f1720m) != null) {
                    accessibilityEvent.setItemCount(((h) aVar).f19777a.length);
                    accessibilityEvent.setFromIndex(viewPager.f1722n);
                    accessibilityEvent.setToIndex(viewPager.f1722n);
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
            default:
                super.c(view, accessibilityEvent);
                break;
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) obj).isChecked());
                break;
        }
    }

    @Override // o0.b
    public final void d(View view, p0.h hVar) {
        boolean z7 = false;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f15862a;
        int i10 = this.f18531d;
        int i11 = -1;
        Object obj = this.f18532e;
        View.AccessibilityDelegate accessibilityDelegate = this.f15504a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                hVar.i(ViewPager.class.getName());
                a aVar = ((ViewPager) obj).f1720m;
                if (aVar != null && ((h) aVar).f19777a.length > 1) {
                    z7 = true;
                }
                hVar.l(z7);
                ViewPager viewPager = (ViewPager) obj;
                if (viewPager.canScrollHorizontally(1)) {
                    hVar.a(g1.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    hVar.a(8192);
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.N;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i13) == view) {
                                i11 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                                    i14++;
                                }
                                i13++;
                            }
                        }
                    }
                }
                hVar.j(p0.g.a(0, 1, i11, 1, ((MaterialButton) view).isChecked()));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11492m);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f11497d0);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                hVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
        }
    }

    @Override // o0.b
    public final boolean g(View view, int i10, Bundle bundle) throws Resources.NotFoundException {
        ViewPager viewPager;
        int i11;
        int i12 = this.f18531d;
        Object obj = this.f18532e;
        switch (i12) {
            case 0:
                if (!super.g(view, i10, bundle)) {
                    if (i10 == 4096) {
                        viewPager = (ViewPager) obj;
                        if (viewPager.canScrollHorizontally(1)) {
                            i11 = viewPager.f1722n + 1;
                            viewPager.setCurrentItem(i11);
                        }
                    } else if (i10 == 8192) {
                        viewPager = (ViewPager) obj;
                        if (viewPager.canScrollHorizontally(-1)) {
                            i11 = viewPager.f1722n - 1;
                            viewPager.setCurrentItem(i11);
                            break;
                        }
                    }
                }
                break;
            case 4:
                if (i10 != 1048576) {
                    break;
                } else {
                    ((m) ((j) obj)).a(3);
                    break;
                }
        }
        return super.g(view, i10, bundle);
    }
}