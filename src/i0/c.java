package i0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Icon c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Bitmap bitmapA;
        Icon iconCreateWithResource;
        int i10;
        Bitmap bitmapDecodeStream;
        Bitmap bitmapDecodeStream2;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        StringBuilder sb;
        int i11 = iconCompat.f806a;
        String strB = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i11) {
            case y4.g.SUCCESS_CACHE /* -1 */:
                return (Icon) iconCompat.f807b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case QueueFuseable.SYNC /* 1 */:
                bitmapA = (Bitmap) iconCompat.f807b;
                iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 2:
                if (i11 == -1 && (i10 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f807b;
                    if (i10 >= 28) {
                        strB = e.b(obj);
                    } else {
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f815j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f807b).split(":", -1)[0] : iconCompat.f815j;
                }
                iconCreateWithResource = Icon.createWithResource(strB, iconCompat.f810e);
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                }
                return iconCreateWithResource;
            case 3:
                iconCreateWithResource = Icon.createWithData((byte[]) iconCompat.f807b, iconCompat.f810e, iconCompat.f811f);
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                }
                return iconCreateWithResource;
            case 4:
                iconCreateWithResource = Icon.createWithContentUri((String) iconCompat.f807b);
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                }
                return iconCreateWithResource;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmapDecodeStream2 = (Bitmap) iconCompat.f807b;
                    iconCreateWithResource = d.b(bitmapDecodeStream2);
                    colorStateList = iconCompat.f812g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f813h;
                    if (mode != IconCompat.f805k) {
                    }
                    return iconCreateWithResource;
                }
                bitmapDecodeStream = (Bitmap) iconCompat.f807b;
                bitmapA = IconCompat.a(bitmapDecodeStream, false);
                iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                }
                return iconCreateWithResource;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithResource = f.a(iconCompat.f());
                    colorStateList = iconCompat.f812g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f813h;
                    if (mode != IconCompat.f805k) {
                    }
                    return iconCreateWithResource;
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.f());
                }
                Uri uriF = iconCompat.f();
                String scheme = uriF.getScheme();
                if ("content".equals(scheme) || "file".equals(scheme)) {
                    try {
                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF);
                    } catch (Exception e11) {
                        e = e11;
                        sb = new StringBuilder("Unable to load image from URI: ");
                        sb.append(uriF);
                        Log.w("IconCompat", sb.toString(), e);
                        if (inputStreamOpenInputStream != null) {
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.f());
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        iconCreateWithResource = d.b(bitmapDecodeStream2);
                    } else {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        bitmapA = IconCompat.a(bitmapDecodeStream, false);
                        iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                    }
                } else {
                    try {
                        inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f807b));
                    } catch (FileNotFoundException e12) {
                        e = e12;
                        sb = new StringBuilder("Unable to load image from path: ");
                        sb.append(uriF);
                        Log.w("IconCompat", sb.toString(), e);
                        if (inputStreamOpenInputStream != null) {
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                    }
                }
                colorStateList = iconCompat.f812g;
                if (colorStateList != null) {
                }
                mode = iconCompat.f813h;
                if (mode != IconCompat.f805k) {
                }
                return iconCreateWithResource;
        }
    }
}