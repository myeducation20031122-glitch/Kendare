package s9;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f16952a = new HashMap();

    public static Typeface a(Context context) {
        HashMap map = f16952a;
        if (map.containsKey("iskpota.ttf")) {
            return (Typeface) map.get("iskpota.ttf");
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "font/iskpota.ttf");
        map.put("iskpota.ttf", typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }
}