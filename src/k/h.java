package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.q;
import l.r;
import l.v;
import o0.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ i E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f13896a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13903h;

    /* renamed from: i, reason: collision with root package name */
    public int f13904i;

    /* renamed from: j, reason: collision with root package name */
    public int f13905j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f13906k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f13907l;

    /* renamed from: m, reason: collision with root package name */
    public int f13908m;

    /* renamed from: n, reason: collision with root package name */
    public char f13909n;

    /* renamed from: o, reason: collision with root package name */
    public int f13910o;

    /* renamed from: p, reason: collision with root package name */
    public char f13911p;

    /* renamed from: q, reason: collision with root package name */
    public int f13912q;

    /* renamed from: r, reason: collision with root package name */
    public int f13913r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13914s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13915t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13916u;

    /* renamed from: v, reason: collision with root package name */
    public int f13917v;

    /* renamed from: w, reason: collision with root package name */
    public int f13918w;

    /* renamed from: x, reason: collision with root package name */
    public String f13919x;

    /* renamed from: y, reason: collision with root package name */
    public String f13920y;

    /* renamed from: z, reason: collision with root package name */
    public r f13921z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f13897b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f13898c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f13899d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f13900e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13901f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13902g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f13896a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f13926c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z7 = false;
        menuItem.setChecked(this.f13914s).setVisible(this.f13915t).setEnabled(this.f13916u).setCheckable(this.f13913r >= 1).setTitleCondensed(this.f13907l).setIcon(this.f13908m);
        int i10 = this.f13917v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f13920y;
        i iVar = this.E;
        if (str != null) {
            if (iVar.f13926c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f13927d == null) {
                iVar.f13927d = i.a(iVar.f13926c);
            }
            Object obj = iVar.f13927d;
            String str2 = this.f13920y;
            g gVar = new g();
            gVar.f13894a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f13895b = cls.getMethod(str2, g.f13893c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e10) {
                StringBuilder sbA = a0.h.A("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbA.append(cls.getName());
                InflateException inflateException = new InflateException(sbA.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f13913r >= 2) {
            if (menuItem instanceof q) {
                ((q) menuItem).g(true);
            } else if (menuItem instanceof v) {
                v vVar = (v) menuItem;
                try {
                    Method method = vVar.f14419e;
                    j0.b bVar = vVar.f14418d;
                    if (method == null) {
                        vVar.f14419e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    vVar.f14419e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str3 = this.f13919x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, i.f13922e, iVar.f13924a));
            z7 = true;
        }
        int i11 = this.f13918w;
        if (i11 > 0) {
            if (z7) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        r rVar = this.f13921z;
        if (rVar != null) {
            if (menuItem instanceof j0.b) {
                ((j0.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof j0.b;
        if (z10) {
            ((j0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((j0.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.m(menuItem, charSequence2);
        }
        char c10 = this.f13909n;
        int i12 = this.f13910o;
        if (z10) {
            ((j0.b) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.g(menuItem, c10, i12);
        }
        char c11 = this.f13911p;
        int i13 = this.f13912q;
        if (z10) {
            ((j0.b) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((j0.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((j0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s.i(menuItem, colorStateList);
            }
        }
    }
}