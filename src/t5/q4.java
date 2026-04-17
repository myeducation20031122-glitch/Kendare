package t5;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17572b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17574f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bundle f17575j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f17576m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f17577n;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f17578t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f17579u = null;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v4 f17580w;

    public q4(v4 v4Var, String str, String str2, long j10, Bundle bundle, boolean z7, boolean z10, boolean z11) {
        this.f17580w = v4Var;
        this.f17572b = str;
        this.f17573e = str2;
        this.f17574f = j10;
        this.f17575j = bundle;
        this.f17576m = z7;
        this.f17577n = z10;
        this.f17578t = z11;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f17580w.y(this.f17572b, this.f17573e, this.f17574f, this.f17575j, this.f17576m, this.f17577n, this.f17578t, this.f17579u);
    }
}