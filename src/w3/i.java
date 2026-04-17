package w3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.isprid.kendare.model.DDevice;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import n8.q;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class i implements y3.b, i8.a, o3.h, x5.e, x5.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18628b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18630f;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f18628b = i10;
        this.f18629e = obj;
        this.f18630f = obj2;
    }

    public final void a(m2.e eVar) {
        t9.g gVar = (t9.g) this.f18629e;
        Purchase purchase = (Purchase) this.f18630f;
        Date date = t9.g.N;
        gVar.getClass();
        if (eVar.f15097b == 0) {
            gVar.D(purchase);
        } else {
            gVar.y(115, null);
        }
    }

    @Override // o3.h
    public final void c(Exception exc) {
        x5.l lVar = (x5.l) this.f18629e;
        r7.a aVar = (r7.a) this.f18630f;
        if (exc != null) {
            lVar.c(exc);
        } else {
            lVar.d(aVar);
        }
    }

    @Override // i8.a
    public final void d(i8.c cVar) {
        i8.a aVar = (i8.a) this.f18629e;
        i8.a aVar2 = (i8.a) this.f18630f;
        aVar.d(cVar);
        aVar2.d(cVar);
    }

    @Override // y3.b
    public final Object execute() {
        int i10 = this.f18628b;
        Object obj = this.f18630f;
        Object obj2 = this.f18629e;
        switch (i10) {
            case 0:
                Iterable iterable = (Iterable) obj;
                x3.l lVar = (x3.l) ((k) obj2).f18636c;
                lVar.getClass();
                if (iterable.iterator().hasNext()) {
                    lVar.a().compileStatement("DELETE FROM events WHERE _id in " + x3.l.g(iterable)).execute();
                    break;
                }
                break;
            default:
                k kVar = (k) obj2;
                kVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long jIntValue = ((Integer) entry.getValue()).intValue();
                    u3.c cVar = u3.c.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    x3.l lVar2 = (x3.l) kVar.f18642i;
                    lVar2.getClass();
                    lVar2.c(new j(str, jIntValue, cVar));
                }
                break;
        }
        return null;
    }

    @Override // x5.e
    public final void onComplete(x5.k task) {
        int i10 = this.f18628b;
        Object obj = this.f18630f;
        Object obj2 = this.f18629e;
        switch (i10) {
            case 4:
                int i11 = n8.g.f15406n;
                ((n8.g) obj2).a((Intent) obj);
                break;
            default:
                r9.b this$0 = (r9.b) obj2;
                DDevice device = (DDevice) obj;
                Intrinsics.f(this$0, "this$0");
                Intrinsics.f(device, "$device");
                Intrinsics.f(task, "task");
                if (!task.j()) {
                    this$0.c(device);
                    Log.e("DeviceViewModel", "GetInstanceId failed ", task.g());
                    break;
                } else {
                    String string = ((String) task.h()).toString();
                    this$0.f16649d = string;
                    Log.e("New Token", String.valueOf(string));
                    this$0.c(device);
                    break;
                }
        }
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        switch (this.f18628b) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                Context context = (Context) this.f18629e;
                Intent intent = (Intent) this.f18630f;
                Object obj = n8.i.f15414c;
                return (y.q() && ((Integer) kVar.h()).intValue() == 402) ? n8.i.a(context, intent).e(new n.a(9), new u7.a(4)) : kVar;
            default:
                q qVar = (q) this.f18629e;
                String str = (String) this.f18630f;
                synchronized (qVar) {
                    qVar.f15433b.remove(str);
                }
                return kVar;
        }
    }
}