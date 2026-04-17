package w9;

import com.onesignal.h4;
import com.onesignal.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import p5.m;
import x9.c;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m dataRepository, l lVar, l lVar2, int i10) {
        super(dataRepository, lVar, lVar2);
        this.f18735g = i10;
        if (i10 != 1) {
            Intrinsics.f(dataRepository, "dataRepository");
        } else {
            Intrinsics.f(dataRepository, "dataRepository");
            super(dataRepository, lVar, lVar2);
        }
    }

    @Override // w9.a
    public final void a() {
        m mVar = this.f18729a;
        c cVar = c.f19122f;
        switch (this.f18735g) {
            case 0:
                c cVar2 = this.f18732d;
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                if (cVar == c.f19120b) {
                    cVar = c.f19121e;
                }
                mVar.getClass();
                ((l) mVar.f15961e).getClass();
                h4.g(cVar.toString(), h4.f11856a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE");
                break;
            default:
                c cVar3 = this.f18732d;
                if (cVar3 != null) {
                    cVar = cVar3;
                }
                mVar.getClass();
                ((l) mVar.f15961e).getClass();
                String str = h4.f11856a;
                h4.g(cVar.toString(), str, "PREFS_OS_OUTCOMES_CURRENT_SESSION");
                String str2 = this.f18734f;
                ((l) mVar.f15961e).getClass();
                h4.g(str2, str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN");
                break;
        }
    }

    @Override // w9.a
    public final int b() {
        m mVar = this.f18729a;
        switch (this.f18735g) {
            case 0:
                ((l) mVar.f15961e).getClass();
                return h4.c(10, "PREFS_OS_IAM_LIMIT");
            default:
                ((l) mVar.f15961e).getClass();
                return h4.c(10, "PREFS_OS_NOTIFICATION_LIMIT");
        }
    }

    @Override // w9.a
    public final String d() {
        switch (this.f18735g) {
            case 0:
                return "iam_id";
            default:
                return "notification_id";
        }
    }

    @Override // w9.a
    public final JSONArray e() {
        JSONArray jSONArray;
        m mVar = this.f18729a;
        switch (this.f18735g) {
            case 0:
                ((l) mVar.f15961e).getClass();
                String strE = h4.e(h4.f11856a, "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
                jSONArray = strE != null ? new JSONArray(strE) : null;
                if (jSONArray == null) {
                    break;
                }
                break;
            default:
                ((l) mVar.f15961e).getClass();
                String strE2 = h4.e(h4.f11856a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
                jSONArray = strE2 != null ? new JSONArray(strE2) : null;
                if (jSONArray == null) {
                    break;
                }
                break;
        }
        return new JSONArray();
    }

    @Override // w9.a
    public final void g() {
        l lVar = this.f18730b;
        m mVar = this.f18729a;
        c cVar = c.f19121e;
        switch (this.f18735g) {
            case 0:
                mVar.getClass();
                ((l) mVar.f15961e).getClass();
                c cVarP = n7.c.p(h4.e(h4.f11856a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", "UNATTRIBUTED"));
                if (cVarP == cVar) {
                    this.f18733e = f();
                }
                Unit unit = Unit.f14090a;
                this.f18732d = cVarP;
                String strL = Intrinsics.l(this, "OneSignal InAppMessageTracker initInfluencedTypeFromCache: ");
                lVar.getClass();
                l.d(strL);
                break;
            default:
                ((l) mVar.f15961e).getClass();
                String str = h4.f11856a;
                c cVarP2 = n7.c.p(h4.e(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", "UNATTRIBUTED"));
                if (cVarP2 == cVar) {
                    this.f18733e = f();
                } else if (cVarP2.e()) {
                    ((l) mVar.f15961e).getClass();
                    this.f18734f = h4.e(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
                }
                Unit unit2 = Unit.f14090a;
                this.f18732d = cVarP2;
                String strL2 = Intrinsics.l(this, "OneSignal NotificationTracker initInfluencedTypeFromCache: ");
                lVar.getClass();
                l.d(strL2);
                break;
        }
    }
}