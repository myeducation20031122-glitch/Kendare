package e9;

import com.isprid.kendare.MyApplication;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f12604a;

    /* renamed from: b, reason: collision with root package name */
    public Calendar f12605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12606c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12607d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public f9.a f12608e;

    /* renamed from: f, reason: collision with root package name */
    public int f12609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12610g;

    /* renamed from: h, reason: collision with root package name */
    public final double f12611h;

    public e(double d10) {
        this.f12611h = d10;
        int i10 = (int) (d10 / 13.333333333333334d);
        this.f12606c = i10 + 1;
        double d11 = d10 - (i10 * 13.333333333333334d);
        this.f12604a = d11;
        this.f12610g = ((int) (d11 / 3.3333333333333335d)) + 1;
    }

    public static Calendar b(long j10, int i10, Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(12, (int) ((TimeUnit.MILLISECONDS.toMinutes(j10) * i10) / 120.0d));
        return calendar2;
    }

    public static int c(int i10) {
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                return 10;
            case 2:
                return 3;
            case 3:
            default:
                return 0;
            case 4:
                return 1;
            case g.INVALID_ACCOUNT /* 5 */:
                return 4;
            case g.RESOLUTION_REQUIRED /* 6 */:
                return 11;
            case g.NETWORK_ERROR /* 7 */:
                return 5;
            case 8:
                return 6;
            case 9:
                return 2;
        }
    }

    public final ArrayList a(Calendar calendar) {
        this.f12605b = calendar;
        ArrayList arrayList = this.f12607d;
        if (arrayList.size() > 0) {
            return arrayList;
        }
        double d10 = (13.333333333333334d - this.f12604a) / 13.333333333333334d;
        f9.a aVarA = this.f12608e;
        if (aVarA == null) {
            int i10 = ((this.f12606c - 1) % 9) + 1;
            this.f12609f = i10;
            aVarA = c.a(c(i10), null, this.f12611h, false);
            this.f12608e = aVarA;
        }
        double dB = d10 * aVarA.b() * 1.0d;
        Calendar calendar2 = this.f12605b;
        int i11 = (int) dB;
        double d11 = (dB - i11) * 12.0d;
        int i12 = (int) d11;
        double d12 = (d11 - i12) * 30.0d;
        int i13 = (int) d12;
        double d13 = (d12 - i13) * 24.0d;
        int i14 = (int) d13;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(calendar2.getTimeInMillis());
        calendar3.add(1, i11);
        calendar3.add(2, i12);
        calendar3.add(6, i13);
        calendar3.add(10, i14);
        calendar3.add(12, (int) ((d13 - i14) * 24.0d));
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(calendar3.getTimeInMillis());
        calendar4.add(1, -this.f12608e.b());
        b bVar = new b(this.f12608e, this.f12609f, calendar4, calendar3);
        arrayList.add(bVar);
        b bVarF = f(bVar);
        while (bVarF != null) {
            arrayList.add(bVarF);
            bVarF = f(bVarF);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            bVar2.f12566a.clear();
            Calendar calendarB = b(bVar2.f12568c.getTimeInMillis() - bVar2.f12571f.getTimeInMillis(), bVar2.f12569d.b(), bVar2.f12571f);
            b bVar3 = new b(bVar2.f12569d, bVar2.f12570e, bVar2.f12571f, calendarB);
            boolean zAfter = calendarB.after(this.f12605b);
            ArrayList arrayList2 = bVar2.f12566a;
            if (zAfter) {
                arrayList2.add(bVar3);
            }
            b bVarE = e(bVar3, bVar2.f12568c.getTimeInMillis() - bVar2.f12571f.getTimeInMillis());
            while (bVarE.f12570e != bVar2.f12570e) {
                if (bVarE.f12568c.after(this.f12605b)) {
                    arrayList2.add(bVarE);
                }
                bVarE = e(bVarE, bVar2.f12568c.getTimeInMillis() - bVar2.f12571f.getTimeInMillis());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((b) it2.next()).f12566a.iterator();
            while (it3.hasNext()) {
                b bVar4 = (b) it3.next();
                bVar4.f12566a.clear();
                Calendar calendar5 = Calendar.getInstance();
                calendar5.setTimeInMillis(bVar4.f12571f.getTimeInMillis());
                Calendar calendar6 = Calendar.getInstance();
                calendar6.setTimeInMillis(bVar4.f12571f.getTimeInMillis());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Calendar calendar7 = bVar4.f12568c;
                long minutes = timeUnit.toMinutes(calendar7.getTimeInMillis() - bVar4.f12571f.getTimeInMillis());
                calendar6.add(12, (int) ((bVar4.f12569d.b() * minutes) / 120.0d));
                if (calendar5.before(calendar7)) {
                    b bVar5 = new b(bVar4.f12569d, bVar4.f12570e, calendar5, calendar6);
                    boolean zAfter2 = calendar6.after(this.f12605b);
                    ArrayList arrayList3 = bVar4.f12566a;
                    if (zAfter2) {
                        arrayList3.add(bVar5);
                    }
                    b bVarG = g(bVar5, minutes);
                    while (bVarG.f12570e != bVar4.f12570e) {
                        if (bVarG.f12568c.after(this.f12605b)) {
                            arrayList3.add(bVarG);
                        }
                        bVarG = g(bVarG, minutes);
                    }
                }
            }
        }
        Calendar calendar8 = Calendar.getInstance();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            b bVar6 = (b) it4.next();
            if (bVar6.f12571f.before(this.f12605b)) {
                bVar6.f12571f = this.f12605b;
            }
            if (bVar6.f12571f.before(calendar8) && bVar6.f12568c.after(calendar8)) {
                bVar6.f12567b = true;
            }
            Iterator it5 = bVar6.f12566a.iterator();
            while (it5.hasNext()) {
                b bVar7 = (b) it5.next();
                if (bVar7.f12571f.before(calendar8) && bVar7.f12568c.after(calendar8)) {
                    bVar7.f12567b = true;
                }
                Iterator it6 = bVar7.f12566a.iterator();
                while (it6.hasNext()) {
                    b bVar8 = (b) it6.next();
                    if (bVar8.f12571f.before(calendar8) && bVar8.f12568c.after(calendar8)) {
                        bVar8.f12567b = true;
                    }
                }
            }
        }
        return arrayList;
    }

    public final String d() {
        n7.c cVar = MyApplication.f11640b;
        return "nekathSin" + this.f12606c;
    }

    public final b e(b bVar, long j10) {
        int i10 = (bVar.f12570e % 9) + 1;
        f9.a aVarA = c.a(c(i10), null, this.f12611h, false);
        return new b(aVarA, i10, bVar.f12568c, b(j10, aVarA.b(), bVar.f12568c));
    }

    public final b f(b bVar) {
        int i10 = (bVar.f12570e % 9) + 1;
        f9.a aVarA = c.a(c(i10), null, this.f12611h, false);
        int iB = aVarA.b();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bVar.f12568c.getTimeInMillis());
        calendar.add(1, iB);
        if (this.f12609f == i10) {
            return null;
        }
        return new b(aVarA, i10, bVar.f12568c, calendar);
    }

    public final b g(b bVar, long j10) {
        int i10 = (bVar.f12570e % 9) + 1;
        f9.a aVarA = c.a(c(i10), null, this.f12611h, false);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bVar.f12568c.getTimeInMillis());
        calendar.add(12, (int) ((aVarA.b() * j10) / 120.0d));
        return new b(aVarA, i10, bVar.f12568c, calendar);
    }
}