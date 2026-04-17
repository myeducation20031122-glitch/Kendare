package a3;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.n3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.y;
import q2.n;
import q2.p;
import s2.e0;
import t2.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286a;

    /* renamed from: b, reason: collision with root package name */
    public final n3 f287b;

    public /* synthetic */ b(n3 n3Var, int i10) {
        this.f286a = i10;
        this.f287b = n3Var;
    }

    @Override // q2.p
    public final e0 a(Object obj, int i10, int i11, n nVar) {
        int i12 = this.f286a;
        n3 n3Var = this.f287b;
        switch (i12) {
            case 0:
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource((ByteBuffer) obj);
                n3Var.getClass();
                return n3.q(sourceCreateSource, i10, i11, nVar);
            default:
                ImageDecoder.Source sourceCreateSource2 = ImageDecoder.createSource(i3.c.b((InputStream) obj));
                n3Var.getClass();
                return n3.q(sourceCreateSource2, i10, i11, nVar);
        }
    }

    @Override // q2.p
    public final boolean b(Object obj, n nVar) {
        int i10 = this.f286a;
        n3 n3Var = this.f287b;
        switch (i10) {
            case 0:
                if (y.o((List) n3Var.f10909e, (ByteBuffer) obj) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
            default:
                List list = (List) n3Var.f10909e;
                if (y.p((h) n3Var.f10910f, (InputStream) obj, list) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
        }
        return false;
    }
}