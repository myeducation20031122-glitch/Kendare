package v4;

import android.content.Context;
import android.content.SharedPreferences;
import fc.t;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f18394c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f18395d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f18396a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f18397b;

    public a(Context context) {
        this.f18397b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        t.k(context);
        ReentrantLock reentrantLock = f18394c;
        reentrantLock.lock();
        try {
            if (f18395d == null) {
                f18395d = new a(context.getApplicationContext());
            }
            a aVar = f18395d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final String b(String str) {
        ReentrantLock reentrantLock = this.f18396a;
        reentrantLock.lock();
        try {
            return this.f18397b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}