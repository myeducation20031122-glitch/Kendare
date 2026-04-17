package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.yl0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14716a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f14717b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14718c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14719d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14720e;

    public c0(ImageView imageView) {
        this.f14717b = imageView;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public final void a() {
        Drawable drawable = ((ImageView) this.f14717b).getDrawable();
        if (drawable != null) {
            t1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            Object obj = this.f14718c;
            if (i10 <= 21 ? i10 == 21 : ((f3) obj) != null) {
                if (((f3) this.f14720e) == null) {
                    this.f14720e = new f3(0);
                }
                f3 f3Var = (f3) this.f14720e;
                f3Var.f14778c = null;
                f3Var.f14777b = false;
                f3Var.f14779d = null;
                f3Var.f14776a = false;
                ColorStateList colorStateListA = u0.f.a((ImageView) this.f14717b);
                if (colorStateListA != null) {
                    f3Var.f14777b = true;
                    f3Var.f14778c = colorStateListA;
                }
                PorterDuff.Mode modeB = u0.f.b((ImageView) this.f14717b);
                if (modeB != null) {
                    f3Var.f14776a = true;
                    f3Var.f14779d = modeB;
                }
                if (f3Var.f14777b || f3Var.f14776a) {
                    x.e(drawable, f3Var, ((ImageView) this.f14717b).getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.f14719d;
            if (f3Var2 != null) {
                x.e(drawable, f3Var2, ((ImageView) this.f14717b).getDrawableState());
                return;
            }
            f3 f3Var3 = (f3) obj;
            if (f3Var3 != null) {
                x.e(drawable, f3Var3, ((ImageView) this.f14717b).getDrawableState());
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int iB;
        Context context = ((ImageView) this.f14717b).getContext();
        int[] iArr = f.a.f12629f;
        g.e eVarI = g.e.I(context, attributeSet, iArr, i10);
        ImageView imageView = (ImageView) this.f14717b;
        o0.c1.q(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) eVarI.f12764f, i10);
        try {
            Drawable drawable3 = ((ImageView) this.f14717b).getDrawable();
            if (drawable3 == null && (iB = eVarI.B(1, -1)) != -1 && (drawable3 = com.bumptech.glide.c.c(((ImageView) this.f14717b).getContext(), iB)) != null) {
                ((ImageView) this.f14717b).setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                t1.a(drawable3);
            }
            if (eVarI.F(2)) {
                ImageView imageView2 = (ImageView) this.f14717b;
                ColorStateList colorStateListR = eVarI.r(2);
                int i11 = Build.VERSION.SDK_INT;
                u0.f.c(imageView2, colorStateListR);
                if (i11 == 21 && (drawable2 = imageView2.getDrawable()) != null && u0.f.a(imageView2) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (eVarI.F(3)) {
                ImageView imageView3 = (ImageView) this.f14717b;
                PorterDuff.Mode modeC = t1.c(eVarI.y(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                u0.f.d(imageView3, modeC);
                if (i12 == 21 && (drawable = imageView3.getDrawable()) != null && u0.f.a(imageView3) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            eVarI.L();
        } catch (Throwable th) {
            eVarI.L();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x003a A[EDGE_INSN: B:87:0x003a->B:18:0x003a BREAK  A[LOOP:3: B:12:0x0022->B:90:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(q1.b bVar, int i10, int i11) {
        List listEmptyList;
        TreeMap treeMap;
        boolean z7;
        l1.a aVar = (l1.a) this.f14717b;
        Object obj = this.f14718c;
        if (aVar != null) {
            p8.c cVar = aVar.f14465d;
            cVar.getClass();
            if (i10 == i11) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z10 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                do {
                    if (z10) {
                        if (i12 >= i11) {
                            listEmptyList = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) cVar.f16073e).get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            break;
                        }
                        Iterator it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            if (z10) {
                                if (iIntValue <= i11 && iIntValue > i12) {
                                    arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                    i12 = iIntValue;
                                    z7 = true;
                                    break;
                                }
                            } else {
                                if (iIntValue >= i11 && iIntValue < i12) {
                                    arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                    i12 = iIntValue;
                                    z7 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z7 = false;
                    } else {
                        if (i12 <= i11) {
                            listEmptyList = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) cVar.f16073e).get(Integer.valueOf(i12));
                        if (treeMap == null) {
                        }
                    }
                } while (z7);
                listEmptyList = null;
            }
            if (listEmptyList != null) {
                yl0 yl0Var = (yl0) obj;
                yl0Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                Cursor cursorD = bVar.d("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorD.moveToNext()) {
                    try {
                        arrayList2.add(cursorD.getString(0));
                    } catch (Throwable th) {
                        cursorD.close();
                        throw th;
                    }
                }
                cursorD.close();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.c("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it3 = listEmptyList.iterator();
                while (it3.hasNext()) {
                    ((m1.a) it3.next()).a(bVar);
                }
                yl0Var.getClass();
                l1.q qVarK = yl0.k(bVar);
                if (!qVarK.f14512a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + qVarK.f14513b);
                }
                yl0Var.getClass();
                h(bVar);
                return;
            }
        }
        l1.a aVar2 = (l1.a) this.f14717b;
        if (aVar2 == null || aVar2.a(i10, i11)) {
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        yl0 yl0Var2 = (yl0) obj;
        yl0Var2.getClass();
        bVar.c("DROP TABLE IF EXISTS `Dependency`");
        bVar.c("DROP TABLE IF EXISTS `WorkSpec`");
        bVar.c("DROP TABLE IF EXISTS `WorkTag`");
        bVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
        bVar.c("DROP TABLE IF EXISTS `WorkName`");
        bVar.c("DROP TABLE IF EXISTS `WorkProgress`");
        bVar.c("DROP TABLE IF EXISTS `Preference`");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) yl0Var2.f10133f;
        int i13 = WorkDatabase_Impl.f1794s;
        List list = workDatabase_Impl.f14509g;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((a2.g) ((WorkDatabase_Impl) yl0Var2.f10133f).f14509g.get(i14)).getClass();
            }
        }
        yl0Var2.getClass();
        yl0.j(bVar);
    }

    public final void e(int i10) {
        if (i10 != 0) {
            Drawable drawableC = com.bumptech.glide.c.c(((ImageView) this.f14717b).getContext(), i10);
            if (drawableC != null) {
                t1.a(drawableC);
            }
            ((ImageView) this.f14717b).setImageDrawable(drawableC);
        } else {
            ((ImageView) this.f14717b).setImageDrawable(null);
        }
        a();
    }

    public final void f(ColorStateList colorStateList) {
        if (((f3) this.f14719d) == null) {
            this.f14719d = new f3(0);
        }
        f3 f3Var = (f3) this.f14719d;
        f3Var.f14778c = colorStateList;
        f3Var.f14777b = true;
        a();
    }

    public final void g(PorterDuff.Mode mode) {
        if (((f3) this.f14719d) == null) {
            this.f14719d = new f3(0);
        }
        f3 f3Var = (f3) this.f14719d;
        f3Var.f14779d = mode;
        f3Var.f14776a = true;
        a();
    }

    public final void h(q1.b bVar) {
        bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f14719d) + "')");
    }
}