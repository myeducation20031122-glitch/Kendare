package h2;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13185b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Notification f13186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13187f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f13188j;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f13188j = systemForegroundService;
        this.f13185b = i10;
        this.f13186e = notification;
        this.f13187f = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        Notification notification = this.f13186e;
        int i11 = this.f13185b;
        SystemForegroundService systemForegroundService = this.f13188j;
        if (i10 >= 29) {
            systemForegroundService.startForeground(i11, notification, this.f13187f);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}