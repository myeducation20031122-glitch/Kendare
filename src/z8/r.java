package z8;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y0;
import com.isprid.kendare.model.DPurchasePlan;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public List f19797a;

    /* renamed from: b, reason: collision with root package name */
    public String f19798b;

    @Override // androidx.recyclerview.widget.y0
    public final int getItemCount() {
        StringBuilder sb = new StringBuilder("Returned size ");
        List list = this.f19797a;
        sb.append(list.size());
        Log.d(this.f19798b, sb.toString());
        return list.size();
    }

    @Override // androidx.recyclerview.widget.y0
    public final void onBindViewHolder(c2 c2Var, int i10) {
        q qVar = (q) c2Var;
        DPurchasePlan dPurchasePlan = (DPurchasePlan) this.f19797a.get(i10);
        qVar.f19793a.setText(dPurchasePlan.getPlanName());
        qVar.f19794b.setText(((m2.g) ((m2.h) dPurchasePlan.getProductDetails().f15109g.get(0)).f15102a.f12657a.get(0)).f15101a);
        boolean zBooleanValue = dPurchasePlan.getShowOffer().booleanValue();
        ConstraintLayout constraintLayout = qVar.f19796d;
        if (!zBooleanValue) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            qVar.f19795c.setText(dPurchasePlan.getOfferText());
        }
    }

    @Override // androidx.recyclerview.widget.y0
    public final c2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131492944, viewGroup, false);
        q qVar = new q(viewInflate);
        qVar.f19793a = (TextView) viewInflate.findViewById(2131296979);
        qVar.f19794b = (TextView) viewInflate.findViewById(2131296978);
        qVar.f19796d = (ConstraintLayout) viewInflate.findViewById(2131296422);
        qVar.f19795c = (TextView) viewInflate.findViewById(2131296939);
        return qVar;
    }
}