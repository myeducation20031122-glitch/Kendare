package w9;

import com.onesignal.h4;
import com.onesignal.l;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.m;
import x9.c;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f18729a;

    /* renamed from: b, reason: collision with root package name */
    public final l f18730b;

    /* renamed from: c, reason: collision with root package name */
    public final l f18731c;

    /* renamed from: d, reason: collision with root package name */
    public c f18732d;

    /* renamed from: e, reason: collision with root package name */
    public JSONArray f18733e;

    /* renamed from: f, reason: collision with root package name */
    public String f18734f;

    public a(m dataRepository, l lVar, l lVar2) {
        Intrinsics.f(dataRepository, "dataRepository");
        this.f18729a = dataRepository;
        this.f18730b = lVar;
        this.f18731c = lVar2;
    }

    public abstract void a();

    public abstract int b();

    public final x9.a c() {
        x9.b bVar;
        c cVar;
        switch (((b) this).f18735g) {
            case 0:
                bVar = x9.b.IAM;
                break;
            default:
                bVar = x9.b.NOTIFICATION;
                break;
        }
        c cVar2 = c.f19123j;
        x9.a aVar = new x9.a(bVar, cVar2, null);
        if (this.f18732d == null) {
            g();
        }
        c cVar3 = this.f18732d;
        if (cVar3 != null) {
            cVar2 = cVar3;
        }
        boolean zE = cVar2.e();
        m mVar = this.f18729a;
        if (zE) {
            ((l) mVar.f15961e).getClass();
            if (h4.b(h4.f11856a, "PREFS_OS_DIRECT_ENABLED", false)) {
                aVar.f19115c = new JSONArray().put(this.f18734f);
                cVar = c.f19120b;
                aVar.f19113a = cVar;
            }
        } else {
            cVar = c.f19121e;
            if (cVar2 == cVar) {
                ((l) mVar.f15961e).getClass();
                if (h4.b(h4.f11856a, "PREFS_OS_INDIRECT_ENABLED", false)) {
                    aVar.f19115c = this.f18733e;
                    aVar.f19113a = cVar;
                }
            } else {
                ((l) mVar.f15961e).getClass();
                if (h4.b(h4.f11856a, "PREFS_OS_UNATTRIBUTED_ENABLED", false)) {
                    cVar = c.f19122f;
                    aVar.f19113a = cVar;
                }
            }
        }
        return aVar;
    }

    public abstract String d();

    public abstract JSONArray e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18732d == aVar.f18732d && Intrinsics.a(aVar.d(), d());
    }

    public final JSONArray f() {
        int iC;
        l lVar = this.f18730b;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayE = e();
            String strL = Intrinsics.l(jSONArrayE, "OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ");
            lVar.getClass();
            l.d(strL);
            b bVar = (b) this;
            int i10 = bVar.f18735g;
            m mVar = bVar.f18729a;
            switch (i10) {
                case 0:
                    ((l) mVar.f15961e).getClass();
                    iC = h4.c(1440, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW");
                    break;
                default:
                    ((l) mVar.f15961e).getClass();
                    iC = h4.c(1440, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW");
                    break;
            }
            long j10 = iC * 60 * 1000;
            this.f18731c.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = jSONArrayE.length();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject = jSONArrayE.getJSONObject(i11);
                    if (jCurrentTimeMillis - jSONObject.getLong("time") <= j10) {
                        jSONArray.put(jSONObject.getString(d()));
                    }
                    if (i12 < length) {
                        i11 = i12;
                    }
                }
            }
        } catch (JSONException e10) {
            lVar.getClass();
            l.f("Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    public abstract void g();

    public final void h() {
        this.f18734f = null;
        JSONArray jSONArrayF = f();
        this.f18733e = jSONArrayF;
        this.f18732d = jSONArrayF.length() > 0 ? c.f19121e : c.f19122f;
        a();
        String str = "OneSignal OSChannelTracker resetAndInitInfluence: " + d() + " finish with influenceType: " + this.f18732d;
        this.f18730b.getClass();
        l.d(str);
    }

    public final int hashCode() {
        c cVar = this.f18732d;
        return d().hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public final void i(String str) {
        JSONArray jSONArray;
        String str2 = "OneSignal OSChannelTracker for: " + d() + " saveLastId: " + ((Object) str);
        this.f18730b.getClass();
        l.d(str2);
        if (str == null || str.length() == 0) {
            return;
        }
        b bVar = (b) this;
        l lVar = bVar.f18730b;
        int i10 = bVar.f18735g;
        switch (i10) {
            case 0:
                try {
                    JSONArray jSONArrayE = bVar.e();
                    try {
                        JSONArray jSONArray2 = new JSONArray();
                        int length = jSONArrayE.length();
                        if (length > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                if (!Intrinsics.a(str, jSONArrayE.getJSONObject(i11).getString(bVar.d()))) {
                                    jSONArray2.put(jSONArrayE.getJSONObject(i11));
                                }
                                if (i12 < length) {
                                    i11 = i12;
                                }
                            }
                        }
                        jSONArrayE = jSONArray2;
                    } catch (JSONException e10) {
                        lVar.getClass();
                        l.f("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                    }
                    jSONArray = jSONArrayE;
                    break;
                } catch (JSONException e11) {
                    lVar.getClass();
                    l.f("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
                    jSONArray = new JSONArray();
                    break;
                }
            default:
                try {
                    jSONArray = bVar.e();
                    break;
                } catch (JSONException e12) {
                    lVar.getClass();
                    l.f("Generating Notification tracker getLastChannelObjects JSONObject ", e12);
                    jSONArray = new JSONArray();
                    break;
                }
        }
        l.d("OneSignal OSChannelTracker for: " + d() + " saveLastId with lastChannelObjectsReceived: " + jSONArray);
        try {
            l lVar2 = this.f18731c;
            JSONObject jSONObjectPut = new JSONObject().put(d(), str);
            lVar2.getClass();
            jSONArray.put(jSONObjectPut.put("time", System.currentTimeMillis()));
            if (jSONArray.length() > b()) {
                int length2 = jSONArray.length() - b();
                JSONArray jSONArray3 = new JSONArray();
                int length3 = jSONArray.length();
                if (length2 < length3) {
                    while (true) {
                        int i13 = length2 + 1;
                        try {
                            jSONArray3.put(jSONArray.get(length2));
                        } catch (JSONException e13) {
                            l.f("Generating tracker lastChannelObjectsReceived get JSONObject ", e13);
                        }
                        if (i13 < length3) {
                            length2 = i13;
                        }
                    }
                }
                jSONArray = jSONArray3;
            }
            l.d("OneSignal OSChannelTracker for: " + d() + " with channelObjectToSave: " + jSONArray);
            m mVar = bVar.f18729a;
            switch (i10) {
                case 0:
                    mVar.getClass();
                    ((l) mVar.f15961e).getClass();
                    h4.g(jSONArray.toString(), h4.f11856a, "PREFS_OS_LAST_IAMS_RECEIVED");
                    break;
                default:
                    mVar.getClass();
                    ((l) mVar.f15961e).getClass();
                    h4.g(jSONArray.toString(), h4.f11856a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED");
                    break;
            }
        } catch (JSONException e14) {
            l.f("Generating tracker newInfluenceId JSONObject ", e14);
        }
    }

    public final String toString() {
        return "OSChannelTracker{tag=" + d() + ", influenceType=" + this.f18732d + ", indirectIds=" + this.f18733e + ", directId=" + ((Object) this.f18734f) + '}';
    }
}