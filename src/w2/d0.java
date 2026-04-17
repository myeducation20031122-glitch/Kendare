package w2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18548a;

    /* renamed from: b, reason: collision with root package name */
    public final u f18549b;

    public /* synthetic */ d0(u uVar, int i10) {
        this.f18548a = i10;
        this.f18549b = uVar;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        Uri uriFromFile;
        File file;
        int i12 = this.f18548a;
        u uVar = this.f18549b;
        switch (i12) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else {
                    if (str.charAt(0) == '/') {
                        file = new File(str);
                    } else {
                        Uri uri = Uri.parse(str);
                        if (uri.getScheme() == null) {
                            file = new File(str);
                        } else {
                            uriFromFile = uri;
                        }
                    }
                    uriFromFile = Uri.fromFile(file);
                }
                if (uriFromFile == null || !uVar.b(uriFromFile)) {
                    return null;
                }
                return uVar.a(uriFromFile, i10, i11, nVar);
            default:
                return uVar.a(new l((URL) obj), i10, i11, nVar);
        }
    }

    @Override // w2.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f18548a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}