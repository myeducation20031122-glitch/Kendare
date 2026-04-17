package o2;

import com.bumptech.glide.m;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15662a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f15663b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f15664c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f15665d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15666e;

    /* renamed from: f, reason: collision with root package name */
    public m f15667f;

    /* renamed from: g, reason: collision with root package name */
    public long f15668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f15669h;

    public b(d dVar, String str) {
        this.f15669h = dVar;
        this.f15662a = str;
        int i10 = dVar.f15681t;
        this.f15663b = new long[i10];
        this.f15664c = new File[i10];
        this.f15665d = new File[i10];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i11 = 0; i11 < dVar.f15681t; i11++) {
            sb.append(i11);
            File[] fileArr = this.f15664c;
            String string = sb.toString();
            File file = dVar.f15675b;
            fileArr[i11] = new File(file, string);
            sb.append(".tmp");
            this.f15665d[i11] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j10 : this.f15663b) {
            sb.append(' ');
            sb.append(j10);
        }
        return sb.toString();
    }
}