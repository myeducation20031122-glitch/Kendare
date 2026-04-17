package l9;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Toast;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14691b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HoroscopeActivity f14692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HoroscopeActivity horoscopeActivity, int i10) {
        super(0);
        this.f14691b = i10;
        this.f14692e = horoscopeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() throws IllegalAccessException, Resources.NotFoundException, SecurityException, IllegalArgumentException, FileNotFoundException, InvocationTargetException {
        switch (this.f14691b) {
            case 0:
                m25invoke();
                break;
            case QueueFuseable.SYNC /* 1 */:
                m25invoke();
                break;
            case 2:
                m25invoke();
                break;
            default:
                m25invoke();
                break;
        }
        return Unit.f14090a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m25invoke() throws IllegalAccessException, Resources.NotFoundException, SecurityException, IllegalArgumentException, FileNotFoundException, InvocationTargetException {
        int i10 = this.f14691b;
        HoroscopeActivity horoscopeActivity = this.f14692e;
        switch (i10) {
            case 0:
                Log.e("FAN ", "No need to show Ad at the moment");
                horoscopeActivity.getOnBackPressedDispatcher().b();
                horoscopeActivity.overridePendingTransition(2130771980, 2130771983);
                return;
            case QueueFuseable.SYNC /* 1 */:
                horoscopeActivity.f11648m = !horoscopeActivity.f11648m;
                horoscopeActivity.p();
                return;
            case 2:
                e9.d dVar = horoscopeActivity.f11647j;
                if (dVar == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                if ((dVar.f12585f == null ? "Please select your birth date and time" : dVar.f12592m == null ? "Please select your birth place" : null) == null) {
                    int i11 = c9.g.Y;
                    if (dVar == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    c9.g gVar = new c9.g();
                    gVar.T = dVar;
                    gVar.k(horoscopeActivity.getSupportFragmentManager(), "save");
                    return;
                }
                return;
            default:
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 29) {
                    horoscopeActivity.requestPermissionAndShare();
                    return;
                }
                b9.a aVar = horoscopeActivity.f11646f;
                if (aVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                aVar.f1975d.buildDrawingCache();
                b9.a aVar2 = horoscopeActivity.f11646f;
                if (aVar2 != null) {
                    Bitmap drawingCache = aVar2.f1975d.getDrawingCache();
                    s9.f fVar = s9.c.f16951a;
                    if (drawingCache == null) {
                        Log.e("Share", "share no image");
                        return;
                    }
                    if (i12 >= 29) {
                        try {
                            String str = "kendare_" + System.currentTimeMillis() + ".png";
                            ContentResolver contentResolver = horoscopeActivity.getContentResolver();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("_display_name", str);
                            contentValues.put("mime_type", "image/png");
                            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "Kendare");
                            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            Objects.requireNonNull(uriInsert);
                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            drawingCache.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                            Objects.requireNonNull(outputStreamOpenOutputStream);
                            Toast.makeText(horoscopeActivity, "Horoscope image saved", 0).show();
                            s9.c.d(horoscopeActivity, uriInsert);
                            return;
                        } catch (Exception e10) {
                            Toast.makeText(horoscopeActivity, "Image not saved \n" + e10, 0).show();
                            return;
                        }
                    }
                    return;
                }
                Intrinsics.n("binding");
                throw null;
        }
    }
}