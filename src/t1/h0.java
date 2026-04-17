package t1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class h0 extends i7.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17043f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f17044g = true;

    public void k(View view, Matrix matrix) {
        if (f17043f) {
            try {
                g0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f17043f = false;
            }
        }
    }

    public void l(View view, Matrix matrix) {
        if (f17044g) {
            try {
                g0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f17044g = false;
            }
        }
    }
}