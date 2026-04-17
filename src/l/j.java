package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f14342a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14343b;

    public j(k kVar) {
        this.f14343b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f14343b.f14346f;
        q qVar = oVar.f14378v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f14366j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f14342a = i10;
                    return;
                }
            }
        }
        this.f14342a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        k kVar = this.f14343b;
        o oVar = kVar.f14346f;
        oVar.i();
        ArrayList arrayList = oVar.f14366j;
        kVar.getClass();
        int i11 = this.f14342a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f14343b;
        o oVar = kVar.f14346f;
        oVar.i();
        int size = oVar.f14366j.size();
        kVar.getClass();
        return this.f14342a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f14343b.f14345e.inflate(2131492880, viewGroup, false);
        }
        ((b0) view).b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}