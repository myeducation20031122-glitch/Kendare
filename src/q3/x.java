package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f16237b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x[] f16238e;

    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    static {
        x xVar = new x("UNKNOWN", 0);
        x xVar2 = new x("ANDROID_FIREBASE", 1);
        f16237b = xVar2;
        f16238e = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f16238e.clone();
    }
}