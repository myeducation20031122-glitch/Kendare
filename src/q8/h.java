package q8;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f16313b;

    /* renamed from: e, reason: collision with root package name */
    public static final e f16314e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f16315f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q8.a] */
    static {
        ?? r02 = new h() { // from class: q8.a
            @Override // q8.i
            public final String c(Field field) {
                return field.getName();
            }
        };
        f16313b = r02;
        h hVar = new h() { // from class: q8.b
            @Override // q8.i
            public final String c(Field field) {
                return h.g(field.getName());
            }
        };
        h hVar2 = new h() { // from class: q8.c
            @Override // q8.i
            public final String c(Field field) {
                return h.g(h.e(' ', field.getName()));
            }
        };
        h hVar3 = new h() { // from class: q8.d
            @Override // q8.i
            public final String c(Field field) {
                return h.e('_', field.getName()).toUpperCase(Locale.ENGLISH);
            }
        };
        e eVar = new e();
        f16314e = eVar;
        f16315f = new h[]{r02, hVar, hVar2, hVar3, eVar, new h() { // from class: q8.f
            @Override // q8.i
            public final String c(Field field) {
                return h.e('-', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: q8.g
            @Override // q8.i
            public final String c(Field field) {
                return h.e('.', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String e(char c10, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String g(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f16315f.clone();
    }
}