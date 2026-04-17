package t5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.zh1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q3 extends g4 {
    public static final Pair Z = new Pair("", 0L);
    public final zh1 M;
    public final p3 N;
    public final com.bumptech.glide.m O;
    public final p3 P;
    public final zh1 Q;
    public boolean R;
    public final p3 S;
    public final p3 T;
    public final zh1 U;
    public final com.bumptech.glide.m V;
    public final com.bumptech.glide.m W;
    public final zh1 X;
    public final g2.h Y;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f17565f;

    /* renamed from: j, reason: collision with root package name */
    public o2.c f17566j;

    /* renamed from: m, reason: collision with root package name */
    public final zh1 f17567m;

    /* renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.m f17568n;

    /* renamed from: t, reason: collision with root package name */
    public String f17569t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17570u;

    /* renamed from: w, reason: collision with root package name */
    public long f17571w;

    public q3(b4 b4Var) {
        super(b4Var);
        this.M = new zh1(this, "session_timeout", 1800000L);
        this.N = new p3(this, "start_new_session", true);
        this.Q = new zh1(this, "last_pause_time", 0L);
        this.O = new com.bumptech.glide.m(this, "non_personalized_ads");
        this.P = new p3(this, "allow_remote_dynamite", false);
        this.f17567m = new zh1(this, "first_open_time", 0L);
        fc.t.g("app_install_time");
        this.f17568n = new com.bumptech.glide.m(this, "app_instance_id");
        this.S = new p3(this, "app_backgrounded", false);
        this.T = new p3(this, "deep_link_retrieval_complete", false);
        this.U = new zh1(this, "deep_link_retrieval_attempts", 0L);
        this.V = new com.bumptech.glide.m(this, "firebase_feature_rollouts");
        this.W = new com.bumptech.glide.m(this, "deferred_attribution_cache");
        this.X = new zh1(this, "deferred_attribution_cache_timestamp", 0L);
        g2.h hVar = new g2.h();
        hVar.f13014j = this;
        fc.t.g("default_event_parameters");
        hVar.f13011b = "default_event_parameters";
        hVar.f13012e = new Bundle();
        this.Y = hVar;
    }

    @Override // t5.g4
    public final boolean p() {
        return true;
    }

    public final SharedPreferences s() {
        o();
        q();
        fc.t.k(this.f17565f);
        return this.f17565f;
    }

    public final void t() {
        b4 b4Var = (b4) this.f15046b;
        SharedPreferences sharedPreferences = b4Var.f17234b.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f17565f = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.R = z7;
        if (!z7) {
            SharedPreferences.Editor editorEdit = this.f17565f.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        b4Var.getClass();
        long jMax = Math.max(0L, ((Long) a3.f17167c.a(null)).longValue());
        o2.c cVar = new o2.c();
        cVar.f15671e = this;
        fc.t.g("health_monitor");
        fc.t.c(jMax > 0);
        cVar.f15672f = "health_monitor:start";
        cVar.f15673j = "health_monitor:count";
        cVar.f15674m = "health_monitor:value";
        cVar.f15670b = jMax;
        this.f17566j = cVar;
    }

    public final h u() {
        o();
        return h.b(s().getString("consent_settings", "G1"));
    }

    public final void w(boolean z7) {
        o();
        i3 i3Var = ((b4) this.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.Q.b(Boolean.valueOf(z7), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z7);
        editorEdit.apply();
    }

    public final boolean x(long j10) {
        return j10 - this.M.zza() > this.Q.zza();
    }

    public final boolean y(int i10) {
        int i11 = s().getInt("consent_source", 100);
        h hVar = h.f17377b;
        return i10 <= i11;
    }
}