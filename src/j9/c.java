package j9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d0;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj9/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public b f13873b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13874e = true;

    public abstract void h();

    public void i() {
    }

    public final void j(Intent intent) {
        if (t.w()) {
            d0 d0VarRequireActivity = requireActivity();
            Intrinsics.e(d0VarRequireActivity, "requireActivity()");
            t.L(d0VarRequireActivity, intent);
        } else {
            startActivity(intent);
        }
        requireActivity().overridePendingTransition(2130771982, 2130771981);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.f(context, "context");
        super.onAttach(context);
        if (context instanceof b) {
            this.f13873b = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b bVar = this.f13873b;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        if (!z7) {
            if (!this.f13874e) {
                i();
            }
            this.f13874e = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.f(view, "view");
        h();
    }
}