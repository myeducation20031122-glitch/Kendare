package n8;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final long f15456i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15457j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15458a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.volley.toolbox.e f15459b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.b f15460c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f15461d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f15463f;

    /* renamed from: h, reason: collision with root package name */
    public final v f15465h;

    /* renamed from: e, reason: collision with root package name */
    public final t.b f15462e = new t.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f15464g = false;

    public x(FirebaseMessaging firebaseMessaging, com.android.volley.toolbox.e eVar, v vVar, v7.b bVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15461d = firebaseMessaging;
        this.f15459b = eVar;
        this.f15465h = vVar;
        this.f15460c = bVar;
        this.f15458a = context;
        this.f15463f = scheduledExecutorService;
    }

    public static void a(x5.s sVar) throws IOException {
        try {
            j4.b(sVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final void b(String str) throws IOException {
        String strA = this.f15461d.a();
        v7.b bVar = this.f15460c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(bVar.e(bVar.n(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f15461d.a();
        v7.b bVar = this.f15460c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(bVar.e(bVar.n(strA, "/topics/" + str, bundle)));
    }

    public final void e(u uVar) {
        synchronized (this.f15462e) {
            try {
                String str = uVar.f15446c;
                if (this.f15462e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f15462e.getOrDefault(str, null);
                    x5.l lVar = (x5.l) arrayDeque.poll();
                    if (lVar != null) {
                        lVar.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f15462e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z7) {
        this.f15464g = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() throws IOException {
        u uVarA;
        String str;
        char c10;
        String str2;
        while (true) {
            synchronized (this) {
                try {
                    uVarA = this.f15465h.a();
                    if (uVarA == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str3 = uVarA.f15445b;
                int iHashCode = str3.hashCode();
                if (iHashCode != 83) {
                    c10 = (iHashCode == 85 && str3.equals("U")) ? (char) 1 : (char) 65535;
                } else if (str3.equals("S")) {
                    c10 = 0;
                }
                String str4 = uVarA.f15444a;
                if (c10 == 0) {
                    b(str4);
                    if (d()) {
                        str2 = "Subscribe to topic: " + str4 + " succeeded.";
                        Log.d("FirebaseMessaging", str2);
                    }
                } else if (c10 == 1) {
                    c(str4);
                    if (d()) {
                        str2 = "Unsubscribe from topic: " + str4 + " succeeded.";
                        Log.d("FirebaseMessaging", str2);
                    }
                } else if (d()) {
                    str2 = "Unknown topic operation" + uVarA + ".";
                    Log.d("FirebaseMessaging", str2);
                }
                this.f15465h.c(uVarA);
                e(uVarA);
            } catch (IOException e10) {
                if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    str = "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.";
                } else {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    str = "Topic operation failed without exception message. Will retry Topic operation.";
                }
                Log.e("FirebaseMessaging", str);
                return false;
            }
        }
        if (d()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void h(long j10) {
        this.f15463f.schedule(new z(this, this.f15458a, this.f15459b, Math.min(Math.max(30L, 2 * j10), f15456i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f15464g = true;
        }
    }
}