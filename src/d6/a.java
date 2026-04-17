package d6;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import q6.d;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12317b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f12316a = i10;
        this.f12317b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        b6.a aVar;
        int i18 = this.f12316a;
        Object obj = this.f12317b;
        switch (i18) {
            case 0:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                d dVar = (d) obj;
                if (dVar.Q.getVisibility() != 0 || (aVar = dVar.f16272l0) == null) {
                    return;
                }
                Rect rect = new Rect();
                ImageView imageView = dVar.Q;
                imageView.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(imageView, null);
                return;
        }
    }
}