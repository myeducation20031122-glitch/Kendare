package ab;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.b = i;
        this.e = obj;
    }

    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                e eVar = (e) obj;
                sb2.append(eVar.b.e());
                String string = sb2.toString();
                List upperBounds = eVar.e.getUpperBounds();
                TypeIntersectionScope.c.getClass();
                return TypeIntersectionScope.Companion.a(string, upperBounds);
            default:
                return (List) obj;
        }
    }
}