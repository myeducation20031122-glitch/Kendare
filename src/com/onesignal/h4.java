package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11856a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f11857b;

    /* renamed from: c, reason: collision with root package name */
    public static final g4 f11858c;

    static {
        String simpleName = z3.class.getSimpleName();
        f11856a = simpleName;
        HashMap map = new HashMap();
        f11857b = map;
        map.put(simpleName, new HashMap());
        f11857b.put("GTPlayerPurchases", new HashMap());
        f11857b.put("OneSignalTriggers", new HashMap());
        g4 g4Var = new g4("OSH_WritePrefs");
        g4Var.f11840e = 0L;
        f11858c = g4Var;
    }

    public static Object a(String str, String str2, Class cls, Object obj) {
        HashMap map = (HashMap) f11857b.get(str);
        synchronized (map) {
            try {
                if (cls.equals(Object.class) && map.containsKey(str2)) {
                    return Boolean.TRUE;
                }
                Object obj2 = map.get(str2);
                if (obj2 == null && !map.containsKey(str2)) {
                    SharedPreferences sharedPreferencesD = d(str);
                    if (sharedPreferencesD == null) {
                        return obj;
                    }
                    if (cls.equals(String.class)) {
                        return sharedPreferencesD.getString(str2, (String) obj);
                    }
                    if (cls.equals(Boolean.class)) {
                        return Boolean.valueOf(sharedPreferencesD.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    }
                    if (cls.equals(Integer.class)) {
                        return Integer.valueOf(sharedPreferencesD.getInt(str2, ((Integer) obj).intValue()));
                    }
                    if (cls.equals(Long.class)) {
                        return Long.valueOf(sharedPreferencesD.getLong(str2, ((Long) obj).longValue()));
                    }
                    if (cls.equals(Set.class)) {
                        return sharedPreferencesD.getStringSet(str2, (Set) obj);
                    }
                    if (cls.equals(Object.class)) {
                        return Boolean.valueOf(sharedPreferencesD.contains(str2));
                    }
                    return null;
                }
                return obj2;
            } finally {
            }
        }
    }

    public static boolean b(String str, String str2, boolean z7) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z7))).booleanValue();
    }

    public static int c(int i10, String str) {
        return ((Integer) a(f11856a, str, Integer.class, Integer.valueOf(i10))).intValue();
    }

    public static synchronized SharedPreferences d(String str) {
        Context context = z3.f12248b;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        z3.b(y3.f12231j, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
        return null;
    }

    public static String e(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set f(String str, HashSet hashSet) {
        return (Set) a(f11856a, str, Set.class, hashSet);
    }

    public static void g(Object obj, String str, String str2) {
        HashMap map = (HashMap) f11857b.get(str);
        synchronized (map) {
            map.put(str2, obj);
        }
        i();
    }

    public static void h(String str, String str2, boolean z7) {
        g(Boolean.valueOf(z7), str, str2);
    }

    public static void i() {
        g4 g4Var = f11858c;
        synchronized (g4Var) {
            if (z3.f12248b == null) {
                return;
            }
            if (!g4Var.f11841f) {
                g4Var.start();
                g4Var.f11841f = true;
            }
            g4Var.a();
        }
    }
}