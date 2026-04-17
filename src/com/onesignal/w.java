package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.ads.c01;
import com.google.android.gms.internal.ads.cd;
import com.google.android.gms.internal.ads.dd;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e11;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.eq0;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.internal.ads.gc;
import com.google.android.gms.internal.ads.gd;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.kf0;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.nd;
import com.google.android.gms.internal.ads.ox0;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.sq0;
import com.google.android.gms.internal.ads.tq0;
import com.google.android.gms.internal.ads.uw;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zc;
import com.google.android.gms.internal.ads.zr;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w implements l.z, c01, eq0, p6.p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f12210b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12211e;

    public /* synthetic */ w(int i10) {
        if (i10 == 3) {
            this.f12211e = new SparseBooleanArray();
            return;
        }
        int i11 = 0;
        if (i10 != 8) {
            this.f12211e = new Handler(Looper.getMainLooper(), new s2.h0(i11));
        } else {
            this.f12211e = new ArrayList();
            this.f12210b = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    @Override // p6.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0.m2 a(View view, o0.m2 m2Var, k4.j jVar) {
        boolean z7;
        o0.j2 j2Var = m2Var.f15585a;
        h0.c cVarF = j2Var.f(7);
        h0.c cVarF2 = j2Var.f(32);
        ((BottomSheetBehavior) this.f12211e).f11379w = cVarF.f13145b;
        boolean zM = com.bumptech.glide.f.m(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f12211e;
        if (bottomSheetBehavior.f11371o) {
            bottomSheetBehavior.f11378v = m2Var.a();
            paddingBottom = jVar.f14006d + ((BottomSheetBehavior) this.f12211e).f11378v;
        }
        BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) this.f12211e;
        boolean z10 = bottomSheetBehavior2.f11372p;
        int i10 = cVarF.f13144a;
        if (z10) {
            paddingLeft = (zM ? jVar.f14005c : jVar.f14003a) + i10;
        }
        boolean z11 = bottomSheetBehavior2.f11373q;
        int i11 = cVarF.f13146c;
        if (z11) {
            paddingRight = (zM ? jVar.f14003a : jVar.f14005c) + i11;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior) this.f12211e;
        boolean z12 = true;
        if (!bottomSheetBehavior3.f11375s || marginLayoutParams.leftMargin == i10) {
            z7 = false;
        } else {
            marginLayoutParams.leftMargin = i10;
            z7 = true;
        }
        if (!bottomSheetBehavior3.f11376t || marginLayoutParams.rightMargin == i11) {
            z12 = z7;
        } else {
            marginLayoutParams.rightMargin = i11;
        }
        if (bottomSheetBehavior3.f11377u) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = cVarF.f13145b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
            } else if (z12) {
            }
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z13 = this.f12210b;
        if (z13) {
            ((BottomSheetBehavior) this.f12211e).f11369m = cVarF2.f13147d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = (BottomSheetBehavior) this.f12211e;
        if (bottomSheetBehavior4.f11371o || z13) {
            bottomSheetBehavior4.J();
        }
        return m2Var;
    }

    public synchronized void b(s2.e0 e0Var, boolean z7) {
        try {
            if (this.f12210b || z7) {
                ((Handler) this.f12211e).obtainMessage(1, e0Var).sendToTarget();
            } else {
                this.f12210b = true;
                e0Var.d();
                this.f12210b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(int i10) {
        com.bumptech.glide.f.N(!this.f12210b);
        ((SparseBooleanArray) this.f12211e).append(i10, true);
    }

    @Override // l.z
    public void d(l.o oVar, boolean z7) {
        m.o oVar2;
        if (this.f12210b) {
            return;
        }
        this.f12210b = true;
        ActionMenuView actionMenuView = ((g.w0) this.f12211e).f12911a.f14873a.f723b;
        if (actionMenuView != null && (oVar2 = actionMenuView.W) != null) {
            oVar2.c();
            m.i iVar = oVar2.X;
            if (iVar != null && iVar.b()) {
                iVar.f14431j.dismiss();
            }
        }
        ((g.w0) this.f12211e).f12912b.onPanelClosed(108, oVar);
        this.f12210b = false;
    }

    public void e(com.google.android.gms.internal.play_billing.e3 e3Var) {
        if (this.f12210b) {
            com.google.android.gms.internal.play_billing.r.e("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            o3.f fVar = (o3.f) this.f12211e;
            o3.a aVar = new o3.a(e3Var, o3.d.f15696b, null);
            q.d dVar = (q.d) fVar;
            dVar.getClass();
            dVar.f(aVar, new o0.h(8));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.r.e("BillingLogger", "logging failed.");
        }
    }

    public com.google.android.gms.internal.ads.t1 f() {
        com.bumptech.glide.f.N(!this.f12210b);
        this.f12210b = true;
        return new com.google.android.gms.internal.ads.t1((SparseBooleanArray) this.f12211e);
    }

    public synchronized void g() {
        boolean z7 = false;
        while (!this.f12210b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean h() {
        boolean z7;
        z7 = this.f12210b;
        this.f12210b = false;
        return z7;
    }

    public void i() {
        Iterator it = ((List) this.f12211e).iterator();
        while (it.hasNext()) {
            ((e11) it.next()).f3881a = false;
        }
    }

    public synchronized boolean j() {
        if (this.f12210b) {
            return false;
        }
        this.f12210b = true;
        notifyAll();
        return true;
    }

    @Override // l.z
    public boolean l(l.o oVar) {
        ((g.w0) this.f12211e).f12912b.onMenuOpened(108, oVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.eq0
    /* renamed from: zza */
    public Object mo11zza(Object obj) {
        m.s3 s3Var = (m.s3) this.f12211e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f12210b) {
            ((Context) s3Var.f14927b).deleteDatabase("OfflineUpload.db");
            return null;
        }
        s3Var.getClass();
        long j10 = 0;
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4740k7)).booleanValue()) {
            sq0 sq0VarB = sq0.b("oa_upload");
            sq0VarB.a("oa_failed_reqs", String.valueOf(com.bumptech.glide.d.I(sQLiteDatabase, 0)));
            sq0VarB.a("oa_total_reqs", String.valueOf(com.bumptech.glide.d.I(sQLiteDatabase, 1)));
            i4.k.A.f13355j.getClass();
            sq0VarB.a("oa_upload_time", String.valueOf(System.currentTimeMillis()));
            Cursor cursorI0 = com.bumptech.glide.d.i0(sQLiteDatabase, 2);
            if (cursorI0.getCount() > 0) {
                cursorI0.moveToNext();
                j10 = cursorI0.getLong(cursorI0.getColumnIndexOrThrow("value"));
            }
            cursorI0.close();
            sq0VarB.a("oa_last_successful_time", String.valueOf(j10));
            sq0VarB.a("oa_session_id", ((l4.e0) ((l4.d0) s3Var.f14933t)).p() ? "" : (String) s3Var.f14931m);
            ((tq0) s3Var.f14932n).a(sq0VarB);
            ArrayList arrayListA0 = com.bumptech.glide.d.a0(sQLiteDatabase);
            m.s3.h(sQLiteDatabase, arrayListA0);
            int size = arrayListA0.size();
            for (int i10 = 0; i10 < size; i10++) {
                cd cdVar = (cd) arrayListA0.get(i10);
                sq0 sq0VarB2 = sq0.b("oa_signals");
                sq0VarB2.a("oa_session_id", ((l4.e0) ((l4.d0) s3Var.f14933t)).p() ? "" : (String) s3Var.f14931m);
                zc zcVarC = cdVar.C();
                String strValueOf = zcVarC.y() ? String.valueOf(zcVarC.A() - 1) : "-1";
                String string = new ox0(cdVar.G()).toString();
                sq0VarB2.a("oa_sig_ts", String.valueOf(cdVar.B()));
                sq0VarB2.a("oa_sig_status", String.valueOf(cdVar.S() - 1));
                sq0VarB2.a("oa_sig_resp_lat", String.valueOf(cdVar.A()));
                sq0VarB2.a("oa_sig_render_lat", String.valueOf(cdVar.z()));
                sq0VarB2.a("oa_sig_formats", string);
                sq0VarB2.a("oa_sig_nw_type", strValueOf);
                sq0VarB2.a("oa_sig_wifi", String.valueOf(cdVar.T() - 1));
                sq0VarB2.a("oa_sig_airplane", String.valueOf(cdVar.P() - 1));
                sq0VarB2.a("oa_sig_data", String.valueOf(cdVar.Q() - 1));
                sq0VarB2.a("oa_sig_nw_resp", String.valueOf(cdVar.y()));
                sq0VarB2.a("oa_sig_offline", String.valueOf(cdVar.R() - 1));
                sq0VarB2.a("oa_sig_nw_state", String.valueOf(cdVar.F().f4288b));
                if (zcVarC.x() && zcVarC.y() && zcVarC.A() == 2) {
                    sq0VarB2.a("oa_sig_cell_type", String.valueOf(zcVarC.z() - 1));
                }
                ((tq0) s3Var.f14932n).a(sq0VarB2);
            }
        } else {
            ArrayList arrayListA02 = com.bumptech.glide.d.a0(sQLiteDatabase);
            dd ddVarV = gd.v();
            String packageName = ((Context) s3Var.f14927b).getPackageName();
            ddVarV.f();
            gd.A((gd) ddVarV.f3329e, packageName);
            String str = Build.MODEL;
            ddVarV.f();
            gd.B((gd) ddVarV.f3329e, str);
            int I = com.bumptech.glide.d.I(sQLiteDatabase, 0);
            ddVarV.f();
            gd.x((gd) ddVarV.f3329e, I);
            ddVarV.f();
            gd.w((gd) ddVarV.f3329e, arrayListA02);
            int I2 = com.bumptech.glide.d.I(sQLiteDatabase, 1);
            ddVarV.f();
            gd.y((gd) ddVarV.f3329e, I2);
            int I3 = com.bumptech.glide.d.I(sQLiteDatabase, 3);
            ddVarV.f();
            gd.D((gd) ddVarV.f3329e, I3);
            i4.k.A.f13355j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ddVarV.f();
            gd.z((gd) ddVarV.f3329e, jCurrentTimeMillis);
            Cursor cursorI02 = com.bumptech.glide.d.i0(sQLiteDatabase, 2);
            if (cursorI02.getCount() > 0) {
                cursorI02.moveToNext();
                j10 = cursorI02.getLong(cursorI02.getColumnIndexOrThrow("value"));
            }
            cursorI02.close();
            ddVarV.f();
            gd.C((gd) ddVarV.f3329e, j10);
            gd gdVar = (gd) ddVarV.d();
            m.s3.h(sQLiteDatabase, arrayListA02);
            ((qb) s3Var.f14928e).a(new k8(gdVar, 18));
            md mdVarV = nd.v();
            int i11 = ((zr) s3Var.f14930j).f10588e;
            mdVarV.f();
            nd.w((nd) mdVarV.f3329e, i11);
            int i12 = ((zr) s3Var.f14930j).f10589f;
            mdVarV.f();
            nd.x((nd) mdVarV.f3329e, i12);
            int i13 = true == ((zr) s3Var.f14930j).f10590j ? 0 : 2;
            mdVarV.f();
            nd.y((nd) mdVarV.f3329e, i13);
            ((qb) s3Var.f14928e).a(new uw((nd) mdVarV.d(), 12));
            ((qb) s3Var.f14928e).b(10004);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        com.bumptech.glide.d.k0(sQLiteDatabase, "failed_requests");
        com.bumptech.glide.d.k0(sQLiteDatabase, "total_requests");
        com.bumptech.glide.d.k0(sQLiteDatabase, "completed_requests");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.c01
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        ArrayList arrayList;
        Iterator it;
        gc gcVar;
        Bundle bundle = (Bundle) obj;
        if (((l4.e0) ((l4.d0) ((kf0) this.f12211e).f12806b)).p()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            listAsList = Arrays.asList((String[]) obj2);
        } else {
            listEmptyList = Collections.emptyList();
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (true) {
                int i10 = 1;
                if (it.hasNext()) {
                    fd fdVar = (fd) kf0.f5963u.get(dq0.D("network", dq0.D("device", bundle)).getInt("active_network_state", -1), fd.UNSPECIFIED);
                    kf0 kf0Var = (kf0) this.f12211e;
                    wc wcVarV = zc.v();
                    int i11 = bundle.getInt("cnt", -2);
                    int i12 = bundle.getInt("gnt", 0);
                    if (i11 == -1) {
                        kf0Var.f5968t = 2;
                    } else {
                        kf0Var.f5968t = 1;
                        if (i11 == 0) {
                            wcVarV.f();
                            zc.B((zc) wcVarV.f3329e, 2);
                        } else if (i11 != 1) {
                            wcVarV.f();
                            zc.B((zc) wcVarV.f3329e, 1);
                        } else {
                            wcVarV.f();
                            zc.B((zc) wcVarV.f3329e, 3);
                        }
                        switch (i12) {
                            case QueueFuseable.SYNC /* 1 */:
                            case 2:
                            case 4:
                            case y4.g.NETWORK_ERROR /* 7 */:
                            case 11:
                            case y4.g.CANCELED /* 16 */:
                                i10 = 2;
                                break;
                            case 3:
                            case y4.g.INVALID_ACCOUNT /* 5 */:
                            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            case 8:
                            case 9:
                            case y4.g.DEVELOPER_ERROR /* 10 */:
                            case 12:
                            case y4.g.INTERRUPTED /* 14 */:
                            case y4.g.TIMEOUT /* 15 */:
                            case y4.g.API_NOT_CONNECTED /* 17 */:
                                i10 = 3;
                                break;
                            case y4.g.ERROR /* 13 */:
                                i10 = 5;
                                break;
                        }
                        wcVarV.f();
                        zc.C((zc) wcVarV.f3329e, i10);
                    }
                    ((e60) ((kf0) this.f12211e).f12807e).b(new androidx.emoji2.text.v(this, this.f12210b, arrayList, (zc) wcVarV.d(), fdVar));
                    return;
                }
                String str = (String) it.next();
                str.getClass();
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            i10 = 0;
                            break;
                        } else {
                            i10 = -1;
                            break;
                        }
                    case -1052618729:
                        if (!str.equals("native")) {
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            i10 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            i10 = 3;
                            break;
                        }
                        break;
                }
                switch (i10) {
                    case 0:
                        gcVar = gc.BANNER;
                        break;
                    case QueueFuseable.SYNC /* 1 */:
                        gcVar = gc.NATIVE_APP_INSTALL;
                        break;
                    case 2:
                        gcVar = gc.REWARD_BASED_VIDEO_AD;
                        break;
                    case 3:
                        gcVar = gc.INTERSTITIAL;
                        break;
                    default:
                        gcVar = gc.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(gcVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (true) {
            int i102 = 1;
            if (it.hasNext()) {
            }
            arrayList.add(gcVar);
        }
    }

    public /* synthetic */ w(Object obj, boolean z7) {
        this.f12211e = obj;
        this.f12210b = z7;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public void zza(Throwable th) {
        wr.d("Failed to get signals bundle");
    }
}