package e0;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ic1;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class o extends Activity implements androidx.lifecycle.t, o0.m {
    private final t.k extraDataMap = new t.k();
    private final androidx.lifecycle.v lifecycleRegistry = new androidx.lifecycle.v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.f(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.e(decorView, "window.decorView");
        if (com.bumptech.glide.d.o(decorView, event)) {
            return true;
        }
        return com.bumptech.glide.d.p(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.f(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.e(decorView, "window.decorView");
        if (com.bumptech.glide.d.o(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Deprecated
    public <T extends n> T getExtraData(Class<T> extraDataClass) {
        Intrinsics.f(extraDataClass, "extraDataClass");
        ic1.v(this.extraDataMap.getOrDefault(extraDataClass, null));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.n0.f1224e;
        v6.e.p(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.f(outState, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(outState);
    }

    @Deprecated
    public void putExtraData(n extraData) {
        Intrinsics.f(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z7 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z7 = true;
                        break;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
        }
        return !z7;
    }

    @Override // o0.m
    public boolean superDispatchKeyEvent(KeyEvent event) {
        Intrinsics.f(event, "event");
        return super.dispatchKeyEvent(event);
    }
}