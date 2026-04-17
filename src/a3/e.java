package a3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import q2.m;
import q2.n;
import q2.p;
import s2.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final m f290b = new m("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, m.f16128e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f291a;

    public e(Context context) {
        this.f291a = context.getApplicationContext();
    }

    @Override // q2.p
    public final /* bridge */ /* synthetic */ e0 a(Object obj, int i10, int i11, n nVar) {
        return c((Uri) obj, nVar);
    }

    @Override // q2.p
    public final boolean b(Object obj, n nVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final e0 c(Uri uri, n nVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.f291a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        boolean z7 = true;
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        }
        Resources.Theme theme = (Resources.Theme) nVar.c(f290b);
        if (!contextCreatePackageContext.getPackageName().equals(authority) && theme != null) {
            z7 = false;
        }
        g5.a.c("Can't get a theme from another package", z7);
        Drawable drawableG = theme == null ? c7.b.g(context, contextCreatePackageContext, identifier, null) : c7.b.g(context, context, identifier, theme);
        if (drawableG != null) {
            return new d(drawableG, 0);
        }
        return null;
    }
}