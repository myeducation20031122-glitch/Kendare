package z8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y0;
import com.isprid.kendare.model.DArticle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f19761a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f19762b;

    public b(ArrayList articleList, k9.c cVar) {
        Intrinsics.f(articleList, "articleList");
        this.f19761a = articleList;
        this.f19762b = cVar;
    }

    @Override // androidx.recyclerview.widget.y0
    public final int getItemCount() {
        return this.f19761a.size();
    }

    @Override // androidx.recyclerview.widget.y0
    public final void onBindViewHolder(c2 c2Var, int i10) {
        a holder = (a) c2Var;
        Intrinsics.f(holder, "holder");
        DArticle dArticle = (DArticle) this.f19761a.get(i10);
        holder.f19759b.setText(dArticle.getTitle());
        String icon = dArticle.getIcon();
        ImageView imageView = holder.f19758a;
        Intrinsics.f(imageView, "<this>");
        Context context = imageView.getContext();
        if (context == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        com.bumptech.glide.q qVarB = com.bumptech.glide.b.b(context).f2234m.b(context);
        qVarB.getClass();
        new com.bumptech.glide.o(qVarB.f2390b, qVarB, Drawable.class, qVarB.f2391e).y(icon).t(((e3.e) new e3.e().q(new q2.k(new z2.h(), new y((int) (12 * Resources.getSystem().getDisplayMetrics().density))), true)).j()).w(imageView);
        holder.f19760c.setOnClickListener(new x6.l(1, this, dArticle));
    }

    @Override // androidx.recyclerview.widget.y0
    public final c2 onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.f(parent, "parent");
        View rootView = LayoutInflater.from(parent.getContext()).inflate(2131492940, parent, false);
        Intrinsics.e(rootView, "rootView");
        return new a(rootView);
    }
}