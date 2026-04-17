package fc;

import com.google.android.gms.internal.ads.r11;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class e0 extends p {
    public long f;
    public boolean j;
    public z0.b m;

    public final void l() {
        long j = this.f - 4294967296L;
        this.f = j;
        if (j <= 0 && this.j) {
            shutdown();
        }
    }

    public final void m(y yVar) {
        z0.b bVar = this.m;
        if (bVar == null) {
            bVar = new z0.b(4);
            this.m = bVar;
        }
        Object[] objArr = (Object[]) bVar.c;
        int i = bVar.b;
        objArr[i] = yVar;
        int length = (objArr.length - 1) & (i + 1);
        bVar.b = length;
        int i2 = bVar.a;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            r11.i3(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = (Object[]) bVar.c;
            int length3 = objArr3.length;
            int i3 = bVar.a;
            r11.i3(objArr3, objArr2, length3 - i3, 0, i3, 4);
            bVar.c = objArr2;
            bVar.a = 0;
            bVar.b = length2;
        }
    }

    public abstract Thread n();

    public final void o(boolean z) {
        this.f = (z ? 4294967296L : 1L) + this.f;
        if (z) {
            return;
        }
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean p() {
        z0.b bVar = this.m;
        if (bVar == null) {
            return false;
        }
        int i = bVar.a;
        y yVar = null;
        if (i != bVar.b) {
            ?? r3 = (Object[]) bVar.c;
            ?? r6 = r3[i];
            r3[i] = 0;
            bVar.a = (i + 1) & (r3.length - 1);
            if (r6 == 0) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            yVar = r6;
        }
        y yVar2 = yVar;
        if (yVar2 == null) {
            return false;
        }
        yVar2.run();
        return true;
    }

    public abstract void shutdown();
}