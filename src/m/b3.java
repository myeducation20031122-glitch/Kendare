package m;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b3 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i10, Class cls, String str) {
        super(cls, str);
        this.f14712a = i10;
    }

    public final Float a(View view) {
        switch (this.f14712a) {
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return Float.valueOf(t1.e0.f17033a.g(view));
            case y4.g.NETWORK_ERROR /* 7 */:
            default:
                WeakHashMap weakHashMap = o0.c1.f15515a;
                return Float.valueOf(view.getPaddingEnd());
            case 8:
                return Float.valueOf(view.getLayoutParams().width);
            case 9:
                return Float.valueOf(view.getLayoutParams().height);
            case y4.g.DEVELOPER_ERROR /* 10 */:
                WeakHashMap weakHashMap2 = o0.c1.f15515a;
                return Float.valueOf(view.getPaddingStart());
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f14712a) {
            case 3:
                t1.e0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 4:
                t1.e0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                t1.e0.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
                break;
        }
    }

    public final void c(View view, Float f10) {
        switch (this.f14712a) {
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                t1.e0.f17033a.i(view, f10.floatValue());
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
            default:
                WeakHashMap weakHashMap = o0.c1.f15515a;
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
                break;
            case 8:
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
                break;
            case 9:
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                int iIntValue = f10.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = o0.c1.f15515a;
                view.setPaddingRelative(iIntValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
                break;
        }
    }

    public final void d(t1.d dVar, PointF pointF) {
        switch (this.f14712a) {
            case QueueFuseable.SYNC /* 1 */:
                dVar.getClass();
                dVar.f17020a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dVar.f17021b = iRound;
                int i10 = dVar.f17025f + 1;
                dVar.f17025f = i10;
                if (i10 == dVar.f17026g) {
                    t1.e0.a(dVar.f17024e, dVar.f17020a, iRound, dVar.f17022c, dVar.f17023d);
                    dVar.f17025f = 0;
                    dVar.f17026g = 0;
                    break;
                }
                break;
            default:
                dVar.getClass();
                dVar.f17022c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                dVar.f17023d = iRound2;
                int i11 = dVar.f17026g + 1;
                dVar.f17026g = i11;
                if (dVar.f17025f == i11) {
                    t1.e0.a(dVar.f17024e, dVar.f17020a, dVar.f17021b, dVar.f17022c, iRound2);
                    dVar.f17025f = 0;
                    dVar.f17026g = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f14712a) {
            case QueueFuseable.SYNC /* 1 */:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                break;
        }
        return a((View) obj);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f14712a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case QueueFuseable.SYNC /* 1 */:
                d((t1.d) obj, (PointF) obj2);
                break;
            case 2:
                d((t1.d) obj, (PointF) obj2);
                break;
            case 3:
                b((View) obj, (PointF) obj2);
                break;
            case 4:
                b((View) obj, (PointF) obj2);
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                b((View) obj, (PointF) obj2);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                c((View) obj, (Float) obj2);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case 8:
                c((View) obj, (Float) obj2);
                break;
            case 9:
                c((View) obj, (Float) obj2);
                break;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                c((View) obj, (Float) obj2);
                break;
            default:
                c((View) obj, (Float) obj2);
                break;
        }
    }
}