package l0;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import t7.w0;
import t7.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14438b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14438b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b7 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b7 != b10) {
                        return b7 - b10;
                    }
                }
                return 0;
            case QueueFuseable.SYNC /* 1 */:
                return ((y) ((w0) obj)).f17968a.compareTo(((y) ((w0) obj2)).f17968a);
            case 2:
                Charset charset = v7.a.f18501d;
                String name = ((File) obj).getName();
                int i11 = v7.a.f18502e;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            default:
                Charset charset2 = v7.a.f18501d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}