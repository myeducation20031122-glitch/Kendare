package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class d0 extends d implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final j0.a f14308d;

    public d0(Context context, j0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14308d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m(((o) this.f14308d).add(i10));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((o) this.f14308d).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f14308d).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final void clear() {
        t.k kVar = (t.k) this.f14306b;
        if (kVar != null) {
            kVar.clear();
        }
        t.k kVar2 = (t.k) this.f14307c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f14308d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f14308d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return m(((o) this.f14308d).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return m(((o) this.f14308d).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f14308d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f14308d).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f14308d).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f14308d).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((t.k) this.f14306b) != null) {
            int i11 = 0;
            while (true) {
                t.k kVar = (t.k) this.f14306b;
                if (i11 >= kVar.f17005f) {
                    break;
                }
                if (((j0.b) kVar.i(i11)).getGroupId() == i10) {
                    ((t.k) this.f14306b).k(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f14308d).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((t.k) this.f14306b) != null) {
            int i11 = 0;
            while (true) {
                t.k kVar = (t.k) this.f14306b;
                if (i11 >= kVar.f17005f) {
                    break;
                }
                if (((j0.b) kVar.i(i11)).getItemId() == i10) {
                    ((t.k) this.f14306b).k(i11);
                    break;
                }
                i11++;
            }
        }
        ((o) this.f14308d).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z7, boolean z10) {
        ((o) this.f14308d).setGroupCheckable(i10, z7, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z7) {
        ((o) this.f14308d).setGroupEnabled(i10, z7);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z7) {
        ((o) this.f14308d).setGroupVisible(i10, z7);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f14308d.setQwertyMode(z7);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f14308d).f14362f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m(((o) this.f14308d).add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f14308d).addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m(((o) this.f14308d).a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f14308d.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f14308d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f14308d).a(0, 0, 0, charSequence));
    }
}