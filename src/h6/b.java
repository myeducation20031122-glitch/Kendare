package h6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i1;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f13200a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13201b;

    public b() {
        Paint paint = new Paint();
        this.f13200a = paint;
        this.f13201b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.i1
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        float fD;
        float f12;
        int I;
        Paint paint = this.f13200a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(2131099898));
        for (e eVar : this.f13201b) {
            eVar.getClass();
            ThreadLocal threadLocal = h0.a.f13142a;
            float f13 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f13)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f13)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f13)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f13))));
            int iJ = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).N0()) {
                f10 = 0.0f;
                eVar.getClass();
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11399q;
                switch (cVar.f13202c) {
                    case 0:
                        break;
                    default:
                        iJ = cVar.f13203d.L();
                        break;
                }
                f11 = iJ;
                fD = 0.0f;
                eVar.getClass();
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11399q;
                int i10 = cVar2.f13202c;
                CarouselLayoutManager carouselLayoutManager = cVar2.f13203d;
                switch (i10) {
                    case 0:
                        I = carouselLayoutManager.f1551o;
                        break;
                    default:
                        I = carouselLayoutManager.f1551o - carouselLayoutManager.I();
                        break;
                }
                f12 = I;
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11399q;
                switch (cVar3.f13202c) {
                    case 0:
                        iJ = cVar3.f13203d.J();
                        break;
                }
                f10 = iJ;
                f11 = 0.0f;
                eVar.getClass();
                fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11399q.d();
                f12 = 0.0f;
                eVar.getClass();
            }
            canvas.drawLine(f10, f11, fD, f12, paint);
        }
    }
}