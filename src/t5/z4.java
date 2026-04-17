package t5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y4 f17717b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y4 f17718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17719f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17720j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b5 f17721m;

    public z4(b5 b5Var, y4 y4Var, y4 y4Var2, long j10, boolean z7) {
        this.f17721m = b5Var;
        this.f17717b = y4Var;
        this.f17718e = y4Var2;
        this.f17719f = j10;
        this.f17720j = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17721m.t(this.f17717b, this.f17718e, this.f17719f, this.f17720j, null);
    }
}