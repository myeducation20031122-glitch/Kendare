package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;
import m0.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends j {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f18058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18059f;

    /* renamed from: j, reason: collision with root package name */
    public String f18060j;

    public a(Context context, String str) {
        super(context);
        this.f18058e = new HashMap();
        this.f18059f = str;
        r();
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f18058e;
        for (String str : map.keySet()) {
            i iVar = (i) map.get(str);
            StringBuilder sbO = ic1.o(str, ">>>>>");
            sbO.append(iVar.f18087b);
            sbO.append(">>>>>");
            sbO.append(iVar.f18088e);
            arrayList.add(sbO.toString());
        }
        l(q(), TextUtils.join("#####", arrayList));
        this.f18060j = Long.toString(new Date().getTime());
        l(q() + ".version", this.f18060j);
    }

    public final String q() {
        return h() + this.f18059f;
    }

    public final void r() {
        String strQ = q();
        Context contextG = g();
        SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
        for (String str : (sharedPreferences != null ? sharedPreferences.getString(strQ, "") : "").split(Pattern.quote("#####"))) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(Pattern.quote(">>>>>"));
                int length = strArrSplit.length;
                HashMap map = this.f18058e;
                if (length > 2) {
                    map.put(strArrSplit[0], new i(strArrSplit[1], strArrSplit[2]));
                } else if (strArrSplit.length > 1) {
                    map.put(strArrSplit[0], new i(strArrSplit[1], null));
                }
            }
        }
        String str2 = q() + ".version";
        Context contextG2 = g();
        SharedPreferences sharedPreferences2 = contextG2.getSharedPreferences(contextG2.getPackageName() + "_preferences", 0);
        this.f18060j = sharedPreferences2 != null ? sharedPreferences2.getString(str2, "0") : "0";
    }

    public final void s() {
        String str = this.f18060j;
        String str2 = q() + ".version";
        Context contextG = g();
        SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
        if (str.equalsIgnoreCase(sharedPreferences != null ? sharedPreferences.getString(str2, "0") : "0")) {
            return;
        }
        this.f18058e.clear();
        r();
    }

    public final String toString() {
        return TextUtils.join(", ", this.f18058e.keySet());
    }
}