package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.bumptech.glide.e;
import f0.f;
import fa.g;
import fa.h;
import fa.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends a {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.f(context, "context");
        Intrinsics.f(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // e.a
    public final d9.c b(ComponentActivity context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.f(context, "context");
        Intrinsics.f(input, "input");
        if (input.length == 0) {
            return new d9.c(h.f12715b);
        }
        for (String str : input) {
            if (f.a(context, str) != 0) {
                return null;
            }
        }
        int iW = e.w(input.length);
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new d9.c(linkedHashMap);
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        h hVar = h.f12715b;
        if (i10 != -1 || intent == null) {
            return hVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return hVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return j.m0(g.P3(ArraysKt.t3(stringArrayExtra), arrayList));
    }
}