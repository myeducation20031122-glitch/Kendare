package s9;

import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f16957b;

    /* renamed from: a, reason: collision with root package name */
    public final String f16958a;

    static {
        HashSet hashSet = new HashSet(3);
        f16957b = hashSet;
        hashSet.add("dalvik.system.VMStack");
        hashSet.add("java.lang.Thread");
        hashSet.add(f.class.getCanonicalName());
    }

    public f() {
        String simpleName;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                simpleName = f.class.getSimpleName();
                break;
            }
            String className = stackTrace[i10].getClassName();
            if (!f16957b.contains(className)) {
                simpleName = className.split("\\.")[r0.length - 1];
                break;
            }
            i10++;
        }
        this.f16958a = simpleName.length() > 0 ? simpleName.concat(": ") : simpleName;
    }
}