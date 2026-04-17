package jc;

import a0.g;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x0;
import g.p;
import ic.e;
import m0.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class c extends j {
    public final void n(String str, String str2, String str3, int i, int i2, String... strArr) {
        x0 supportFragmentManager;
        b bVar = (b) this;
        Object obj = ((j) bVar).b;
        switch (bVar.e) {
            case 0:
                supportFragmentManager = ((p) obj).getSupportFragmentManager();
                break;
            default:
                supportFragmentManager = ((Fragment) obj).getChildFragmentManager();
                break;
        }
        if (supportFragmentManager.B("RationaleDialogFragmentCompat") instanceof e) {
            Log.d("BSPermissionsHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        e eVar = new e();
        eVar.setArguments(new g(str2, str3, str, i, i2, strArr).e());
        if (supportFragmentManager.J()) {
            return;
        }
        eVar.k(supportFragmentManager, "RationaleDialogFragmentCompat");
    }
}