package o0;

import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p2 extends o2 {
    @Override // g8.e
    public final void F(boolean z7) {
        if (!z7) {
            K(16);
            return;
        }
        Window window = this.f15594e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}