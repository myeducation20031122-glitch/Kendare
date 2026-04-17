package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f5b;

    /* renamed from: c, reason: collision with root package name */
    public int f6c;

    /* renamed from: d, reason: collision with root package name */
    public float f7d;

    /* renamed from: e, reason: collision with root package name */
    public String f8e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9f;

    /* renamed from: g, reason: collision with root package name */
    public int f10g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f5b = bVar.f5b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f170d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i10 = 0;
        boolean z7 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i10 = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i10 = 4;
            } else {
                if (index == 7) {
                    dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                } else if (index == 4) {
                    dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i10 = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i10 = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i10 = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i10 = 8;
                }
                objValueOf = Float.valueOf(dimension);
                i10 = 7;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f5b = i10;
            bVar.f4a = z7;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (v.h.b(this.f5b)) {
            case 0:
            case y4.g.NETWORK_ERROR /* 7 */:
                this.f6c = ((Integer) obj).intValue();
                break;
            case QueueFuseable.SYNC /* 1 */:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                this.f7d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f10g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f8e = (String) obj;
                break;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                this.f9f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}