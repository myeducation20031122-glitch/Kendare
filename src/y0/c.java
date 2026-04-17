package y0;

import java.nio.ByteBuffer;
import v6.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f19189a;

    /* renamed from: b, reason: collision with root package name */
    public int f19190b;

    /* renamed from: c, reason: collision with root package name */
    public int f19191c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19192d;

    public c() {
        if (e.f18415e == null) {
            e.f18415e = new e(8);
        }
    }

    public final int a(int i10) {
        if (i10 < this.f19191c) {
            return ((ByteBuffer) this.f19192d).getShort(this.f19190b + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f19192d = byteBuffer;
        if (byteBuffer != null) {
            this.f19189a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f19190b = i11;
            s10 = ((ByteBuffer) this.f19192d).getShort(i11);
        } else {
            s10 = 0;
            this.f19189a = 0;
            this.f19190b = 0;
        }
        this.f19191c = s10;
    }
}