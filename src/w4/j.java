package w4;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.qu;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.e2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l4.b0;
import org.json.JSONException;
import org.json.JSONObject;
import x5.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public static j f18673f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18674a;

    /* renamed from: b, reason: collision with root package name */
    public int f18675b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18676c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18677d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18678e;

    public j() {
        this.f18674a = 3;
        this.f18676c = null;
        this.f18677d = null;
        this.f18675b = 0;
        this.f18678e = new Object();
    }

    public static synchronized j d(Context context) {
        try {
            if (f18673f == null) {
                f18673f = new j(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new n.c("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18673f;
    }

    public final e2 a() {
        e2 e2Var;
        Object obj = this.f18678e;
        if (((j) obj) == null) {
            e2Var = null;
        } else {
            j jVar = (j) obj;
            e2Var = new e2(jVar.f18675b, (String) jVar.f18676c, (String) jVar.f18677d, null, null);
        }
        return new e2(this.f18675b, (String) this.f18676c, (String) this.f18677d, e2Var, null);
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f18678e) {
            try {
                if (this.f18675b != 0) {
                    t.l((HandlerThread) this.f18676c, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f18676c) == null) {
                    b0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f18676c = handlerThread;
                    handlerThread.start();
                    this.f18677d = new bu0(((HandlerThread) this.f18676c).getLooper(), 0);
                    b0.k("Looper thread started.");
                } else {
                    b0.k("Resuming the looper thread");
                    this.f18678e.notifyAll();
                }
                this.f18675b++;
                looper = ((HandlerThread) this.f18676c).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f18675b);
        jSONObject.put("Message", (String) this.f18676c);
        jSONObject.put("Domain", (String) this.f18677d);
        j jVar = (j) this.f18678e;
        jSONObject.put("Cause", jVar == null ? "null" : jVar.c());
        return jSONObject;
    }

    public final synchronized int e() {
        int i10;
        i10 = this.f18675b;
        this.f18675b = i10 + 1;
        return i10;
    }

    public final synchronized s f(h hVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!((g) this.f18678e).d(hVar)) {
                g gVar = new g(this);
                this.f18678e = gVar;
                gVar.d(hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar.f18670b.f19011a;
    }

    public String toString() {
        switch (this.f18674a) {
            case QueueFuseable.SYNC /* 1 */:
                try {
                    return c().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public j(int i10, String str, String str2, j jVar) {
        this.f18674a = 1;
        this.f18675b = i10;
        this.f18676c = str;
        this.f18677d = str2;
        this.f18678e = jVar;
    }

    public j(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f18674a = 0;
        this.f18678e = new g(this);
        this.f18675b = 1;
        this.f18677d = scheduledExecutorService;
        this.f18676c = context.getApplicationContext();
    }

    public j(qu quVar) throws k4.e {
        this.f18674a = 2;
        this.f18677d = quVar.getLayoutParams();
        ViewParent parent = quVar.getParent();
        this.f18676c = quVar.Q();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new k4.e("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f18678e = viewGroup;
        this.f18675b = viewGroup.indexOfChild(quVar.g());
        ((ViewGroup) this.f18678e).removeView(quVar.g());
        quVar.u0(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str, int i10, String str2) {
        this(i10, str, str2, null);
        this.f18674a = 1;
    }
}