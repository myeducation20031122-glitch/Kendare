package kc;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a0 extends RuntimeException implements Serializable {
    public final int b;

    public a0(int i, int i2, String str) {
        super(str);
        this.b = i2;
    }

    public a0(int i, int i2, StringBuffer stringBuffer) {
        super(stringBuffer == null ? null : stringBuffer.toString());
        this.b = i2;
    }
}