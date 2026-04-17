package c0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.r;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.WeakHashMap;
import o0.c1;
import o0.q0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2036b;

    public /* synthetic */ h(int i10) {
        this.f2036b = i10;
    }

    public final int a(View view, View view2) {
        switch (this.f2036b) {
            case 0:
                WeakHashMap weakHashMap = c1.f15515a;
                float fM = q0.m(view);
                float fM2 = q0.m(view2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 4:
                w1.d dVar = (w1.d) view.getLayoutParams();
                w1.d dVar2 = (w1.d) view2.getLayoutParams();
                boolean z7 = dVar.f18526a;
                return z7 != dVar2.f18526a ? z7 ? 1 : -1 : dVar.f18530e - dVar2.f18530e;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.f2036b) {
            case 0:
                return a((View) obj, (View) obj2);
            case QueueFuseable.SYNC /* 1 */:
                return ((r) obj).f1620a - ((r) obj2).f1620a;
            case 2:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                RecyclerView recyclerView = f0Var.f1435d;
                if ((recyclerView == null) != (f0Var2.f1435d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z7 = f0Var.f1432a;
                if (z7 == f0Var2.f1432a) {
                    int i10 = f0Var2.f1433b - f0Var.f1433b;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = f0Var.f1434c - f0Var2.f1434c;
                    if (i11 != 0) {
                        return i11;
                    }
                    return 0;
                }
                if (z7) {
                }
            case 3:
                return ((w1.c) obj).f18522b - ((w1.c) obj2).f18522b;
            case 4:
                return a((View) obj, (View) obj2);
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return a((View) obj, (View) obj2);
            case y4.g.NETWORK_ERROR /* 7 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return com.bumptech.glide.d.f(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }
}