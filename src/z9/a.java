package z9;

import com.onesignal.b4;
import com.onesignal.l;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final l f19799a;

    public a(l client) {
        Intrinsics.f(client, "client");
        this.f19799a = client;
    }

    public abstract void a(JSONObject jSONObject, b4 b4Var);
}