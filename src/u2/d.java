package u2;

import com.google.android.gms.internal.measurement.n3;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f18231a = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final e f18232b;

    public d(e eVar) {
        this.f18232b = eVar;
    }

    public final o2.c a() {
        e eVar = this.f18232b;
        File cacheDir = eVar.f18233b.getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else {
            String str = eVar.f18234e;
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.isDirectory() && !cacheDir.mkdirs()) {
            return null;
        }
        o2.c cVar = new o2.c();
        cVar.f15674m = new n3(22);
        cVar.f15673j = cacheDir;
        cVar.f15670b = this.f18231a;
        cVar.f15672f = new n3(23);
        return cVar;
    }
}