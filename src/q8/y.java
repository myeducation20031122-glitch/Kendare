package q8;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y implements z {

    /* renamed from: b, reason: collision with root package name */
    public static final u f16338b;

    /* renamed from: e, reason: collision with root package name */
    public static final v f16339e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f16340f;

    static {
        u uVar = new u();
        f16338b = uVar;
        v vVar = new v();
        f16339e = vVar;
        f16340f = new y[]{uVar, vVar, new y() { // from class: q8.w
            @Override // q8.z
            public final Number c(y8.a aVar) throws IOException, NumberFormatException {
                String strU = aVar.u();
                try {
                    return Long.valueOf(Long.parseLong(strU));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strU);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f19403e) {
                                throw new y8.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.h(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e10) {
                        StringBuilder sbA = a0.h.A("Cannot parse ", strU, "; at path ");
                        sbA.append(aVar.h(true));
                        throw new androidx.fragment.app.y(sbA.toString(), e10);
                    }
                }
            }
        }, new y() { // from class: q8.x
            @Override // q8.z
            public final Number c(y8.a aVar) throws IOException {
                String strU = aVar.u();
                try {
                    return new BigDecimal(strU);
                } catch (NumberFormatException e10) {
                    StringBuilder sbA = a0.h.A("Cannot parse ", strU, "; at path ");
                    sbA.append(aVar.h(true));
                    throw new androidx.fragment.app.y(sbA.toString(), e10);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f16340f.clone();
    }
}