package g;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import io.reactivex.internal.fuseable.QueueFuseable;
import m.j3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12759b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12760e;

    public /* synthetic */ d(Object obj, int i10) {
        this.f12759b = i10;
        this.f12760e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message messageObtain = null;
        messageObtain = null;
        int i10 = this.f12759b;
        Object obj = this.f12760e;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                if ((view == lVar.f12819k && (message2 = lVar.f12821m) != null) || (view == lVar.f12823o && (message2 = lVar.f12825q) != null)) {
                    messageObtain = Message.obtain(message2);
                } else if (view == lVar.f12827s && (message = lVar.f12829u) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                lVar.K.obtainMessage(1, lVar.f12810b).sendToTarget();
                break;
            case QueueFuseable.SYNC /* 1 */:
                j3 j3Var = ((Toolbar) obj).f746s0;
                l.q qVar = j3Var != null ? j3Var.f14805e : null;
                if (qVar != null) {
                    qVar.collapseActionView();
                    break;
                }
                break;
            case 2:
            default:
                l.q itemData = ((q6.d) view).getItemData();
                q6.f fVar = (q6.f) obj;
                if (!fVar.f16295k0.q(itemData, fVar.f16294j0, 0)) {
                    itemData.setChecked(true);
                    break;
                }
                break;
            case 3:
                com.google.android.material.datepicker.l lVar2 = (com.google.android.material.datepicker.l) obj;
                int i11 = lVar2.f11439m;
                if (i11 != 2) {
                    if (i11 == 1) {
                        lVar2.i(2);
                        break;
                    }
                } else {
                    lVar2.i(1);
                    break;
                }
                break;
        }
    }
}