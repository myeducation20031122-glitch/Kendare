package com.onesignal;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12138b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f12139e;

    public /* synthetic */ s3(k1 k1Var, int i10) {
        this.f12138b = i10;
        this.f12139e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12138b) {
            case 0:
                z3.f12272r.getClass();
                l.d("Running getTags() operation from pending queue.");
                z3.r(this.f12139e);
                return;
            default:
                ArrayList arrayList = z3.R;
                synchronized (arrayList) {
                    try {
                        arrayList.add(this.f12139e);
                        if (arrayList.size() > 1) {
                            return;
                        }
                        if (z3.s() != null) {
                            z3.z();
                            return;
                        } else {
                            z3.f12272r.getClass();
                            l.l("getTags called under a null user!");
                            return;
                        }
                    } finally {
                    }
                }
        }
    }
}