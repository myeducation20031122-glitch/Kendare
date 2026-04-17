package f0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}