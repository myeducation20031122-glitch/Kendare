package v6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final t[] f18463a = new t[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f18464b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f18465c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f18466d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f18467e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f18468f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final t f18469g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f18470h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f18471i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f18472j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f18473k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18474l = true;

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18463a[i10] = new t();
            this.f18464b[i10] = new Matrix();
            this.f18465c[i10] = new Matrix();
        }
    }

    public final void a(j jVar, float f10, RectF rectF, p5.g gVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        float fCenterX;
        float f11;
        Path path2;
        p5.g gVar2;
        int i11;
        float f12;
        float f13;
        l lVar = this;
        p5.g gVar3 = gVar;
        Path path3 = path;
        path.rewind();
        Path path4 = lVar.f18467e;
        path4.rewind();
        Path path5 = lVar.f18468f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            i10 = 4;
            matrixArr = lVar.f18465c;
            fArr = lVar.f18470h;
            matrixArr2 = lVar.f18464b;
            tVarArr = lVar.f18463a;
            if (i12 >= 4) {
                break;
            }
            c cVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? jVar.f18455f : jVar.f18454e : jVar.f18457h : jVar.f18456g;
            c4.c cVar2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? jVar.f18451b : jVar.f18450a : jVar.f18453d : jVar.f18452c;
            t tVar = tVarArr[i12];
            cVar2.getClass();
            cVar2.j(f10, cVar.a(rectF), tVar);
            int i13 = i12 + 1;
            float f14 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = lVar.f18466d;
            if (i12 == 1) {
                i11 = i13;
                f12 = rectF.right;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    f12 = rectF.right;
                    i11 = i13;
                } else {
                    i11 = i13;
                    f12 = rectF.left;
                }
                f13 = rectF.top;
                pointF.set(f12, f13);
                matrixArr2[i12].setTranslate(pointF.x, pointF.y);
                matrixArr2[i12].preRotate(f14);
                t tVar2 = tVarArr[i12];
                fArr[0] = tVar2.f18495c;
                fArr[1] = tVar2.f18496d;
                matrixArr2[i12].mapPoints(fArr);
                matrixArr[i12].reset();
                matrixArr[i12].setTranslate(fArr[0], fArr[1]);
                matrixArr[i12].preRotate(f14);
                i12 = i11;
            } else {
                i11 = i13;
                f12 = rectF.left;
            }
            f13 = rectF.bottom;
            pointF.set(f12, f13);
            matrixArr2[i12].setTranslate(pointF.x, pointF.y);
            matrixArr2[i12].preRotate(f14);
            t tVar22 = tVarArr[i12];
            fArr[0] = tVar22.f18495c;
            fArr[1] = tVar22.f18496d;
            matrixArr2[i12].mapPoints(fArr);
            matrixArr[i12].reset();
            matrixArr[i12].setTranslate(fArr[0], fArr[1]);
            matrixArr[i12].preRotate(f14);
            i12 = i11;
        }
        int i14 = 0;
        while (i14 < i10) {
            t tVar3 = tVarArr[i14];
            fArr[0] = tVar3.f18493a;
            fArr[1] = tVar3.f18494b;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 0) {
                path3.moveTo(fArr[0], fArr[1]);
            } else {
                path3.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i14].b(matrixArr2[i14], path3);
            if (gVar3 != null) {
                t tVar4 = tVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                BitSet bitSet = ((g) gVar3.f15951b).f18443j;
                tVar4.getClass();
                bitSet.set(i14, false);
                s[] sVarArr = ((g) gVar3.f15951b).f18441e;
                tVar4.a(tVar4.f18498f);
                sVarArr[i14] = new m(new ArrayList(tVar4.f18500h), new Matrix(matrix));
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            t tVar5 = tVarArr[i14];
            fArr[0] = tVar5.f18495c;
            fArr[1] = tVar5.f18496d;
            matrixArr2[i14].mapPoints(fArr);
            t tVar6 = tVarArr[i16];
            float f15 = tVar6.f18493a;
            float[] fArr2 = lVar.f18471i;
            fArr2[0] = f15;
            fArr2[1] = tVar6.f18494b;
            matrixArr2[i16].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i14];
            fArr[0] = tVar7.f18495c;
            fArr[1] = tVar7.f18496d;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 1 || i14 == 3) {
                fCenterX = rectF.centerX();
                f11 = fArr[0];
            } else {
                fCenterX = rectF.centerY();
                f11 = fArr[1];
            }
            Math.abs(fCenterX - f11);
            t tVar8 = lVar.f18469g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            (i14 != 1 ? i14 != 2 ? i14 != 3 ? jVar.f18459j : jVar.f18458i : jVar.f18461l : jVar.f18460k).getClass();
            tVar8.c(fMax, 0.0f);
            Path path6 = lVar.f18472j;
            path6.reset();
            tVar8.b(matrixArr[i14], path6);
            if (lVar.f18474l && (lVar.b(path6, i14) || lVar.b(path6, i16))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = tVar8.f18493a;
                fArr[1] = tVar8.f18494b;
                matrixArr[i14].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i14], path4);
                gVar2 = gVar;
                path2 = path;
            } else {
                path2 = path;
                tVar8.b(matrixArr[i14], path2);
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                Matrix matrix2 = matrixArr[i14];
                ((g) gVar2.f15951b).f18443j.set(i14 + 4, false);
                s[] sVarArr2 = ((g) gVar2.f15951b).f18442f;
                tVar8.a(tVar8.f18498f);
                sVarArr2[i14] = new m(new ArrayList(tVar8.f18500h), new Matrix(matrix2));
            }
            lVar = this;
            path3 = path2;
            i14 = i15;
            i10 = 4;
            gVar3 = gVar2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f18473k;
        path2.reset();
        this.f18463a[i10].b(this.f18464b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}