package i7;

import android.content.Context;
import io.reactivex.internal.fuseable.QueueFuseable;
import m7.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements i8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13418c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f13416a = i10;
        this.f13417b = obj;
        this.f13418c = obj2;
    }

    @Override // i8.c
    public final Object get() {
        int i10 = this.f13416a;
        Object obj = this.f13417b;
        Object obj2 = this.f13418c;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                String strD = gVar.d();
                return new m8.a((Context) obj2, strD);
            case QueueFuseable.SYNC /* 1 */:
                m7.g gVar2 = (m7.g) obj;
                m7.a aVar = (m7.a) obj2;
                gVar2.getClass();
                return aVar.f15188e.a(new s(aVar, gVar2));
            default:
                return new g8.h((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ b(Context context, String str) {
        this.f13416a = 2;
        this.f13418c = context;
        this.f13417b = str;
    }
}