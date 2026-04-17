package t5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.u8;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i5 extends m3 {

    /* renamed from: f, reason: collision with root package name */
    public final h5 f17427f;

    /* renamed from: j, reason: collision with root package name */
    public c3 f17428j;

    /* renamed from: m, reason: collision with root package name */
    public volatile Boolean f17429m;

    /* renamed from: n, reason: collision with root package name */
    public final e5 f17430n;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.i f17431t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f17432u;

    /* renamed from: w, reason: collision with root package name */
    public final e5 f17433w;

    public i5(b4 b4Var) {
        super(b4Var);
        this.f17432u = new ArrayList();
        this.f17431t = new androidx.recyclerview.widget.i(b4Var.Q);
        this.f17427f = new h5(this);
        this.f17430n = new e5(this, b4Var, 0);
        this.f17433w = new e5(this, b4Var, 1);
    }

    public static void D(i5 i5Var, ComponentName componentName) {
        i5Var.o();
        if (i5Var.f17428j != null) {
            i5Var.f17428j = null;
            i3 i3Var = ((b4) i5Var.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.Q.b(componentName, "Disconnected from device MeasurementService");
            i5Var.o();
            i5Var.E();
        }
    }

    public final void A() {
        o();
        androidx.recyclerview.widget.i iVar = this.f17431t;
        ((e5.b) ((e5.a) iVar.f1472c)).getClass();
        iVar.f1471b = SystemClock.elapsedRealtime();
        ((b4) this.f15046b).getClass();
        this.f17430n.c(((Long) a3.J.a(null)).longValue());
    }

    public final void B(Runnable runnable) {
        o();
        if (u()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f17432u;
        int size = arrayList.size();
        b4 b4Var = (b4) this.f15046b;
        b4Var.getClass();
        if (size >= 1000) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f17433w.c(60000L);
            E();
        }
    }

    public final Boolean C() {
        return this.f17429m;
    }

    public final void E() {
        o();
        p();
        if (u()) {
            return;
        }
        if (x()) {
            this.f17427f.a();
            return;
        }
        if (((b4) this.f15046b).f17249t.C()) {
            return;
        }
        ((b4) this.f15046b).getClass();
        List<ResolveInfo> listQueryIntentServices = ((b4) this.f15046b).f17234b.getPackageManager().queryIntentServices(new Intent().setClassName(((b4) this.f15046b).f17234b, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i3 i3Var = ((b4) this.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Object obj = this.f15046b;
        Context context = ((b4) obj).f17234b;
        ((b4) obj).getClass();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
        h5 h5Var = this.f17427f;
        h5Var.f17385f.o();
        Context context2 = ((b4) h5Var.f17385f.f15046b).f17234b;
        d5.a aVarB = d5.a.b();
        synchronized (h5Var) {
            try {
                if (h5Var.f17383b) {
                    i3 i3Var2 = ((b4) h5Var.f17385f.f15046b).f17251w;
                    b4.i(i3Var2);
                    i3Var2.Q.a("Connection attempt already in progress");
                } else {
                    i3 i3Var3 = ((b4) h5Var.f17385f.f15046b).f17251w;
                    b4.i(i3Var3);
                    i3Var3.Q.a("Using local app measurement service");
                    h5Var.f17383b = true;
                    aVarB.a(context2, intent, h5Var.f17385f.f17427f, 129);
                }
            } finally {
            }
        }
    }

    public final void F() {
        o();
        p();
        h5 h5Var = this.f17427f;
        if (h5Var.f17384e != null && (h5Var.f17384e.a() || h5Var.f17384e.D())) {
            h5Var.f17384e.m();
        }
        h5Var.f17384e = null;
        try {
            d5.a.b().c(((b4) this.f15046b).f17234b, this.f17427f);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17428j = null;
    }

    public final void G(AtomicReference atomicReference) {
        o();
        p();
        B(new l0.a(this, atomicReference, y(false), 23));
    }

    @Override // t5.m3
    public final boolean r() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0206 A[Catch: all -> 0x014c, SQLiteDatabaseLockedException -> 0x0157, SQLiteException -> 0x01e3, SQLiteFullException -> 0x01e6, TryCatch #33 {all -> 0x014c, blocks: (B:40:0x0110, B:42:0x0116, B:44:0x011e, B:46:0x0128, B:50:0x013e, B:52:0x0143, B:165:0x02e3, B:167:0x02e9, B:168:0x02ec, B:176:0x0314, B:184:0x0330, B:72:0x017b, B:73:0x017e, B:71:0x0177, B:81:0x018f, B:83:0x01a3, B:90:0x01be, B:91:0x01c2, B:92:0x01c5, B:88:0x01b8, B:95:0x01c9, B:99:0x01df, B:113:0x0206, B:114:0x020b, B:115:0x020e, B:111:0x0200, B:118:0x0214, B:119:0x0220, B:120:0x0224, B:132:0x0267, B:134:0x0275, B:136:0x0285, B:141:0x0299), top: B:254:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e3 A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #33 {all -> 0x014c, blocks: (B:40:0x0110, B:42:0x0116, B:44:0x011e, B:46:0x0128, B:50:0x013e, B:52:0x0143, B:165:0x02e3, B:167:0x02e9, B:168:0x02ec, B:176:0x0314, B:184:0x0330, B:72:0x017b, B:73:0x017e, B:71:0x0177, B:81:0x018f, B:83:0x01a3, B:90:0x01be, B:91:0x01c2, B:92:0x01c5, B:88:0x01b8, B:95:0x01c9, B:99:0x01df, B:113:0x0206, B:114:0x020b, B:115:0x020e, B:111:0x0200, B:118:0x0214, B:119:0x0220, B:120:0x0224, B:132:0x0267, B:134:0x0275, B:136:0x0285, B:141:0x0299), top: B:254:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x034b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(c3 c3Var, b5.a aVar, d6 d6Var) throws Throwable {
        b4 b4Var;
        int i10;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabaseS;
        String str;
        Cursor cursorQuery;
        int i11;
        int i12;
        Cursor cursor;
        Cursor cursorQuery2;
        long j10;
        String str2;
        String[] strArr;
        Parcel parcelObtain;
        q qVarCreateFromParcel;
        g3 g3Var;
        String str3;
        c cVarCreateFromParcel;
        y5 y5VarCreateFromParcel;
        int size;
        b4 b4Var2;
        i3 i3Var;
        String str4;
        o();
        p();
        ((b4) this.f15046b).getClass();
        b4 b4Var3 = (b4) this.f15046b;
        b4Var3.getClass();
        int i13 = 100;
        int i14 = 0;
        for (int i15 = 100; i14 < 1001 && i13 == i15; i15 = 100) {
            ArrayList arrayList2 = new ArrayList();
            e3 e3VarO = b4Var3.o();
            String str5 = "rowid";
            e3VarO.o();
            if (e3VarO.f17320j) {
                b4Var = b4Var3;
                i10 = i14;
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                b4 b4Var4 = (b4) e3VarO.f15046b;
                Context context = b4Var4.f17234b;
                b4Var4.getClass();
                if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i16 = 5;
                    int i17 = 0;
                    int i18 = 5;
                    while (true) {
                        Object obj = e3VarO.f15046b;
                        if (i17 >= i16) {
                            b4Var = b4Var3;
                            i10 = i14;
                            i3 i3Var2 = ((b4) obj).f17251w;
                            b4.i(i3Var2);
                            i3Var2.f17400w.a("Failed to read events from database in reasonable time");
                            break;
                        }
                        try {
                            sQLiteDatabaseS = e3VarO.s();
                            if (sQLiteDatabaseS == null) {
                                try {
                                    try {
                                        e3VarO.f17320j = true;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseS != null) {
                                            sQLiteDatabaseS.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    i12 = i18;
                                    cursorQuery = null;
                                    SystemClock.sleep(i12);
                                    i18 = i12 + 20;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabaseS != null) {
                                    }
                                    i17++;
                                    str5 = str;
                                    b4Var3 = b4Var;
                                    i14 = i10;
                                    i16 = 5;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    i11 = i18;
                                    cursorQuery = null;
                                    i3 i3Var3 = ((b4) obj).f17251w;
                                    b4.i(i3Var3);
                                    i3Var3.f17397n.b(e, "Error reading entries from local database");
                                    e3VarO.f17320j = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabaseS != null) {
                                    }
                                    i18 = i11;
                                    i17++;
                                    str5 = str;
                                    b4Var3 = b4Var;
                                    i14 = i10;
                                    i16 = 5;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    cursorQuery = null;
                                    if (sQLiteDatabaseS != null) {
                                    }
                                    i3 i3Var4 = ((b4) obj).f17251w;
                                    b4.i(i3Var4);
                                    i3Var4.f17397n.b(e, "Error reading entries from local database");
                                    e3VarO.f17320j = true;
                                    if (cursorQuery != null) {
                                    }
                                    if (sQLiteDatabaseS != null) {
                                    }
                                    i11 = i18;
                                    i18 = i11;
                                    i17++;
                                    str5 = str;
                                    b4Var3 = b4Var;
                                    i14 = i10;
                                    i16 = 5;
                                }
                            } else {
                                sQLiteDatabaseS.beginTransaction();
                                try {
                                    cursorQuery2 = sQLiteDatabaseS.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                } catch (Throwable th2) {
                                    th = th2;
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    cursorQuery2 = null;
                                }
                                try {
                                    long j11 = -1;
                                    if (cursorQuery2.moveToFirst()) {
                                        j10 = cursorQuery2.getLong(0);
                                        cursorQuery2.close();
                                    } else {
                                        cursorQuery2.close();
                                        j10 = -1;
                                    }
                                    if (j10 != -1) {
                                        str2 = "rowid<?";
                                        strArr = new String[]{String.valueOf(j10)};
                                    } else {
                                        str2 = null;
                                        strArr = null;
                                    }
                                    int i19 = 2;
                                    cursorQuery = sQLiteDatabaseS.query("messages", new String[]{str5, "type", "entry"}, str2, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursorQuery.moveToNext()) {
                                        try {
                                            try {
                                                j11 = cursorQuery.getLong(0);
                                                str = str5;
                                                try {
                                                    int i20 = cursorQuery.getInt(1);
                                                    byte[] blob = cursorQuery.getBlob(i19);
                                                    if (i20 == 0) {
                                                        try {
                                                            parcelObtain = Parcel.obtain();
                                                            try {
                                                                i10 = i14;
                                                                try {
                                                                    try {
                                                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain.setDataPosition(0);
                                                                        qVarCreateFromParcel = q.CREATOR.createFromParcel(parcelObtain);
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        throw th;
                                                                    }
                                                                } catch (b5.b unused2) {
                                                                    i3 i3Var5 = ((b4) obj).f17251w;
                                                                    b4.i(i3Var5);
                                                                    i3Var5.f17397n.a("Failed to load event from local database");
                                                                    parcelObtain.recycle();
                                                                    b4Var = b4Var3;
                                                                    i19 = 2;
                                                                    str5 = str;
                                                                    b4Var3 = b4Var;
                                                                    i14 = i10;
                                                                }
                                                            } catch (b5.b unused3) {
                                                                i10 = i14;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i10 = i14;
                                                        } catch (SQLiteFullException e12) {
                                                            e = e12;
                                                            i10 = i14;
                                                        } catch (SQLiteException e13) {
                                                            e = e13;
                                                            i10 = i14;
                                                        }
                                                        try {
                                                            if (qVarCreateFromParcel != null) {
                                                                arrayList3.add(qVarCreateFromParcel);
                                                            }
                                                            b4Var = b4Var3;
                                                            i19 = 2;
                                                            str5 = str;
                                                            b4Var3 = b4Var;
                                                            i14 = i10;
                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                            b4Var = b4Var3;
                                                            i12 = i18;
                                                            SystemClock.sleep(i12);
                                                            i18 = i12 + 20;
                                                            if (cursorQuery != null) {
                                                            }
                                                            if (sQLiteDatabaseS != null) {
                                                            }
                                                            i17++;
                                                            str5 = str;
                                                            b4Var3 = b4Var;
                                                            i14 = i10;
                                                            i16 = 5;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            b4Var = b4Var3;
                                                            i11 = i18;
                                                            i3 i3Var32 = ((b4) obj).f17251w;
                                                            b4.i(i3Var32);
                                                            i3Var32.f17397n.b(e, "Error reading entries from local database");
                                                            e3VarO.f17320j = true;
                                                            if (cursorQuery != null) {
                                                            }
                                                            if (sQLiteDatabaseS != null) {
                                                            }
                                                            i18 = i11;
                                                            i17++;
                                                            str5 = str;
                                                            b4Var3 = b4Var;
                                                            i14 = i10;
                                                            i16 = 5;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            b4Var = b4Var3;
                                                            if (sQLiteDatabaseS != null) {
                                                            }
                                                            i3 i3Var42 = ((b4) obj).f17251w;
                                                            b4.i(i3Var42);
                                                            i3Var42.f17397n.b(e, "Error reading entries from local database");
                                                            e3VarO.f17320j = true;
                                                            if (cursorQuery != null) {
                                                            }
                                                            if (sQLiteDatabaseS != null) {
                                                            }
                                                            i11 = i18;
                                                            i18 = i11;
                                                            i17++;
                                                            str5 = str;
                                                            b4Var3 = b4Var;
                                                            i14 = i10;
                                                            i16 = 5;
                                                        }
                                                    } else {
                                                        i10 = i14;
                                                        if (i20 == 1) {
                                                            parcelObtain = Parcel.obtain();
                                                            try {
                                                                try {
                                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain.setDataPosition(0);
                                                                    y5VarCreateFromParcel = y5.CREATOR.createFromParcel(parcelObtain);
                                                                } finally {
                                                                    parcelObtain.recycle();
                                                                }
                                                            } catch (b5.b unused6) {
                                                                i3 i3Var6 = ((b4) obj).f17251w;
                                                                b4.i(i3Var6);
                                                                i3Var6.f17397n.a("Failed to load user property from local database");
                                                                parcelObtain.recycle();
                                                                y5VarCreateFromParcel = null;
                                                            }
                                                            if (y5VarCreateFromParcel != null) {
                                                                arrayList3.add(y5VarCreateFromParcel);
                                                            }
                                                            b4Var = b4Var3;
                                                            i19 = 2;
                                                            str5 = str;
                                                            b4Var3 = b4Var;
                                                            i14 = i10;
                                                        } else {
                                                            i19 = 2;
                                                            if (i20 == 2) {
                                                                parcelObtain = Parcel.obtain();
                                                                try {
                                                                    b4Var = b4Var3;
                                                                    try {
                                                                        try {
                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain.setDataPosition(0);
                                                                            cVarCreateFromParcel = c.CREATOR.createFromParcel(parcelObtain);
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            throw th;
                                                                        }
                                                                    } catch (b5.b unused7) {
                                                                        i3 i3Var7 = ((b4) obj).f17251w;
                                                                        b4.i(i3Var7);
                                                                        i3Var7.f17397n.a("Failed to load conditional user property from local database");
                                                                        parcelObtain.recycle();
                                                                        cVarCreateFromParcel = null;
                                                                        if (cVarCreateFromParcel != null) {
                                                                        }
                                                                        str5 = str;
                                                                        b4Var3 = b4Var;
                                                                        i14 = i10;
                                                                    }
                                                                } catch (b5.b unused8) {
                                                                    b4Var = b4Var3;
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    b4Var = b4Var3;
                                                                }
                                                                try {
                                                                    if (cVarCreateFromParcel != null) {
                                                                        arrayList3.add(cVarCreateFromParcel);
                                                                    }
                                                                    str5 = str;
                                                                    b4Var3 = b4Var;
                                                                    i14 = i10;
                                                                } catch (SQLiteDatabaseLockedException unused9) {
                                                                    i12 = i18;
                                                                    SystemClock.sleep(i12);
                                                                    i18 = i12 + 20;
                                                                    if (cursorQuery != null) {
                                                                    }
                                                                    if (sQLiteDatabaseS != null) {
                                                                    }
                                                                    i17++;
                                                                    str5 = str;
                                                                    b4Var3 = b4Var;
                                                                    i14 = i10;
                                                                    i16 = 5;
                                                                } catch (SQLiteFullException e16) {
                                                                    e = e16;
                                                                    i11 = i18;
                                                                    i3 i3Var322 = ((b4) obj).f17251w;
                                                                    b4.i(i3Var322);
                                                                    i3Var322.f17397n.b(e, "Error reading entries from local database");
                                                                    e3VarO.f17320j = true;
                                                                    if (cursorQuery != null) {
                                                                    }
                                                                    if (sQLiteDatabaseS != null) {
                                                                    }
                                                                    i18 = i11;
                                                                    i17++;
                                                                    str5 = str;
                                                                    b4Var3 = b4Var;
                                                                    i14 = i10;
                                                                    i16 = 5;
                                                                } catch (SQLiteException e17) {
                                                                    e = e17;
                                                                    if (sQLiteDatabaseS != null) {
                                                                    }
                                                                    i3 i3Var422 = ((b4) obj).f17251w;
                                                                    b4.i(i3Var422);
                                                                    i3Var422.f17397n.b(e, "Error reading entries from local database");
                                                                    e3VarO.f17320j = true;
                                                                    if (cursorQuery != null) {
                                                                    }
                                                                    if (sQLiteDatabaseS != null) {
                                                                    }
                                                                    i11 = i18;
                                                                    i18 = i11;
                                                                    i17++;
                                                                    str5 = str;
                                                                    b4Var3 = b4Var;
                                                                    i14 = i10;
                                                                    i16 = 5;
                                                                }
                                                            } else {
                                                                b4Var = b4Var3;
                                                                if (i20 == 3) {
                                                                    i3 i3Var8 = ((b4) obj).f17251w;
                                                                    b4.i(i3Var8);
                                                                    g3Var = i3Var8.f17400w;
                                                                    str3 = "Skipping app launch break";
                                                                } else {
                                                                    i3 i3Var9 = ((b4) obj).f17251w;
                                                                    b4.i(i3Var9);
                                                                    g3Var = i3Var9.f17397n;
                                                                    str3 = "Unknown record type in local database";
                                                                }
                                                                g3Var.a(str3);
                                                                str5 = str;
                                                                b4Var3 = b4Var;
                                                                i14 = i10;
                                                            }
                                                        }
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused10) {
                                                    b4Var = b4Var3;
                                                    i10 = i14;
                                                } catch (SQLiteFullException e18) {
                                                    e = e18;
                                                    b4Var = b4Var3;
                                                    i10 = i14;
                                                } catch (SQLiteException e19) {
                                                    e = e19;
                                                    b4Var = b4Var3;
                                                    i10 = i14;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabaseS != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused11) {
                                            b4Var = b4Var3;
                                            i10 = i14;
                                            str = str5;
                                        } catch (SQLiteFullException e20) {
                                            e = e20;
                                            b4Var = b4Var3;
                                            i10 = i14;
                                            str = str5;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            b4Var = b4Var3;
                                            i10 = i14;
                                            str = str5;
                                        }
                                    }
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    String[] strArr2 = new String[1];
                                    try {
                                        strArr2[0] = Long.toString(j11);
                                        if (sQLiteDatabaseS.delete("messages", "rowid <= ?", strArr2) < arrayList3.size()) {
                                            i3 i3Var10 = ((b4) obj).f17251w;
                                            b4.i(i3Var10);
                                            i3Var10.f17397n.a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabaseS.setTransactionSuccessful();
                                        sQLiteDatabaseS.endTransaction();
                                        cursorQuery.close();
                                        sQLiteDatabaseS.close();
                                    } catch (SQLiteDatabaseLockedException unused12) {
                                        i12 = i18;
                                        SystemClock.sleep(i12);
                                        i18 = i12 + 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseS != null) {
                                            sQLiteDatabaseS.close();
                                        }
                                        i17++;
                                        str5 = str;
                                        b4Var3 = b4Var;
                                        i14 = i10;
                                        i16 = 5;
                                    } catch (SQLiteFullException e22) {
                                        e = e22;
                                        i11 = i18;
                                        i3 i3Var3222 = ((b4) obj).f17251w;
                                        b4.i(i3Var3222);
                                        i3Var3222.f17397n.b(e, "Error reading entries from local database");
                                        e3VarO.f17320j = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseS != null) {
                                            sQLiteDatabaseS.close();
                                        }
                                        i18 = i11;
                                        i17++;
                                        str5 = str;
                                        b4Var3 = b4Var;
                                        i14 = i10;
                                        i16 = 5;
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                        if (sQLiteDatabaseS != null && sQLiteDatabaseS.inTransaction()) {
                                            sQLiteDatabaseS.endTransaction();
                                        }
                                        i3 i3Var4222 = ((b4) obj).f17251w;
                                        b4.i(i3Var4222);
                                        i3Var4222.f17397n.b(e, "Error reading entries from local database");
                                        e3VarO.f17320j = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseS != null) {
                                            sQLiteDatabaseS.close();
                                        }
                                        i11 = i18;
                                        i18 = i11;
                                        i17++;
                                        str5 = str;
                                        b4Var3 = b4Var;
                                        i14 = i10;
                                        i16 = 5;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    b4Var = b4Var3;
                                    i10 = i14;
                                    str = str5;
                                    if (cursorQuery2 != null) {
                                        try {
                                            cursorQuery2.close();
                                        } catch (SQLiteDatabaseLockedException unused13) {
                                            i12 = i18;
                                            cursorQuery = null;
                                            SystemClock.sleep(i12);
                                            i18 = i12 + 20;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseS != null) {
                                            }
                                            i17++;
                                            str5 = str;
                                            b4Var3 = b4Var;
                                            i14 = i10;
                                            i16 = 5;
                                        } catch (SQLiteFullException e24) {
                                            e = e24;
                                            i11 = i18;
                                            cursorQuery = null;
                                            i3 i3Var32222 = ((b4) obj).f17251w;
                                            b4.i(i3Var32222);
                                            i3Var32222.f17397n.b(e, "Error reading entries from local database");
                                            e3VarO.f17320j = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseS != null) {
                                            }
                                            i18 = i11;
                                            i17++;
                                            str5 = str;
                                            b4Var3 = b4Var;
                                            i14 = i10;
                                            i16 = 5;
                                        } catch (SQLiteException e25) {
                                            e = e25;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseS != null) {
                                                sQLiteDatabaseS.endTransaction();
                                            }
                                            i3 i3Var42222 = ((b4) obj).f17251w;
                                            b4.i(i3Var42222);
                                            i3Var42222.f17397n.b(e, "Error reading entries from local database");
                                            e3VarO.f17320j = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseS != null) {
                                            }
                                            i11 = i18;
                                            i18 = i11;
                                            i17++;
                                            str5 = str;
                                            b4Var3 = b4Var;
                                            i14 = i10;
                                            i16 = 5;
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused14) {
                            b4Var = b4Var3;
                            i10 = i14;
                            str = str5;
                            i12 = i18;
                            cursorQuery = null;
                            sQLiteDatabaseS = null;
                        } catch (SQLiteFullException e26) {
                            e = e26;
                            b4Var = b4Var3;
                            i10 = i14;
                            str = str5;
                            i11 = i18;
                            cursorQuery = null;
                            sQLiteDatabaseS = null;
                        } catch (SQLiteException e27) {
                            e = e27;
                            b4Var = b4Var3;
                            i10 = i14;
                            str = str5;
                            cursorQuery = null;
                            sQLiteDatabaseS = null;
                        } catch (Throwable th9) {
                            th = th9;
                            sQLiteDatabaseS = null;
                        }
                        i17++;
                        str5 = str;
                        b4Var3 = b4Var;
                        i14 = i10;
                        i16 = 5;
                    }
                } else {
                    b4Var = b4Var3;
                    i10 = i14;
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList2.add(aVar);
            }
            int size2 = arrayList2.size();
            int i21 = 0;
            while (i21 < size2) {
                b5.a aVar2 = (b5.a) arrayList2.get(i21);
                if (aVar2 instanceof q) {
                    try {
                        c3Var.c3((q) aVar2, d6Var);
                        b4Var2 = b4Var;
                    } catch (RemoteException e28) {
                        e = e28;
                        b4Var2 = b4Var;
                        i3Var = b4Var2.f17251w;
                        b4.i(i3Var);
                        str4 = "Failed to send event to the service";
                        i3Var.f17397n.b(e, str4);
                        i21++;
                        b4Var = b4Var2;
                    }
                } else {
                    b4Var2 = b4Var;
                    if (aVar2 instanceof y5) {
                        try {
                            c3Var.V((y5) aVar2, d6Var);
                        } catch (RemoteException e29) {
                            e = e29;
                            i3Var = b4Var2.f17251w;
                            b4.i(i3Var);
                            str4 = "Failed to send user property to the service";
                            i3Var.f17397n.b(e, str4);
                            i21++;
                            b4Var = b4Var2;
                        }
                    } else if (aVar2 instanceof c) {
                        try {
                            c3Var.z0((c) aVar2, d6Var);
                        } catch (RemoteException e30) {
                            e = e30;
                            i3Var = b4Var2.f17251w;
                            b4.i(i3Var);
                            str4 = "Failed to send conditional user property to the service";
                            i3Var.f17397n.b(e, str4);
                            i21++;
                            b4Var = b4Var2;
                        }
                    } else {
                        i3 i3Var11 = b4Var2.f17251w;
                        b4.i(i3Var11);
                        i3Var11.f17397n.a("Discarding data. Unrecognized parcel type.");
                    }
                }
                i21++;
                b4Var = b4Var2;
            }
            i14 = i10 + 1;
            i13 = size;
            b4Var3 = b4Var;
        }
    }

    public final void t(c cVar) {
        boolean zW;
        o();
        p();
        b4 b4Var = (b4) this.f15046b;
        b4Var.getClass();
        e3 e3VarO = b4Var.o();
        b4 b4Var2 = (b4) e3VarO.f15046b;
        b6 b6Var = b4Var2.O;
        b4.g(b6Var);
        b6Var.getClass();
        byte[] bArrG0 = b6.g0(cVar);
        if (bArrG0.length > 131072) {
            i3 i3Var = b4Var2.f17251w;
            b4.i(i3Var);
            i3Var.f17398t.a("Conditional user property too long for local database. Sending directly to service");
            zW = false;
        } else {
            zW = e3VarO.w(bArrG0, 2);
        }
        B(new androidx.fragment.app.g(this, y(true), zW, new c(cVar), cVar, 6));
    }

    public final boolean u() {
        o();
        p();
        return this.f17428j != null;
    }

    public final boolean w() {
        o();
        p();
        if (!x()) {
            return true;
        }
        b6 b6Var = ((b4) this.f15046b).O;
        b4.g(b6Var);
        return b6Var.r0() >= ((Integer) a3.f17172e0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x() {
        g3 g3Var;
        String str;
        g3 g3Var2;
        String str2;
        o();
        p();
        if (this.f17429m == null) {
            o();
            p();
            q3 q3Var = ((b4) this.f15046b).f17250u;
            b4.g(q3Var);
            q3Var.o();
            boolean z7 = false;
            Boolean boolValueOf = !q3Var.s().contains("use_service") ? null : Boolean.valueOf(q3Var.s().getBoolean("use_service", false));
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                ((b4) this.f15046b).getClass();
                d3 d3VarN = ((b4) this.f15046b).n();
                d3VarN.p();
                if (d3VarN.N == 1) {
                    z7 = true;
                    if (!z7 && ((b4) this.f15046b).f17249t.C()) {
                        i3 i3Var = ((b4) this.f15046b).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.a("No way to upload. Consider using the full version of Analytics");
                    } else if (z) {
                        q3 q3Var2 = ((b4) this.f15046b).f17250u;
                        b4.g(q3Var2);
                        q3Var2.o();
                        SharedPreferences.Editor editorEdit = q3Var2.s().edit();
                        editorEdit.putBoolean("use_service", z7);
                        editorEdit.apply();
                    }
                    z = z7;
                } else {
                    i3 i3Var2 = ((b4) this.f15046b).f17251w;
                    b4.i(i3Var2);
                    i3Var2.Q.a("Checking service availability");
                    b6 b6Var = ((b4) this.f15046b).O;
                    b4.g(b6Var);
                    b6Var.getClass();
                    int iD = x4.g.f18964b.d(((b4) b6Var.f15046b).f17234b, 12451000);
                    if (iD != 0) {
                        if (iD != 1) {
                            if (iD != 2) {
                                if (iD == 3) {
                                    i3 i3Var3 = ((b4) this.f15046b).f17251w;
                                    b4.i(i3Var3);
                                    g3Var2 = i3Var3.f17400w;
                                    str2 = "Service disabled";
                                } else if (iD == 9) {
                                    i3 i3Var4 = ((b4) this.f15046b).f17251w;
                                    b4.i(i3Var4);
                                    g3Var2 = i3Var4.f17400w;
                                    str2 = "Service invalid";
                                } else if (iD != 18) {
                                    i3 i3Var5 = ((b4) this.f15046b).f17251w;
                                    b4.i(i3Var5);
                                    i3Var5.f17400w.b(Integer.valueOf(iD), "Unexpected service status");
                                } else {
                                    i3 i3Var6 = ((b4) this.f15046b).f17251w;
                                    b4.i(i3Var6);
                                    g3Var = i3Var6.f17400w;
                                    str = "Service updating";
                                }
                                g3Var2.a(str2);
                            } else {
                                i3 i3Var7 = ((b4) this.f15046b).f17251w;
                                b4.i(i3Var7);
                                i3Var7.P.a("Service container out of date");
                                b6 b6Var2 = ((b4) this.f15046b).O;
                                b4.g(b6Var2);
                                if (b6Var2.r0() >= 17443) {
                                    z7 = boolValueOf == null;
                                }
                            }
                            z = false;
                        } else {
                            i3 i3Var8 = ((b4) this.f15046b).f17251w;
                            b4.i(i3Var8);
                            i3Var8.Q.a("Service missing");
                        }
                        if (!z7) {
                            if (z) {
                            }
                            z = z7;
                        }
                    } else {
                        i3 i3Var9 = ((b4) this.f15046b).f17251w;
                        b4.i(i3Var9);
                        g3Var = i3Var9.Q;
                        str = "Service available";
                    }
                    g3Var.a(str);
                    z7 = true;
                    if (!z7) {
                    }
                }
            }
            this.f17429m = Boolean.valueOf(z);
        }
        return this.f17429m.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d6 y(boolean z7) {
        String strG;
        long jS0;
        long j10;
        boolean z10;
        Class<?> clsLoadClass;
        String str;
        String str2;
        g3 g3Var;
        Object objInvoke;
        String str3;
        List list;
        long j11;
        String str4;
        String strU;
        long jAbs;
        Pair pair;
        b4 b4Var = (b4) this.f15046b;
        b4Var.getClass();
        d3 d3VarN = b4Var.n();
        if (z7) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            b4 b4Var2 = (b4) i3Var.f15046b;
            q3 q3Var = b4Var2.f17250u;
            b4.g(q3Var);
            if (q3Var.f17566j == null) {
                strG = null;
            } else {
                q3 q3Var2 = b4Var2.f17250u;
                b4.g(q3Var2);
                o2.c cVar = q3Var2.f17566j;
                ((q3) cVar.f15671e).o();
                ((q3) cVar.f15671e).o();
                long j12 = ((q3) cVar.f15671e).s().getLong((String) cVar.f15672f, 0L);
                if (j12 == 0) {
                    cVar.f();
                    jAbs = 0;
                } else {
                    ((b4) ((q3) cVar.f15671e).f15046b).Q.getClass();
                    jAbs = Math.abs(j12 - System.currentTimeMillis());
                }
                long j13 = cVar.f15670b;
                if (jAbs < j13) {
                    pair = null;
                    if (pair != null) {
                    }
                } else if (jAbs > j13 + j13) {
                    cVar.f();
                    pair = null;
                    if (pair != null && pair != q3.Z) {
                        strG = a0.h.G(String.valueOf(pair.second), ":", (String) pair.first);
                    }
                } else {
                    String string = ((q3) cVar.f15671e).s().getString((String) cVar.f15674m, null);
                    long j14 = ((q3) cVar.f15671e).s().getLong((String) cVar.f15673j, 0L);
                    cVar.f();
                    pair = (string == null || j14 <= 0) ? q3.Z : new Pair(string, Long.valueOf(j14));
                    if (pair != null) {
                        strG = null;
                    }
                }
            }
        }
        d3VarN.o();
        String strT = d3VarN.t();
        String strU2 = d3VarN.u();
        d3VarN.p();
        String str5 = d3VarN.f17294j;
        d3VarN.p();
        long j15 = d3VarN.f17295m;
        d3VarN.p();
        fc.t.k(d3VarN.f17296n);
        String str6 = d3VarN.f17296n;
        Object obj = d3VarN.f15046b;
        b4 b4Var3 = (b4) obj;
        b4Var3.f17249t.t();
        d3VarN.p();
        d3VarN.o();
        long j16 = d3VarN.f17297t;
        b6 b6Var = b4Var3.O;
        if (j16 == 0) {
            b4.g(b6Var);
            Context context = b4Var3.f17234b;
            String packageName = context.getPackageName();
            b6Var.o();
            fc.t.g(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestX = b6.x();
            Object obj2 = b6Var.f15046b;
            if (messageDigestX == null) {
                i3 i3Var2 = ((b4) obj2).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.a("Could not get MD5 instance");
            } else if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e10) {
                    i3 i3Var3 = ((b4) obj2).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.b(e10, "Package name not found");
                }
                if (b6Var.a0(context, packageName)) {
                    jS0 = 0;
                } else {
                    Signature[] signatureArr = g5.b.a(context).g(64, ((b4) obj2).f17234b.getPackageName()).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        i3 i3Var4 = ((b4) obj2).f17251w;
                        b4.i(i3Var4);
                        i3Var4.f17400w.a("Could not get signatures");
                    } else {
                        jS0 = b6.s0(messageDigestX.digest(signatureArr[0].toByteArray()));
                    }
                }
                d3VarN.f17297t = jS0;
            }
            jS0 = -1;
            d3VarN.f17297t = jS0;
        } else {
            jS0 = j16;
        }
        boolean zE = b4Var3.e();
        q3 q3Var3 = b4Var3.f17250u;
        b4.g(q3Var3);
        boolean z11 = !q3Var3.R;
        d3VarN.o();
        boolean zE2 = b4Var3.e();
        f fVar = b4Var3.f17249t;
        if (zE2) {
            ((b9) a9.f10677e.f10678b.zza()).getClass();
            j10 = jS0;
            boolean zY = fVar.y(null, a3.f17164a0);
            i3 i3Var5 = b4Var3.f17251w;
            if (zY) {
                b4.i(i3Var5);
                i3Var5.Q.a("Disabled IID for tests.");
            } else {
                try {
                    clsLoadClass = ((b4) obj).f17234b.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    z10 = zE;
                }
                if (clsLoadClass != null) {
                    z10 = zE;
                    try {
                        str = str6;
                        try {
                            objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, ((b4) obj).f17234b);
                        } catch (Exception unused2) {
                            b4.i(i3Var5);
                            str2 = "Failed to obtain Firebase Analytics instance";
                            g3Var = i3Var5.M;
                            g3Var.a(str2);
                            str3 = null;
                            b4.g(q3Var3);
                            long jZza = q3Var3.f17567m.zza();
                            long j17 = b4Var3.f17246j0;
                            if (jZza != 0) {
                            }
                            d3VarN.p();
                            int i10 = d3VarN.N;
                            Boolean boolX = fVar.x("google_analytics_adid_collection_enabled");
                            if (boolX != null) {
                            }
                            b4.g(q3Var3);
                            q3Var3.o();
                            boolean z12 = q3Var3.s().getBoolean("deferred_analytics_collection", false);
                            d3VarN.p();
                            String str7 = d3VarN.P;
                            if (fVar.x("google_analytics_default_allow_ad_personalization_signals") != null) {
                            }
                            long j18 = d3VarN.f17298u;
                            List list2 = d3VarN.f17299w;
                            b4.g(q3Var3);
                            String strE = q3Var3.u().e();
                            if (d3VarN.M != null) {
                            }
                            String str8 = d3VarN.M;
                            u8.a();
                            if (fVar.y(null, a3.f17204u0)) {
                            }
                            return new d6(strT, strU2, str5, j15, str, 68000L, j10, strG, z10, z11, str3, jMin, i10, z, z12, str7, boolValueOf, j11, list, strE, str8, str4);
                        }
                    } catch (Exception unused3) {
                        str = str6;
                    }
                    if (objInvoke == null) {
                        str3 = null;
                    } else {
                        try {
                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                        } catch (Exception unused4) {
                            b4.i(i3Var5);
                            str2 = "Failed to retrieve Firebase Instance Id";
                            g3Var = i3Var5.N;
                            g3Var.a(str2);
                            str3 = null;
                            b4.g(q3Var3);
                            long jZza2 = q3Var3.f17567m.zza();
                            long j172 = b4Var3.f17246j0;
                            if (jZza2 != 0) {
                            }
                            d3VarN.p();
                            int i102 = d3VarN.N;
                            Boolean boolX2 = fVar.x("google_analytics_adid_collection_enabled");
                            if (boolX2 != null) {
                            }
                            b4.g(q3Var3);
                            q3Var3.o();
                            boolean z122 = q3Var3.s().getBoolean("deferred_analytics_collection", false);
                            d3VarN.p();
                            String str72 = d3VarN.P;
                            if (fVar.x("google_analytics_default_allow_ad_personalization_signals") != null) {
                            }
                            long j182 = d3VarN.f17298u;
                            List list22 = d3VarN.f17299w;
                            b4.g(q3Var3);
                            String strE2 = q3Var3.u().e();
                            if (d3VarN.M != null) {
                            }
                            String str82 = d3VarN.M;
                            u8.a();
                            if (fVar.y(null, a3.f17204u0)) {
                            }
                            return new d6(strT, strU2, str5, j15, str, 68000L, j10, strG, z10, z11, str3, jMin, i102, z, z122, str72, boolValueOf, j11, list, strE2, str82, str4);
                        }
                    }
                    b4.g(q3Var3);
                    long jZza22 = q3Var3.f17567m.zza();
                    long j1722 = b4Var3.f17246j0;
                    long jMin = jZza22 != 0 ? j1722 : Math.min(j1722, jZza22);
                    d3VarN.p();
                    int i1022 = d3VarN.N;
                    Boolean boolX22 = fVar.x("google_analytics_adid_collection_enabled");
                    boolean z13 = boolX22 != null || boolX22.booleanValue();
                    b4.g(q3Var3);
                    q3Var3.o();
                    boolean z1222 = q3Var3.s().getBoolean("deferred_analytics_collection", false);
                    d3VarN.p();
                    String str722 = d3VarN.P;
                    Boolean boolValueOf = fVar.x("google_analytics_default_allow_ad_personalization_signals") != null ? null : Boolean.valueOf(!r6.booleanValue());
                    long j1822 = d3VarN.f17298u;
                    List list222 = d3VarN.f17299w;
                    b4.g(q3Var3);
                    String strE22 = q3Var3.u().e();
                    if (d3VarN.M != null) {
                        list = list222;
                        if (fVar.y(null, a3.f17214z0)) {
                            b4.g(b6Var);
                            strU = b6Var.u();
                        } else {
                            strU = "";
                        }
                        d3VarN.M = strU;
                    } else {
                        list = list222;
                    }
                    String str822 = d3VarN.M;
                    u8.a();
                    if (fVar.y(null, a3.f17204u0)) {
                        j11 = j1822;
                        str4 = null;
                    } else {
                        d3VarN.o();
                        j11 = j1822;
                        if (d3VarN.R != 0) {
                            b4Var3.Q.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - d3VarN.R;
                            if (d3VarN.Q != null && jCurrentTimeMillis > 86400000 && d3VarN.S == null) {
                                d3VarN.w();
                            }
                        }
                        if (d3VarN.Q == null) {
                            d3VarN.w();
                        }
                        str4 = d3VarN.Q;
                    }
                    return new d6(strT, strU2, str5, j15, str, 68000L, j10, strG, z10, z11, str3, jMin, i1022, z13, z1222, str722, boolValueOf, j11, list, strE22, str822, str4);
                }
            }
            z10 = zE;
        } else {
            z10 = zE;
            j10 = jS0;
        }
        str = str6;
        str3 = null;
        b4.g(q3Var3);
        long jZza222 = q3Var3.f17567m.zza();
        long j17222 = b4Var3.f17246j0;
        if (jZza222 != 0) {
        }
        d3VarN.p();
        int i10222 = d3VarN.N;
        Boolean boolX222 = fVar.x("google_analytics_adid_collection_enabled");
        if (boolX222 != null) {
        }
        b4.g(q3Var3);
        q3Var3.o();
        boolean z12222 = q3Var3.s().getBoolean("deferred_analytics_collection", false);
        d3VarN.p();
        String str7222 = d3VarN.P;
        if (fVar.x("google_analytics_default_allow_ad_personalization_signals") != null) {
        }
        long j18222 = d3VarN.f17298u;
        List list2222 = d3VarN.f17299w;
        b4.g(q3Var3);
        String strE222 = q3Var3.u().e();
        if (d3VarN.M != null) {
        }
        String str8222 = d3VarN.M;
        u8.a();
        if (fVar.y(null, a3.f17204u0)) {
        }
        return new d6(strT, strU2, str5, j15, str, 68000L, j10, strG, z10, z11, str3, jMin, i10222, z13, z12222, str7222, boolValueOf, j11, list, strE222, str8222, str4);
    }

    public final void z() {
        o();
        b4 b4Var = (b4) this.f15046b;
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        ArrayList arrayList = this.f17432u;
        i3Var.Q.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                i3 i3Var2 = b4Var.f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f17433w.a();
    }
}