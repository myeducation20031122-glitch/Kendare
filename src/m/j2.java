package m;

import android.content.res.Resources;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14803b;

    public /* synthetic */ j2(Object obj, int i10) {
        this.f14802a = i10;
        this.f14803b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.f14802a;
        Object obj = this.f14803b;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj;
                if (m2Var.f14841c0.isShowing()) {
                    m2Var.c();
                    break;
                }
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        int i10 = this.f14802a;
        Object obj = this.f14803b;
        switch (i10) {
            case 0:
                ((m2) obj).dismiss();
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }
}