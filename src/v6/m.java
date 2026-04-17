package v6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f18475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f18476d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f18475c = arrayList;
        this.f18476d = matrix;
    }

    @Override // v6.s
    public final void a(Matrix matrix, u6.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f18475c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f18476d, aVar, i10, canvas);
        }
    }
}