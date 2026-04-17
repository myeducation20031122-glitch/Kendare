package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d5 {

    /* renamed from: i, reason: collision with root package name */
    public static int f11756i = -99;

    /* renamed from: j, reason: collision with root package name */
    public static Class f11757j;

    /* renamed from: a, reason: collision with root package name */
    public c5 f11758a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11759b;

    /* renamed from: c, reason: collision with root package name */
    public Method f11760c;

    /* renamed from: d, reason: collision with root package name */
    public Method f11761d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f11762e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11764g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11765h = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11763f = new ArrayList();

    public d5(Context context) {
        this.f11764g = true;
        this.f11762e = context;
        try {
            JSONArray jSONArray = new JSONArray(h4.e("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f11763f.add(jSONArray.get(i10).toString());
            }
            boolean z7 = jSONArray.length() == 0;
            this.f11764g = z7;
            if (z7) {
                this.f11764g = h4.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        b();
    }

    public static void a(d5 d5Var, ArrayList arrayList, ArrayList arrayList2) {
        Method method;
        d5Var.getClass();
        try {
            int i10 = 2;
            if (d5Var.f11761d == null) {
                Method[] methods = f11757j.getMethods();
                int length = methods.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i11];
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                        break;
                    } else {
                        i11++;
                    }
                }
                d5Var.f11761d = method;
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) d5Var.f11761d.invoke(d5Var.f11759b, 3, d5Var.f11762e.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap map = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", bigDecimalDivide.toString());
                    map.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (map.containsKey(str)) {
                        jSONArray.put(map.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    z3.K(jSONArray, d5Var.f11764g, new y2(i10, d5Var, arrayList2));
                }
            }
        } catch (Throwable th) {
            z3.b(y3.f12231j, "Failed to track IAP purchases", th);
        }
    }

    public final void b() {
        if (this.f11758a != null) {
            if (this.f11759b == null || this.f11765h) {
                return;
            }
            new Thread(new g0(this, 6)).start();
            return;
        }
        this.f11758a = new c5(this);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f11762e.bindService(intent, this.f11758a, 1);
    }
}