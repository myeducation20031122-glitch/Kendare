package i7;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import fc.t;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m7.n;
import p5.m;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f13424j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final e f13425k = new e();

    /* renamed from: l, reason: collision with root package name */
    public static final t.b f13426l = new t.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13428b;

    /* renamed from: c, reason: collision with root package name */
    public final h f13429c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.g f13430d;

    /* renamed from: g, reason: collision with root package name */
    public final n f13433g;

    /* renamed from: h, reason: collision with root package name */
    public final i8.c f13434h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13431e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f13432f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f13435i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[LOOP:0: B:24:0x00b6->B:26:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, h hVar, String str) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        PackageManager packageManager;
        String str2;
        final int i10 = 0;
        new CopyOnWriteArrayList();
        this.f13427a = context;
        t.g(str);
        this.f13428b = str;
        this.f13429c = hVar;
        m mVar = new m();
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (packageManager == null) {
            str2 = "Context has no PackageManager.";
        } else {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) mVar.f15961e), 128);
            if (serviceInfo != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str3 : bundle.keySet()) {
                        if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str3)) && str3.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str3.substring(31));
                        }
                    }
                }
                for (final String str4 : arrayList) {
                    arrayList2.add(new i8.c() { // from class: m7.c
                        @Override // i8.c
                        public final Object get() throws ClassNotFoundException {
                            int i11 = i10;
                            Object obj = str4;
                            switch (i11) {
                                case 0:
                                    String str5 = (String) obj;
                                    try {
                                        Class<?> cls = Class.forName(str5);
                                        if (e.class.isAssignableFrom(cls)) {
                                            return (e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                        }
                                        throw new m(String.format("Class %s is not an instance of %s", str5, "com.google.firebase.components.ComponentRegistrar"));
                                    } catch (ClassNotFoundException unused2) {
                                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str5));
                                        return null;
                                    } catch (IllegalAccessException e10) {
                                        throw new m(String.format("Could not instantiate %s.", str5), e10);
                                    } catch (InstantiationException e11) {
                                        throw new m(String.format("Could not instantiate %s.", str5), e11);
                                    } catch (NoSuchMethodException e12) {
                                        throw new m(String.format("Could not instantiate %s", str5), e12);
                                    } catch (InvocationTargetException e13) {
                                        throw new m(String.format("Could not instantiate %s", str5), e13);
                                    }
                                default:
                                    return (e) obj;
                            }
                        }
                    });
                }
                o5.d dVar = new o5.d(f13425k);
                ((List) dVar.f15721e).addAll(arrayList2);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                final int i11 = 1;
                ((List) dVar.f15721e).add(new i8.c() { // from class: m7.c
                    @Override // i8.c
                    public final Object get() throws ClassNotFoundException {
                        int i112 = i11;
                        Object obj = firebaseCommonRegistrar;
                        switch (i112) {
                            case 0:
                                String str5 = (String) obj;
                                try {
                                    Class<?> cls = Class.forName(str5);
                                    if (e.class.isAssignableFrom(cls)) {
                                        return (e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                    }
                                    throw new m(String.format("Class %s is not an instance of %s", str5, "com.google.firebase.components.ComponentRegistrar"));
                                } catch (ClassNotFoundException unused2) {
                                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str5));
                                    return null;
                                } catch (IllegalAccessException e10) {
                                    throw new m(String.format("Could not instantiate %s.", str5), e10);
                                } catch (InstantiationException e11) {
                                    throw new m(String.format("Could not instantiate %s.", str5), e11);
                                } catch (NoSuchMethodException e12) {
                                    throw new m(String.format("Could not instantiate %s", str5), e12);
                                } catch (InvocationTargetException e13) {
                                    throw new m(String.format("Could not instantiate %s", str5), e13);
                                }
                            default:
                                return (e) obj;
                        }
                    }
                });
                ((List) dVar.f15722f).add(m7.a.b(context, Context.class, new Class[0]));
                ((List) dVar.f15722f).add(m7.a.b(this, g.class, new Class[0]));
                ((List) dVar.f15722f).add(m7.a.b(hVar, h.class, new Class[0]));
                m7.g gVar = new m7.g((Executor) dVar.f15723j, (List) dVar.f15721e, (List) dVar.f15722f);
                this.f13430d = gVar;
                this.f13433g = new n(new b(i10, this, context));
                this.f13434h = gVar.c(g8.d.class);
                c cVar = new c(this);
                a();
                if (this.f13431e.get()) {
                    z4.c.f19615m.f19616b.get();
                }
                this.f13435i.add(cVar);
            }
            str2 = ((Class) mVar.f15961e) + " has no service info.";
        }
        Log.w("ComponentDiscovery", str2);
        if (bundle != null) {
        }
        while (r10.hasNext()) {
        }
        o5.d dVar2 = new o5.d(f13425k);
        ((List) dVar2.f15721e).addAll(arrayList2);
        final Object firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        final int i112 = 1;
        ((List) dVar2.f15721e).add(new i8.c() { // from class: m7.c
            @Override // i8.c
            public final Object get() throws ClassNotFoundException {
                int i1122 = i112;
                Object obj = firebaseCommonRegistrar2;
                switch (i1122) {
                    case 0:
                        String str5 = (String) obj;
                        try {
                            Class<?> cls = Class.forName(str5);
                            if (e.class.isAssignableFrom(cls)) {
                                return (e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            throw new m(String.format("Class %s is not an instance of %s", str5, "com.google.firebase.components.ComponentRegistrar"));
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str5));
                            return null;
                        } catch (IllegalAccessException e10) {
                            throw new m(String.format("Could not instantiate %s.", str5), e10);
                        } catch (InstantiationException e11) {
                            throw new m(String.format("Could not instantiate %s.", str5), e11);
                        } catch (NoSuchMethodException e12) {
                            throw new m(String.format("Could not instantiate %s", str5), e12);
                        } catch (InvocationTargetException e13) {
                            throw new m(String.format("Could not instantiate %s", str5), e13);
                        }
                    default:
                        return (e) obj;
                }
            }
        });
        ((List) dVar2.f15722f).add(m7.a.b(context, Context.class, new Class[0]));
        ((List) dVar2.f15722f).add(m7.a.b(this, g.class, new Class[0]));
        ((List) dVar2.f15722f).add(m7.a.b(hVar, h.class, new Class[0]));
        m7.g gVar2 = new m7.g((Executor) dVar2.f15723j, (List) dVar2.f15721e, (List) dVar2.f15722f);
        this.f13430d = gVar2;
        this.f13433g = new n(new b(i10, this, context));
        this.f13434h = gVar2.c(g8.d.class);
        c cVar2 = new c(this);
        a();
        if (this.f13431e.get()) {
        }
        this.f13435i.add(cVar2);
    }

    public static g c() {
        g gVar;
        synchronized (f13424j) {
            try {
                gVar = (g) f13426l.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + e5.c.c() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context, h hVar, String str) {
        g gVar;
        AtomicReference atomicReference = d.f13420a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f13420a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        z4.c.b(application);
                        z4.c.f19615m.a(dVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f13424j) {
            t.b bVar = f13426l;
            t.m("FirebaseApp name " + strTrim + " already exists!", !bVar.containsKey(strTrim));
            t.l(context, "Application context cannot be null.");
            gVar = new g(context, hVar, strTrim);
            bVar.put(strTrim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        t.m("FirebaseApp was deleted", !this.f13432f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f13430d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f13428b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f13429c.f13437b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? k0.n.a(this.f13427a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f13428b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f13427a;
            AtomicReference atomicReference = f.f13422b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f13428b);
        Log.i("FirebaseApp", sb2.toString());
        m7.g gVar = this.f13430d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f13428b);
        AtomicReference atomicReference2 = gVar.f15198j;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (gVar) {
                    map = new HashMap(gVar.f15194f);
                }
                gVar.k(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((g8.d) this.f13434h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f13428b.equals(gVar.f13428b);
    }

    public final boolean g() {
        boolean z7;
        a();
        m8.a aVar = (m8.a) this.f13433g.get();
        synchronized (aVar) {
            z7 = aVar.f15226a;
        }
        return z7;
    }

    public final int hashCode() {
        return this.f13428b.hashCode();
    }

    public final String toString() {
        d3.d dVar = new d3.d(this);
        dVar.a(this.f13428b, "name");
        dVar.a(this.f13429c, "options");
        return dVar.toString();
    }
}