package b3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.y;
import q2.n;
import q2.p;
import s2.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final List f1887a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1888b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.h f1889c;

    public j(List list, a aVar, t2.h hVar) {
        this.f1887a = list;
        this.f1888b = aVar;
        this.f1889c = hVar;
    }

    @Override // q2.p
    public final e0 a(Object obj, int i10, int i11, n nVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f1888b.a(ByteBuffer.wrap(byteArray), i10, i11, nVar);
    }

    @Override // q2.p
    public final boolean b(Object obj, n nVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) nVar.c(i.f1886b)).booleanValue()) {
            if (y.p(this.f1889c, inputStream, this.f1887a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}