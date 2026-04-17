package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14422a;

    /* renamed from: b, reason: collision with root package name */
    public final o f14423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14424c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14425d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14426e;

    /* renamed from: f, reason: collision with root package name */
    public View f14427f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14429h;

    /* renamed from: i, reason: collision with root package name */
    public z f14430i;

    /* renamed from: j, reason: collision with root package name */
    public w f14431j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14432k;

    /* renamed from: g, reason: collision with root package name */
    public int f14428g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final x f14433l = new x(this);

    public y(int i10, int i11, Context context, View view, o oVar, boolean z7) {
        this.f14422a = context;
        this.f14423b = oVar;
        this.f14427f = view;
        this.f14424c = z7;
        this.f14425d = i10;
        this.f14426e = i11;
    }

    public final w a() {
        w f0Var;
        if (this.f14431j == null) {
            Context context = this.f14422a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131099670)) {
                f0Var = new i(this.f14422a, this.f14427f, this.f14425d, this.f14426e, this.f14424c);
            } else {
                Context context2 = this.f14422a;
                o oVar = this.f14423b;
                f0Var = new f0(this.f14425d, this.f14426e, context2, this.f14427f, oVar, this.f14424c);
            }
            f0Var.o(this.f14423b);
            f0Var.u(this.f14433l);
            f0Var.q(this.f14427f);
            f0Var.f(this.f14430i);
            f0Var.r(this.f14429h);
            f0Var.s(this.f14428g);
            this.f14431j = f0Var;
        }
        return this.f14431j;
    }

    public final boolean b() {
        w wVar = this.f14431j;
        return wVar != null && wVar.a();
    }

    public void c() {
        this.f14431j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14432k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z7, boolean z10) {
        w wVarA = a();
        wVarA.v(z10);
        if (z7) {
            if ((Gravity.getAbsoluteGravity(this.f14428g, this.f14427f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f14427f.getWidth();
            }
            wVarA.t(i10);
            wVarA.w(i11);
            int i12 = (int) ((this.f14422a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wVarA.f14420b = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        wVarA.c();
    }
}