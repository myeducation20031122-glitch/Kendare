package g5;

import android.content.Context;
import androidx.emoji2.text.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f13049b;

    /* renamed from: a, reason: collision with root package name */
    public o f13050a;

    static {
        b bVar = new b();
        bVar.f13050a = null;
        f13049b = bVar;
    }

    public static o a(Context context) {
        o oVar;
        b bVar = f13049b;
        synchronized (bVar) {
            try {
                if (bVar.f13050a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f13050a = new o(context);
                }
                oVar = bVar.f13050a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}