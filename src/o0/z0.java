package o0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import com.google.android.gms.internal.ads.wi1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z0 implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f15647a;

    public z0(a0 a0Var) {
        this.f15647a = a0Var;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        g gVar = new g(new g.u0(contentInfo));
        g gVarA = ((u0.r) this.f15647a).a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (gVarA == gVar) {
            return contentInfo;
        }
        ContentInfo contentInfoT = gVarA.f15544a.t();
        Objects.requireNonNull(contentInfoT);
        return wi1.g(contentInfoT);
    }
}