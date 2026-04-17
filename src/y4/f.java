package y4;

import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final Status f19238b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Status status) {
        int i10 = status.f2482b;
        String str = status.f2483e;
        super(i10 + ": " + (str == null ? "" : str));
        this.f19238b = status;
    }
}