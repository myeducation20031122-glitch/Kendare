package x2;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import g.j0;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends j0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i10) {
        super(context, ParcelFileDescriptor.class);
        if (i10 != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}