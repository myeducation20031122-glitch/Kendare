package q9;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.m;
import androidx.fragment.app.d0;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import c4.i;
import com.bumptech.glide.f;
import e0.g;
import g.e;
import io.reactivex.internal.fuseable.QueueFuseable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t7.z0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lq9/b;", "Lj9/c;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends j9.c {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f16344w = 0;

    /* renamed from: f, reason: collision with root package name */
    public z8.b f16345f;

    /* renamed from: j, reason: collision with root package name */
    public q.d f16346j;

    /* renamed from: t, reason: collision with root package name */
    public d f16349t;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f16347m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f16348n = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16350u = true;

    @Override // j9.c
    public final void h() {
        d dVar = (d) new e((d1) this).o(d.class);
        this.f16349t = dVar;
        dVar.f16353a.e(getViewLifecycleOwner(), new g(this, 24));
        n7.c.v(b.class);
        q.d dVar2 = this.f16346j;
        if (dVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) dVar2.f16091m;
        requireContext();
        recyclerView.setLayoutManager(new GridLayoutManager());
        q.d dVar3 = this.f16346j;
        if (dVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((RecyclerView) dVar3.f16091m).setItemAnimator(new q());
        q.d dVar4 = this.f16346j;
        if (dVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView2 = (RecyclerView) dVar4.f16091m;
        Context contextRequireContext = requireContext();
        Intrinsics.e(contextRequireContext, "requireContext()");
        recyclerView2.i(new s9.e(contextRequireContext));
        z8.b bVar = new z8.b(this.f16347m, new k9.c(this, 1));
        this.f16345f = bVar;
        q.d dVar5 = this.f16346j;
        if (dVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((RecyclerView) dVar5.f16091m).setAdapter(bVar);
        l();
        Context contextRequireContext2 = requireContext();
        Intrinsics.e(contextRequireContext2, "requireContext()");
        q.d dVar6 = this.f16346j;
        if (dVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) dVar6.f16088e;
        Intrinsics.e(linearLayout, "binding.bannerAd");
        if (!g5.a.f13038j || n7.c.u() || !n7.c.n(contextRequireContext2)) {
            f.l(linearLayout);
            return;
        }
        i iVar = new i(contextRequireContext2);
        String str = g5.a.f13041m;
        if (str.length() == 0) {
            return;
        }
        iVar.setAdUnitId(str);
        linearLayout.removeAllViews();
        linearLayout.addView(iVar);
        linearLayout.post(new m(contextRequireContext2, linearLayout, iVar, 3));
    }

    @Override // j9.c
    public final void i() {
        this.f16350u = false;
        l();
    }

    public final void k() {
        q.d dVar = this.f16346j;
        if (dVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) dVar.f16091m;
        Intrinsics.e(recyclerView, "binding.rvArticles");
        f.l(recyclerView);
        q.d dVar2 = this.f16346j;
        if (dVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) dVar2.f16089f;
        Intrinsics.e(linearLayout, "binding.noPostLayout");
        f.x(linearLayout);
    }

    public final void l() {
        d0 d0VarB = b();
        if (d0VarB != null) {
            if (!u9.c.a(d0VarB)) {
                z0.j(this);
                return;
            }
            d dVar = this.f16349t;
            if (dVar == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            dVar.f16356d.add(dVar.f16355c.getArticles().subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new c(dVar, 3), 12)).subscribe(new m9.d(new c(dVar, 4), 13), new m9.d(new c(dVar, 5), 14)));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004b. Please report as an issue. */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.f(inflater, "inflater");
        View viewInflate = inflater.inflate(2131492930, viewGroup, false);
        int i10 = 2131296373;
        LinearLayout linearLayout = (LinearLayout) g5.a.l(viewInflate, 2131296373);
        if (linearLayout != null) {
            i10 = 2131296727;
            LinearLayout linearLayout2 = (LinearLayout) g5.a.l(viewInflate, 2131296727);
            if (linearLayout2 != null) {
                i10 = 2131296728;
                TextView textView = (TextView) g5.a.l(viewInflate, 2131296728);
                if (textView != null) {
                    i10 = 2131296823;
                    RecyclerView recyclerView = (RecyclerView) g5.a.l(viewInflate, 2131296823);
                    if (recyclerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f16346j = new q.d(constraintLayout, linearLayout, linearLayout2, textView, recyclerView, 13);
                        switch (13) {
                        }
                        Intrinsics.e(constraintLayout, "binding.root");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f16348n) {
            i();
        }
        this.f16348n = false;
    }
}