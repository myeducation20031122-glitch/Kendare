package e0;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12429e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12430f;

    public u(int i10) {
        this.f12429e = i10;
        if (i10 != 1) {
            return;
        }
        this.f12430f = new ArrayList();
    }

    @Override // e0.x
    public final void a(Bundle bundle) {
        switch (this.f12429e) {
            case 0:
                super.a(bundle);
                break;
            default:
                super.a(bundle);
                break;
        }
    }

    @Override // e0.x
    public final void b(g0 g0Var) {
        int i10 = this.f12429e;
        Notification.Builder builder = g0Var.f12374b;
        switch (i10) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(builder).setBigContentTitle(this.f12455b).bigText((CharSequence) this.f12430f);
                if (this.f12457d) {
                    bigTextStyleBigText.setSummaryText(this.f12456c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(builder).setBigContentTitle(this.f12455b);
                if (this.f12457d) {
                    bigContentTitle.setSummaryText(this.f12456c);
                }
                Iterator it = ((ArrayList) this.f12430f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // e0.x
    public final String c() {
        switch (this.f12429e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}