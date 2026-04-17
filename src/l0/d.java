package l0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.ads.yl0;
import g.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f14439a = new b(0);

    public static yl0 a(Context context, t tVar) throws Throwable {
        Object obj;
        Cursor cursorD;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) tVar.f14936c;
        int i10 = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(a0.h.v("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals((String) tVar.f14937d)) {
            StringBuilder sbA = a0.h.A("Found content provider ", str, ", but package was not ");
            sbA.append((String) tVar.f14937d);
            throw new PackageManager.NameNotFoundException(sbA.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        b bVar = f14439a;
        Collections.sort(arrayList, bVar);
        List listE = (List) tVar.f14939f;
        if (listE == null) {
            listE = fc.t.E(resources, tVar.f14935b);
        }
        int i11 = 0;
        loop1: while (true) {
            obj = null;
            if (i11 >= listE.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listE.get(i11));
            Collections.sort(arrayList2, bVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i12), (byte[]) arrayList2.get(i12))) {
                        break;
                    }
                }
                break loop1;
            }
            i11++;
        }
        int i13 = 2;
        int i14 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new yl0(i14, obj, i13);
        }
        String str2 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str2).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        c u0Var = Build.VERSION.SDK_INT < 24 ? new u0(context, uriBuild) : new p8.c(context, uriBuild);
        try {
            cursorD = u0Var.d(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) tVar.f14938e});
            if (cursorD != null) {
                try {
                    if (cursorD.getCount() > 0) {
                        int columnIndex = cursorD.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursorD.getColumnIndex("_id");
                        int columnIndex3 = cursorD.getColumnIndex("file_id");
                        int columnIndex4 = cursorD.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorD.getColumnIndex("font_weight");
                        int columnIndex6 = cursorD.getColumnIndex("font_italic");
                        while (cursorD.moveToNext()) {
                            arrayList3.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorD.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorD.getLong(columnIndex3)), columnIndex4 != -1 ? cursorD.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorD.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorD.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorD.getInt(columnIndex) : 0));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorD != null) {
                        cursorD.close();
                    }
                    u0Var.close();
                    throw th;
                }
            }
            if (cursorD != null) {
                cursorD.close();
            }
            u0Var.close();
            return new yl0(i10, (i[]) arrayList3.toArray(new i[0]), 2);
        } catch (Throwable th2) {
            th = th2;
            cursorD = null;
        }
    }
}