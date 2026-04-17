package r1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f16366d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f16367e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f16370c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f16369b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16368a = new HashMap();

    public a(Context context) {
        this.f16370c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f16366d == null) {
            synchronized (f16367e) {
                try {
                    if (f16366d == null) {
                        f16366d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f16366d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f16370c.getString(2131886122);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f16369b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b(hashSet2, (Class) it2.next());
                }
            } catch (ClassNotFoundException e10) {
                throw new y(e10);
            }
        }
    }

    public final Object b(HashSet hashSet, Class cls) {
        Object objB;
        if (g5.a.u()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f16368a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(hashSet, cls2);
                        }
                    }
                }
                objB = bVar.b(this.f16370c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new y(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}