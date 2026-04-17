package t2;

import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.n3;
import i3.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;
import l4.j0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements j {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config[] f17145j;

    /* renamed from: m, reason: collision with root package name */
    public static final Bitmap.Config[] f17146m;

    /* renamed from: n, reason: collision with root package name */
    public static final Bitmap.Config[] f17147n;

    /* renamed from: t, reason: collision with root package name */
    public static final Bitmap.Config[] f17148t;

    /* renamed from: u, reason: collision with root package name */
    public static final Bitmap.Config[] f17149u;

    /* renamed from: b, reason: collision with root package name */
    public final c f17150b = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public final n3 f17151e = new n3(21);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f17152f = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = j0.C();
        }
        f17145j = configArr;
        f17146m = configArr;
        f17147n = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f17148t = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f17149u = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String e(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapF = f(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapF.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapF.remove(num);
                return;
            } else {
                navigableMapF.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(o.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    @Override // t2.j
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = o.d(config) * i10 * i11;
        c cVar = this.f17150b;
        k kVarP = (k) ((Queue) cVar.f15046b).poll();
        if (kVarP == null) {
            kVarP = cVar.p();
        }
        m mVar = (m) kVarP;
        mVar.f17143b = iD;
        mVar.f17144c = config;
        int i12 = 0;
        if (Build.VERSION.SDK_INT < 26 || !j0.C().equals(config)) {
            int i13 = l.f17141a[config.ordinal()];
            configArr = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? new Bitmap.Config[]{config} : f17149u : f17148t : f17147n : f17145j;
        } else {
            configArr = f17146m;
        }
        int length = configArr.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i12];
            Integer num = (Integer) f(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i12++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.k(mVar);
                int iIntValue = num.intValue();
                k kVarP2 = (k) ((Queue) cVar.f15046b).poll();
                if (kVarP2 == null) {
                    kVarP2 = cVar.p();
                }
                mVar = (m) kVarP2;
                mVar.f17143b = iIntValue;
                mVar.f17144c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f17151e.s(mVar);
        if (bitmap != null) {
            a(Integer.valueOf(mVar.f17143b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // t2.j
    public final void c(Bitmap bitmap) {
        int iC = o.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f17150b;
        k kVarP = (k) ((Queue) cVar.f15046b).poll();
        if (kVarP == null) {
            kVarP = cVar.p();
        }
        m mVar = (m) kVarP;
        mVar.f17143b = iC;
        mVar.f17144c = config;
        this.f17151e.B(mVar, bitmap);
        NavigableMap navigableMapF = f(bitmap.getConfig());
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(mVar.f17143b));
        navigableMapF.put(Integer.valueOf(mVar.f17143b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // t2.j
    public final String d(int i10, int i11, Bitmap.Config config) {
        return e(o.d(config) * i10 * i11, config);
    }

    public final NavigableMap f(Bitmap.Config config) {
        HashMap map = this.f17152f;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // t2.j
    public final int k(Bitmap bitmap) {
        return o.c(bitmap);
    }

    @Override // t2.j
    public final String l(Bitmap bitmap) {
        return e(o.c(bitmap), bitmap.getConfig());
    }

    @Override // t2.j
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f17151e.D();
        if (bitmap != null) {
            a(Integer.valueOf(o.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder sbN = ic1.n("SizeConfigStrategy{groupedMap=");
        sbN.append(this.f17151e);
        sbN.append(", sortedSizes=(");
        HashMap map = this.f17152f;
        for (Map.Entry entry : map.entrySet()) {
            sbN.append(entry.getKey());
            sbN.append('[');
            sbN.append(entry.getValue());
            sbN.append("], ");
        }
        if (!map.isEmpty()) {
            sbN.replace(sbN.length() - 2, sbN.length(), "");
        }
        sbN.append(")}");
        return sbN.toString();
    }
}