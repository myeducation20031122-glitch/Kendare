package l7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f14655a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b, reason: collision with root package name */
    public static final List f14656b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    public static final List f14657c = Arrays.asList("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    public static final List f14658d = Arrays.asList("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    public static final List f14659e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f14660f;

    static {
        String[][] strArr = {j4.f17452i, j4.f17453j};
        int length = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            length += strArr[i10].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr[0], length);
        int length2 = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, objArrCopyOf, length2, strArr2.length);
        f14659e = Arrays.asList((String[]) objArrCopyOf);
        f14660f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}