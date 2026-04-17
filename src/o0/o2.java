package o0;

import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class o2 extends n2 {
    @Override // g8.e
    public final void G(boolean z7) {
        if (!z7) {
            K(8192);
            return;
        }
        Window window = this.f15594e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}