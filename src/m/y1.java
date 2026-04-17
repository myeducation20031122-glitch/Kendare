package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f15009a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f15009a = declaredField;
    }
}