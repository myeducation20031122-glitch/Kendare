package a0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f61a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63c;

    /* renamed from: d, reason: collision with root package name */
    public final float f64d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65e;

    public f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f61a = Float.NaN;
        this.f62b = Float.NaN;
        this.f63c = Float.NaN;
        this.f64d = Float.NaN;
        this.f65e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f176j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f65e);
                this.f65e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f64d = typedArrayObtainStyledAttributes.getDimension(index, this.f64d);
            } else if (index == 2) {
                this.f62b = typedArrayObtainStyledAttributes.getDimension(index, this.f62b);
            } else if (index == 3) {
                this.f63c = typedArrayObtainStyledAttributes.getDimension(index, this.f63c);
            } else if (index == 4) {
                this.f61a = typedArrayObtainStyledAttributes.getDimension(index, this.f61a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}