package w2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 implements u {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f18563b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final u f18564a;

    public i0(u uVar) {
        this.f18564a = uVar;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        return this.f18564a.a(new l(((Uri) obj).toString()), i10, i11, nVar);
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        return f18563b.contains(((Uri) obj).getScheme());
    }
}