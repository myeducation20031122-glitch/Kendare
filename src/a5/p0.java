package a5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f384d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f385a;

    /* renamed from: b, reason: collision with root package name */
    public final String f386b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f387c;

    public p0(String str, String str2, boolean z7) {
        fc.t.g(str);
        this.f385a = str;
        fc.t.g(str2);
        this.f386b = str2;
        this.f387c = z7;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        String str = this.f385a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f387c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f384d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f386b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return o5.y.i(this.f385a, p0Var.f385a) && o5.y.i(this.f386b, p0Var.f386b) && o5.y.i(null, null) && this.f387c == p0Var.f387c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f385a, this.f386b, null, 4225, Boolean.valueOf(this.f387c)});
    }

    public final String toString() {
        String str = this.f385a;
        if (str != null) {
            return str;
        }
        fc.t.k((Object) null);
        throw null;
    }
}