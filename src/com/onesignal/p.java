package com.onesignal;

import com.google.android.gms.internal.measurement.l9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12051e;

    public p(int i10) {
        this.f12051e = i10;
        if (i10 != 1) {
            this.f12084a = 1L;
            this.f12085b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        } else {
            this.f12084a = 60L;
            this.f12085b = "GT_UNSENT_ACTIVE_TIME";
        }
    }

    @Override // com.onesignal.r
    public final void b(JSONObject jsonObject) throws JSONException {
        switch (this.f12051e) {
            case 0:
                p1 p1Var = z3.B;
                ArrayList arrayListD = d();
                l lVar = (l) p1Var.f12056f;
                String str = "OneSignal SessionManager addSessionData with influences: " + arrayListD.toString();
                lVar.getClass();
                l.d(str);
                l9 l9Var = (l9) p1Var.f12054b;
                l9Var.getClass();
                Intrinsics.f(jsonObject, "jsonObject");
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    x9.a aVar = (x9.a) it.next();
                    if (aVar.f19114b.ordinal() == 1) {
                        w9.b bVar = (w9.b) l9Var.l();
                        switch (bVar.f18735g) {
                            case 0:
                                break;
                            default:
                                if (!aVar.f19113a.c()) {
                                    break;
                                } else {
                                    try {
                                        jsonObject.put("direct", aVar.f19113a.e());
                                        jsonObject.put("notification_ids", aVar.f19115c);
                                        break;
                                    } catch (JSONException e10) {
                                        bVar.f18730b.getClass();
                                        l.f("Generating notification tracker addSessionData JSONObject ", e10);
                                        break;
                                    }
                                }
                        }
                    }
                }
                l.d("OneSignal SessionManager addSessionIds on jsonObject: " + jsonObject);
                break;
        }
    }

    @Override // com.onesignal.r
    public final ArrayList d() {
        switch (this.f12051e) {
            case 0:
                ArrayList arrayList = new ArrayList();
                String str = h4.f11856a;
                Iterator it = h4.f("PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(new x9.a((String) it.next()));
                    } catch (JSONException e10) {
                        z3.b(y3.f12230f, p.class.getSimpleName() + ": error generation OSInfluence from json object: " + e10, null);
                    }
                }
                return arrayList;
            default:
                return new ArrayList();
        }
    }

    @Override // com.onesignal.r
    public final void f(List list) {
        switch (this.f12051e) {
            case 0:
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        hashSet.add(((x9.a) it.next()).a());
                    } catch (JSONException e10) {
                        z3.b(y3.f12230f, p.class.getSimpleName() + ": error generation json object OSInfluence: " + e10, null);
                    }
                }
                h4.g(hashSet, h4.f11856a, "PREFS_OS_ATTRIBUTED_INFLUENCES");
                break;
        }
    }
}