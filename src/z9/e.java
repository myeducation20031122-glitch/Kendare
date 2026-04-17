package z9;

import com.onesignal.b4;
import com.onesignal.l;
import com.onesignal.q3;
import com.onesignal.y2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l client, int i10) {
        super(client);
        this.f19804b = i10;
        if (i10 != 1) {
            Intrinsics.f(client, "client");
        } else {
            Intrinsics.f(client, "client");
            super(client);
        }
    }

    @Override // z9.a
    public final void a(JSONObject jSONObject, b4 b4Var) throws InterruptedException {
        int i10 = this.f19804b;
        l lVar = this.f19799a;
        switch (i10) {
            case 0:
                lVar.getClass();
                q3.L("outcomes/measure", jSONObject, new y2(1, lVar, b4Var));
                break;
            default:
                lVar.getClass();
                q3.L("outcomes/measure_sources", jSONObject, new y2(1, lVar, b4Var));
                break;
        }
    }
}