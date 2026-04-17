package g2;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.k;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f12997f = o.t("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final l2.a f12998a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12999b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13000c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13001d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f13002e;

    public d(Context context, l2.a aVar) {
        this.f12999b = context.getApplicationContext();
        this.f12998a = aVar;
    }

    public abstract Object a();

    public final void b(f2.c cVar) {
        synchronized (this.f13000c) {
            try {
                if (this.f13001d.remove(cVar) && this.f13001d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f13000c) {
            try {
                Object obj2 = this.f13002e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f13002e = obj;
                    ((g.e) this.f12998a).A().execute(new k(8, this, new ArrayList(this.f13001d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}