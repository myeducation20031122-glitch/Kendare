package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends a {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        j input = (j) obj;
        Intrinsics.f(context, "context");
        Intrinsics.f(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.e(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        return new androidx.activity.result.a(intent, i10);
    }
}