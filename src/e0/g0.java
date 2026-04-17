package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12373a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f12374b;

    /* renamed from: c, reason: collision with root package name */
    public final w f12375c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f12376d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12377e;

    public g0(w wVar) {
        int i10;
        ArrayList arrayList;
        int i11;
        new ArrayList();
        this.f12376d = new Bundle();
        this.f12375c = wVar;
        Context context = wVar.f12431a;
        this.f12373a = context;
        int i12 = Build.VERSION.SDK_INT;
        this.f12374b = i12 >= 26 ? c0.a(context, wVar.f12449s) : new Notification.Builder(wVar.f12431a);
        Notification notification = wVar.f12452v;
        this.f12374b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(wVar.f12435e).setContentText(wVar.f12436f).setContentInfo(null).setContentIntent(wVar.f12437g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(wVar.f12439i).setProgress(0, 0, false);
        if (i12 < 23) {
            Notification.Builder builder = this.f12374b;
            IconCompat iconCompat = wVar.f12438h;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.c());
        } else {
            Notification.Builder builder2 = this.f12374b;
            IconCompat iconCompat2 = wVar.f12438h;
            a0.b(builder2, iconCompat2 == null ? null : iconCompat2.g(context));
        }
        this.f12374b.setSubText(null).setUsesChronometer(false).setPriority(wVar.f12440j);
        Iterator it = wVar.f12432b.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            int i13 = Build.VERSION.SDK_INT;
            if (qVar.f12417b == null && (i11 = qVar.f12420e) != 0) {
                qVar.f12417b = IconCompat.b(i11);
            }
            IconCompat iconCompat3 = qVar.f12417b;
            PendingIntent pendingIntent = qVar.f12422g;
            CharSequence charSequence = qVar.f12421f;
            Notification.Action.Builder builderA = i13 >= 23 ? a0.a(iconCompat3 != null ? iconCompat3.g(null) : null, charSequence, pendingIntent) : y.e(iconCompat3 != null ? iconCompat3.d() : 0, charSequence, pendingIntent);
            Bundle bundle = qVar.f12416a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z7 = qVar.f12418c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z7);
            if (i13 >= 24) {
                b0.a(builderA, z7);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                d0.b(builderA, 0);
            }
            if (i13 >= 29) {
                e0.c(builderA, false);
            }
            if (i13 >= 31) {
                f0.a(builderA, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", qVar.f12419d);
            y.b(builderA, bundle2);
            y.a(this.f12374b, y.d(builderA));
        }
        Bundle bundle3 = wVar.f12446p;
        if (bundle3 != null) {
            this.f12376d.putAll(bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f12374b.setShowWhen(wVar.f12441k);
        y.i(this.f12374b, wVar.f12445o);
        y.g(this.f12374b, wVar.f12443m);
        y.j(this.f12374b, null);
        y.h(this.f12374b, wVar.f12444n);
        this.f12377e = wVar.f12450t;
        z.b(this.f12374b, null);
        z.c(this.f12374b, wVar.f12447q);
        z.f(this.f12374b, wVar.f12448r);
        z.d(this.f12374b, null);
        z.e(this.f12374b, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = wVar.f12433c;
        ArrayList arrayList3 = wVar.f12453w;
        if (i14 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    ic1.v(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    t.c cVar = new t.c(arrayList3.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                z.a(this.f12374b, (String) it3.next());
            }
        }
        ArrayList arrayList4 = wVar.f12434d;
        if (arrayList4.size() > 0) {
            if (wVar.f12446p == null) {
                wVar.f12446p = new Bundle();
            }
            Bundle bundle4 = wVar.f12446p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                String string = Integer.toString(i15);
                q qVar2 = (q) arrayList4.get(i15);
                Bundle bundle7 = new Bundle();
                if (qVar2.f12417b == null && (i10 = qVar2.f12420e) != 0) {
                    qVar2.f12417b = IconCompat.b(i10);
                }
                IconCompat iconCompat4 = qVar2.f12417b;
                bundle7.putInt("icon", iconCompat4 != null ? iconCompat4.d() : 0);
                bundle7.putCharSequence("title", qVar2.f12421f);
                bundle7.putParcelable("actionIntent", qVar2.f12422g);
                Bundle bundle8 = qVar2.f12416a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", qVar2.f12418c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", qVar2.f12419d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (wVar.f12446p == null) {
                wVar.f12446p = new Bundle();
            }
            wVar.f12446p.putBundle("android.car.EXTENSIONS", bundle4);
            this.f12376d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            this.f12374b.setExtras(wVar.f12446p);
            b0.e(this.f12374b, null);
        }
        if (i16 >= 26) {
            c0.b(this.f12374b, 0);
            c0.e(this.f12374b, null);
            c0.f(this.f12374b, null);
            c0.g(this.f12374b, 0L);
            c0.d(this.f12374b, wVar.f12450t);
            if (!TextUtils.isEmpty(wVar.f12449s)) {
                this.f12374b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                ic1.v(it4.next());
                throw null;
            }
        }
        if (i16 >= 29) {
            e0.a(this.f12374b, wVar.f12451u);
            e0.b(this.f12374b, null);
        }
    }

    public static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}