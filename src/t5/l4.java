package t5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final b4 f17485a;

    public l4(b4 b4Var) {
        this.f17485a = b4Var;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        b4 b4Var = this.f17485a;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.o();
        if (b4Var.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        q3Var.W.g(string);
        b4.g(q3Var);
        b4Var.Q.getClass();
        q3Var.X.c(System.currentTimeMillis());
    }

    public final boolean b() {
        b4 b4Var = this.f17485a;
        if (!TextUtils.isEmpty(b4Var.f17238e)) {
            return false;
        }
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        return Log.isLoggable(i3Var.B(), 3);
    }

    public final boolean c() {
        q3 q3Var = this.f17485a.f17250u;
        b4.g(q3Var);
        return q3Var.X.zza() > 0;
    }

    public final boolean d() {
        if (!c()) {
            return false;
        }
        b4 b4Var = this.f17485a;
        b4Var.Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        return jCurrentTimeMillis - q3Var.X.zza() > b4Var.f17249t.u(null, a3.R);
    }

    public l4(b4 b4Var, int i10) {
        this.f17485a = b4Var;
    }
}