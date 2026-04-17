package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y0;
import com.isprid.kendare.model.DHospitalPlace;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends y0 implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public List f19789a;

    /* renamed from: b, reason: collision with root package name */
    public final n f19790b;

    /* renamed from: c, reason: collision with root package name */
    public List f19791c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19792d;

    public p(ArrayList hospitalPlaces, n listener) {
        Intrinsics.f(hospitalPlaces, "hospitalPlaces");
        Intrinsics.f(listener, "listener");
        this.f19789a = hospitalPlaces;
        this.f19790b = listener;
        this.f19791c = new ArrayList();
        this.f19792d = this.f19789a;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new o(this);
    }

    @Override // androidx.recyclerview.widget.y0
    public final int getItemCount() {
        return this.f19789a.size();
    }

    @Override // androidx.recyclerview.widget.y0
    public final void onBindViewHolder(c2 c2Var, int i10) {
        m holder = (m) c2Var;
        Intrinsics.f(holder, "holder");
        DHospitalPlace dHospitalPlace = (DHospitalPlace) this.f19789a.get(i10);
        holder.f19786a.setText(dHospitalPlace.getPlaceName());
        holder.f19787b.setText(dHospitalPlace.getCountry());
    }

    @Override // androidx.recyclerview.widget.y0
    public final c2 onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.f(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492943, parent, false);
        Intrinsics.e(itemView, "itemView");
        return new m(this, itemView);
    }
}