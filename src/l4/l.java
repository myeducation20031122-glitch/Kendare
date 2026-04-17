package l4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14620b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14622f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f14623j;

    public l(Context context, String str, boolean z7, boolean z10) {
        this.f14620b = context;
        this.f14621e = str;
        this.f14622f = z7;
        this.f14623j = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = i4.k.A.f13348c;
        AlertDialog.Builder builderE = g0.e(this.f14620b);
        builderE.setMessage(this.f14621e);
        builderE.setTitle(this.f14622f ? "Error" : "Info");
        if (this.f14623j) {
            builderE.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderE.setPositiveButton("Learn More", new f(this, 2));
            builderE.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderE.create().show();
    }
}