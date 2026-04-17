package l4;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.ge;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class m0 extends k0 {
    @Override // w2.k
    public final int p(AudioManager audioManager) {
        return a3.a.b(audioManager);
    }

    @Override // w2.k
    public final void r(final Activity activity) {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.R0)).booleanValue() && i4.k.A.f13352g.c().z() == null && !d2.c.t(activity)) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != a3.a.f(attributes)) {
                a3.a.w(attributes, 1);
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l4.l0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws ExecutionException, InterruptedException, TimeoutException {
                    i4.k kVar = i4.k.A;
                    if (kVar.f13352g.c().z() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        e0 e0VarC = kVar.f13352g.c();
                        if (displayCutout != null) {
                            for (Rect rect : a3.a.q(displayCutout)) {
                                String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(String.valueOf(str));
                            }
                        }
                        e0VarC.c(strConcat);
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != a3.a.f(attributes2)) {
                        a3.a.w(attributes2, 2);
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}