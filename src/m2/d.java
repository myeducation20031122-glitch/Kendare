package m2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.dc0;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.wr;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.e0;
import l4.g0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15088a;

    /* renamed from: b, reason: collision with root package name */
    public String f15089b;

    /* renamed from: c, reason: collision with root package name */
    public String f15090c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15091d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15092e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15093f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f15094g;

    /* renamed from: h, reason: collision with root package name */
    public Object f15095h;

    public d() {
        this.f15088a = 1;
        this.f15093f = new Object();
        this.f15089b = "";
        this.f15090c = "";
        this.f15091d = false;
        this.f15092e = false;
        this.f15094g = "";
    }

    public static void f(Context context, String str, boolean z7, boolean z10) {
        if (context instanceof Activity) {
            g0.f14590i.post(new l4.l(context, str, z7, z10));
        } else {
            wr.f("Can not create dialog without Activity Context");
        }
    }

    public static final String k(Context context, String str, String str2) {
        String strValueOf;
        String str3;
        HashMap map = new HashMap();
        map.put("User-Agent", i4.k.A.f13348c.r(context, str2));
        new l4.u(context);
        l4.s sVarA = l4.u.a(0, str, map, null);
        try {
            return (String) sVarA.f4987b.get(((Integer) j4.q.f13781d.f13784c.a(ge.V3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            strValueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            wr.e(str3.concat(strValueOf), e);
            sVarA.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            e = e11;
            strValueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            wr.e(str3.concat(strValueOf), e);
            sVarA.cancel(true);
            return null;
        } catch (Exception e12) {
            wr.e("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    public final String a() {
        String str;
        switch (this.f15088a) {
            case 0:
                return this.f15089b;
            default:
                synchronized (this.f15093f) {
                    str = this.f15090c;
                }
                return str;
        }
    }

    public final void b(Context context) {
        ec0 ec0Var;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.M7)).booleanValue() || (ec0Var = (ec0) this.f15095h) == null) {
            return;
        }
        ec0Var.d(new l4.k(this, context), dc0.f3606j);
    }

    public final void c(Context context, String str, String str2) {
        g0 g0Var = i4.k.A.f13348c;
        g0.m(context, l(context, (String) j4.q.f13781d.f13784c.a(ge.R3), str, str2));
    }

    public final void d(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = l(context, (String) j4.q.f13781d.f13784c.a(ge.U3), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        g0 g0Var = i4.k.A.f13348c;
        g0.f(context, str, builderBuildUpon.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0028, B:11:0x002e, B:13:0x0034, B:16:0x0039, B:17:0x003d, B:19:0x0043, B:22:0x0049), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0028, B:11:0x002e, B:13:0x0034, B:16:0x0039, B:17:0x003d, B:19:0x0043, B:22:0x0049), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z7) {
        synchronized (this.f15093f) {
            try {
                this.f15092e = z7;
                if (((Boolean) j4.q.f13781d.f13784c.a(ge.M7)).booleanValue()) {
                    i4.k.A.f13352g.c().b(z7);
                    ec0 ec0Var = (ec0) this.f15095h;
                    if (ec0Var != null) {
                        if (!ec0Var.f3972r) {
                            if (z7) {
                                ec0Var.i();
                                if (ec0Var.f3970p) {
                                    ec0Var.n();
                                }
                            }
                            if (!ec0Var.f()) {
                                ec0Var.m();
                            }
                        } else if (z7) {
                            if (ec0Var.f3970p) {
                            }
                        } else if (!ec0Var.f()) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(Context context, String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        ce ceVar = ge.T3;
        j4.q qVar = j4.q.f13781d;
        String strK = k(context, l(context, (String) qVar.f13784c.a(ceVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strK)) {
            wr.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strK.trim()).optString("debug_mode"));
            e(zEquals);
            if (((Boolean) qVar.f13784c.a(ge.M7)).booleanValue()) {
                e0 e0VarC = i4.k.A.f13352g.c();
                if (true != zEquals) {
                    str = "";
                }
                e0VarC.a(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            wr.h("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f15093f) {
            z7 = this.f15092e;
        }
        return z7;
    }

    public final boolean i() {
        boolean z7;
        synchronized (this.f15093f) {
            z7 = this.f15091d;
        }
        return z7;
    }

    public final boolean j(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !i()) {
            return false;
        }
        wr.b("Sending troubleshooting signals to the server.");
        d(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003b, B:14:0x0043, B:16:0x0054, B:19:0x0066, B:11:0x0034, B:20:0x006b, B:21:0x006d), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri l(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f15093f) {
            if (TextUtils.isEmpty(this.f15089b)) {
                g0 g0Var = i4.k.A.f13348c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    g5.a.k(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    wr.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f15089b = str5;
                if (TextUtils.isEmpty(str5)) {
                    g0 g0Var2 = i4.k.A.f13348c;
                    String string = UUID.randomUUID().toString();
                    this.f15089b = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        wr.e("Error writing to file in internal storage.", e10);
                    }
                    str4 = this.f15089b;
                } else {
                    str4 = this.f15089b;
                }
            }
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}