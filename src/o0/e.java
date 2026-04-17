package o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements d, f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15524b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final ClipData f15525e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15526f;

    /* renamed from: j, reason: collision with root package name */
    public int f15527j;

    /* renamed from: m, reason: collision with root package name */
    public Uri f15528m;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f15529n;

    public e(ClipData clipData, int i10) {
        this.f15525e = clipData;
        this.f15526f = i10;
    }

    @Override // o0.d
    public final g a() {
        return new g(new e(this));
    }

    @Override // o0.f
    public final ClipData b() {
        return this.f15525e;
    }

    @Override // o0.d
    public final void c(Bundle bundle) {
        this.f15529n = bundle;
    }

    @Override // o0.d
    public final void d(Uri uri) {
        this.f15528m = uri;
    }

    @Override // o0.d
    public final void e(int i10) {
        this.f15527j = i10;
    }

    @Override // o0.f
    public final int h() {
        return this.f15526f;
    }

    @Override // o0.f
    public final int p() {
        return this.f15527j;
    }

    @Override // o0.f
    public final ContentInfo t() {
        return null;
    }

    public final String toString() {
        String str;
        switch (this.f15524b) {
            case QueueFuseable.SYNC /* 1 */:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f15525e.getDescription());
                sb.append(", source=");
                int i10 = this.f15526f;
                sb.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i11 = this.f15527j;
                sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (this.f15528m == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + this.f15528m.toString().length() + ")";
                }
                sb.append(str);
                return kc.r.g(sb, this.f15529n != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f15525e;
        clipData.getClass();
        this.f15525e = clipData;
        int i10 = eVar.f15526f;
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i10 > 5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
        this.f15526f = i10;
        int i11 = eVar.f15527j;
        if ((i11 & 1) == i11) {
            this.f15527j = i11;
            this.f15528m = eVar.f15528m;
            this.f15529n = eVar.f15529n;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}