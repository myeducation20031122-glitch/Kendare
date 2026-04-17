package q;

import a.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import n8.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public Context f16086b;

    public abstract void a(s sVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar;
        if (this.f16086b == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = a.d.f1b;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) {
                a.c cVar = new a.c();
                cVar.f0b = iBinder;
                eVar = cVar;
            } else {
                eVar = (e) iInterfaceQueryLocalInterface;
            }
        }
        Context context = this.f16086b;
        s sVar = new s();
        sVar.f15438j = this;
        sVar.f15435b = eVar;
        sVar.f15436e = componentName;
        sVar.f15437f = context;
        a(sVar);
    }
}