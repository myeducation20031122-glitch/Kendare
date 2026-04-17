package q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.n3;
import g2.h;
import n8.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f16083a;

    /* renamed from: b, reason: collision with root package name */
    public final s f16084b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16085c;

    public b() {
        this.f16083a = new Intent("android.intent.action.VIEW");
        this.f16084b = new s(1);
        this.f16085c = true;
    }

    public final n3 a() {
        Intent intent = this.f16083a;
        Object obj = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f16085c);
        s sVar = this.f16084b;
        h hVar = new h((Integer) sVar.f15435b, (Integer) sVar.f15436e, (Integer) sVar.f15437f, (Integer) sVar.f15438j);
        Bundle bundle2 = new Bundle();
        Integer num = (Integer) hVar.f13011b;
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) hVar.f13012e;
        if (num2 != null) {
            bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) hVar.f13013f;
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = (Integer) hVar.f13014j;
        if (num4 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new n3(3, intent, obj);
    }

    public b(d dVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f16083a = intent;
        this.f16084b = new s(1);
        this.f16085c = true;
        if (dVar != null) {
            intent.setPackage(((ComponentName) dVar.f16090j).getPackageName());
            IBinder iBinderAsBinder = ((a.b) dVar.f16089f).asBinder();
            PendingIntent pendingIntent = (PendingIntent) dVar.f16091m;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}