package u1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f18191p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f18192a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f18193b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f18194c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f18195d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f18196e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f18197f;

    /* renamed from: g, reason: collision with root package name */
    public final j f18198g;

    /* renamed from: h, reason: collision with root package name */
    public float f18199h;

    /* renamed from: i, reason: collision with root package name */
    public float f18200i;

    /* renamed from: j, reason: collision with root package name */
    public float f18201j;

    /* renamed from: k, reason: collision with root package name */
    public float f18202k;

    /* renamed from: l, reason: collision with root package name */
    public int f18203l;

    /* renamed from: m, reason: collision with root package name */
    public String f18204m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f18205n;

    /* renamed from: o, reason: collision with root package name */
    public final t.b f18206o;

    public m() {
        this.f18194c = new Matrix();
        this.f18199h = 0.0f;
        this.f18200i = 0.0f;
        this.f18201j = 0.0f;
        this.f18202k = 0.0f;
        this.f18203l = 255;
        this.f18204m = null;
        this.f18205n = null;
        this.f18206o = new t.b();
        this.f18198g = new j();
        this.f18192a = new Path();
        this.f18193b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        jVar.f18175a.set(matrix);
        Matrix matrix2 = jVar.f18175a;
        matrix2.preConcat(jVar.f18184j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = jVar.f18176b;
            if (i13 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i10, i11);
            } else {
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f11 = i10 / this.f18201j;
                    float f12 = i11 / this.f18202k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix3 = this.f18194c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i12 = i13;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f18192a;
                        lVar.getClass();
                        path.reset();
                        h0.g[] gVarArr = lVar.f18187a;
                        if (gVarArr != null) {
                            h0.g.b(gVarArr, path);
                        }
                        Path path2 = this.f18193b;
                        path2.reset();
                        if (lVar instanceof h) {
                            path2.setFillType(lVar.f18189c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f14 = iVar.f18169j;
                            if (f14 != 0.0f || iVar.f18170k != 1.0f) {
                                float f15 = iVar.f18171l;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (iVar.f18170k + f15) % 1.0f;
                                if (this.f18197f == null) {
                                    this.f18197f = new PathMeasure();
                                }
                                this.f18197f.setPath(path, false);
                                float length = this.f18197f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f18197f.getSegment(f18, length, path, true);
                                    f10 = 0.0f;
                                    this.f18197f.getSegment(0.0f, f19, path, true);
                                } else {
                                    f10 = 0.0f;
                                    this.f18197f.getSegment(f18, f19, path, true);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix3);
                            g0.d dVar = iVar.f18166g;
                            if ((((Shader) dVar.f12951e) == null && dVar.f12950b == 0) ? false : true) {
                                if (this.f18196e == null) {
                                    Paint paint = new Paint(1);
                                    this.f18196e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f18196e;
                                Object obj = dVar.f12951e;
                                if (((Shader) obj) != null) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f18168i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = dVar.f12950b;
                                    float f20 = iVar.f18168i;
                                    PorterDuff.Mode mode = p.M;
                                    paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(iVar.f18189c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            g0.d dVar2 = iVar.f18164e;
                            if (((Shader) dVar2.f12951e) != null || dVar2.f12950b != 0) {
                                if (this.f18195d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f18195d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f18195d;
                                Paint.Join join = iVar.f18173n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f18172m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f18174o);
                                Object obj2 = dVar2.f12951e;
                                if (((Shader) obj2) != null) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f18167h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = dVar2.f12950b;
                                    float f21 = iVar.f18167h;
                                    PorterDuff.Mode mode2 = p.M;
                                    paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f21)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f18165f * fAbs * fMin);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i13 = i12 + 1;
                c10 = 0;
            }
            i12 = i13;
            i13 = i12 + 1;
            c10 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f18203l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f18203l = i10;
    }

    public m(m mVar) {
        this.f18194c = new Matrix();
        this.f18199h = 0.0f;
        this.f18200i = 0.0f;
        this.f18201j = 0.0f;
        this.f18202k = 0.0f;
        this.f18203l = 255;
        this.f18204m = null;
        this.f18205n = null;
        t.b bVar = new t.b();
        this.f18206o = bVar;
        this.f18198g = new j(mVar.f18198g, bVar);
        this.f18192a = new Path(mVar.f18192a);
        this.f18193b = new Path(mVar.f18193b);
        this.f18199h = mVar.f18199h;
        this.f18200i = mVar.f18200i;
        this.f18201j = mVar.f18201j;
        this.f18202k = mVar.f18202k;
        this.f18203l = mVar.f18203l;
        this.f18204m = mVar.f18204m;
        String str = mVar.f18204m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f18205n = mVar.f18205n;
    }
}