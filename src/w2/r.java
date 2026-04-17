package w2;

import android.content.Context;
import android.net.Uri;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18581a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18582b;

    public r(Context context, int i10) {
        this.f18581a = i10;
        if (i10 == 1) {
            this.f18582b = context.getApplicationContext();
        } else if (i10 != 2) {
            this.f18582b = context;
        } else {
            this.f18582b = context.getApplicationContext();
        }
    }

    @Override // w2.u
    public final /* bridge */ /* synthetic */ t a(Object obj, int i10, int i11, q2.n nVar) {
        switch (this.f18581a) {
        }
        return c((Uri) obj, i10, i11, nVar);
    }

    @Override // w2.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f18581a) {
        }
        return d((Uri) obj);
    }

    public final t c(Uri uri, int i10, int i11, q2.n nVar) {
        Long l10;
        int i12 = this.f18581a;
        Context context = this.f18582b;
        switch (i12) {
            case 0:
                return new t(new h3.d(uri), new q(context, uri));
            case QueueFuseable.SYNC /* 1 */:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    return null;
                }
                return new t(new h3.d(uri), r2.c.e(context, uri, new r2.a(context.getContentResolver())));
            default:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384 || (l10 = (Long) nVar.c(z2.h0.f19527d)) == null || l10.longValue() != -1) {
                    return null;
                }
                return new t(new h3.d(uri), r2.c.e(context, uri, new r2.b(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f18581a) {
            case 0:
                return fc.t.x(uri);
            case QueueFuseable.SYNC /* 1 */:
                return fc.t.x(uri) && !uri.getPathSegments().contains("video");
            default:
                return fc.t.x(uri) && uri.getPathSegments().contains("video");
        }
    }
}