package c4;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.cd;
import com.google.android.gms.internal.ads.ei1;
import com.google.android.gms.internal.ads.eq0;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.qp1;
import com.google.android.gms.internal.ads.u31;
import com.google.android.gms.internal.ads.w0;
import com.google.android.gms.internal.ads.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l4.d0;
import l4.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements aj0, com.google.android.gms.internal.ads.h, com.google.android.gms.internal.ads.i, eq0 {

    /* renamed from: b, reason: collision with root package name */
    public int f2115b;

    /* renamed from: e, reason: collision with root package name */
    public long f2116e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2117f;

    @Override // com.google.android.gms.internal.ads.h
    public void a(int i10) throws EOFException, InterruptedIOException {
        ((qp1) ((com.google.android.gms.internal.ads.h) this.f2117f)).k(i10);
    }

    @Override // com.google.android.gms.internal.ads.h
    public int b() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.h
    public void c(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        ((qp1) ((com.google.android.gms.internal.ads.h) this.f2117f)).i(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.h
    public void f(byte[] bArr, int i10, int i11) {
        ((qp1) ((com.google.android.gms.internal.ads.h) this.f2117f)).l(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.i
    public void g() {
        ((com.google.android.gms.internal.ads.i) this.f2117f).g();
    }

    @Override // com.google.android.gms.internal.ads.h
    public boolean i(byte[] bArr, int i10, int i11, boolean z7) {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).i(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.h
    public int j(byte[] bArr, int i10, int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.i
    public void k(x xVar) {
        ((com.google.android.gms.internal.ads.i) this.f2117f).k(new w0(this, xVar));
    }

    @Override // com.google.android.gms.internal.ads.h
    public boolean l(byte[] bArr, int i10, int i11, boolean z7) {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).l(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.i
    public a0 m(int i10, int i11) {
        return ((com.google.android.gms.internal.ads.i) this.f2117f).m(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public int n(byte[] bArr, int i10, int i11) {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).n(bArr, i10, i11);
    }

    public long o() throws NumberFormatException {
        switch (this.f2115b) {
            case 3:
                Iterator it = ((ArrayList) this.f2117f).iterator();
                while (it.hasNext()) {
                    for (Map.Entry entry : ((u31) it.next()).zze().entrySet()) {
                        try {
                            if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                                this.f2116e = Math.max(this.f2116e, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                            }
                        } catch (RuntimeException unused) {
                        }
                    }
                    it.remove();
                }
                break;
        }
        return this.f2116e;
    }

    public void p(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2117f) == null) {
            this.f2117f = exc;
            this.f2116e = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f2116e) {
            Exception exc2 = (Exception) this.f2117f;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = (Exception) this.f2117f;
            this.f2117f = null;
            throw exc3;
        }
    }

    public boolean q() {
        return ((String) this.f2117f) != null && this.f2116e >= 0;
    }

    @Override // com.google.android.gms.internal.ads.eq0
    /* renamed from: zza */
    public Object mo11zza(Object obj) throws SQLException {
        if0 if0Var = (if0) this.f2117f;
        long j10 = this.f2116e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((e0) ((d0) if0Var.f12806b)).p()) {
            return null;
        }
        bd bdVarD = cd.D();
        bdVarD.f();
        cd.O((cd) bdVarD.f3329e, j10);
        byte[] bArrD = ((cd) bdVarD.d()).d();
        com.bumptech.glide.d.h0(sQLiteDatabase, false, false);
        com.bumptech.glide.d.d0(sQLiteDatabase, j10, bArrD);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h
    public long zzd() {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).zzd() - this.f2116e;
    }

    @Override // com.google.android.gms.internal.ads.h
    public long zze() {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).zze() - this.f2116e;
    }

    @Override // com.google.android.gms.internal.ads.h
    public long zzf() {
        return ((com.google.android.gms.internal.ads.h) this.f2117f).zzf() - this.f2116e;
    }

    @Override // com.google.android.gms.internal.ads.h
    public void zzg(int i10) {
        ((qp1) ((com.google.android.gms.internal.ads.h) this.f2117f)).g(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.h
    public void zzj() {
        ((com.google.android.gms.internal.ads.h) this.f2117f).zzj();
    }

    public /* synthetic */ h(int i10) {
        this.f2115b = i10;
        if (i10 != 5) {
            this.f2117f = new ArrayList();
        } else {
            this.f2117f = null;
            this.f2116e = -1L;
        }
    }

    public /* synthetic */ h(long j10, Object obj, int i10) {
        this.f2115b = i10;
        this.f2116e = j10;
        this.f2117f = obj;
    }

    public /* synthetic */ h(com.google.android.gms.internal.ads.h hVar, long j10) {
        this.f2115b = 1;
        this.f2117f = hVar;
        com.bumptech.glide.f.J(hVar.zzf() >= j10);
        this.f2116e = j10;
    }

    public /* synthetic */ h(Object obj, long j10, int i10) {
        this.f2115b = i10;
        this.f2117f = obj;
        this.f2116e = j10;
    }

    @Override // com.google.android.gms.internal.ads.aj0
    /* renamed from: zza */
    public void mo1zza(Object obj) {
        ((ei1) obj).zzh(this.f2115b);
    }
}