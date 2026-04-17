package e9;

import android.content.Context;
import android.content.res.Resources;
import com.isprid.kendare.MyApplication;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12566a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f12567b;

    /* renamed from: c, reason: collision with root package name */
    public final Calendar f12568c;

    /* renamed from: d, reason: collision with root package name */
    public final c f12569d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12570e;

    /* renamed from: f, reason: collision with root package name */
    public Calendar f12571f;

    public b(c cVar, int i10, Calendar calendar, Calendar calendar2) {
        this.f12569d = cVar;
        this.f12570e = i10;
        this.f12571f = calendar;
        this.f12568c = calendar2;
    }

    public static String a(Context context, Calendar calendar) throws Resources.NotFoundException {
        n7.c cVar = MyApplication.f11640b;
        String str = "monthSin" + (calendar.get(2) + 1);
        s9.f fVar = s9.c.f16951a;
        return calendar.get(1) + " " + context.getResources().getString(s9.c.b(context, str)) + " " + String.format("%02d", Integer.valueOf(calendar.get(5)));
    }
}