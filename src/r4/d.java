package r4;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16474a;

    /* renamed from: b, reason: collision with root package name */
    public String f16475b;

    public d(int i10) {
        this.f16474a = i10;
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return a0.h.G(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", d(this.f16475b, str, objArr));
        }
    }

    public final void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.f16475b, str, objArr), remoteException);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.f16475b, str, objArr));
        }
    }

    public final String toString() {
        switch (this.f16474a) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return "<" + this.f16475b + '>';
            default:
                return super.toString();
        }
    }

    public d(String str, int i10) {
        this.f16474a = i10;
        if (i10 == 5) {
            this.f16475b = str;
            return;
        }
        this.f16475b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public /* synthetic */ d(d dVar) {
        this.f16474a = 0;
        this.f16475b = dVar.f16475b;
    }
}