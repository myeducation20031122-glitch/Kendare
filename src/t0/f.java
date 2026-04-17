package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements g {

    /* renamed from: b, reason: collision with root package name */
    public final InputContentInfo f17013b;

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17013b = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // t0.g
    public final ClipDescription a() {
        return this.f17013b.getDescription();
    }

    @Override // t0.g
    public final Object e() {
        return this.f17013b;
    }

    @Override // t0.g
    public final Uri g() {
        return this.f17013b.getContentUri();
    }

    @Override // t0.g
    public final void h() {
        this.f17013b.requestPermission();
    }

    @Override // t0.g
    public final Uri i() {
        return this.f17013b.getLinkUri();
    }

    public f(Object obj) {
        this.f17013b = (InputContentInfo) obj;
    }
}