package w2;

import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f18541a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18542b;

    public b(AssetManager assetManager, a aVar) {
        this.f18541a = assetManager;
        this.f18542b = aVar;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        Uri uri = (Uri) obj;
        return new t(new h3.d(uri), this.f18542b.m(this.f18541a, uri.toString().substring(22)));
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}