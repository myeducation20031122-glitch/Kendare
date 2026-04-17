package t5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a3 {
    public static final z2 A;
    public static final z2 A0;
    public static final z2 B;
    public static final z2 B0;
    public static final z2 C;
    public static final z2 D;
    public static final z2 E;
    public static final z2 F;
    public static final z2 G;
    public static final z2 H;
    public static final z2 I;
    public static final z2 J;
    public static final z2 K;
    public static final z2 L;
    public static final z2 M;
    public static final z2 N;
    public static final z2 O;
    public static final z2 P;
    public static final z2 Q;
    public static final z2 R;
    public static final z2 S;
    public static final z2 T;
    public static final z2 U;
    public static final z2 V;
    public static final z2 W;
    public static final z2 X;
    public static final z2 Y;
    public static final z2 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final List f17163a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0, reason: collision with root package name */
    public static final z2 f17164a0;

    /* renamed from: b, reason: collision with root package name */
    public static final z2 f17165b;

    /* renamed from: b0, reason: collision with root package name */
    public static final z2 f17166b0;

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f17167c;

    /* renamed from: c0, reason: collision with root package name */
    public static final z2 f17168c0;

    /* renamed from: d, reason: collision with root package name */
    public static final z2 f17169d;

    /* renamed from: d0, reason: collision with root package name */
    public static final z2 f17170d0;

    /* renamed from: e, reason: collision with root package name */
    public static final z2 f17171e;

    /* renamed from: e0, reason: collision with root package name */
    public static final z2 f17172e0;

    /* renamed from: f, reason: collision with root package name */
    public static final z2 f17173f;

    /* renamed from: f0, reason: collision with root package name */
    public static final z2 f17174f0;

    /* renamed from: g, reason: collision with root package name */
    public static final z2 f17175g;

    /* renamed from: g0, reason: collision with root package name */
    public static final z2 f17176g0;

    /* renamed from: h, reason: collision with root package name */
    public static final z2 f17177h;

    /* renamed from: h0, reason: collision with root package name */
    public static final z2 f17178h0;

    /* renamed from: i, reason: collision with root package name */
    public static final z2 f17179i;

    /* renamed from: i0, reason: collision with root package name */
    public static final z2 f17180i0;

    /* renamed from: j, reason: collision with root package name */
    public static final z2 f17181j;

    /* renamed from: j0, reason: collision with root package name */
    public static final z2 f17182j0;

    /* renamed from: k, reason: collision with root package name */
    public static final z2 f17183k;

    /* renamed from: k0, reason: collision with root package name */
    public static final z2 f17184k0;

    /* renamed from: l, reason: collision with root package name */
    public static final z2 f17185l;

    /* renamed from: l0, reason: collision with root package name */
    public static final z2 f17186l0;

    /* renamed from: m, reason: collision with root package name */
    public static final z2 f17187m;

    /* renamed from: m0, reason: collision with root package name */
    public static final z2 f17188m0;

    /* renamed from: n, reason: collision with root package name */
    public static final z2 f17189n;

    /* renamed from: n0, reason: collision with root package name */
    public static final z2 f17190n0;

    /* renamed from: o, reason: collision with root package name */
    public static final z2 f17191o;

    /* renamed from: o0, reason: collision with root package name */
    public static final z2 f17192o0;

    /* renamed from: p, reason: collision with root package name */
    public static final z2 f17193p;

    /* renamed from: p0, reason: collision with root package name */
    public static final z2 f17194p0;

    /* renamed from: q, reason: collision with root package name */
    public static final z2 f17195q;

    /* renamed from: q0, reason: collision with root package name */
    public static final z2 f17196q0;

    /* renamed from: r, reason: collision with root package name */
    public static final z2 f17197r;

    /* renamed from: r0, reason: collision with root package name */
    public static final z2 f17198r0;

    /* renamed from: s, reason: collision with root package name */
    public static final z2 f17199s;

    /* renamed from: s0, reason: collision with root package name */
    public static final z2 f17200s0;

    /* renamed from: t, reason: collision with root package name */
    public static final z2 f17201t;

    /* renamed from: t0, reason: collision with root package name */
    public static final z2 f17202t0;

    /* renamed from: u, reason: collision with root package name */
    public static final z2 f17203u;

    /* renamed from: u0, reason: collision with root package name */
    public static final z2 f17204u0;

    /* renamed from: v, reason: collision with root package name */
    public static final z2 f17205v;

    /* renamed from: v0, reason: collision with root package name */
    public static final z2 f17206v0;

    /* renamed from: w, reason: collision with root package name */
    public static final z2 f17207w;

    /* renamed from: w0, reason: collision with root package name */
    public static final z2 f17208w0;

    /* renamed from: x, reason: collision with root package name */
    public static final z2 f17209x;

    /* renamed from: x0, reason: collision with root package name */
    public static final z2 f17210x0;

    /* renamed from: y, reason: collision with root package name */
    public static final z2 f17211y;

    /* renamed from: y0, reason: collision with root package name */
    public static final z2 f17212y0;

    /* renamed from: z, reason: collision with root package name */
    public static final z2 f17213z;

    /* renamed from: z0, reason: collision with root package name */
    public static final z2 f17214z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f17165b = a("measurement.ad_id_cache_time", 10000L, 10000L, b0.f17229b);
        f17167c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, t.f17608b);
        f17169d = a("measurement.config.cache_time", 86400000L, 3600000L, f0.f17340b);
        f17171e = a("measurement.config.url_scheme", "https", "https", r0.f17586b);
        f17173f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", e1.f17317b);
        f17175g = a("measurement.upload.max_bundles", 100, 100, q1.f17563b);
        f17177h = a("measurement.upload.max_batch_size", 65536, 65536, d2.f17292b);
        f17179i = a("measurement.upload.max_bundle_size", 65536, 65536, p2.f17547b);
        Integer numValueOf = Integer.valueOf(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
        f17181j = a("measurement.upload.max_events_per_bundle", numValueOf, numValueOf, t2.f17613b);
        f17183k = a("measurement.upload.max_events_per_day", 100000, 100000, v2.f17637b);
        f17185l = a("measurement.upload.max_error_events_per_day", numValueOf, numValueOf, m0.f17491b);
        f17187m = a("measurement.upload.max_public_events_per_day", 50000, 50000, y0.f17684b);
        f17189n = a("measurement.upload.max_conversions_per_day", 10000, 10000, j1.f17437b);
        f17191o = a("measurement.upload.max_realtime_events_per_day", 10, 10, v1.f17636b);
        f17193p = a("measurement.store.max_stored_events_per_app", 100000, 100000, g2.f17363b);
        f17195q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", r2.f17588b);
        f17197r = a("measurement.upload.backoff_period", 43200000L, 43200000L, w2.f17651b);
        f17199s = a("measurement.upload.window_interval", 3600000L, 3600000L, x2.f17679b);
        f17201t = a("measurement.upload.interval", 3600000L, 3600000L, d.f17289e);
        f17203u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, s.f17597b);
        f17205v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, u.f17622b);
        f17207w = a("measurement.upload.minimum_delay", 500L, 500L, v.f17634b);
        f17209x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, w.f17648b);
        f17211y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, x.f17676b);
        f17213z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, y.f17683b);
        A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, z.f17703b);
        B = a("measurement.upload.retry_time", 1800000L, 1800000L, a0.f17160b);
        C = a("measurement.upload.retry_count", 6, 6, c0.f17274b);
        D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, d0.f17290b);
        E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, e0.f17316b);
        F = a("measurement.audience.filter_result_max_count", 200, 200, g0.f17361b);
        G = a("measurement.upload.max_public_user_properties", 25, 25, null);
        H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        I = a("measurement.upload.max_public_event_params", 25, 25, null);
        J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, h0.f17379b);
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, i0.f17391b);
        L = a("measurement.test.string_flag", "---", "---", j0.f17436b);
        M = a("measurement.test.long_flag", -1L, -1L, k0.f17463b);
        N = a("measurement.test.int_flag", -2, -2, l0.f17476b);
        Double dValueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", dValueOf, dValueOf, n0.f17514b);
        P = a("measurement.experiment.max_ids", 50, 50, o0.f17533b);
        Q = a("measurement.max_bundles_per_iteration", 100, 100, p0.f17545b);
        R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, q0.f17562b);
        S = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, t0.f17609b);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, u0.f17623b);
        T = a("measurement.quality.checksum", bool, bool, null);
        U = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, v0.f17635b);
        V = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, w0.f17649b);
        W = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, x0.f17677b);
        X = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, z0.f17704b);
        Y = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, a1.f17161b);
        Z = a("measurement.lifecycle.app_in_background_parameter", bool, bool, b1.f17230b);
        f17164a0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, c1.f17275b);
        f17166b0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, d1.f17291b);
        f17168c0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, f1.f17341b);
        f17170d0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, g1.f17362b);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, h1.f17380b);
        f17172e0 = a("measurement.service.storage_consent_support_version", 203600, 203600, i1.f17392b);
        a("measurement.client.click_identifier_control.dev", bool, bool, k1.f17464b);
        a("measurement.service.click_identifier_control", bool, bool, l1.f17477b);
        f17174f0 = a("measurement.module.pixie.fix_array", bool2, bool2, m1.f17492b);
        f17176g0 = a("measurement.adid_zero.only_request_adid_if_enabled", bool2, bool2, n1.f17515b);
        f17178h0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, o1.f17534b);
        a("measurement.enhanced_campaign.service", bool2, bool2, p1.f17546b);
        f17180i0 = a("measurement.enhanced_campaign.client", bool2, bool2, r1.f17587b);
        f17182j0 = a("measurement.enhanced_campaign.srsltid.client", bool2, bool2, s1.f17601b);
        a("measurement.enhanced_campaign.srsltid.service", bool2, bool2, u1.f17624b);
        f17184k0 = a("measurement.service.store_null_safelist", bool2, bool2, w1.f17650b);
        f17186l0 = a("measurement.service.store_safelist", bool2, bool2, x1.f17678b);
        f17188m0 = a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, y1.f17685b);
        f17190n0 = a("measurement.redaction.config_redacted_fields", bool2, bool2, z1.f17705b);
        f17192o0 = a("measurement.redaction.upload_redacted_fields", bool2, bool2, a2.f17162b);
        f17194p0 = a("measurement.redaction.upload_subdomain_override", bool2, bool2, b2.f17231b);
        f17196q0 = a("measurement.redaction.device_info", bool2, bool2, c2.f17276b);
        f17198r0 = a("measurement.redaction.user_id", bool2, bool2, e2.f17318b);
        f17200s0 = a("measurement.redaction.google_signals", bool2, bool2, f2.f17342b);
        f17202t0 = a("measurement.collection.enable_session_stitching_token.service", bool, bool, h2.f17381b);
        f17204u0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, i2.f17393b);
        f17206v0 = a("measurement.redaction.app_instance_id", bool2, bool2, j2.f17438b);
        f17208w0 = a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, k2.f17465b);
        f17210x0 = a("measurement.redaction.enhanced_uid", bool2, bool2, l2.f17478b);
        f17212y0 = a("measurement.redaction.e_tag", bool2, bool2, m2.f17493b);
        f17214z0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, n2.f17516b);
        A0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, o2.f17535b);
        a("measurement.redaction.scion_payload_generator", bool, bool, q2.f17564b);
        B0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, s2.f17602b);
    }

    public static z2 a(String str, Object obj, Object obj2, y2 y2Var) {
        z2 z2Var = new z2(str, obj, obj2, y2Var);
        f17163a.add(z2Var);
        return z2Var;
    }

    public static Map b(Context context) {
        com.google.android.gms.internal.measurement.l3 l3VarA = com.google.android.gms.internal.measurement.l3.a(context.getContentResolver(), com.google.android.gms.internal.measurement.q3.a(), r.f17585b);
        return l3VarA == null ? Collections.emptyMap() : l3VarA.b();
    }
}