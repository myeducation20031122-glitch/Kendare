package i7;

import android.content.Context;
import android.text.TextUtils;
import fc.t;
import java.util.Arrays;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13437b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13438c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13439d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13440e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13441f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13442g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = e5.d.f12531a;
        t.m("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f13437b = str;
        this.f13436a = str2;
        this.f13438c = str3;
        this.f13439d = str4;
        this.f13440e = str5;
        this.f13441f = str6;
        this.f13442g = str7;
    }

    public static h a(Context context) {
        d3.d dVar = new d3.d(context);
        String strF = dVar.f("google_app_id");
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return new h(strF, dVar.f("google_api_key"), dVar.f("firebase_database_url"), dVar.f("ga_trackingId"), dVar.f("gcm_defaultSenderId"), dVar.f("google_storage_bucket"), dVar.f("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return y.i(this.f13437b, hVar.f13437b) && y.i(this.f13436a, hVar.f13436a) && y.i(this.f13438c, hVar.f13438c) && y.i(this.f13439d, hVar.f13439d) && y.i(this.f13440e, hVar.f13440e) && y.i(this.f13441f, hVar.f13441f) && y.i(this.f13442g, hVar.f13442g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13437b, this.f13436a, this.f13438c, this.f13439d, this.f13440e, this.f13441f, this.f13442g});
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(this.f13437b, "applicationId");
        dVar.a(this.f13436a, "apiKey");
        dVar.a(this.f13438c, "databaseUrl");
        dVar.a(this.f13440e, "gcmSenderId");
        dVar.a(this.f13441f, "storageBucket");
        dVar.a(this.f13442g, "projectId");
        return dVar.toString();
    }
}