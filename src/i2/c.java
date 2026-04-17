package i2;

import android.database.Cursor;
import java.util.ArrayList;
import l1.p;
import l1.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p f13244a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13245b;

    public c(p pVar, int i10) {
        if (i10 == 1) {
            this.f13244a = pVar;
            this.f13245b = new b(this, pVar, 1);
        } else if (i10 == 2) {
            this.f13244a = pVar;
            this.f13245b = new b(this, pVar, 3);
        } else if (i10 != 3) {
            this.f13244a = pVar;
            this.f13245b = new b(this, pVar, 0);
        } else {
            this.f13244a = pVar;
            this.f13245b = new b(this, pVar, 6);
        }
    }

    public final ArrayList a(String str) {
        r rVarA = r.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            rVarA.c(1);
        } else {
            rVarA.d(1, str);
        }
        p pVar = this.f13244a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarA.e();
        }
    }

    public final Long b(String str) {
        r rVarA = r.a(1, "SELECT long_value FROM Preference where `key`=?");
        rVarA.d(1, str);
        p pVar = this.f13244a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarA);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            rVarA.e();
        }
    }

    public final ArrayList c(String str) {
        r rVarA = r.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            rVarA.c(1);
        } else {
            rVarA.d(1, str);
        }
        p pVar = this.f13244a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarA.e();
        }
    }

    public final boolean d(String str) {
        r rVarA = r.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            rVarA.c(1);
        } else {
            rVarA.d(1, str);
        }
        p pVar = this.f13244a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarA);
        try {
            boolean z7 = false;
            if (cursorG.moveToFirst()) {
                z7 = cursorG.getInt(0) != 0;
            }
            return z7;
        } finally {
            cursorG.close();
            rVarA.e();
        }
    }

    public final void e(d dVar) {
        p pVar = this.f13244a;
        pVar.b();
        pVar.c();
        try {
            this.f13245b.e(dVar);
            pVar.h();
        } finally {
            pVar.f();
        }
    }
}