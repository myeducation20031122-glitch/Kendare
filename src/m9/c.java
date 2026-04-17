package m9;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d0;
import androidx.fragment.app.q;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.google.android.material.datepicker.m;
import io.reactivex.internal.fuseable.QueueFuseable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t7.z0;
import z8.n;
import z8.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm9/c;", "Landroidx/fragment/app/q;", "Lz8/n;", "<init>", "()V", "q6/b", "m9/a", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends q implements n {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f15228a0 = 0;
    public RecyclerView T;
    public p U;
    public final ArrayList V = new ArrayList();
    public a W;
    public ProgressBar X;
    public LinearLayout Y;
    public f Z;

    public final void l(boolean z7) {
        ProgressBar progressBar = this.X;
        if (progressBar == null) {
            Intrinsics.n("progressBarLayout");
            throw null;
        }
        progressBar.setVisibility(z7 ? 0 : 8);
        LinearLayout linearLayout = this.Y;
        if (linearLayout != null) {
            linearLayout.setVisibility(z7 ? 8 : 0);
        } else {
            Intrinsics.n("dataLayout");
            throw null;
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 0, 2131951629");
        }
        this.f1077m = 0;
        this.f1078n = 2131951629;
        Intrinsics.e(requireContext(), "requireContext()");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.f(inflater, "inflater");
        int i10 = 0;
        View viewInflate = inflater.inflate(2131492931, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(2131296959);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.toolbar)");
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setTitleTextColor(-1);
        toolbar.setSubtitleTextColor(-1);
        toolbar.setNavigationIcon(2131165378);
        toolbar.setNavigationOnClickListener(new m(this, 4));
        toolbar.setTitle(requireActivity().getResources().getString(2131886485));
        View viewFindViewById2 = viewInflate.findViewById(2131296809);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.recycler_view)");
        this.T = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(2131296706);
        Intrinsics.e(viewFindViewById3, "view.findViewById(R.id.myEditText)");
        EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(2131296771);
        Intrinsics.e(viewFindViewById4, "view.findViewById(R.id.pbPlace)");
        this.X = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(2131296470);
        Intrinsics.e(viewFindViewById5, "view.findViewById(R.id.data_layout)");
        this.Y = (LinearLayout) viewFindViewById5;
        f fVar = (f) new g.e((d1) this).o(f.class);
        this.Z = fVar;
        fVar.f15233a.e(getViewLifecycleOwner(), new e0.g(this, 19));
        this.U = new p(this.V, this);
        requireActivity();
        int i11 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = this.T;
        if (recyclerView == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.T;
        if (recyclerView2 == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        recyclerView2.setItemAnimator(new androidx.recyclerview.widget.q());
        RecyclerView recyclerView3 = this.T;
        if (recyclerView3 == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        recyclerView3.i(new y(requireActivity()));
        RecyclerView recyclerView4 = this.T;
        if (recyclerView4 == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        p pVar = this.U;
        if (pVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerView4.setAdapter(pVar);
        d0 d0VarB = b();
        if (d0VarB != null) {
            if (u9.c.a(d0VarB)) {
                f fVar2 = this.Z;
                if (fVar2 == null) {
                    Intrinsics.n("viewModel");
                    throw null;
                }
                int i12 = 2;
                fVar2.f15235c.add(fVar2.f15234b.getHospitalPlaces().subscribeOn(Schedulers.io()).doOnSubscribe(new d(new e(fVar2, i10), i10)).subscribe(new d(new e(fVar2, i11), i11), new d(new e(fVar2, i12), i12)));
            } else {
                z0.j(this);
            }
        }
        editText.addTextChangedListener(new b(this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.O;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(2131951631);
            }
        }
    }
}