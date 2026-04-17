package p3;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o5.u;
import r3.k;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f15916c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f15917d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f15918e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f15919f;

    /* renamed from: a, reason: collision with root package name */
    public final String f15920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15921b;

    static {
        String strJ = u.j("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f15916c = strJ;
        String strJ2 = u.j("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strJ3 = u.j("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f15917d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new o3.c("proto"), new o3.c("json"))));
        f15918e = new a(strJ, null);
        f15919f = new a(strJ2, strJ3);
    }

    public a(String str, String str2) {
        this.f15920a = str;
        this.f15921b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}