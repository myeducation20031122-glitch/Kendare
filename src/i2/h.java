package i2;

import io.reactivex.internal.fuseable.QueueFuseable;
import l1.p;
import l1.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, p pVar, int i10) {
        super(pVar);
        this.f13254d = i10;
        this.f13255e = obj;
    }

    @Override // l1.t
    public final String b() {
        switch (this.f13254d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case QueueFuseable.SYNC /* 1 */:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}