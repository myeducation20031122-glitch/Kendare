package fc;

import kotlin.coroutines.AbstractCoroutineContextElement;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class v {
    public static final /* synthetic */ int a = 0;

    static {
        String property;
        int i = kotlinx.coroutines.internal.r.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            u uVar = u.t;
            return;
        }
        kotlinx.coroutines.scheduling.e eVar = z.a;
        AbstractCoroutineContextElement abstractCoroutineContextElement = kotlinx.coroutines.internal.m.a;
        gc.c cVar = ((gc.c) abstractCoroutineContextElement).n;
        if (abstractCoroutineContextElement instanceof w) {
        } else {
            u uVar2 = u.t;
        }
    }
}