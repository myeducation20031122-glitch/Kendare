package u6;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f18283i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f18284j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f18285k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f18286l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f18287a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f18288b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f18289c;

    /* renamed from: d, reason: collision with root package name */
    public int f18290d;

    /* renamed from: e, reason: collision with root package name */
    public int f18291e;

    /* renamed from: f, reason: collision with root package name */
    public int f18292f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f18293g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f18294h;

    public a() {
        Paint paint = new Paint();
        this.f18294h = paint;
        Paint paint2 = new Paint();
        this.f18287a = paint2;
        this.f18290d = h0.a.d(-16777216, 68);
        this.f18291e = h0.a.d(-16777216, 20);
        this.f18292f = h0.a.d(-16777216, 0);
        paint2.setColor(this.f18290d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f18288b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f18289c = new Paint(paint3);
    }
}