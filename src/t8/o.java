package t8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q8.a0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f17996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17998c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Method f18001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Field f18002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f18004i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q8.n f18005j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x8.a f18006k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f18007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f18008m;

    public o(String str, String str2, boolean z7, boolean z10, boolean z11, Method method, Field field, boolean z12, a0 a0Var, q8.n nVar, x8.a aVar, boolean z13, boolean z14) {
        this.f18000e = z11;
        this.f18001f = method;
        this.f18002g = field;
        this.f18003h = z12;
        this.f18004i = a0Var;
        this.f18005j = nVar;
        this.f18006k = aVar;
        this.f18007l = z13;
        this.f18008m = z14;
        this.f17996a = str;
        this.f17997b = str2;
        this.f17998c = z7;
        this.f17999d = z10;
    }

    public final void a(y8.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.f17998c) {
            boolean z7 = this.f18000e;
            Field field = this.f18002g;
            Method method = this.f18001f;
            if (z7) {
                if (method == null) {
                    s.a(obj, field);
                } else {
                    s.a(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e10) {
                    throw new m7.p(a0.h.w("Accessor ", v8.b.c(method, false), " threw exception"), e10.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.g(this.f17996a);
            boolean z10 = this.f18003h;
            a0 uVar = this.f18004i;
            if (!z10) {
                uVar = new u(this.f18005j, uVar, this.f18006k.f19111b);
            }
            uVar.c(bVar, objInvoke);
        }
    }
}