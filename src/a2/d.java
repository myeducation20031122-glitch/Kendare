package a2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.kq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f232a = z1.o.t("Schedulers");

    public static void a(z1.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        kq kqVarN = workDatabase.n();
        workDatabase.c();
        try {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = bVar.f19456h;
            if (i10 == 23) {
                i11 /= 2;
            }
            ArrayList arrayListC = kqVarN.c(i11);
            ArrayList arrayListB = kqVarN.b();
            if (arrayListC.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    kqVarN.m(jCurrentTimeMillis, ((i2.j) it.next()).f13258a);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListC.size() > 0) {
                i2.j[] jVarArr = (i2.j[]) arrayListC.toArray(new i2.j[arrayListC.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.f()) {
                        cVar.d(jVarArr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                i2.j[] jVarArr2 = (i2.j[]) arrayListB.toArray(new i2.j[arrayListB.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.f()) {
                        cVar2.d(jVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}