package a5;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.bu0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j0 extends bu0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, Looper looper) {
        super(looper, 2);
        this.f357b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        if (this.f357b.f319e0.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                c0 c0Var = (c0) message.obj;
                c0Var.getClass();
                c0Var.e();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 1 && i11 != 7) {
            if (i11 == 4) {
                this.f357b.getClass();
            } else if (i11 == 5) {
            }
            if (!this.f357b.D()) {
            }
        } else if (!this.f357b.D()) {
            c0 c0Var2 = (c0) message.obj;
            c0Var2.getClass();
            c0Var2.e();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            f fVar = this.f357b;
            fVar.f315b0 = new x4.b(message.arg2);
            if (!fVar.f316c0 && !TextUtils.isEmpty(fVar.A()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fVar.A());
                    f fVar2 = this.f357b;
                    if (!fVar2.f316c0) {
                        fVar2.I(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            f fVar3 = this.f357b;
            x4.b bVar = fVar3.f315b0;
            if (bVar == null) {
                bVar = new x4.b(8);
            }
            fVar3.R.a(bVar);
            f fVar4 = this.f357b;
            fVar4.getClass();
            fVar4.f321j = bVar.f18952e;
            fVar4.f322m = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            f fVar5 = this.f357b;
            x4.b bVar2 = fVar5.f315b0;
            if (bVar2 == null) {
                bVar2 = new x4.b(8);
            }
            fVar5.R.a(bVar2);
            f fVar6 = this.f357b;
            fVar6.getClass();
            fVar6.f321j = bVar2.f18952e;
            fVar6.f322m = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj2 = message.obj;
            PendingIntent pendingIntent = obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null;
            int i13 = message.arg2;
            this.f357b.R.a(new x4.b(i13, pendingIntent));
            f fVar7 = this.f357b;
            fVar7.getClass();
            fVar7.f321j = i13;
            fVar7.f322m = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.f357b.I(5, null);
            b bVar3 = this.f357b.W;
            if (bVar3 != null) {
                bVar3.A(message.arg2);
            }
            this.f357b.E(message.arg2);
            f.H(this.f357b, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f357b.a()) {
            c0 c0Var3 = (c0) message.obj;
            c0Var3.getClass();
            c0Var3.e();
            return;
        }
        int i14 = message.what;
        if (i14 != 2 && i14 != 1 && i14 != 7) {
            Log.wtf("GmsClient", kc.r.d("Don't know how to handle message: ", i14), new Exception());
            return;
        }
        c0 c0Var4 = (c0) message.obj;
        synchronized (c0Var4) {
            try {
                obj = c0Var4.f304a;
                if (c0Var4.f305b) {
                    Log.w("GmsClient", "Callback proxy " + c0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            c0Var4.a();
        }
        synchronized (c0Var4) {
            c0Var4.f305b = true;
        }
        c0Var4.e();
    }
}