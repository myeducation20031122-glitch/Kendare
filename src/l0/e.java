package l0;

import android.content.Context;
import java.util.concurrent.Callable;
import m.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14440b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f14442f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f14443j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f14444m;

    public /* synthetic */ e(String str, Context context, t tVar, int i10, int i11) {
        this.f14440b = i11;
        this.f14441e = str;
        this.f14442f = context;
        this.f14443j = tVar;
        this.f14444m = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f14441e;
        Context context = this.f14442f;
        t tVar = this.f14443j;
        int i10 = this.f14444m;
        int i11 = this.f14440b;
        switch (i11) {
            case 0:
                switch (i11) {
                }
            default:
                switch (i11) {
                }
        }
        return h.a(str, context, tVar, i10);
    }
}