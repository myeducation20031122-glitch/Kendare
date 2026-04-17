package w2;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18598a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18599b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18600c;

    public y(Resources resources, u uVar) {
        this.f18600c = resources;
        this.f18599b = uVar;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        t tVarA;
        Uri uri;
        int i12 = this.f18598a;
        Object obj2 = this.f18599b;
        Object obj3 = this.f18600c;
        switch (i12) {
            case 0:
                List list = (List) obj2;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                q2.j jVar = null;
                for (int i13 = 0; i13 < size; i13++) {
                    u uVar = (u) list.get(i13);
                    if (uVar.b(obj) && (tVarA = uVar.a(obj, i10, i11, nVar)) != null) {
                        arrayList.add(tVarA.f18589c);
                        jVar = tVarA.f18587a;
                    }
                }
                if (arrayList.isEmpty() || jVar == null) {
                    return null;
                }
                return new t(jVar, new x(arrayList, (n0.c) obj3));
            default:
                Integer num = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj3).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj3).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e10) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((u) obj2).a(uri, i10, i11, nVar);
        }
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        switch (this.f18598a) {
            case 0:
                Iterator it = ((List) this.f18599b).iterator();
                while (it.hasNext()) {
                    if (((u) it.next()).b(obj)) {
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f18598a) {
            case 0:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f18599b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public y(ArrayList arrayList, n0.c cVar) {
        this.f18599b = arrayList;
        this.f18600c = cVar;
    }
}