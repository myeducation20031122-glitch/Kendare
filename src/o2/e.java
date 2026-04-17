package o2;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends ByteArrayOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i10) {
        super(i10);
        this.f15684b = fVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
            i10--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f15684b.f15686e.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}