package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.e1;
import o0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class o implements j0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f14356y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f14357a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f14358b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14359c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14360d;

    /* renamed from: e, reason: collision with root package name */
    public m f14361e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14362f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14363g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14364h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f14365i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f14366j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14367k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f14369m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f14370n;

    /* renamed from: o, reason: collision with root package name */
    public View f14371o;

    /* renamed from: v, reason: collision with root package name */
    public q f14378v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14380x;

    /* renamed from: l, reason: collision with root package name */
    public int f14368l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14372p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14373q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14374r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14375s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f14376t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f14377u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f14379w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z7 = false;
        this.f14357a = context;
        Resources resources2 = context.getResources();
        this.f14358b = resources2;
        this.f14362f = new ArrayList();
        this.f14363g = new ArrayList();
        this.f14364h = true;
        this.f14365i = new ArrayList();
        this.f14366j = new ArrayList();
        this.f14367k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = g1.f15547a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : e1.b(viewConfiguration)) {
                z7 = true;
            }
        }
        this.f14360d = z7;
    }

    public q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f14356y[i14] << 16) | (65535 & i12);
        q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f14368l);
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((q) arrayList.get(size)).f14387d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, qVar);
        p(true);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f14358b.getString(i10));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f14357a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q qVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            qVarA.setIcon(resolveInfo.loadIcon(packageManager));
            qVarA.f14390g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = qVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f14358b.getString(i10));
    }

    public final void b(a0 a0Var, Context context) {
        this.f14377u.add(new WeakReference(a0Var));
        a0Var.i(context, this);
        this.f14367k = true;
    }

    public final void c(boolean z7) {
        if (this.f14375s) {
            return;
        }
        this.f14375s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.d(this, z7);
            }
        }
        this.f14375s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f14378v;
        if (qVar != null) {
            d(qVar);
        }
        this.f14362f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f14370n = null;
        this.f14369m = null;
        this.f14371o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
        boolean zN = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14378v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zN = a0Var.n(qVar);
                    if (zN) {
                        break;
                    }
                }
            }
            v();
            if (zN) {
                this.f14378v = null;
            }
        }
        return zN;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f14361e;
        return mVar != null && mVar.f(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zG = a0Var.g(qVar);
                if (zG) {
                    break;
                }
            }
        }
        v();
        if (zG) {
            this.f14378v = qVar;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f14384a == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (menuItemFindItem = qVar.f14398o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final q g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f14376t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            char c10 = zN ? qVar.f14393j : qVar.f14391h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f14362f.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList2 = this.f14362f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = (q) arrayList2.get(i11);
                if (qVar.hasSubMenu()) {
                    qVar.f14398o.h(arrayList, i10, keyEvent);
                }
                char c10 = zN ? qVar.f14393j : qVar.f14391h;
                if ((modifiers & 69647) == ((zN ? qVar.f14394k : qVar.f14392i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (zN && c10 == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (qVar.isEnabled()) {
                        arrayList.add(qVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f14380x) {
            return true;
        }
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f14367k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zK = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK |= a0Var.k();
                }
            }
            ArrayList arrayList = this.f14365i;
            ArrayList arrayList2 = this.f14366j;
            arrayList.clear();
            arrayList2.clear();
            if (zK) {
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    q qVar = (q) arrayListL.get(i10);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList2.addAll(l());
            }
            this.f14367k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z7 = this.f14364h;
        ArrayList arrayList = this.f14363g;
        if (!z7) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f14362f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f14364h = false;
        this.f14367k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f14379w;
    }

    public boolean n() {
        return this.f14359c;
    }

    public boolean o() {
        return this.f14360d;
    }

    public final void p(boolean z7) {
        if (this.f14372p) {
            this.f14373q = true;
            if (z7) {
                this.f14374r = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f14364h = true;
            this.f14367k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.h(z7);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        q qVarG = g(i10, keyEvent);
        boolean zQ = qVarG != null ? q(qVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[PHI: r1
      0x005f: PHI (r1v12 boolean) = (r1v10 boolean), (r1v9 boolean), (r1v13 boolean) binds: [B:68:0x00ce, B:43:0x006f, B:36:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, a0 a0Var, int i10) {
        boolean zExpandActionView;
        q qVar = (q) menuItem;
        if (qVar == null || !qVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = qVar.f14399p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(qVar)) {
            o oVar = qVar.f14397n;
            if (!oVar.e(oVar, qVar)) {
                Intent intent = qVar.f14390g;
                if (intent != null) {
                    try {
                        oVar.f14357a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    }
                } else {
                    r rVar = qVar.A;
                    zExpandActionView = rVar != null && rVar.f14411b.onPerformDefaultAction();
                }
            }
        }
        r rVar2 = qVar.A;
        boolean z7 = rVar2 != null && rVar2.f14411b.hasSubMenu();
        if (qVar.e()) {
            zExpandActionView |= qVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (qVar.hasSubMenu() || z7) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!qVar.hasSubMenu()) {
                g0 g0Var = new g0(this.f14357a, this, qVar);
                qVar.f14398o = g0Var;
                g0Var.setHeaderTitle(qVar.f14388e);
            }
            g0 g0Var2 = qVar.f14398o;
            if (z7) {
                rVar2.f14412c.getClass();
                rVar2.f14411b.onPrepareSubMenu(g0Var2);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
            if (!copyOnWriteArrayList.isEmpty()) {
                zM = a0Var != null ? a0Var.m(g0Var2) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    a0 a0Var2 = (a0) weakReference.get();
                    if (a0Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zM) {
                        zM = a0Var2.m(g0Var2);
                    }
                }
            }
            zExpandActionView |= zM;
            if (!zExpandActionView) {
            }
        } else if ((i10 & 1) == 0) {
        }
        return zExpandActionView;
    }

    public final void r(a0 a0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14377u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var2 = (a0) weakReference.get();
            if (a0Var2 == null || a0Var2 == a0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((q) arrayList.get(i12)).f14385b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((q) arrayList.get(i12)).f14385b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f14362f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((q) arrayList.get(i11)).f14384a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f14362f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f14362f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((g0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z7, boolean z10) {
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f14385b == i10) {
                qVar.g(z10);
                qVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f14379w = z7;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z7) {
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f14385b == i10) {
                qVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z7) {
        ArrayList arrayList = this.f14362f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f14385b == i10) {
                int i12 = qVar.f14407x;
                int i13 = (i12 & (-9)) | (z7 ? 0 : 8);
                qVar.f14407x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f14359c = z7;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14362f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f14362f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((g0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f14371o = view;
            this.f14369m = null;
            this.f14370n = null;
        } else {
            if (i10 > 0) {
                this.f14369m = this.f14358b.getText(i10);
            } else if (charSequence != null) {
                this.f14369m = charSequence;
            }
            if (i11 > 0) {
                Object obj = f0.f.f12651a;
                this.f14370n = f0.a.b(this.f14357a, i11);
            } else if (drawable != null) {
                this.f14370n = drawable;
            }
            this.f14371o = null;
        }
        p(false);
    }

    public final void v() {
        this.f14372p = false;
        if (this.f14373q) {
            this.f14373q = false;
            p(this.f14374r);
        }
    }

    public final void w() {
        if (this.f14372p) {
            return;
        }
        this.f14372p = true;
        this.f14373q = false;
        this.f14374r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f14358b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f14358b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q qVarA = a(i10, i11, i12, charSequence);
        g0 g0Var = new g0(this.f14357a, this, qVarA);
        qVarA.f14398o = g0Var;
        g0Var.setHeaderTitle(qVarA.f14388e);
        return g0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}