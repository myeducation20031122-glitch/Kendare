package com.onesignal;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.l9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11806b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11807e;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f11806b = i10;
        this.f11807e = obj;
    }

    private void a() {
        l9 l9Var;
        x9.c cVar;
        x9.c cVar2;
        l9 l9Var2;
        Thread.currentThread().setPriority(10);
        o2.c cVar3 = (o2.c) this.f11807e;
        ((aa.b) cVar3.f15673j).f468d = cVar3.f15670b;
        z9.b bVarE = ((n8.s) ((p1) cVar3.f15671e).f12055e).e();
        aa.b event = (aa.b) ((o2.c) this.f11807e).f15673j;
        Intrinsics.f(event, "event");
        o5.d dVar = bVarE.f19801b;
        synchronized (dVar) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                x9.c cVar4 = x9.c.f19122f;
                aa.c cVar5 = event.f466b;
                if (cVar5 == null || (l9Var = cVar5.f469a) == null) {
                    cVar2 = cVar4;
                } else {
                    JSONArray jSONArray3 = (JSONArray) l9Var.f10881e;
                    if (jSONArray3 != null && jSONArray3.length() > 0) {
                        cVar = x9.c.f19120b;
                        jSONArray = jSONArray3;
                    } else {
                        cVar = cVar4;
                    }
                    JSONArray jSONArray4 = (JSONArray) l9Var.f10882f;
                    if (jSONArray4 != null && jSONArray4.length() > 0) {
                        cVar4 = x9.c.f19120b;
                        jSONArray2 = jSONArray4;
                    }
                    cVar2 = cVar4;
                    cVar4 = cVar;
                }
                aa.c cVar6 = event.f466b;
                if (cVar6 != null && (l9Var2 = cVar6.f470b) != null) {
                    JSONArray jSONArray5 = (JSONArray) l9Var2.f10881e;
                    if (jSONArray5 != null && jSONArray5.length() > 0) {
                        cVar4 = x9.c.f19121e;
                        jSONArray = jSONArray5;
                    }
                    JSONArray jSONArray6 = (JSONArray) l9Var2.f10882f;
                    if (jSONArray6 != null && jSONArray6.length() > 0) {
                        cVar2 = x9.c.f19121e;
                        jSONArray2 = jSONArray6;
                    }
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("notification_ids", jSONArray.toString());
                contentValues.put("iam_ids", jSONArray2.toString());
                String string = cVar4.toString();
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = string.toLowerCase();
                Intrinsics.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                contentValues.put("notification_influence_type", lowerCase);
                String string2 = cVar2.toString();
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase2 = string2.toLowerCase();
                Intrinsics.e(lowerCase2, "(this as java.lang.String).toLowerCase()");
                contentValues.put("iam_influence_type", lowerCase2);
                contentValues.put("name", event.f465a);
                contentValues.put("weight", Float.valueOf(event.f467c));
                contentValues.put("timestamp", Long.valueOf(event.f468d));
                ((f4) ((e4) dVar.f15722f)).e("outcome", contentValues);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        Method method;
        switch (this.f11806b) {
            case 0:
                i0 i0Var = (i0) this.f11807e;
                n5 n5Var = i0Var.f11882t;
                if (n5Var != null) {
                    s1 s1VarN = z3.n();
                    u1 u1Var = n5Var.f12023a.f12161e;
                    s1VarN.f12116h.getClass();
                    l.k("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                }
                if (i0Var.f11864b == null) {
                    i0Var.f11874l = true;
                    return;
                } else {
                    i0Var.e(null);
                    i0Var.f11883u = null;
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                s1 s1Var = (s1) this.f11807e;
                s1Var.f12116h.getClass();
                l.d("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
                s1Var.f0();
                return;
            case 2:
                z3.b(y3.f12233n, "Running complete from OSNotificationReceivedEvent timeout runnable!", null);
                r2 r2Var = (r2) this.f11807e;
                r2Var.a(r2Var.f12101d);
                return;
            case 3:
                a();
                return;
            case 4:
                g4 g4Var = (g4) this.f11807e;
                int i10 = g4.f11838j;
                g4Var.getClass();
                for (String str : h4.f11857b.keySet()) {
                    SharedPreferences.Editor editorEdit = h4.d(str).edit();
                    HashMap map = (HashMap) h4.f11857b.get(str);
                    synchronized (map) {
                        try {
                            for (String str2 : map.keySet()) {
                                Object obj = map.get(str2);
                                if (obj instanceof String) {
                                    editorEdit.putString(str2, (String) obj);
                                } else if (obj instanceof Boolean) {
                                    editorEdit.putBoolean(str2, ((Boolean) obj).booleanValue());
                                } else if (obj instanceof Integer) {
                                    editorEdit.putInt(str2, ((Integer) obj).intValue());
                                } else if (obj instanceof Long) {
                                    editorEdit.putLong(str2, ((Long) obj).longValue());
                                } else if (obj instanceof Set) {
                                    editorEdit.putStringSet(str2, (Set) obj);
                                } else if (obj == null) {
                                    editorEdit.remove(str2);
                                }
                            }
                            map.clear();
                        } finally {
                        }
                    }
                    editorEdit.apply();
                }
                z3.f12275u.getClass();
                g4Var.f11840e = System.currentTimeMillis();
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                int i11 = (q3.f12078f * 10000) + 30000;
                if (i11 > 90000) {
                    i11 = 90000;
                }
                z3.b(y3.f12232m, "Failed to get Android parameters, trying again in " + (i11 / com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS) + " seconds.", null);
                try {
                    Thread.sleep(i11);
                    q3.f12078f++;
                    Object obj2 = this.f11807e;
                    q3.E((String) ((i4) obj2).f11896i, (String) ((i4) obj2).f11897j, (com.google.android.gms.internal.ads.d0) ((i4) obj2).f11898k);
                    return;
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    return;
                }
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Object obj3 = this.f11807e;
                d5 d5Var = (d5) obj3;
                d5Var.f11765h = true;
                try {
                    if (((d5) obj3).f11760c == null) {
                        d5 d5Var2 = (d5) obj3;
                        Method[] methods = d5.f11757j.getMethods();
                        int length = methods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                method = methods[i12];
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length != 4 || parameterTypes[0] != Integer.TYPE || parameterTypes[1] != String.class || parameterTypes[2] != String.class || parameterTypes[3] != String.class) {
                                    i12++;
                                }
                            } else {
                                method = null;
                            }
                        }
                        d5Var2.f11760c = method;
                        ((d5) obj3).f11760c.setAccessible(true);
                    }
                    Bundle bundle = (Bundle) ((d5) obj3).f11760c.invoke(((d5) obj3).f11759b, 3, ((d5) obj3).f11762e.getPackageName(), "inapp", null);
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        for (int i13 = 0; i13 < stringArrayList2.size(); i13++) {
                            String str3 = stringArrayList2.get(i13);
                            String str4 = stringArrayList.get(i13);
                            String string = new JSONObject(str3).getString("purchaseToken");
                            if (!((d5) obj3).f11763f.contains(string) && !arrayList2.contains(string)) {
                                arrayList2.add(string);
                                arrayList.add(str4);
                            }
                        }
                        if (arrayList.size() > 0) {
                            d5.a((d5) obj3, arrayList, arrayList2);
                        } else if (stringArrayList2.size() == 0) {
                            ((d5) obj3).f11764g = false;
                            h4.h("GTPlayerPurchases", "ExistingPurchases", false);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                d5Var.f11765h = false;
                return;
            default:
                l5 l5Var = (l5) this.f11807e;
                if (!l5Var.f11960j.f11986d.get()) {
                    l5Var.f11960j.y(false);
                    return;
                }
                return;
        }
    }
}