package y2;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import q2.m;
import q2.o;
import z2.n;
import z2.p;
import z2.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final v f19226a = v.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f19227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19228c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.b f19229d;

    /* renamed from: e, reason: collision with root package name */
    public final n f19230e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19231f;

    /* renamed from: g, reason: collision with root package name */
    public final o f19232g;

    public b(int i10, int i11, q2.n nVar) {
        this.f19227b = i10;
        this.f19228c = i11;
        this.f19229d = (q2.b) nVar.c(p.f19545f);
        this.f19230e = (n) nVar.c(n.f19543f);
        m mVar = p.f19548i;
        this.f19231f = nVar.c(mVar) != null && ((Boolean) nVar.c(mVar)).booleanValue();
        this.f19232g = (o) nVar.c(p.f19546g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f19226a.b(this.f19227b, this.f19228c, this.f19231f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f19229d == q2.b.f16120e) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f19227b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f19228c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f19230e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        o oVar = this.f19232g;
        if (oVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((oVar == o.f16134b && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}