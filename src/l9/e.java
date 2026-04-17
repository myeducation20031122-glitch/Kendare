package l9;

import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y0;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.maps.model.LatLng;
import com.isprid.kendare.MyApplication;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ll9/e;", "Landroidx/fragment/app/q;", "La9/f;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends q implements a9.f {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f14696a0 = 0;
    public a9.a T;
    public l9 U;
    public Typeface V;
    public RecyclerView W;
    public TextView X;
    public TextView Y;
    public z8.g Z;

    @Override // androidx.fragment.app.q
    public final Dialog i() {
        yl0 yl0Var = new yl0(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(2131492926, (ViewGroup) null);
        yl0Var.n(viewInflate);
        View viewFindViewById = viewInflate.findViewById(2131296955);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.title)");
        this.Y = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131296808);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.recyclerView)");
        this.W = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(2131296937);
        Intrinsics.e(viewFindViewById3, "view.findViewById(R.id.text_no_data)");
        this.X = (TextView) viewFindViewById3;
        q6.b bVar = d9.a.f12363b;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.e(applicationContext, "requireContext().applicationContext");
        this.U = new l9(bVar.c(applicationContext));
        Typeface typefaceA = s9.d.a(requireContext());
        Intrinsics.e(typefaceA, "getTypeFace(requireConte…ontUtil.TypeFace.SINHALA)");
        this.V = typefaceA;
        TextView textView = this.X;
        String str = "textNoData";
        if (textView == null) {
            Intrinsics.n("textNoData");
            throw null;
        }
        textView.setTypeface(typefaceA);
        l9 l9Var = this.U;
        if (l9Var == null) {
            Intrinsics.n("mSavingHoroscopeVM");
            throw null;
        }
        List list = (List) l9Var.f10882f;
        Typeface typeface = this.V;
        if (typeface == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        this.Z = new z8.g(list, this, typeface);
        RecyclerView recyclerView = this.W;
        String str2 = "recyclerView";
        if (recyclerView == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.W;
        if (recyclerView2 == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView3 = this.W;
        if (recyclerView3 == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        z8.g gVar = this.Z;
        String str3 = "adapter";
        if (gVar == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        recyclerView3.setAdapter(gVar);
        n7.c cVar = MyApplication.f11640b;
        TextView textView2 = this.Y;
        if (textView2 == null) {
            Intrinsics.n("title");
            throw null;
        }
        Typeface typeface2 = this.V;
        if (typeface2 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView2.setTypeface(typeface2, 1);
        TextView textView3 = this.X;
        if (textView3 == null) {
            Intrinsics.n("textNoData");
            throw null;
        }
        Typeface typeface3 = this.V;
        if (typeface3 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView3.setTypeface(typeface3);
        TextView textView4 = this.Y;
        if (textView4 == null) {
            Intrinsics.n("title");
            throw null;
        }
        textView4.setText(getString(2131886954));
        yl0Var.l(getString(2131886314), new c9.c(4));
        TextView textView5 = this.X;
        if (textView5 == null) {
            Intrinsics.n("textNoData");
            throw null;
        }
        textView5.setText(2131886810);
        l9 l9Var2 = this.U;
        if (l9Var2 == null) {
            Intrinsics.n("mSavingHoroscopeVM");
            throw null;
        }
        d9.b bVar2 = ((d9.a) ((a9.d) l9Var2.f10881e)).f12365a;
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = bVar2.getReadableDatabase().rawQuery("select * from horoscope", null);
        Intrinsics.e(cursorRawQuery, "db.rawQuery(\"select * fr…scopeTable._NAME}\", null)");
        cursorRawQuery.moveToFirst();
        while (!cursorRawQuery.isAfterLast()) {
            int i10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("_id"));
            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("name"));
            String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("birthPlace"));
            int i11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("lagna"));
            long j10 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("birthDateTime"));
            double d10 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndexOrThrow("latitude"));
            double d11 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndexOrThrow("longitude"));
            l9 l9Var3 = l9Var2;
            double d12 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndexOrThrow("timeZone"));
            ArrayList arrayList2 = arrayList;
            long j11 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("createdAt"));
            String str4 = str3;
            cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("status"));
            e9.d dVar = new e9.d();
            dVar.f12580a = i10;
            dVar.f12582c = string;
            dVar.f12586g = string2;
            dVar.f12581b = i11;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            dVar.f12585f = calendar;
            dVar.f12592m = new LatLng(d10, d11);
            dVar.f12602w = d12;
            Calendar.getInstance().setTimeInMillis(j11);
            arrayList2.add(dVar);
            cursorRawQuery.moveToNext();
            arrayList = arrayList2;
            str = str;
            yl0Var = yl0Var;
            str2 = str2;
            l9Var2 = l9Var3;
            str3 = str4;
        }
        yl0 yl0Var2 = yl0Var;
        l9 l9Var4 = l9Var2;
        String str5 = str2;
        String str6 = str;
        String str7 = str3;
        cursorRawQuery.close();
        ((List) l9Var4.f10882f).clear();
        ((List) l9Var4.f10882f).addAll(arrayList);
        RecyclerView recyclerView4 = this.W;
        if (recyclerView4 == null) {
            Intrinsics.n(str5);
            throw null;
        }
        y0 adapter = recyclerView4.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        z8.g gVar2 = this.Z;
        if (gVar2 == null) {
            Intrinsics.n(str7);
            throw null;
        }
        Log.e("TAG", "(adapter.getItemCount()" + gVar2.f19774a.size());
        z8.g gVar3 = this.Z;
        if (gVar3 == null) {
            Intrinsics.n(str7);
            throw null;
        }
        if (gVar3.f19774a.size() > 0) {
            RecyclerView recyclerView5 = this.W;
            if (recyclerView5 == null) {
                Intrinsics.n(str5);
                throw null;
            }
            com.bumptech.glide.f.x(recyclerView5);
            TextView textView6 = this.X;
            if (textView6 == null) {
                Intrinsics.n(str6);
                throw null;
            }
            com.bumptech.glide.f.l(textView6);
        } else {
            RecyclerView recyclerView6 = this.W;
            if (recyclerView6 == null) {
                Intrinsics.n(str5);
                throw null;
            }
            com.bumptech.glide.f.l(recyclerView6);
            TextView textView7 = this.X;
            if (textView7 == null) {
                Intrinsics.n(str6);
                throw null;
            }
            com.bumptech.glide.f.x(textView7);
        }
        this.f1079t = true;
        Dialog dialog = this.O;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        return yl0Var2.i();
    }
}