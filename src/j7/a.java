package j7;

import a0.h;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.x0;
import java.util.List;
import java.util.Map;
import t5.w4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f13839a;

    public a(j1 j1Var) {
        this.f13839a = j1Var;
    }

    @Override // t5.w4
    public final void I(String str) {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        j1Var.b(new x0(j1Var, str, 1));
    }

    @Override // t5.w4
    public final void a(String str) {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        j1Var.b(new x0(j1Var, str, 0));
    }

    @Override // t5.w4
    public final void b(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        j1Var.b(new t0(j1Var, str, str2, bundle, 0));
    }

    @Override // t5.w4
    public final List c(String str, String str2) {
        return this.f13839a.f(str, str2);
    }

    @Override // t5.w4
    public final Map d(String str, String str2, boolean z7) {
        return this.f13839a.g(str, str2, z7);
    }

    @Override // t5.w4
    public final void e(Bundle bundle) {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        j1Var.b(new s0(j1Var, bundle, 0));
    }

    @Override // t5.w4
    public final void f(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        j1Var.b(new d1(j1Var, str, str2, bundle, true));
    }

    @Override // t5.w4
    public final int zza(String str) {
        return this.f13839a.c(str);
    }

    @Override // t5.w4
    public final long zzb() {
        return this.f13839a.d();
    }

    @Override // t5.w4
    public final String zzh() {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        return (String) f0.T(h.l(j1Var, new f0(), 1, 50L), String.class);
    }

    @Override // t5.w4
    public final String zzi() {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        return (String) f0.T(h.l(j1Var, new f0(), 4, 500L), String.class);
    }

    @Override // t5.w4
    public final String zzj() {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        return (String) f0.T(h.l(j1Var, new f0(), 3, 500L), String.class);
    }

    @Override // t5.w4
    public final String zzk() {
        j1 j1Var = this.f13839a;
        j1Var.getClass();
        return (String) f0.T(h.l(j1Var, new f0(), 0, 500L), String.class);
    }
}