package e0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t0 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12427b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Context f12428e;

    public t0(Context context) {
        this.f12428e = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12427b.iterator();
    }
}