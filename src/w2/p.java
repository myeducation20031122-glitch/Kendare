package w2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p implements m {

    /* renamed from: b, reason: collision with root package name */
    public final Map f18576b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f18577c;

    public p(Map map) {
        this.f18576b = Collections.unmodifiableMap(map);
    }

    @Override // w2.m
    public final Map a() {
        if (this.f18577c == null) {
            synchronized (this) {
                try {
                    if (this.f18577c == null) {
                        this.f18577c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f18577c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f18576b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((o) list.get(i10)).f18575a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f18576b.equals(((p) obj).f18576b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18576b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f18576b + '}';
    }
}