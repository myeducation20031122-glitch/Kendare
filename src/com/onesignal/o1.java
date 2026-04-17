package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.l9;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12039b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12041f;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.f12039b = i10;
        this.f12041f = obj;
        this.f12040e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        RelativeLayout relativeLayout;
        int i10 = 2;
        l9 l9Var = null;
        int i11 = 0;
        z = false;
        z = false;
        boolean z7 = false;
        switch (this.f12039b) {
            case 0:
                Object obj = this.f12041f;
                s1 s1Var = (s1) obj;
                Iterator it = s1Var.f12128t.iterator();
                while (it.hasNext()) {
                    ((u1) it.next()).f12177g = false;
                }
                try {
                    ((s1) obj).m0((JSONArray) this.f12040e);
                    return;
                } catch (JSONException e10) {
                    s1Var.f12116h.getClass();
                    l.f("ERROR processing InAppMessageJson JSON Response.", e10);
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                Thread.currentThread().setPriority(10);
                l lVar = (l) ((p1) this.f12041f).f12055e;
                List list = (List) this.f12040e;
                lVar.getClass();
                if (z3.C == null) {
                    z3.b(y3.f12231j, "OneSignal onSessionEnding called before init!", null);
                }
                p1 p1Var = z3.C;
                if (p1Var != null) {
                    z3.b(y3.f12233n, "OneSignal cleanOutcomes for session", null);
                    p1Var.f12054b = OSUtils.q();
                    p1Var.i();
                }
                s sVarM = z3.m();
                Long lC = sVarM.c();
                if (lC == null) {
                    ((f0) sVarM.f12108d).b(list).k(2);
                    return;
                }
                r rVarB = ((f0) sVarM.f12108d).b(list);
                rVarB.g(lC.longValue(), list);
                rVarB.k(2);
                return;
            case 2:
                break;
            case 3:
                i0 i0Var = (i0) this.f12041f;
                Activity activity = (Activity) this.f12040e;
                int i12 = i0.f11860v;
                i0Var.d(activity);
                return;
            case 4:
                i0 i0Var2 = (i0) this.f12041f;
                boolean z10 = i0Var2.f11873k;
                Object obj2 = this.f12040e;
                if (z10 && (relativeLayout = i0Var2.f11880r) != null) {
                    i0.b(relativeLayout, i0.f11861w, i0.f11860v, new t1.p(i10, i0Var2, (r5) obj2)).start();
                    return;
                }
                i0.a(i0Var2);
                r5 r5Var = (r5) obj2;
                if (r5Var != null) {
                    r5Var.onComplete();
                    return;
                }
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                ((r2) this.f12041f).b((g2) this.f12040e);
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Thread.currentThread().setPriority(10);
                z9.b bVarE = ((n8.s) ((p1) this.f12041f).f12055e).e();
                aa.b eventParams = (aa.b) this.f12040e;
                Intrinsics.f(eventParams, "eventParams");
                o5.d dVar = bVarE.f19801b;
                synchronized (dVar) {
                    l lVar2 = (l) dVar.f15721e;
                    String strL = Intrinsics.l(eventParams, "OneSignal saveUniqueOutcomeEventParams: ");
                    lVar2.getClass();
                    l.d(strL);
                    String str = eventParams.f465a;
                    ArrayList arrayList = new ArrayList();
                    aa.c cVar = eventParams.f466b;
                    l9 l9Var2 = cVar == null ? null : cVar.f469a;
                    if (cVar != null) {
                        l9Var = cVar.f470b;
                    }
                    if (l9Var2 != null) {
                        JSONArray jSONArray = (JSONArray) l9Var2.f10882f;
                        JSONArray jSONArray2 = (JSONArray) l9Var2.f10881e;
                        o5.d.e(arrayList, jSONArray, x9.b.IAM);
                        o5.d.e(arrayList, jSONArray2, x9.b.NOTIFICATION);
                    }
                    if (l9Var != null) {
                        JSONArray jSONArray3 = (JSONArray) l9Var.f10882f;
                        JSONArray jSONArray4 = (JSONArray) l9Var.f10881e;
                        o5.d.e(arrayList, jSONArray3, x9.b.IAM);
                        o5.d.e(arrayList, jSONArray4, x9.b.NOTIFICATION);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        aa.a aVar = (aa.a) it2.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("channel_influence_id", aVar.f463a);
                        contentValues.put("channel_type", aVar.f464b.f19119b);
                        contentValues.put("name", str);
                        ((f4) ((e4) dVar.f15722f)).e("cached_unique_outcome", contentValues);
                    }
                }
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                e eVar = g.f11804e;
                if (eVar != null) {
                    String str2 = (String) this.f12040e;
                    n3 n3Var = new n3(this, eVar);
                    e.f11766d.put(str2, n3Var);
                    Activity activity2 = eVar.f11770b;
                    if (activity2 != null) {
                        n3Var.a(activity2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (z3.i() != null) {
                    new AlertDialog.Builder(z3.i()).setTitle(((y3) this.f12040e).toString()).setMessage((String) this.f12041f).show();
                    return;
                }
                return;
            case 9:
                ((q3) this.f12040e).K((String) this.f12041f);
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                int[] iArr = (int[]) this.f12040e;
                boolean z11 = iArr.length > 0 && iArr[0] == 0;
                HashMap map = PermissionsActivity.f11702n;
                PermissionsActivity permissionsActivity = (PermissionsActivity) this.f12041f;
                r4 r4Var = (r4) map.get(permissionsActivity.f11703b);
                if (r4Var == null) {
                    throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.f11703b);
                }
                if (z11) {
                    r4Var.a();
                    return;
                }
                if (PermissionsActivity.f11700j && PermissionsActivity.f11701m && !e0.h.f(permissionsActivity, permissionsActivity.f11704e)) {
                    z7 = true;
                }
                r4Var.b(z7);
                return;
            default:
                t5.h((u1) this.f12040e, (i1) this.f12041f);
                return;
        }
        while (i11 < 5) {
            u4 u4Var = (u4) this.f12041f;
            String str3 = (String) this.f12040e;
            u4Var.getClass();
            y3 y3Var = y3.f12232m;
            y3 y3Var2 = y3.f12230f;
            try {
                String strB = u4Var.b(str3);
                z3.b(y3Var, "Device registered, push token = " + strB, null);
                u4Var.f12190a.getClass();
                l.c(1, strB);
                return;
            } catch (IOException e11) {
                int iD = u4.d(e11);
                Throwable cause = e11;
                while (cause.getCause() != null && cause.getCause() != cause) {
                    cause = cause.getCause();
                }
                String message = cause.getMessage();
                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"AUTHENTICATION_FAILED".equals(message)) {
                    z3.b(y3Var2, "Error Getting FCM Token", new Exception(e11));
                    if (u4Var.f12192c) {
                        return;
                    }
                    u4Var.f12190a.getClass();
                    l.c(iD, null);
                    return;
                }
                Exception exc = new Exception(e11);
                if (i11 >= 4) {
                    z3.b(y3Var2, "Retry count of 5 exceed! Could not get a FCM Token.", exc);
                } else {
                    z3.b(y3Var, "'Google Play services' returned " + message + " error. Current retry count: " + i11, exc);
                    if (i11 == 2) {
                        u4Var.f12190a.getClass();
                        l.c(iD, null);
                        u4Var.f12192c = true;
                        return;
                    }
                }
                i11++;
                try {
                    Thread.sleep(10000 * i11);
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th) {
                Exception exc2 = new Exception(th);
                int iD2 = u4.d(th);
                z3.b(y3Var2, "Unknown error getting FCM Token", exc2);
                u4Var.f12190a.getClass();
                l.c(iD2, null);
                return;
            }
        }
    }

    public /* synthetic */ o1(Object obj, Object obj2, int i10) {
        this.f12039b = i10;
        this.f12040e = obj;
        this.f12041f = obj2;
    }
}