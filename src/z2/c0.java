package z2;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 implements s2.e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19513b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19514e;

    public c0(File file) {
        this.f19513b = 3;
        if (file == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19514e = file;
    }

    @Override // s2.e0
    public final int b() {
        int i10 = this.f19513b;
        Object obj = this.f19514e;
        switch (i10) {
            case 0:
                return i3.o.c((Bitmap) obj);
            case QueueFuseable.SYNC /* 1 */:
                return ((byte[]) obj).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return i3.o.d(Bitmap.Config.ARGB_8888) * a3.a.z(animatedImageDrawable) * a3.a.a(animatedImageDrawable) * 2;
            default:
                return 1;
        }
    }

    @Override // s2.e0
    public final Class c() {
        switch (this.f19513b) {
            case 0:
                return Bitmap.class;
            case QueueFuseable.SYNC /* 1 */:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.f19514e.getClass();
        }
    }

    @Override // s2.e0
    public final void d() {
        switch (this.f19513b) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f19514e;
                a3.a.u(animatedImageDrawable);
                a3.a.D(animatedImageDrawable);
                break;
        }
    }

    @Override // s2.e0
    public final Object get() {
        int i10 = this.f19513b;
        Object obj = this.f19514e;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            case QueueFuseable.SYNC /* 1 */:
                return (byte[]) obj;
            case 2:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    public /* synthetic */ c0(Object obj, int i10) {
        this.f19513b = i10;
        this.f19514e = obj;
    }

    public c0(byte[] bArr) {
        this.f19513b = 1;
        if (bArr == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f19514e = bArr;
    }
}