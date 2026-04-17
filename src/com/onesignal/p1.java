package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p1 implements d2, r5 {

    /* renamed from: b, reason: collision with root package name */
    public Object f12054b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12055e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12056f;

    public p1(Context context) {
        Intrinsics.f(context, "context");
        this.f12054b = context;
        this.f12055e = NotificationOpenedReceiver.class;
        this.f12056f = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    @Override // com.onesignal.d2, com.onesignal.b4
    public final void a(String str) {
    }

    public final void b(int i10, String str) {
        boolean zL;
        x9.a aVarC;
        l lVar = (l) this.f12056f;
        String strConcat = "OneSignal SessionManager attemptSessionUpgrade with entryAction: ".concat(ic1.D(i10));
        lVar.getClass();
        l.d(strConcat);
        l9 l9Var = (l9) this.f12054b;
        l9Var.getClass();
        kc.r.k(i10, "entryAction");
        w9.a aVarL = v.h.a(i10, 1) ? l9Var.l() : null;
        ArrayList arrayListG = ((l9) this.f12054b).g(i10);
        ArrayList arrayList = new ArrayList();
        if (aVarL != null) {
            aVarC = aVarL.c();
            x9.c cVar = x9.c.f19120b;
            if (str == null) {
                str = aVarL.f18734f;
            }
            zL = l(aVarL, cVar, str, null);
        } else {
            zL = false;
            aVarC = null;
        }
        if (zL) {
            lVar.getClass();
            l.d("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + arrayListG);
            arrayList.add(aVarC);
            Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                w9.a aVar = (w9.a) it.next();
                if (aVar.f18732d.e()) {
                    arrayList.add(aVar.c());
                    aVar.h();
                }
            }
        }
        lVar.getClass();
        l.d("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        Iterator it2 = arrayListG.iterator();
        while (it2.hasNext()) {
            w9.a aVar2 = (w9.a) it2.next();
            x9.c cVar2 = aVar2.f18732d;
            cVar2.getClass();
            if (cVar2 == x9.c.f19122f) {
                JSONArray jSONArrayF = aVar2.f();
                if (jSONArrayF.length() > 0 && !v.h.a(i10, 3)) {
                    x9.a aVarC2 = aVar2.c();
                    if (l(aVar2, x9.c.f19121e, null, jSONArrayF)) {
                        arrayList.add(aVarC2);
                    }
                }
            }
        }
        y3 y3Var = y3.f12233n;
        StringBuilder sb = new StringBuilder("Trackers after update attempt: ");
        l9 l9Var2 = (l9) this.f12054b;
        l9Var2.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(l9Var2.l());
        arrayList2.add(l9Var2.k());
        sb.append(arrayList2.toString());
        z3.b(y3Var, sb.toString(), null);
        k(arrayList);
    }

    @Override // com.onesignal.d2
    public final void c(String str) {
        Set set = ((s1) this.f12056f).f12126r;
        Object obj = this.f12055e;
        set.remove((String) obj);
        ((u1) this.f12054b).f12174d.remove((String) obj);
    }

    public final List d() {
        Collection collectionValues = ((ConcurrentHashMap) ((l9) this.f12054b).f10881e).values();
        Intrinsics.e(collectionValues, "trackers.values");
        Collection collection = collectionValues;
        ArrayList arrayList = new ArrayList(fa.d.f3(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((w9.a) it.next()).c());
        }
        return arrayList;
    }

    public final PendingIntent e(Intent oneSignalIntent, int i10) {
        Intrinsics.f(oneSignalIntent, "oneSignalIntent");
        return PendingIntent.getActivity((Context) this.f12054b, i10, oneSignalIntent, 201326592);
    }

    public final Intent f(int i10) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 23) {
            intent = new Intent((Context) this.f12054b, (Class<?>) this.f12055e);
        } else {
            intent = new Intent((Context) this.f12054b, (Class<?>) this.f12056f);
            intent.addFlags(403177472);
        }
        Intent intentAddFlags = intent.putExtra("androidNotificationId", i10).addFlags(603979776);
        Intrinsics.e(intentAddFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return intentAddFlags;
    }

    public final void g(int i10) {
        s1 s1Var = (s1) this.f12056f;
        s1Var.f12129u = null;
        l lVar = s1Var.f12116h;
        String strConcat = "IAM prompt to handle finished with result: ".concat(ic1.E(i10));
        lVar.getClass();
        l.d(strConcat);
        u1 u1Var = (u1) this.f12054b;
        boolean z7 = u1Var.f12181k;
        Object obj = this.f12055e;
        if (!z7 || i10 != 3) {
            s1Var.q0(u1Var, (List) obj);
            return;
        }
        s1Var.getClass();
        String string = z3.f12248b.getString(2131886556);
        new AlertDialog.Builder(z3.i()).setTitle(string).setMessage(z3.f12248b.getString(2131886555)).setPositiveButton(R.string.ok, new q1(s1Var, u1Var, (List) obj)).show();
    }

    public final void h(String str) {
        ((l) this.f12056f).getClass();
        l.d("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        w9.a aVarK = ((l9) this.f12054b).k();
        aVarK.i(str);
        aVarK.h();
    }

    public final void i() {
        z9.b bVarE = ((n8.s) this.f12055e).e();
        Set unattributedUniqueOutcomeEvents = (Set) this.f12054b;
        Intrinsics.f(unattributedUniqueOutcomeEvents, "unattributedUniqueOutcomeEvents");
        String strL = Intrinsics.l(unattributedUniqueOutcomeEvents, "OneSignal save unattributedUniqueOutcomeEvents: ");
        bVarE.f19800a.getClass();
        l.d(strL);
        ((l) bVarE.f19801b.f15723j).getClass();
        h4.g(unattributedUniqueOutcomeEvents, h4.f11856a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT");
    }

    public final void j(String str, float f10, ArrayList arrayList) throws ClassNotFoundException {
        z3.f12275u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int iB = OSUtils.b();
        String str2 = z3.f12252d;
        Iterator it = arrayList.iterator();
        boolean z7 = false;
        l9 l9Var = null;
        l9 l9Var2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            y3 y3Var = y3.f12234t;
            if (!zHasNext) {
                if (l9Var == null && l9Var2 == null && !z7) {
                    z3.b(y3Var, "Outcomes disabled for all channels", null);
                    return;
                }
                aa.b bVar = new aa.b(str, new aa.c(l9Var, l9Var2), f10, 0L);
                o2.c cVar = new o2.c();
                cVar.f15671e = this;
                cVar.f15673j = bVar;
                cVar.f15674m = null;
                cVar.f15670b = jCurrentTimeMillis;
                cVar.f15672f = str;
                ((n8.s) this.f12055e).e().a(str2, iB, bVar, cVar);
                return;
            }
            x9.a aVar = (x9.a) it.next();
            int iOrdinal = aVar.f19113a.ordinal();
            if (iOrdinal == 0) {
                if (l9Var == null) {
                    l9Var = new l9(28);
                }
                int iOrdinal2 = aVar.f19114b.ordinal();
                if (iOrdinal2 == 0) {
                    l9Var.f10882f = aVar.f19115c;
                } else if (iOrdinal2 == 1) {
                    l9Var.f10881e = aVar.f19115c;
                }
            } else if (iOrdinal == 1) {
                if (l9Var2 == null) {
                    l9Var2 = new l9(28);
                }
                int iOrdinal3 = aVar.f19114b.ordinal();
                if (iOrdinal3 == 0) {
                    l9Var2.f10882f = aVar.f19115c;
                } else if (iOrdinal3 == 1) {
                    l9Var2.f10881e = aVar.f19115c;
                }
            } else if (iOrdinal == 2) {
                z7 = true;
            } else if (iOrdinal == 3) {
                z3.b(y3Var, "Outcomes disabled for channel: " + aVar.f19114b, null);
                return;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        ((l) this.f12056f).getClass();
        l.d("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + arrayList);
        if (arrayList.size() > 0) {
            new Thread(new o1(1, this, arrayList), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(w9.a aVar, x9.c cVar, String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str2;
        if (cVar.equals(aVar.f18732d)) {
            x9.c cVar2 = aVar.f18732d;
            if (!cVar2.e() || (str2 = aVar.f18734f) == null || str2.equals(str)) {
                if ((cVar2 == x9.c.f19121e) && (jSONArray2 = aVar.f18733e) != null && jSONArray2.length() > 0 && ((jSONArray3 = aVar.f18733e) != null || jSONArray != null)) {
                    if (jSONArray3 != null && jSONArray != null && jSONArray3.length() == jSONArray.length()) {
                        int i10 = 0;
                        while (i10 < jSONArray3.length()) {
                            try {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    if (q3.H(jSONArray3.get(i10)).equals(q3.H(jSONArray.get(i11)))) {
                                        break;
                                    }
                                }
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
                return false;
            }
        }
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "OSChannelTracker changed: " + aVar.d() + "\nfrom:\ninfluenceType: " + aVar.f18732d + ", directNotificationId: " + aVar.f18734f + ", indirectNotificationIds: " + aVar.f18733e + "\nto:\ninfluenceType: " + cVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray, null);
        aVar.f18732d = cVar;
        aVar.f18734f = str;
        aVar.f18733e = jSONArray;
        aVar.a();
        StringBuilder sb = new StringBuilder("Trackers changed to: ");
        l9 l9Var = (l9) this.f12054b;
        l9Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(l9Var.l());
        arrayList.add(l9Var.k());
        sb.append(arrayList.toString());
        z3.b(y3Var, sb.toString(), null);
        return true;
    }

    @Override // com.onesignal.r5
    public final void onComplete() {
        t5.f12156l = null;
        t5.g((Activity) this.f12055e, (i1) this.f12056f, (u1) this.f12054b);
    }

    public p1(p1 p1Var, n8.s sVar) {
        this.f12056f = p1Var;
        this.f12055e = sVar;
        this.f12054b = OSUtils.q();
        z9.b bVarE = sVar.e();
        ((l) bVarE.f19801b.f15723j).getClass();
        Set setF = h4.f("PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
        String strL = Intrinsics.l(setF, "OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ");
        bVarE.f19800a.getClass();
        l.d(strL);
        if (setF != null) {
            this.f12054b = setF;
        }
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3) {
        this.f12055e = obj;
        this.f12054b = obj2;
        this.f12056f = obj3;
    }
}