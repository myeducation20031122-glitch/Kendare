package o5;

import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f15730b;

    public f0(int i10, String str) {
        super(str);
        this.f15730b = i10;
    }

    public final m2.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        String message = getMessage();
        return new m2.e(this.f15730b, 2, message);
    }

    public f0(int i10, String str, IOException iOException) {
        super(str, iOException);
        this.f15730b = i10;
    }
}