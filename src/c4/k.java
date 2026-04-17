package c4;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.wr;
import j4.d2;
import j4.f2;
import j4.f3;
import j4.i0;
import j4.u1;
import j4.v2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final f2 f2120b;

    public k(Context context) {
        super(context);
        this.f2120b = new f2(this);
    }

    public final void a(f fVar) {
        fc.t.f("#008 Must be called on the main UI thread.");
        ge.a(getContext());
        if (((Boolean) ff.f4304f.k()).booleanValue()) {
            if (((Boolean) j4.q.f13781d.f13784c.a(ge.K8)).booleanValue()) {
                qr.f7819b.execute(new m.k(this, fVar, 25));
                return;
            }
        }
        this.f2120b.b(fVar.f2103a);
    }

    public b getAdListener() {
        return this.f2120b.f13690f;
    }

    public g getAdSize() {
        f3 f3VarZzg;
        f2 f2Var = this.f2120b;
        f2Var.getClass();
        try {
            i0 i0Var = f2Var.f13693i;
            if (i0Var != null && (f3VarZzg = i0Var.zzg()) != null) {
                return new g(f3VarZzg.f13701m, f3VarZzg.f13698e, f3VarZzg.f13697b);
            }
        } catch (RemoteException e10) {
            wr.i("#007 Could not call remote method.", e10);
        }
        g[] gVarArr = f2Var.f13691g;
        if (gVarArr != null) {
            return gVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        i0 i0Var;
        f2 f2Var = this.f2120b;
        if (f2Var.f13694j == null && (i0Var = f2Var.f13693i) != null) {
            try {
                f2Var.f13694j = i0Var.zzr();
            } catch (RemoteException e10) {
                wr.i("#007 Could not call remote method.", e10);
            }
        }
        return f2Var.f13694j;
    }

    public n getOnPaidEventListener() {
        this.f2120b.getClass();
        return null;
    }

    public q getResponseInfo() {
        i0 i0Var;
        f2 f2Var = this.f2120b;
        f2Var.getClass();
        try {
            i0Var = f2Var.f13693i;
        } catch (RemoteException e10) {
            wr.i("#007 Could not call remote method.", e10);
        }
        u1 u1VarZzk = i0Var != null ? i0Var.zzk() : null;
        if (u1VarZzk != null) {
            return new q(u1VarZzk);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        g adSize;
        int measuredHeight;
        int i12;
        int i13;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                wr.e("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i14 = adSize.f2107a;
                if (i14 == -3) {
                    i12 = -1;
                } else if (i14 != -1) {
                    sr srVar = j4.o.f13771f.f13772a;
                    i12 = sr.i(context.getResources().getDisplayMetrics(), i14);
                } else {
                    i12 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i15 = adSize.f2108b;
                if (i15 == -4 || i15 == -3) {
                    i13 = -1;
                } else if (i15 != -2) {
                    sr srVar2 = j4.o.f13771f.f13772a;
                    i13 = sr.i(context.getResources().getDisplayMetrics(), i15);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.heightPixels;
                    float f11 = displayMetrics.density;
                    int i16 = (int) (f10 / f11);
                    i13 = (int) ((i16 <= 400 ? 32 : i16 <= 720 ? 50 : 90) * f11);
                }
                measuredHeight = i13;
                measuredWidth = i12;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(b bVar) {
        f2 f2Var = this.f2120b;
        f2Var.f13690f = bVar;
        d2 d2Var = f2Var.f13688d;
        synchronized (d2Var.f13668b) {
            d2Var.f13669e = bVar;
        }
        if (bVar == 0) {
            this.f2120b.c(null);
            return;
        }
        if (bVar instanceof j4.a) {
            this.f2120b.c((j4.a) bVar);
        }
        if (bVar instanceof d4.b) {
            f2 f2Var2 = this.f2120b;
            d4.b bVar2 = (d4.b) bVar;
            f2Var2.getClass();
            try {
                f2Var2.f13692h = bVar2;
                i0 i0Var = f2Var2.f13693i;
                if (i0Var != null) {
                    i0Var.G2(new ia(bVar2));
                }
            } catch (RemoteException e10) {
                wr.i("#007 Could not call remote method.", e10);
            }
        }
    }

    public void setAdSize(g gVar) {
        g[] gVarArr = {gVar};
        f2 f2Var = this.f2120b;
        if (f2Var.f13691g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        ViewGroup viewGroup = f2Var.f13695k;
        f2Var.f13691g = gVarArr;
        try {
            i0 i0Var = f2Var.f13693i;
            if (i0Var != null) {
                i0Var.g0(f2.a(viewGroup.getContext(), f2Var.f13691g, f2Var.f13696l));
            }
        } catch (RemoteException e10) {
            wr.i("#007 Could not call remote method.", e10);
        }
        viewGroup.requestLayout();
    }

    public void setAdUnitId(String str) {
        f2 f2Var = this.f2120b;
        if (f2Var.f13694j != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        f2Var.f13694j = str;
    }

    public void setOnPaidEventListener(n nVar) {
        f2 f2Var = this.f2120b;
        f2Var.getClass();
        try {
            i0 i0Var = f2Var.f13693i;
            if (i0Var != null) {
                i0Var.g1(new v2());
            }
        } catch (RemoteException e10) {
            wr.i("#007 Could not call remote method.", e10);
        }
    }
}