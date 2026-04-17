package g;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.ads.c01;
import com.google.android.gms.internal.ads.wr;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class v0 implements l.m, l.z, m.r, j3.a, w2.v, w2.a, q2.c, w2.g0, z2.k, com.bumptech.glide.manager.n, t3.b, c01, z4.o, o5.c0, p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12908b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12909e;

    public v0() {
        this.f12908b = 16;
        this.f12909e = new u2.g(this);
    }

    public static ByteArrayInputStream r(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public static Object t(Object[] objArr, int i10, h0.n nVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z7 = (i10 & 2) != 0;
        Object obj = null;
        int i12 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(nVar.l(obj2) - i11) * 2) + (nVar.n(obj2) == z7 ? 0 : 1);
            if (obj == null || i12 > iAbs) {
                obj = obj2;
                i12 = iAbs;
            }
        }
        return obj;
    }

    @Override // z2.k
    public final int a(byte[] bArr, int i10) throws z2.j {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = ((InputStream) this.f12909e).read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new z2.j();
        }
        return i11;
    }

    @Override // p5.l
    public final synchronized void b(z4.m mVar) {
        z4.m mVar2 = (z4.m) this.f12909e;
        if (mVar2 != mVar) {
            mVar2.f19675b = null;
            mVar2.f19676c = null;
            this.f12909e = mVar;
        }
    }

    @Override // z2.k
    public final short c() throws IOException {
        int i10 = ((InputStream) this.f12909e).read();
        if (i10 != -1) {
            return (short) i10;
        }
        throw new z2.j();
    }

    @Override // l.z
    public final void d(l.o oVar, boolean z7) {
        if (oVar instanceof l.g0) {
            oVar.k().c(false);
        }
        l.z zVar = ((m.o) this.f12909e).f14863m;
        if (zVar != null) {
            zVar.d(oVar, z7);
        }
    }

    @Override // z2.k
    public final int e() {
        return (c() << 8) | c();
    }

    @Override // l.m
    public final boolean f(l.o oVar, MenuItem menuItem) {
        return false;
    }

    @Override // z4.o
    public final void g(a5.k kVar, Object obj) {
        x5.l lVar = (x5.l) obj;
        c5.a aVar = (c5.a) ((c5.d) kVar).z();
        a5.r rVar = (a5.r) this.f12909e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f9704f);
        int i10 = l5.b.f14646a;
        if (rVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            rVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f9703e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            lVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // da.a
    public final Object get() {
        z3.a aVar = (z3.a) ((da.a) this.f12909e).get();
        d3.d dVar = new d3.d(6);
        o3.d dVar2 = o3.d.f15696b;
        e eVar = new e(23);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        eVar.f12765j = setEmptySet;
        eVar.f12763e = 30000L;
        eVar.f12764f = 86400000L;
        ((Map) dVar.f12310f).put(dVar2, eVar.l());
        o3.d dVar3 = o3.d.f15698f;
        e eVar2 = new e(23);
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        eVar2.f12765j = setEmptySet2;
        eVar2.f12763e = 1000L;
        eVar2.f12764f = 86400000L;
        ((Map) dVar.f12310f).put(dVar3, eVar2.l());
        o3.d dVar4 = o3.d.f15697e;
        e eVar3 = new e(23);
        Set setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        eVar3.f12765j = setEmptySet3;
        eVar3.f12763e = 86400000L;
        eVar3.f12764f = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(w3.e.f18614e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        eVar3.f12765j = setUnmodifiableSet;
        ((Map) dVar.f12310f).put(dVar4, eVar3.l());
        dVar.f12309e = aVar;
        if (aVar == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (((Map) dVar.f12310f).keySet().size() < o3.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map map = (Map) dVar.f12310f;
        dVar.f12310f = new HashMap();
        return new w3.b((z3.a) dVar.f12309e, map);
    }

    @Override // q2.c
    public final boolean h(Object obj, File file, q2.n nVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((t2.h) this.f12909e).d(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((t2.h) this.f12909e).h(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((t2.h) this.f12909e).h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                ((t2.h) this.f12909e).h(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public Typeface i(Context context, g0.g gVar, Resources resources, int i10) throws NoSuchFieldException, SecurityException {
        long jLongValue;
        g0.h hVar = (g0.h) t(gVar.f12953a, i10, new p8.c(this, 6));
        if (hVar == null) {
            return null;
        }
        int i11 = hVar.f12959f;
        String str = hVar.f12954a;
        Typeface typefaceQ = h0.h.f13153a.q(context, resources, i11, str, i10);
        if (typefaceQ != null) {
            h0.h.f13154b.c(h0.h.b(resources, i11, str, 0, i10), typefaceQ);
        }
        if (typefaceQ == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceQ)).longValue();
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            }
        }
        if (jLongValue != 0) {
            ((ConcurrentHashMap) this.f12909e).put(Long.valueOf(jLongValue), gVar);
        }
        return typefaceQ;
    }

    @Override // w2.g0
    public final com.bumptech.glide.load.data.e j(Uri uri) {
        return new com.bumptech.glide.load.data.o((ContentResolver) this.f12909e, uri, 1);
    }

    @Override // j3.a
    public final Object k() {
        g0.d dVar = (g0.d) this.f12909e;
        return new s2.m((x4.k) dVar.f12951e, (n0.c) dVar.f12952f);
    }

    @Override // l.z
    public final boolean l(l.o oVar) {
        Object obj = this.f12909e;
        if (oVar == ((m.o) obj).f14861f) {
            return false;
        }
        ((m.o) obj).f14859b0 = ((l.g0) oVar).A.f14384a;
        l.z zVar = ((m.o) obj).f14863m;
        if (zVar != null) {
            return zVar.l(oVar);
        }
        return false;
    }

    @Override // w2.a
    public final com.bumptech.glide.load.data.k m(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 1);
    }

    public Typeface o(Context context, l0.i[] iVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(u(i10, iVarArr).f14453a);
            try {
                Typeface typefaceP = p(context, inputStreamOpenInputStream);
                o5.y.c(inputStreamOpenInputStream);
                return typefaceP;
            } catch (IOException unused) {
                o5.y.c(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                o5.y.c(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface p(Context context, InputStream inputStream) {
        File fileN = o5.y.n(context);
        if (fileN == null) {
            return null;
        }
        try {
            if (o5.y.f(fileN, inputStream)) {
                return Typeface.createFromFile(fileN.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileN.delete();
        }
    }

    public Typeface q(Context context, Resources resources, int i10, String str, int i11) {
        File fileN = o5.y.n(context);
        if (fileN == null) {
            return null;
        }
        try {
            if (o5.y.e(fileN, resources, i10)) {
                return Typeface.createFromFile(fileN.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileN.delete();
        }
    }

    @Override // l.m
    public final void s(l.o oVar) {
        if (((w0) this.f12909e).f12911a.f14873a.p()) {
            ((w0) this.f12909e).f12912b.onPanelClosed(108, oVar);
        } else if (((w0) this.f12909e).f12912b.onPreparePanel(0, null, oVar)) {
            ((w0) this.f12909e).f12912b.onMenuOpened(108, oVar);
        }
    }

    @Override // z2.k
    public final long skip(long j10) throws IOException {
        if (j10 < 0) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            long jSkip = ((InputStream) this.f12909e).skip(j11);
            if (jSkip <= 0) {
                if (((InputStream) this.f12909e).read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j11 -= jSkip;
        }
        return j10 - j11;
    }

    public final String toString() {
        switch (this.f12908b) {
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return super.toString() + "{fragment=" + ((com.bumptech.glide.manager.u) this.f12909e) + "}";
            default:
                return super.toString();
        }
    }

    public l0.i u(int i10, l0.i[] iVarArr) {
        return (l0.i) t(iVarArr, i10, new u0(this, 5));
    }

    @Override // w2.v
    public final w2.u v(w2.a0 a0Var) {
        switch (this.f12908b) {
            case y4.g.INTERRUPTED /* 14 */:
                return new w2.b((AssetManager) this.f12909e, this);
            default:
                return new w2.h0(this);
        }
    }

    public final void w(n2.p pVar, n2.t tVar, m.k kVar) {
        pVar.markDelivered();
        pVar.addMarker("post-response");
        ((Executor) this.f12909e).execute(new l0.a(pVar, tVar, kVar, 10, 0));
    }

    public final long x() {
        return ((ByteBuffer) this.f12909e).getInt() & 4294967295L;
    }

    public final void y(int i10) {
        Object obj = this.f12909e;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i10);
    }

    @Override // p5.l
    public final synchronized z4.m zza() {
        return (z4.m) this.f12909e;
    }

    @Override // o5.c0
    public final /* synthetic */ Object zzb() {
        return new d3.d((o5.c) ((o5.c) this.f12909e).f15707a);
    }

    public v0(int i10) {
        this.f12908b = i10;
        if (i10 != 21) {
            this.f12909e = new ConcurrentHashMap();
        }
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void zza(Throwable th) {
        i4.k.A.f13352g.h("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        r4.b bVar = (r4.b) this.f12909e;
        com.bumptech.glide.d.b0(bVar.Q, bVar.f16460n, "sgf", new Pair("sgf_reason", th.getMessage()));
        wr.e("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // p5.l
    /* renamed from: zzb, reason: collision with other method in class */
    public final void mo22zzb() {
    }

    public v0(ClipData clipData, int i10) {
        this.f12908b = 5;
        this.f12909e = Build.VERSION.SDK_INT >= 31 ? new o0.c(clipData, i10) : new o0.e(clipData, i10);
    }

    @Override // com.google.android.gms.internal.ads.c01
    /* renamed from: zzb */
    public final /* synthetic */ void mo28zzb(Object obj) {
        wr.b("Initialized webview successfully for SDKCore.");
    }

    public v0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f12908b = 7;
        this.f12909e = Build.VERSION.SDK_INT >= 25 ? new t0.f(uri, clipDescription, uri2) : new e(uri, clipDescription, uri2, 5, 0);
    }

    public v0(Handler handler) {
        this.f12908b = 11;
        this.f12909e = new n2.f(handler);
    }

    public v0(View view) {
        o0.e0 e0Var;
        this.f12908b = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            o0.f0 f0Var = new o0.f0(view);
            f0Var.f15541m = view;
            e0Var = f0Var;
        } else {
            e0Var = new o0.e0(view);
        }
        this.f12909e = e0Var;
    }

    public v0(WindowInsetsController windowInsetsController) {
        this.f12908b = 6;
        o0.f0 f0Var = new o0.f0(null);
        f0Var.f15542n = windowInsetsController;
        this.f12909e = f0Var;
    }

    public v0(com.bumptech.glide.d dVar) {
        this.f12908b = 3;
        this.f12909e = dVar;
    }

    public /* synthetic */ v0(Object obj, int i10) {
        this.f12908b = i10;
        this.f12909e = obj;
    }

    public v0(ByteBuffer byteBuffer) {
        this.f12908b = 9;
        this.f12909e = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}