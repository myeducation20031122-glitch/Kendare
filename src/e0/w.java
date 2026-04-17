package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12431a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12435e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f12436f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f12437g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f12438h;

    /* renamed from: i, reason: collision with root package name */
    public int f12439i;

    /* renamed from: j, reason: collision with root package name */
    public int f12440j;

    /* renamed from: l, reason: collision with root package name */
    public x f12442l;

    /* renamed from: m, reason: collision with root package name */
    public String f12443m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12444n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f12446p;

    /* renamed from: s, reason: collision with root package name */
    public String f12449s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f12451u;

    /* renamed from: v, reason: collision with root package name */
    public final Notification f12452v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f12453w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12432b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12433c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12434d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f12441k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12445o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f12447q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f12448r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f12450t = 0;

    public w(Context context, String str) {
        Notification notification = new Notification();
        this.f12452v = notification;
        this.f12431a = context;
        this.f12449s = str;
        notification.when = System.currentTimeMillis();
        this.f12452v.audioStreamType = -1;
        this.f12440j = 0;
        this.f12453w = new ArrayList();
        this.f12451u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[PHI: r0
      0x0048: PHI (r0v3 android.app.Notification) = (r0v2 android.app.Notification), (r0v4 android.app.Notification) binds: [B:36:0x0074, B:22:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        g0 g0Var = new g0(this);
        w wVar = g0Var.f12375c;
        x xVar = wVar.f12442l;
        if (xVar != null) {
            xVar.b(g0Var);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = g0Var.f12374b;
        if (i10 >= 26) {
            notificationBuild = builder.build();
        } else {
            int i11 = g0Var.f12377e;
            if (i10 >= 24) {
                notificationBuild = builder.build();
                if (i11 != 0) {
                    if (y.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        g0.a(notificationBuild);
                    }
                    if (y.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                        g0.a(notificationBuild);
                    }
                }
            } else {
                builder.setExtras(g0Var.f12376d);
                notificationBuild = builder.build();
                if (i11 != 0) {
                    if (y.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        g0.a(notificationBuild);
                    }
                    if (y.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                    }
                }
            }
        }
        if (xVar != null) {
            wVar.f12442l.getClass();
        }
        if (xVar != null && (bundle = notificationBuild.extras) != null) {
            xVar.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i10) {
        Notification notification = this.f12452v;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i10, boolean z7) {
        Notification notification;
        int i11;
        if (z7) {
            notification = this.f12452v;
            i11 = i10 | notification.flags;
        } else {
            notification = this.f12452v;
            i11 = (~i10) & notification.flags;
        }
        notification.flags = i11;
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f12431a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131099748);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131099747);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f805k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f807b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f12438h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f12452v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderE = v.e(v.c(v.b(), 4), 5);
        this.f12452v.audioAttributes = v.a(builderE);
    }

    public final void g(x xVar) {
        if (this.f12442l != xVar) {
            this.f12442l = xVar;
            if (xVar == null || xVar.f12454a == this) {
                return;
            }
            xVar.f12454a = this;
            g(xVar);
        }
    }
}