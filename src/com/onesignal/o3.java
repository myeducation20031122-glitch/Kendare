package com.onesignal;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12044a = b(24);

    public static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new o1("decorViewReady:" + runnable, runnable, 7));
    }

    public static int b(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int[] c(Activity activity) {
        float fE;
        float fB;
        DisplayCutout cutout;
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
        View viewFindViewById = activity.getWindow().findViewById(R.id.content);
        float top = (r0.top - viewFindViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - r0.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            fE = 0.0f;
            fB = 0.0f;
        } else {
            fE = a3.a.e(cutout) / Resources.getSystem().getDisplayMetrics().density;
            fB = a3.a.B(cutout) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(fE), Math.round(fB)};
    }

    public static int d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            int height = decorView.getHeight();
            return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
        }
        if (activity.getResources().getConfiguration().orientation == 2) {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.height();
        }
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static boolean e(Activity activity) {
        boolean z7 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z7;
        }
        return z7 && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    public static boolean f(WeakReference weakReference) {
        View decorView;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        return decorView != null && displayMetrics.heightPixels - rect.bottom > f12044a;
    }
}