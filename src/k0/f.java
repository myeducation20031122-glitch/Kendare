package k0;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, i iVar) {
        configuration.setLocales((LocaleList) iVar.f13944a.b());
    }
}