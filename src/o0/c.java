package o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.internal.ads.wi1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public final ContentInfo.Builder f15511b;

    public c(ClipData clipData, int i10) {
        this.f15511b = wi1.e(clipData, i10);
    }

    @Override // o0.d
    public final g a() {
        return new g(new g.u0(this.f15511b.build()));
    }

    @Override // o0.d
    public final void c(Bundle bundle) {
        this.f15511b.setExtras(bundle);
    }

    @Override // o0.d
    public final void d(Uri uri) {
        this.f15511b.setLinkUri(uri);
    }

    @Override // o0.d
    public final void e(int i10) {
        this.f15511b.setFlags(i10);
    }
}