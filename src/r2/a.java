package r2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16371b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f16372a;

    public a(ContentResolver contentResolver) {
        this.f16372a = contentResolver;
    }

    @Override // r2.d
    public final Cursor a(Uri uri) {
        return this.f16372a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f16371b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}