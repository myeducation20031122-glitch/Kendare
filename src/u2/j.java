package u2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f18242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18244c;

    public j(i iVar) {
        Context context = iVar.f18238a;
        ActivityManager activityManager = iVar.f18239b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f18244c = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) iVar.f18240c.f12909e;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = iVar.f18241d;
        int iRound2 = Math.round(f10 * f11);
        int iRound3 = Math.round(f10 * 2.0f);
        int i11 = iRound - i10;
        int i12 = iRound3 + iRound2;
        if (i12 <= i11) {
            this.f18243b = iRound3;
            this.f18242a = iRound2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f18243b = Math.round(2.0f * f12);
            this.f18242a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f18243b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f18242a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i10));
            sb.append(", memory class limited? ");
            sb.append(i12 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}