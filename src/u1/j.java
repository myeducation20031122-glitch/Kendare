package u1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f18175a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18176b;

    /* renamed from: c, reason: collision with root package name */
    public float f18177c;

    /* renamed from: d, reason: collision with root package name */
    public float f18178d;

    /* renamed from: e, reason: collision with root package name */
    public float f18179e;

    /* renamed from: f, reason: collision with root package name */
    public float f18180f;

    /* renamed from: g, reason: collision with root package name */
    public float f18181g;

    /* renamed from: h, reason: collision with root package name */
    public float f18182h;

    /* renamed from: i, reason: collision with root package name */
    public float f18183i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f18184j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18185k;

    /* renamed from: l, reason: collision with root package name */
    public String f18186l;

    public j() {
        this.f18175a = new Matrix();
        this.f18176b = new ArrayList();
        this.f18177c = 0.0f;
        this.f18178d = 0.0f;
        this.f18179e = 0.0f;
        this.f18180f = 1.0f;
        this.f18181g = 1.0f;
        this.f18182h = 0.0f;
        this.f18183i = 0.0f;
        this.f18184j = new Matrix();
        this.f18186l = null;
    }

    @Override // u1.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18176b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u1.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f18176b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.f18184j;
        matrix.reset();
        matrix.postTranslate(-this.f18178d, -this.f18179e);
        matrix.postScale(this.f18180f, this.f18181g);
        matrix.postRotate(this.f18177c, 0.0f, 0.0f);
        matrix.postTranslate(this.f18182h + this.f18178d, this.f18183i + this.f18179e);
    }

    public String getGroupName() {
        return this.f18186l;
    }

    public Matrix getLocalMatrix() {
        return this.f18184j;
    }

    public float getPivotX() {
        return this.f18178d;
    }

    public float getPivotY() {
        return this.f18179e;
    }

    public float getRotation() {
        return this.f18177c;
    }

    public float getScaleX() {
        return this.f18180f;
    }

    public float getScaleY() {
        return this.f18181g;
    }

    public float getTranslateX() {
        return this.f18182h;
    }

    public float getTranslateY() {
        return this.f18183i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f18178d) {
            this.f18178d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f18179e) {
            this.f18179e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f18177c) {
            this.f18177c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f18180f) {
            this.f18180f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f18181g) {
            this.f18181g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f18182h) {
            this.f18182h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f18183i) {
            this.f18183i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, t.b bVar) {
        h hVar;
        this.f18175a = new Matrix();
        this.f18176b = new ArrayList();
        this.f18177c = 0.0f;
        this.f18178d = 0.0f;
        this.f18179e = 0.0f;
        this.f18180f = 1.0f;
        this.f18181g = 1.0f;
        this.f18182h = 0.0f;
        this.f18183i = 0.0f;
        Matrix matrix = new Matrix();
        this.f18184j = matrix;
        this.f18186l = null;
        this.f18177c = jVar.f18177c;
        this.f18178d = jVar.f18178d;
        this.f18179e = jVar.f18179e;
        this.f18180f = jVar.f18180f;
        this.f18181g = jVar.f18181g;
        this.f18182h = jVar.f18182h;
        this.f18183i = jVar.f18183i;
        String str = jVar.f18186l;
        this.f18186l = str;
        this.f18185k = jVar.f18185k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f18184j);
        ArrayList arrayList = jVar.f18176b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f18176b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f18165f = 0.0f;
                    iVar2.f18167h = 1.0f;
                    iVar2.f18168i = 1.0f;
                    iVar2.f18169j = 0.0f;
                    iVar2.f18170k = 1.0f;
                    iVar2.f18171l = 0.0f;
                    iVar2.f18172m = Paint.Cap.BUTT;
                    iVar2.f18173n = Paint.Join.MITER;
                    iVar2.f18174o = 4.0f;
                    iVar2.f18164e = iVar.f18164e;
                    iVar2.f18165f = iVar.f18165f;
                    iVar2.f18167h = iVar.f18167h;
                    iVar2.f18166g = iVar.f18166g;
                    iVar2.f18189c = iVar.f18189c;
                    iVar2.f18168i = iVar.f18168i;
                    iVar2.f18169j = iVar.f18169j;
                    iVar2.f18170k = iVar.f18170k;
                    iVar2.f18171l = iVar.f18171l;
                    iVar2.f18172m = iVar.f18172m;
                    iVar2.f18173n = iVar.f18173n;
                    iVar2.f18174o = iVar.f18174o;
                    hVar = iVar2;
                } else {
                    if (!(obj instanceof h)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    hVar = new h((h) obj);
                }
                this.f18176b.add(hVar);
                Object obj2 = hVar.f18188b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}