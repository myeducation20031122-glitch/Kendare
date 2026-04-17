package w2;

import android.util.Log;
import g.v0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18557b;

    /* renamed from: e, reason: collision with root package name */
    public Object f18558e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18559f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f18560j;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f18557b = i10;
        this.f18559f = obj;
        this.f18560j = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        int i10 = this.f18557b;
        Object obj = this.f18560j;
        switch (i10) {
            case 0:
                ((v0) obj).getClass();
                return InputStream.class;
            default:
                return ((j) obj).a();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() throws IOException {
        int i10 = this.f18557b;
        Object obj = this.f18560j;
        switch (i10) {
            case 0:
                try {
                    Object obj2 = this.f18558e;
                    ((v0) obj).getClass();
                    ((InputStream) obj2).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            default:
                Object obj3 = this.f18558e;
                if (obj3 != null) {
                    try {
                        ((j) obj).w(obj3);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
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
        int i10 = this.f18557b;
        Object obj = this.f18559f;
        Object obj2 = this.f18560j;
        switch (i10) {
            case 0:
                try {
                    ((v0) obj2).getClass();
                    ByteArrayInputStream byteArrayInputStreamR = v0.r((String) obj);
                    this.f18558e = byteArrayInputStreamR;
                    dVar.g(byteArrayInputStreamR);
                    break;
                } catch (IllegalArgumentException e10) {
                    dVar.e(e10);
                }
            default:
                try {
                    Object objQ = ((j) obj2).q((File) obj);
                    this.f18558e = objQ;
                    dVar.g(objQ);
                    break;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar.e(e11);
                    return;
                }
        }
    }
}