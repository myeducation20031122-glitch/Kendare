package z2;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t implements q2.f {
    @Override // q2.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // q2.f
    public final int b(InputStream inputStream, t2.h hVar) throws Throwable {
        a1.g gVar = new a1.g(inputStream);
        a1.c cVarC = gVar.c("Orientation");
        int iE = 1;
        if (cVarC != null) {
            try {
                iE = cVarC.e(gVar.f217f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // q2.f
    public final int c(ByteBuffer byteBuffer, t2.h hVar) {
        AtomicReference atomicReference = i3.c.f13284a;
        return b(new i3.a(byteBuffer), hVar);
    }

    @Override // q2.f
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}