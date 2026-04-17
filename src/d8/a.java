package d8;

import e8.f;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12346a;

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        switch (this.f12346a) {
            case 0:
                throw new b8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case QueueFuseable.SYNC /* 1 */:
                Map.Entry entry = (Map.Entry) obj;
                b8.e eVar = (b8.e) obj2;
                Charset charset = f.f12548f;
                eVar.a(f.f12549g, entry.getKey());
                eVar.a(f.f12550h, entry.getValue());
                return;
            default:
                throw new b8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}