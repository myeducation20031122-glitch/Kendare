package z0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.es0;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.vf1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f19424a;

    /* renamed from: b, reason: collision with root package name */
    public int f19425b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19426c;

    public b(int i10) {
        if (i10 == 4) {
            this.f19426c = new Object[16];
            return;
        }
        this.f19426c = na0.f6782a;
        this.f19425b = 0;
        this.f19424a = 2;
    }

    public final void a(vf1 vf1Var) {
        ByteBuffer byteBuffer = vf1Var.f9299d;
        byteBuffer.getClass();
        if (byteBuffer.limit() - vf1Var.f9299d.position() == 0) {
            return;
        }
        ByteBuffer byteBuffer2 = vf1Var.f9299d;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (((ByteBuffer) this.f19426c).capacity() < i12) {
            this.f19426c = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f19426c).clear();
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) this.f19426c;
        byteBuffer3.put((byte) 79);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 83);
        byteBuffer3.put((byte) 0);
        byteBuffer3.put((byte) 0);
        int iL = this.f19425b + ((int) ((com.bumptech.glide.f.L(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
        this.f19425b = iL;
        byteBuffer3.putLong(iL);
        byteBuffer3.putInt(0);
        byteBuffer3.putInt(this.f19424a);
        this.f19424a++;
        byteBuffer3.putInt(0);
        byteBuffer3.put((byte) i11);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i10 >= 255) {
                byteBuffer3.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer3.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        byteBuffer3.putInt(22, es0.j(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        byteBuffer3.position(0);
        this.f19426c = byteBuffer3;
        vf1Var.d();
        vf1Var.e(((ByteBuffer) this.f19426c).remaining());
        vf1Var.f9299d.put((ByteBuffer) this.f19426c);
        vf1Var.f();
    }

    public final synchronized int b() {
        int i10 = this.f19425b;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = ((Context) this.f19426c).getPackageManager();
        if (g5.b.a((Context) this.f19426c).f883b.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!y.q()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f19425b = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f19425b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (y.q()) {
            this.f19425b = 2;
            i11 = 2;
        } else {
            this.f19425b = 1;
        }
        return i11;
    }
}