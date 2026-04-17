package l4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.bc0;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.i01;
import com.google.android.gms.internal.ads.wr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14606a;

    /* renamed from: b, reason: collision with root package name */
    public final ec0 f14607b;

    /* renamed from: c, reason: collision with root package name */
    public String f14608c;

    /* renamed from: d, reason: collision with root package name */
    public String f14609d;

    /* renamed from: e, reason: collision with root package name */
    public String f14610e;

    /* renamed from: f, reason: collision with root package name */
    public String f14611f;

    /* renamed from: h, reason: collision with root package name */
    public final int f14613h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f14614i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f14615j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f14616k;

    /* renamed from: g, reason: collision with root package name */
    public int f14612g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final b f14617l = new b(this, 6);

    public j(Context context) {
        this.f14606a = context;
        this.f14613h = ViewConfiguration.get(context).getScaledTouchSlop();
        i4.k kVar = i4.k.A;
        kVar.f13363r.b();
        this.f14616k = (Handler) kVar.f13363r.f18677d;
        this.f14607b = (ec0) kVar.f13358m.f15095h;
    }

    public static final int e(String str, ArrayList arrayList, boolean z7) {
        if (!z7) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f14612g = 0;
            this.f14614i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f14612g;
        if (i10 == -1) {
            return;
        }
        b bVar = this.f14617l;
        Handler handler = this.f14616k;
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f14612g = 5;
                this.f14615j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(bVar, ((Long) j4.q.f13781d.f13784c.a(ge.Q3)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z7 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z7 |= !d(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z7) {
                    return;
                }
            }
            this.f14612g = -1;
            handler.removeCallbacks(bVar);
        }
    }

    public final void b() {
        Context context = this.f14606a;
        try {
            if (!(context instanceof Activity)) {
                wr.f("Can not create dialog without Activity Context");
                return;
            }
            i4.k kVar = i4.k.A;
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(kVar.f13358m.a())) {
                str = "Creative preview";
            }
            String str2 = true != kVar.f13358m.i() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e("Ad information", arrayList, true);
            final int iE2 = e(str, arrayList, true);
            final int iE3 = e(str2, arrayList, true);
            boolean zBooleanValue = ((Boolean) j4.q.f13781d.f13784c.a(ge.M7)).booleanValue();
            final int iE4 = e("Open ad inspector", arrayList, zBooleanValue);
            final int iE5 = e("Ad inspector settings", arrayList, zBooleanValue);
            AlertDialog.Builder builderE = g0.e(context);
            builderE.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l4.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    final ds dsVar;
                    b bVar;
                    final j jVar = this.f14600b;
                    jVar.getClass();
                    if (i10 != iE) {
                        final int i11 = 0;
                        if (i10 == iE2) {
                            wr.b("Debug mode [Creative Preview] selected.");
                            dsVar = es.f4113a;
                            bVar = new b(jVar, 0);
                        } else if (i10 == iE3) {
                            wr.b("Debug mode [Troubleshooting] selected.");
                            dsVar = es.f4113a;
                            bVar = new b(jVar, 2);
                        } else {
                            int i12 = iE4;
                            ec0 ec0Var = jVar.f14607b;
                            if (i10 == i12) {
                                dsVar = es.f4117e;
                                ds dsVar2 = es.f4113a;
                                if (!ec0Var.f()) {
                                    final int i13 = 1;
                                    dsVar2.execute(new Runnable() { // from class: l4.e
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i14 = i13;
                                            i01 i01Var = dsVar;
                                            j jVar2 = jVar;
                                            switch (i14) {
                                                case 0:
                                                    jVar2.getClass();
                                                    i4.k kVar2 = i4.k.A;
                                                    m2.d dVar = kVar2.f13358m;
                                                    String str3 = jVar2.f14609d;
                                                    String str4 = jVar2.f14610e;
                                                    Context context2 = jVar2.f14606a;
                                                    if (!dVar.g(context2, str3, str4)) {
                                                        kVar2.f13358m.c(context2, jVar2.f14609d, jVar2.f14610e);
                                                        break;
                                                    } else {
                                                        i01Var.execute(new b(jVar2, 1));
                                                        break;
                                                    }
                                                default:
                                                    jVar2.getClass();
                                                    i4.k kVar3 = i4.k.A;
                                                    m2.d dVar2 = kVar3.f13358m;
                                                    String str5 = jVar2.f14609d;
                                                    String str6 = jVar2.f14610e;
                                                    Context context3 = jVar2.f14606a;
                                                    if (!dVar2.g(context3, str5, str6)) {
                                                        kVar3.f13358m.c(context3, jVar2.f14609d, jVar2.f14610e);
                                                        break;
                                                    } else {
                                                        i01Var.execute(new b(jVar2, 5));
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    return;
                                }
                                bVar = new b(jVar, 4);
                            } else {
                                if (i10 != iE5) {
                                    return;
                                }
                                dsVar = es.f4117e;
                                ds dsVar3 = es.f4113a;
                                if (!ec0Var.f()) {
                                    dsVar3.execute(new Runnable() { // from class: l4.e
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i14 = i11;
                                            i01 i01Var = dsVar;
                                            j jVar2 = jVar;
                                            switch (i14) {
                                                case 0:
                                                    jVar2.getClass();
                                                    i4.k kVar2 = i4.k.A;
                                                    m2.d dVar = kVar2.f13358m;
                                                    String str3 = jVar2.f14609d;
                                                    String str4 = jVar2.f14610e;
                                                    Context context2 = jVar2.f14606a;
                                                    if (!dVar.g(context2, str3, str4)) {
                                                        kVar2.f13358m.c(context2, jVar2.f14609d, jVar2.f14610e);
                                                        break;
                                                    } else {
                                                        i01Var.execute(new b(jVar2, 1));
                                                        break;
                                                    }
                                                default:
                                                    jVar2.getClass();
                                                    i4.k kVar3 = i4.k.A;
                                                    m2.d dVar2 = kVar3.f13358m;
                                                    String str5 = jVar2.f14609d;
                                                    String str6 = jVar2.f14610e;
                                                    Context context3 = jVar2.f14606a;
                                                    if (!dVar2.g(context3, str5, str6)) {
                                                        kVar3.f13358m.c(context3, jVar2.f14609d, jVar2.f14610e);
                                                        break;
                                                    } else {
                                                        i01Var.execute(new b(jVar2, 5));
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    return;
                                }
                                bVar = new b(jVar, 3);
                            }
                        }
                        dsVar.execute(bVar);
                        return;
                    }
                    Context context2 = jVar.f14606a;
                    if (!(context2 instanceof Activity)) {
                        wr.f("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = jVar.f14608c;
                    final String str4 = "No debug information";
                    if (!TextUtils.isEmpty(str3)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        g0 g0Var = i4.k.A.f13348c;
                        HashMap mapH = g0.h(uriBuild);
                        for (String str5 : mapH.keySet()) {
                            sb.append(str5);
                            sb.append(" = ");
                            sb.append((String) mapH.get(str5));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str4 = strTrim;
                        }
                    }
                    g0 g0Var2 = i4.k.A.f13348c;
                    AlertDialog.Builder builderE2 = g0.e(context2);
                    builderE2.setMessage(str4);
                    builderE2.setTitle("Ad Information");
                    builderE2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: l4.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i14) {
                            j jVar2 = jVar;
                            jVar2.getClass();
                            g0 g0Var3 = i4.k.A.f13348c;
                            g0.l(jVar2.f14606a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str4), "Share via"));
                        }
                    });
                    builderE2.setNegativeButton("Close", d.f14553b);
                    builderE2.create().show();
                }
            });
            builderE.create().show();
        } catch (WindowManager.BadTokenException e10) {
            b0.l("", e10);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int iE = e("None", arrayList, true);
        final int iE2 = e("Shake", arrayList, true);
        final int iE3 = e("Flick", arrayList, true);
        int iOrdinal = this.f14607b.f3969o.ordinal();
        final int i11 = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        g0 g0Var = i4.k.A.f13348c;
        AlertDialog.Builder builderE = g0.e(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i11);
        builderE.setTitle("Setup gesture");
        builderE.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i11, new f(atomicInteger, 0));
        builderE.setNegativeButton("Dismiss", new f(this, i10));
        builderE.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: l4.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                j jVar = this.f14585b;
                jVar.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i11) {
                    jVar.f14607b.k(atomicInteger2.get() == iE2 ? bc0.f2959e : atomicInteger2.get() == iE3 ? bc0.f2960f : bc0.f2958b, true);
                }
                jVar.b();
            }
        });
        builderE.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l4.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f14599b.b();
            }
        });
        builderE.create().show();
    }

    public final boolean d(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f14614i.x - f10);
        int i10 = this.f14613h;
        return fAbs < ((float) i10) && Math.abs(this.f14614i.y - f11) < ((float) i10) && Math.abs(this.f14615j.x - f12) < ((float) i10) && Math.abs(this.f14615j.y - f13) < ((float) i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f14608c);
        sb.append(",DebugSignal: ");
        sb.append(this.f14611f);
        sb.append(",AFMA Version: ");
        sb.append(this.f14610e);
        sb.append(",Ad Unit ID: ");
        return kc.r.g(sb, this.f14609d, "}");
    }
}