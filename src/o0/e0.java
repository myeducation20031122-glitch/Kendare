package o0;

import android.R;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class e0 extends v6.e {

    /* renamed from: j, reason: collision with root package name */
    public final View f15530j;

    public e0(View view) {
        super(4, (Object) null);
        this.f15530j = view;
    }

    @Override // v6.e
    public void x() {
        View viewFindViewById;
        View view = this.f15530j;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new androidx.activity.d(viewFindViewById, 5));
    }
}