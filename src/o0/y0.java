package o0;

import android.view.ContentInfo;
import android.view.View;
import com.google.android.gms.internal.ads.wi1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo contentInfoT = gVar.f15544a.t();
        Objects.requireNonNull(contentInfoT);
        ContentInfo contentInfoG = wi1.g(contentInfoT);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoG);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoG ? gVar : new g(new g.u0(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, a0 a0Var) {
        if (a0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new z0(a0Var));
        }
    }
}