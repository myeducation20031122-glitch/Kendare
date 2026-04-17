package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t extends x {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f12424e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f12425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12426g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    @Override // e0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(g0 g0Var) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(g0Var.f12374b).setBigContentTitle(this.f12455b);
        IconCompat iconCompat = this.f12424e;
        Context context = g0Var.f12373a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                s.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.e() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f12424e.c());
            }
        }
        if (this.f12426g) {
            IconCompat iconCompat2 = this.f12425f;
            if (iconCompat2 != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r.a(bigContentTitle, iconCompat2.g(context));
                } else if (iconCompat2.e() == 1) {
                    bigContentTitle.bigLargeIcon(this.f12425f.c());
                } else {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                }
            }
        }
        if (this.f12457d) {
            bigContentTitle.setSummaryText(this.f12456c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            s.c(bigContentTitle, false);
            s.b(bigContentTitle, null);
        }
    }

    @Override // e0.x
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}