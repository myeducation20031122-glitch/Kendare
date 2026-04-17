package s9;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.y0;
import androidx.recyclerview.widget.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16955c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16956d;

    public e(Context context) {
        this.f16953a = d(context, 16);
        this.f16954b = d(context, 16);
        this.f16955c = d(context, 16);
        this.f16956d = d(context, 8);
    }

    public static int d(Context context, int i10) {
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }

    @Override // androidx.recyclerview.widget.i1
    public final void a(Rect outRect, View view, RecyclerView parent, y1 state) {
        Intrinsics.f(outRect, "outRect");
        Intrinsics.f(view, "view");
        Intrinsics.f(parent, "parent");
        Intrinsics.f(state, "state");
        c2 c2VarM = RecyclerView.M(view);
        int absoluteAdapterPosition = c2VarM != null ? c2VarM.getAbsoluteAdapterPosition() : -1;
        y0 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i10 = absoluteAdapterPosition % 2;
        int i11 = absoluteAdapterPosition / 2;
        int i12 = this.f16955c;
        outRect.left = i12 - ((i10 * i12) / 2);
        outRect.right = ((i10 + 1) * i12) / 2;
        if (absoluteAdapterPosition < 2) {
            outRect.top = this.f16953a;
        }
        outRect.bottom = this.f16956d;
        if (i11 == (itemCount - 1) / 2) {
            outRect.bottom = this.f16954b;
        }
    }
}