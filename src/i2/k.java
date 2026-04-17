package i2;

import io.reactivex.internal.fuseable.QueueFuseable;
import l1.p;
import l1.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, int i10) {
        super(pVar);
        this.f13276d = i10;
    }

    @Override // l1.t
    public final String b() {
        switch (this.f13276d) {
            case 0:
                return "DELETE FROM workspec WHERE id=?";
            case QueueFuseable.SYNC /* 1 */:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case 3:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            default:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }
}