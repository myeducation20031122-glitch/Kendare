package z8;

import android.widget.Filter;
import com.isprid.kendare.model.DHospitalPlace;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f19788a;

    public o(p pVar) {
        this.f19788a = pVar;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Intrinsics.f(charSequence, "charSequence");
        String string = charSequence.toString();
        ArrayList arrayList = new ArrayList();
        int length = string.length();
        p pVar = this.f19788a;
        if (length == 0 || Intrinsics.a(charSequence, "")) {
            arrayList = fa.g.L3(pVar.f19792d);
        } else {
            for (DHospitalPlace dHospitalPlace : pVar.f19789a) {
                String placeName = dHospitalPlace.getPlaceName();
                if (placeName != null) {
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.e(ROOT, "ROOT");
                    String lowerCase = placeName.toLowerCase(ROOT);
                    Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String lowerCase2 = string.toLowerCase(ROOT);
                    Intrinsics.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    if (ec.j.E(lowerCase, lowerCase2)) {
                        arrayList.add(dHospitalPlace);
                    }
                }
            }
        }
        pVar.f19791c = arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = pVar.f19791c;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.f(charSequence, "charSequence");
        Intrinsics.f(filterResults, "filterResults");
        Object obj = filterResults.values;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.isprid.kendare.model.DHospitalPlace>");
        List listA = TypeIntrinsics.a(obj);
        p pVar = this.f19788a;
        pVar.f19789a = listA;
        pVar.notifyDataSetChanged();
    }
}