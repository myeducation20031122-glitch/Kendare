package l1;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p1.c f14462a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14464c;

    /* renamed from: d, reason: collision with root package name */
    public final p8.c f14465d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14466e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14467f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14468g;

    public a(Context context, String str, p1.c cVar, p8.c cVar2, ArrayList arrayList, boolean z7, int i10, Executor executor, Executor executor2, boolean z10, boolean z11) {
        this.f14462a = cVar;
        this.f14463b = context;
        this.f14464c = str;
        this.f14465d = cVar2;
        this.f14467f = z10;
        this.f14468g = z11;
    }

    public final boolean a(int i10, int i11) {
        if (i10 <= i11 || !this.f14468g) {
            return this.f14467f;
        }
        return false;
    }
}