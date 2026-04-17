package w3;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.onesignal.g1;
import com.onesignal.y3;
import com.onesignal.z3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18604b;

    public /* synthetic */ a(int i10) {
        this.f18604b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18604b) {
            case 0:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f2424a;
                break;
            default:
                g1.f11808b = true;
                z3.b(y3.f12233n, "OSFocusHandler setting stop state: true", null);
                break;
        }
    }
}