package d7;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12325a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f12325a = new HashMap();
        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PlayCoreVersion");
    }
}