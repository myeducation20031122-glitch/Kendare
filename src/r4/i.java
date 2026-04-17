package r4;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f16485b;

    public i(j jVar) {
        this.f16485b = jVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f16485b) {
            try {
                int size = size();
                j jVar = this.f16485b;
                if (size <= jVar.f16486a) {
                    return false;
                }
                jVar.f16491f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.f16485b.f16486a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}