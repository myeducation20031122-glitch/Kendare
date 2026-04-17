package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final b4 f17603a;

    public s3(w5 w5Var) {
        this.f17603a = w5Var.O;
    }

    public final boolean a() {
        b4 b4Var = this.f17603a;
        try {
            androidx.emoji2.text.o oVarA = g5.b.a(b4Var.f17234b);
            if (oVarA != null) {
                return oVarA.g(128, "com.android.vending").versionCode >= 80837300;
            }
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.Q.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.Q.b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}