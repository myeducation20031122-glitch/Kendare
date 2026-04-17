package s9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16951a = new f();

    public static String a(Context context, String str) {
        return context.getResources().getString(b(context, str + "_sin"));
    }

    public static int b(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static void c(Context context, Bitmap bitmap) {
        File file;
        if (bitmap == null) {
            Log.e("Share", "share no image");
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            file = new File(context.getExternalFilesDir(null) + "/" + context.getString(2131886136));
            if (!file.exists()) {
                file.mkdir();
            }
        } else {
            file = new File(Environment.getExternalStorageDirectory(), "/Kendare");
        }
        if (!file.exists() && !file.mkdirs()) {
            Log.e("Share", "Can't create directory to save image. > " + file.getAbsolutePath());
            Toast.makeText(context, "Can not create directory to save image.", 1).show();
            return;
        }
        Object[] objArr = {Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), file.getAbsolutePath()};
        StringBuilder sb = new StringBuilder();
        f fVar = f16951a;
        sb.append(fVar.f16958a);
        sb.append(String.format("Saving %dx%d bitmap to %s.", objArr));
        Log.i("Kendare Logger", sb.toString());
        File file2 = new File(file, "kendare_" + System.currentTimeMillis() + ".png");
        boolean zExists = file2.exists();
        String str = fVar.f16958a;
        if (zExists) {
            Log.i("Kendare Logger", str + "file.exists");
            file2.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e10) {
            Log.e("Kendare Logger", str + "Exception!", e10);
        }
        try {
            Uri uriD = FileProvider.d(context, file2);
            context.grantUriPermission(context.getPackageName(), uriD, 3);
            d(context, uriD);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void d(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.SUBJECT", context.getResources().getString(2131886136));
            intent.putExtra("android.intent.extra.TEXT", context.getResources().getString(2131886963) + " " + context.getResources().getString(2131886136) + ". " + context.getResources().getString(2131886964) + "https://play.google.com/store/apps/details?id=" + context.getPackageName());
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, "Share Image:"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}