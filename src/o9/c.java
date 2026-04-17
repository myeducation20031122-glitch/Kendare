package o9;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.o;
import androidx.fragment.app.d0;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import e0.g;
import g.e;
import io.reactivex.internal.fuseable.QueueFuseable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o5.d;
import t7.z0;
import z8.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo9/c;", "Lj9/c;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends j9.c {
    public static final /* synthetic */ int M = 0;

    /* renamed from: f, reason: collision with root package name */
    public d f15836f;

    /* renamed from: j, reason: collision with root package name */
    public o f15837j;

    /* renamed from: m, reason: collision with root package name */
    public l f15838m;

    /* renamed from: u, reason: collision with root package name */
    public b f15841u;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f15839n = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f15840t = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15842w = true;

    @Override // j9.c
    public final void h() {
        Context contextRequireContext = requireContext();
        Intrinsics.e(contextRequireContext, "requireContext()");
        o oVar = new o(contextRequireContext, 4);
        this.f15837j = oVar;
        Window window = requireActivity().getWindow();
        Intrinsics.e(window, "requireActivity().window");
        oVar.j(window);
        o oVar2 = this.f15837j;
        if (oVar2 == null) {
            Intrinsics.n("methods");
            throw null;
        }
        Window window2 = requireActivity().getWindow();
        Intrinsics.e(window2, "requireActivity().window");
        oVar2.e(window2);
        n7.c.w("NotificationsFragment");
        b bVar = (b) new e((d1) this).o(b.class);
        this.f15841u = bVar;
        bVar.f15833a.e(getViewLifecycleOwner(), new g(this, 21));
        this.f15838m = new l(this.f15839n);
        d dVar = this.f15836f;
        if (dVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) dVar.f15722f;
        b();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        d dVar2 = this.f15836f;
        if (dVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((RecyclerView) dVar2.f15722f).setItemAnimator(new q());
        d dVar3 = this.f15836f;
        if (dVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView2 = (RecyclerView) dVar3.f15722f;
        l lVar = this.f15838m;
        if (lVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerView2.setAdapter(lVar);
        k();
    }

    @Override // j9.c
    public final void i() {
        this.f15842w = false;
        k();
    }

    public final void k() {
        d0 d0VarB = b();
        if (d0VarB != null) {
            if (!u9.c.a(d0VarB)) {
                z0.j(this);
                return;
            }
            b bVar = this.f15841u;
            if (bVar == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            bVar.f15835c.add(bVar.f15834b.getNotifications().subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new a(bVar, 0), 3)).subscribe(new m9.d(new a(bVar, 1), 4), new m9.d(new a(bVar, 2), 5)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.f(inflater, "inflater");
        View viewInflate = inflater.inflate(2131492928, viewGroup, false);
        int i10 = 2131296824;
        RecyclerView recyclerView = (RecyclerView) g5.a.l(viewInflate, 2131296824);
        if (recyclerView != null) {
            i10 = 2131296938;
            TextView textView = (TextView) g5.a.l(viewInflate, 2131296938);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f15836f = new d(constraintLayout, recyclerView, textView, 21);
                Intrinsics.e(constraintLayout, "binding.root");
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f15840t) {
            i();
        }
        this.f15840t = false;
    }
}