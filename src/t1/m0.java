package t1;

import android.os.Build;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class m0 extends k0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f17056i = true;

    @Override // i7.a
    public void j(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.j(view, i10);
        } else if (f17056i) {
            try {
                l0.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f17056i = false;
            }
        }
    }
}