package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final o f14350a;

    /* renamed from: b, reason: collision with root package name */
    public int f14351b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14352c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14353d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f14354e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14355f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z7, int i10) {
        this.f14353d = z7;
        this.f14354e = layoutInflater;
        this.f14350a = oVar;
        this.f14355f = i10;
        a();
    }

    public final void a() {
        o oVar = this.f14350a;
        q qVar = oVar.f14378v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f14366j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f14351b = i10;
                    return;
                }
            }
        }
        this.f14351b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        ArrayList arrayListL;
        boolean z7 = this.f14353d;
        o oVar = this.f14350a;
        if (z7) {
            oVar.i();
            arrayListL = oVar.f14366j;
        } else {
            arrayListL = oVar.l();
        }
        int i11 = this.f14351b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z7 = this.f14353d;
        o oVar = this.f14350a;
        if (z7) {
            oVar.i();
            arrayListL = oVar.f14366j;
        } else {
            arrayListL = oVar.l();
        }
        int i10 = this.f14351b;
        int size = arrayListL.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z7 = false;
        if (view == null) {
            view = this.f14354e.inflate(this.f14355f, viewGroup, false);
        }
        int i11 = getItem(i10).f14385b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f14385b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14350a.m() && i11 != i13) {
            z7 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z7);
        b0 b0Var = (b0) view;
        if (this.f14352c) {
            listMenuItemView.setForceShowIcon(true);
        }
        b0Var.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}