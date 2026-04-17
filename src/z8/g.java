package z8;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y0;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.measurement.l9;
import com.isprid.kendare.MyApplication;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f19774a;

    /* renamed from: b, reason: collision with root package name */
    public final a9.f f19775b;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f19776c;

    public g(List mList, a9.f mClick, Typeface typeface) {
        Intrinsics.f(mList, "mList");
        Intrinsics.f(mClick, "mClick");
        this.f19774a = mList;
        this.f19775b = mClick;
        this.f19776c = typeface;
    }

    @Override // androidx.recyclerview.widget.y0
    public final int getItemCount() {
        return this.f19774a.size();
    }

    @Override // androidx.recyclerview.widget.y0
    public final void onBindViewHolder(c2 c2Var, final int i10) throws Resources.NotFoundException {
        f holder = (f) c2Var;
        Intrinsics.f(holder, "holder");
        final Context context = holder.itemView.getContext();
        Intrinsics.e(context, "holder.itemView.context");
        final e9.d dVar = (e9.d) this.f19774a.get(i10);
        holder.f19771a.setText(dVar.f12582c);
        String strB = c31.a(dVar.f12581b).b();
        s9.f fVar = s9.c.f16951a;
        String string = context.getResources().getString(s9.c.b(context, strB));
        TextView textView = holder.f19772b;
        textView.setText(string);
        Typeface typefaceA = s9.d.a(context);
        n7.c cVar = MyApplication.f11640b;
        textView.setTypeface(typefaceA);
        holder.f19773c.setOnClickListener(new View.OnClickListener() { // from class: z8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                final g this$0 = this.f19763b;
                Intrinsics.f(this$0, "this$0");
                final Context context2 = context;
                Intrinsics.f(context2, "$context");
                final e9.d kendare = dVar;
                Intrinsics.f(kendare, "$kendare");
                Intrinsics.e(it, "it");
                new AlertDialog.Builder(context2).setTitle("Delete").setMessage("Are you sure you want to delete").setNegativeButton("NO", (DialogInterface.OnClickListener) null).setPositiveButton("YES", new DialogInterface.OnClickListener() { // from class: z8.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        g this$02 = this$0;
                        Intrinsics.f(this$02, "this$0");
                        Context context3 = context2;
                        Intrinsics.f(context3, "$context");
                        e9.d horoscope = kendare;
                        Intrinsics.f(horoscope, "$horoscope");
                        Intrinsics.f(dialogInterface, "dialogInterface");
                        q6.b bVar = d9.a.f12363b;
                        Context applicationContext = context3.getApplicationContext();
                        Intrinsics.e(applicationContext, "context.applicationContext");
                        a9.d dVarC = bVar.c(applicationContext);
                        String valueOf = String.valueOf(horoscope.f12580a);
                        d9.b bVar2 = ((d9.a) dVarC).f12365a;
                        bVar2.getClass();
                        Intrinsics.f(valueOf, "valueOf");
                        bVar2.getWritableDatabase().delete("horoscope", "_id=?", new String[]{valueOf});
                        fa.g.L3(this$02.f19774a).remove(horoscope);
                        this$02.notifyDataSetChanged();
                    }
                }).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: z8.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                g this$0 = this.f19766b;
                Intrinsics.f(this$0, "this$0");
                Intrinsics.e(it, "it");
                l9.e eVar = (l9.e) this$0.f19775b;
                eVar.getClass();
                a9.a aVar = eVar.T;
                if (aVar == null) {
                    Intrinsics.n("mListener");
                    throw null;
                }
                l9 l9Var = eVar.U;
                if (l9Var == null) {
                    Intrinsics.n("mSavingHoroscopeVM");
                    throw null;
                }
                aVar.a(((List) l9Var.f10882f).get(i10));
                eVar.h(false, false);
            }
        });
    }

    @Override // androidx.recyclerview.widget.y0
    public final c2 onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.f(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492941, parent, false);
        Intrinsics.e(itemView, "itemView");
        return new f(this, itemView);
    }
}