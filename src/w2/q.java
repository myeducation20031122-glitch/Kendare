package w2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements com.bumptech.glide.load.data.e {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f18578f = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f18579b;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f18580e;

    public q(Context context, Uri uri) {
        this.f18579b = context;
        this.f18580e = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return q2.a.f16113b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.d dVar) {
        Cursor cursorQuery = this.f18579b.getContentResolver().query(this.f18580e, f18578f, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (!TextUtils.isEmpty(string)) {
            dVar.g(new File(string));
            return;
        }
        dVar.e(new FileNotFoundException("Failed to find file path for: " + this.f18580e));
    }
}