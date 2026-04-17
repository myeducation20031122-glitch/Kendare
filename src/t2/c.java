package t2;

import i3.o;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends m0.j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17117e;

    public c(int i10) {
        this.f17117e = i10;
        char[] cArr = o.f13305a;
        this.f15046b = new ArrayDeque(20);
    }

    public final k p() {
        switch (this.f17117e) {
            case 0:
                return new b(this);
            case QueueFuseable.SYNC /* 1 */:
                return new g(this);
            default:
                return new m(this);
        }
    }
}