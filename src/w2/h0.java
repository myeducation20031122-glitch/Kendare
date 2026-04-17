package w2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 implements u {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f18561b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final g0 f18562a;

    public h0(g0 g0Var) {
        this.f18562a = g0Var;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        Uri uri = (Uri) obj;
        return new t(new h3.d(uri), this.f18562a.j(uri));
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        return f18561b.contains(((Uri) obj).getScheme());
    }
}