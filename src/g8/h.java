package g8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.onesignal.v0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13093a;

    public h(Context context, String str) {
        this.f13093a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j10 = this.f13093a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f13093a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f13093a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f13093a.edit().putStringSet(key, hashSet).putLong("fire-count", j10 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f13093a.edit();
            for (Map.Entry<String, ?> entry : this.f13093a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    editorEdit.remove(entry.getKey());
                }
            }
            editorEdit.remove("fire-count");
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f13093a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(new a(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.f(v0.i(v0.j(v0.h(new Date(j10)), v0.l())), v0.m());
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f13093a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    public final synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f13093a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    public final synchronized void h(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f13093a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f13093a.edit().remove(strE) : this.f13093a.edit().putStringSet(strE, hashSet)).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j10) {
        return j(j10);
    }

    public final synchronized boolean j(long j10) {
        if (!this.f13093a.contains("fire-global")) {
            this.f13093a.edit().putLong("fire-global", j10).commit();
            return true;
        }
        if (f(this.f13093a.getLong("fire-global", -1L), j10)) {
            return false;
        }
        this.f13093a.edit().putLong("fire-global", j10).commit();
        return true;
    }

    public final synchronized void k(long j10, String str) {
        try {
            String strD = d(j10);
            if (this.f13093a.getString("last-used-date", "").equals(strD)) {
                return;
            }
            long j11 = this.f13093a.getLong("fire-count", 0L);
            if (j11 + 1 == 30) {
                a();
                j11 = this.f13093a.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.f13093a.getStringSet(str, new HashSet()));
            hashSet.add(strD);
            this.f13093a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", strD).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l(long j10) {
        this.f13093a.edit().putLong("fire-global", j10).commit();
    }
}