package q8;

import java.io.IOException;
import java.io.StringWriter;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            y8.b bVar = new y8.b(stringWriter);
            bVar.f19416n = true;
            j4.S(this, bVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}