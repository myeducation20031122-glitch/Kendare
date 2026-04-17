package g;

import android.view.View;
import android.widget.AbsListView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12771b;

    public g(View view, View view2) {
        this.f12770a = view;
        this.f12771b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        l.b(absListView, this.f12770a, this.f12771b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}