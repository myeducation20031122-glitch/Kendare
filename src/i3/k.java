package i3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13297a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f13298b;

    /* renamed from: c, reason: collision with root package name */
    public long f13299c;

    public k(long j10) {
        this.f13298b = j10;
    }

    public final synchronized Object a(Object obj) {
        j jVar;
        jVar = (j) this.f13297a.get(obj);
        return jVar != null ? jVar.f13295a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j10 = iB;
        if (j10 >= this.f13298b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f13299c += j10;
        }
        j jVar = (j) this.f13297a.put(obj, obj2 == null ? null : new j(obj2, iB));
        if (jVar != null) {
            this.f13299c -= jVar.f13296b;
            if (!jVar.f13295a.equals(obj2)) {
                c(obj, jVar.f13295a);
            }
        }
        e(this.f13298b);
        return jVar != null ? jVar.f13295a : null;
    }

    public final synchronized void e(long j10) {
        while (this.f13299c > j10) {
            Iterator it = this.f13297a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getValue();
            this.f13299c -= jVar.f13296b;
            Object key = entry.getKey();
            it.remove();
            c(key, jVar.f13295a);
        }
    }
}