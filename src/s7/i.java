package s7;

import android.util.Log;
import com.google.android.gms.internal.ads.yl0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements a {

    /* renamed from: j, reason: collision with root package name */
    public static final Charset f16891j = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public final File f16892b;

    /* renamed from: e, reason: collision with root package name */
    public final int f16893e = 65536;

    /* renamed from: f, reason: collision with root package name */
    public h f16894f;

    public i(File file) {
        this.f16892b = file;
    }

    public final void a() {
        File file = this.f16892b;
        if (this.f16894f == null) {
            try {
                this.f16894f = new h(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }

    @Override // s7.a
    public final void b() throws IOException {
        r7.e.a(this.f16894f, "There was a problem closing the Crashlytics log file.");
        this.f16894f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // s7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        yl0 yl0Var;
        byte[] bArr;
        if (this.f16892b.exists()) {
            a();
            h hVar = this.f16894f;
            if (hVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[hVar.l()];
                try {
                    this.f16894f.d(new o5.d(this, bArr2, iArr, 12, (Object) null));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                yl0Var = new yl0(bArr2, iArr[0], 20);
            }
        } else {
            yl0Var = null;
        }
        if (yl0Var == null) {
            bArr = null;
        } else {
            int i10 = yl0Var.f10132e;
            bArr = new byte[i10];
            System.arraycopy((byte[]) yl0Var.f10133f, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, f16891j);
        }
        return null;
    }

    @Override // s7.a
    public final void i(long j10, String str) {
        a();
        int i10 = this.f16893e;
        if (this.f16894f == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i11 = i10 / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f16894f.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f16891j));
            while (!this.f16894f.e() && this.f16894f.l() > i10) {
                this.f16894f.h();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }
}