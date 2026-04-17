package r2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16373b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f16374a;

    public b(ContentResolver contentResolver) {
        this.f16374a = contentResolver;
    }

    @Override // r2.d
    public final Cursor a(Uri uri) {
        return this.f16374a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f16373b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}