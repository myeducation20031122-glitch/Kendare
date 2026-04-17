package w2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18553b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18554e;

    public /* synthetic */ f(Object obj, int i10) {
        this.f18553b = i10;
        this.f18554e = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f18553b) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f18554e.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return q2.a.f16113b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.d dVar) {
        int i10 = this.f18553b;
        Object obj = this.f18554e;
        switch (i10) {
            case 0:
                try {
                    dVar.g(i3.c.a((File) obj));
                    break;
                } catch (IOException e10) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                    }
                    dVar.e(e10);
                    return;
                }
            default:
                dVar.g(obj);
                break;
        }
    }
}