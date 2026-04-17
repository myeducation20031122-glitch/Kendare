package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import g.u0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.o2;
import m.p2;
import m.r2;
import m.z1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends w implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View R;
    public View S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public z f14330a0;

    /* renamed from: b0, reason: collision with root package name */
    public ViewTreeObserver f14331b0;

    /* renamed from: c0, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14332c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f14333d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14334e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14335f;

    /* renamed from: j, reason: collision with root package name */
    public final int f14336j;

    /* renamed from: m, reason: collision with root package name */
    public final int f14337m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14338n;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f14339t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f14340u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f14341w = new ArrayList();
    public final e M = new e(this, 0);
    public final f N = new f(this, 0);
    public final u0 O = new u0(this, 2);
    public int P = 0;
    public int Q = 0;
    public boolean Y = false;

    public i(Context context, View view, int i10, int i11, boolean z7) {
        this.f14334e = context;
        this.R = view;
        this.f14336j = i10;
        this.f14337m = i11;
        this.f14338n = z7;
        this.T = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14335f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.f14339t = new Handler();
    }

    @Override // l.e0
    public final boolean a() {
        ArrayList arrayList = this.f14341w;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).f14327a.f14841c0.isShowing();
    }

    @Override // l.a0
    public final void b(Parcelable parcelable) {
    }

    @Override // l.e0
    public final void c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f14340u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((o) it.next());
        }
        arrayList.clear();
        View view = this.R;
        this.S = view;
        if (view != null) {
            boolean z7 = this.f14331b0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14331b0 = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.M);
            }
            this.S.addOnAttachStateChangeListener(this.N);
        }
    }

    @Override // l.a0
    public final void d(o oVar, boolean z7) {
        ArrayList arrayList = this.f14341w;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (oVar == ((h) arrayList.get(i10)).f14328b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((h) arrayList.get(i11)).f14328b.c(false);
        }
        h hVar = (h) arrayList.remove(i10);
        hVar.f14328b.r(this);
        boolean z10 = this.f14333d0;
        r2 r2Var = hVar.f14327a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                o2.b(r2Var.f14841c0, null);
            } else {
                r2Var.getClass();
            }
            r2Var.f14841c0.setAnimationStyle(0);
        }
        r2Var.dismiss();
        int size2 = arrayList.size();
        this.T = size2 > 0 ? ((h) arrayList.get(size2 - 1)).f14329c : this.R.getLayoutDirection() == 1 ? 0 : 1;
        if (size2 != 0) {
            if (z7) {
                ((h) arrayList.get(0)).f14328b.c(false);
                return;
            }
            return;
        }
        dismiss();
        z zVar = this.f14330a0;
        if (zVar != null) {
            zVar.d(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14331b0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14331b0.removeGlobalOnLayoutListener(this.M);
            }
            this.f14331b0 = null;
        }
        this.S.removeOnAttachStateChangeListener(this.N);
        this.f14332c0.onDismiss();
    }

    @Override // l.e0
    public final void dismiss() {
        ArrayList arrayList = this.f14341w;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                h hVar = hVarArr[i10];
                if (hVar.f14327a.f14841c0.isShowing()) {
                    hVar.f14327a.dismiss();
                }
            }
        }
    }

    @Override // l.e0
    public final z1 e() {
        ArrayList arrayList = this.f14341w;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).f14327a.f14843f;
    }

    @Override // l.a0
    public final void f(z zVar) {
        this.f14330a0 = zVar;
    }

    @Override // l.a0
    public final void h(boolean z7) {
        Iterator it = this.f14341w.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f14327a.f14843f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.a0
    public final boolean k() {
        return false;
    }

    @Override // l.a0
    public final Parcelable l() {
        return null;
    }

    @Override // l.a0
    public final boolean m(g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f14341w.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (g0Var == hVar.f14328b) {
                hVar.f14327a.f14843f.requestFocus();
                return true;
            }
        }
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        o(g0Var);
        z zVar = this.f14330a0;
        if (zVar != null) {
            zVar.l(g0Var);
        }
        return true;
    }

    @Override // l.w
    public final void o(o oVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        oVar.b(this, this.f14334e);
        if (a()) {
            y(oVar);
        } else {
            this.f14340u.add(oVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f14341w;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = (h) arrayList.get(i10);
            if (!hVar.f14327a.f14841c0.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (hVar != null) {
            hVar.f14328b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.w
    public final void q(View view) {
        if (this.R != view) {
            this.R = view;
            this.Q = Gravity.getAbsoluteGravity(this.P, view.getLayoutDirection());
        }
    }

    @Override // l.w
    public final void r(boolean z7) {
        this.Y = z7;
    }

    @Override // l.w
    public final void s(int i10) {
        if (this.P != i10) {
            this.P = i10;
            this.Q = Gravity.getAbsoluteGravity(i10, this.R.getLayoutDirection());
        }
    }

    @Override // l.w
    public final void t(int i10) {
        this.U = true;
        this.W = i10;
    }

    @Override // l.w
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f14332c0 = onDismissListener;
    }

    @Override // l.w
    public final void v(boolean z7) {
        this.Z = z7;
    }

    @Override // l.w
    public final void w(int i10) {
        this.V = true;
        this.X = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(o oVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h hVar;
        View childAt;
        char c10;
        int i10;
        int i11;
        int width;
        MenuItem item;
        l lVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f14334e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        l lVar2 = new l(oVar, layoutInflaterFrom, this.f14338n, 2131492875);
        if (!a() && this.Y) {
            lVar2.f14352c = true;
        } else if (a()) {
            lVar2.f14352c = w.x(oVar);
        }
        int iP = w.p(lVar2, context, this.f14335f);
        r2 r2Var = new r2(context, null, this.f14336j, this.f14337m);
        r2Var.f14907g0 = this.O;
        r2Var.S = this;
        r2Var.f14841c0.setOnDismissListener(this);
        r2Var.R = this.R;
        r2Var.O = this.Q;
        r2Var.f14840b0 = true;
        r2Var.f14841c0.setFocusable(true);
        r2Var.f14841c0.setInputMethodMode(2);
        r2Var.o(lVar2);
        r2Var.r(iP);
        r2Var.O = this.Q;
        ArrayList arrayList = this.f14341w;
        if (arrayList.size() > 0) {
            hVar = (h) arrayList.get(arrayList.size() - 1);
            o oVar2 = hVar.f14328b;
            int size = oVar2.f14362f.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    item = null;
                    break;
                }
                item = oVar2.getItem(i12);
                if (item.hasSubMenu() && oVar == item.getSubMenu()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                z1 z1Var = hVar.f14327a.f14843f;
                ListAdapter adapter = z1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    lVar = (l) headerViewListAdapter.getWrappedAdapter();
                } else {
                    lVar = (l) adapter;
                    headersCount = 0;
                }
                int count = lVar.getCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= count) {
                        i13 = -1;
                        break;
                    } else if (item == lVar.getItem(i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 != -1 && (firstVisiblePosition = (i13 + headersCount) - z1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < z1Var.getChildCount()) {
                    childAt = z1Var.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i14 = Build.VERSION.SDK_INT;
                m.f0 f0Var = r2Var.f14841c0;
                if (i14 <= 28) {
                    Method method = r2.f14906h0;
                    if (method != null) {
                        try {
                            method.invoke(f0Var, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    p2.a(f0Var, false);
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    o2.a(r2Var.f14841c0, null);
                }
                z1 z1Var2 = ((h) arrayList.get(arrayList.size() - 1)).f14327a.f14843f;
                int[] iArr = new int[2];
                z1Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.S.getWindowVisibleDisplayFrame(rect);
                int i16 = (this.T != 1 ? iArr[0] - iP >= 0 : (z1Var2.getWidth() + iArr[0]) + iP > rect.right) ? 0 : 1;
                boolean z7 = i16 == 1;
                this.T = i16;
                if (i15 >= 26) {
                    r2Var.R = childAt;
                    i11 = 0;
                    i10 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.R.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.Q & 7) == 5) {
                        c10 = 0;
                        iArr2[0] = this.R.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    } else {
                        c10 = 0;
                    }
                    i10 = iArr3[c10] - iArr2[c10];
                    i11 = iArr3[1] - iArr2[1];
                }
                if ((this.Q & 5) != 5) {
                    width = z7 ? i10 + childAt.getWidth() : i10 - iP;
                    r2Var.f14846n = width;
                    r2Var.N = true;
                    r2Var.M = true;
                    r2Var.h(i11);
                } else if (z7) {
                    width = i10 + iP;
                    r2Var.f14846n = width;
                    r2Var.N = true;
                    r2Var.M = true;
                    r2Var.h(i11);
                } else {
                    iP = childAt.getWidth();
                    r2Var.f14846n = width;
                    r2Var.N = true;
                    r2Var.M = true;
                    r2Var.h(i11);
                }
            } else {
                if (this.U) {
                    r2Var.f14846n = this.W;
                }
                if (this.V) {
                    r2Var.h(this.X);
                }
                Rect rect2 = this.f14420b;
                r2Var.f14838a0 = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new h(r2Var, oVar, this.T));
            r2Var.c();
            z1 z1Var3 = r2Var.f14843f;
            z1Var3.setOnKeyListener(this);
            if (hVar == null || !this.Z || oVar.f14369m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131492882, (ViewGroup) z1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(oVar.f14369m);
            z1Var3.addHeaderView(frameLayout, null, false);
            r2Var.c();
            return;
        }
        hVar = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new h(r2Var, oVar, this.T));
        r2Var.c();
        z1 z1Var32 = r2Var.f14843f;
        z1Var32.setOnKeyListener(this);
        if (hVar == null) {
        }
    }
}