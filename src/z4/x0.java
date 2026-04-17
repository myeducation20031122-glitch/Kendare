package z4;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f19727c = new Status(8, "The connection to Google Play services was lost", null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f19728a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    public final w0 f19729b = new w0(this);

    public final void a() {
        boolean zL0;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f19728a.toArray(new BasePendingResult[0])) {
            basePendingResult.f2491e.set(null);
            synchronized (basePendingResult.f2487a) {
                try {
                    if (((GoogleApiClient) basePendingResult.f2488b.get()) == null || !basePendingResult.f2495i) {
                        basePendingResult.j0();
                    }
                    zL0 = basePendingResult.l0();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zL0) {
                this.f19728a.remove(basePendingResult);
            }
        }
    }
}