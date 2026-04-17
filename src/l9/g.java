package l9;

import android.widget.ImageView;
import com.isprid.kendare.ui.horoscope.MoreDetailsActivity;
import kotlin.jvm.internal.Intrinsics;
import m.s3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements w1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoreDetailsActivity f14699a;

    public g(MoreDetailsActivity moreDetailsActivity) {
        this.f14699a = moreDetailsActivity;
    }

    public final void a(int i10) {
        s3 s3Var;
        int i11 = MoreDetailsActivity.f11650w;
        MoreDetailsActivity moreDetailsActivity = this.f14699a;
        moreDetailsActivity.p(i10);
        if (i10 == 0) {
            s3 s3Var2 = moreDetailsActivity.f11651f;
            if (s3Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ImageView imageView = (ImageView) s3Var2.f14931m;
            Intrinsics.e(imageView, "binding.prev");
            com.bumptech.glide.f.l(imageView);
            s3Var = moreDetailsActivity.f11651f;
            if (s3Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
        } else {
            if (i10 == 5) {
                s3 s3Var3 = moreDetailsActivity.f11651f;
                if (s3Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ImageView imageView2 = (ImageView) s3Var3.f14931m;
                Intrinsics.e(imageView2, "binding.prev");
                com.bumptech.glide.f.x(imageView2);
                s3 s3Var4 = moreDetailsActivity.f11651f;
                if (s3Var4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ImageView imageView3 = (ImageView) s3Var4.f14930j;
                Intrinsics.e(imageView3, "binding.next");
                com.bumptech.glide.f.l(imageView3);
                return;
            }
            s3 s3Var5 = moreDetailsActivity.f11651f;
            if (s3Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ImageView imageView4 = (ImageView) s3Var5.f14931m;
            Intrinsics.e(imageView4, "binding.prev");
            com.bumptech.glide.f.x(imageView4);
            s3Var = moreDetailsActivity.f11651f;
            if (s3Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
        }
        ImageView imageView5 = (ImageView) s3Var.f14930j;
        Intrinsics.e(imageView5, "binding.next");
        com.bumptech.glide.f.x(imageView5);
    }
}