package s9;

import android.util.Log;
import c4.l;
import fc.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends m4.b {
    @Override // c4.c
    public final void k(l lVar) {
        t.m = null;
        Log.e("Admob", "Interstitial failed: " + ((String) lVar.f18676c));
    }

    @Override // c4.c
    public final void l(Object obj) {
        t.m = (m4.a) obj;
        Log.i("Admob", "Interstitial loaded");
    }
}