package t9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.material.datepicker.d(6);

    /* renamed from: b, reason: collision with root package name */
    public final String f18087b;

    /* renamed from: e, reason: collision with root package name */
    public final String f18088e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18089f;

    /* renamed from: j, reason: collision with root package name */
    public final h f18090j;

    public i(Parcel parcel) {
        this.f18087b = parcel.readString();
        this.f18089f = parcel.readString();
        this.f18088e = parcel.readString();
        this.f18090j = a();
    }

    public final h a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f18087b);
            h hVar = new h();
            hVar.f18079b = jSONObject.optString("orderId");
            hVar.f18080e = jSONObject.optString("packageName");
            hVar.f18081f = jSONObject.optString("productId");
            long jOptLong = jSONObject.optLong("purchaseTime", 0L);
            hVar.f18082j = jOptLong != 0 ? new Date(jOptLong) : null;
            hVar.f18083m = v.h.c(4)[jSONObject.optInt("purchaseState", 1)];
            hVar.f18084n = this.f18089f;
            hVar.f18085t = jSONObject.getString("purchaseToken");
            hVar.f18086u = jSONObject.optBoolean("autoRenewing");
            return hVar;
        } catch (JSONException e10) {
            Log.e("PurchaseInfo", "Failed to parse response data", e10);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f18087b.equals(iVar.f18087b) && this.f18088e.equals(iVar.f18088e) && this.f18089f.equals(iVar.f18089f)) {
            h hVar = this.f18090j;
            String str = hVar.f18085t;
            h hVar2 = iVar.f18090j;
            if (str.equals(hVar2.f18085t) && hVar.f18082j.equals(hVar2.f18082j)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18087b);
        parcel.writeString(this.f18089f);
        parcel.writeString(this.f18088e);
    }

    public i(String str, String str2) {
        this.f18087b = str;
        this.f18088e = str2;
        this.f18089f = "";
        this.f18090j = a();
    }

    public i(String str, String str2, String str3) {
        this.f18087b = str;
        this.f18088e = str2;
        this.f18089f = str3;
        this.f18090j = a();
    }
}