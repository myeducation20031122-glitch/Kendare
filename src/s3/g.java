package s3;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f16849a;

    /* renamed from: b, reason: collision with root package name */
    public final d f16850b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16851c;

    public g(Context context, d dVar) {
        f fVar = new f(context);
        this.f16851c = new HashMap();
        this.f16849a = fVar;
        this.f16850b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f16851c.containsKey(str)) {
            return (h) this.f16851c.get(str);
        }
        CctBackendFactory cctBackendFactoryA = this.f16849a.a(str);
        if (cctBackendFactoryA == null) {
            return null;
        }
        d dVar = this.f16850b;
        h hVarCreate = cctBackendFactoryA.create(new b(dVar.f16840a, dVar.f16841b, dVar.f16842c, str));
        this.f16851c.put(str, hVarCreate);
        return hVarCreate;
    }
}