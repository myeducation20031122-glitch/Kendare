package com.onesignal;

import com.google.android.gms.internal.ads.ic1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public String f12171a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12172b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12173c;

    /* renamed from: d, reason: collision with root package name */
    public Set f12174d;

    /* renamed from: e, reason: collision with root package name */
    public z1 f12175e;

    /* renamed from: f, reason: collision with root package name */
    public double f12176f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12177g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12178h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12179i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f12180j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12181k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12182l;

    public u1(JSONObject jSONObject) throws JSONException, ParseException {
        Date date;
        long jIntValue;
        String string;
        int i10;
        int i11;
        this.f12171a = jSONObject.getString("id");
        this.f12175e = new z1();
        int i12 = 0;
        JSONObject jSONObject2 = jSONObject.getJSONObject("variants");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
            HashMap map2 = new HashMap();
            Iterator<String> itKeys2 = jSONObject3.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                map2.put(next2, jSONObject3.getString(next2));
            }
            map.put(next, map2);
        }
        this.f12172b = map;
        JSONArray jSONArray = jSONObject.getJSONArray("triggers");
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < jSONArray.length()) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i13);
            ArrayList arrayList2 = new ArrayList();
            int i14 = 0;
            while (i14 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i14);
                m3 m3Var = new m3();
                m3Var.f11971a = jSONObject4.getString("id");
                String string2 = jSONObject4.getString("kind");
                int[] iArrC = v.h.c(4);
                int length = iArrC.length;
                while (true) {
                    if (i12 >= length) {
                        i10 = 4;
                        break;
                    }
                    int i15 = iArrC[i12];
                    if (ic1.h(i15).equalsIgnoreCase(string2)) {
                        i10 = i15;
                        break;
                    }
                    i12++;
                }
                m3Var.f11972b = i10;
                m3Var.f11973c = jSONObject4.optString("property", null);
                String string3 = jSONObject4.getString("operator");
                int[] iArrC2 = v.h.c(9);
                int length2 = iArrC2.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length2) {
                        i11 = 3;
                        break;
                    }
                    int i17 = iArrC2[i16];
                    if (ic1.f(i17).equalsIgnoreCase(string3)) {
                        i11 = i17;
                        break;
                    }
                    i16++;
                }
                m3Var.f11974d = i11;
                m3Var.f11975e = jSONObject4.opt("value");
                arrayList2.add(m3Var);
                i14++;
                i12 = 0;
            }
            arrayList.add(arrayList2);
            i13++;
            i12 = 0;
        }
        this.f12173c = arrayList;
        this.f12174d = new HashSet();
        try {
            string = jSONObject.getString("end_time");
        } catch (JSONException unused) {
        }
        if (string.equals("null")) {
            date = null;
        } else {
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(string);
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
        this.f12180j = date;
        if (jSONObject.has("has_liquid")) {
            this.f12182l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("redisplay");
            z1 z1Var = new z1();
            z1Var.f12239a = -1L;
            z1Var.f12240b = 0;
            z1Var.f12241c = 1;
            z1Var.f12242d = 0L;
            z1Var.f12243e = true;
            Object obj = jSONObject5.get("limit");
            Object obj2 = jSONObject5.get("delay");
            if (obj instanceof Integer) {
                z1Var.f12241c = ((Integer) obj).intValue();
            }
            if (!(obj2 instanceof Long)) {
                jIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : jIntValue;
                this.f12175e = z1Var;
            }
            jIntValue = ((Long) obj2).longValue();
            z1Var.f12242d = jIntValue;
            this.f12175e = z1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        return this.f12171a.equals(((u1) obj).f12171a);
    }

    public final int hashCode() {
        return this.f12171a.hashCode();
    }

    public final String toString() {
        return "OSInAppMessage{messageId='" + this.f12171a + "', variants=" + this.f12172b + ", triggers=" + this.f12173c + ", clickedClickIds=" + this.f12174d + ", redisplayStats=" + this.f12175e + ", displayDuration=" + this.f12176f + ", displayedInSession=" + this.f12177g + ", triggerChanged=" + this.f12178h + ", actionTaken=" + this.f12179i + ", isPreview=" + this.f12181k + ", endTime=" + this.f12180j + ", hasLiquid=" + this.f12182l + '}';
    }
}