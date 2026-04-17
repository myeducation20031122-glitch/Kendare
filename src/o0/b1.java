package o0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ic1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f15506d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f15507a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f15508b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f15509c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f15507a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount));
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(2131296909);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                ic1.v(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}