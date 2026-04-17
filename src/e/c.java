package e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends a {
    @Override // e.a
    public final Intent a(ComponentActivity context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.f(context, "context");
        Intrinsics.f(input, "input");
        return input;
    }

    @Override // e.a
    public final Object c(Intent intent, int i10) {
        return new androidx.activity.result.a(intent, i10);
    }
}