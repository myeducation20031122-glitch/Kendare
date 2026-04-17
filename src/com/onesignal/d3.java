package com.onesignal;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d3 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f11753a;

    public d3(ArrayBlockingQueue arrayBlockingQueue) {
        this.f11753a = arrayBlockingQueue;
    }

    @Override // com.onesignal.k0
    public final n0 a() {
        return n0.f12007f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.k0
    public final void b(m0 m0Var) {
        m0 obj = m0Var;
        if (m0Var == null) {
            obj = new Object();
        }
        this.f11753a.offer(obj);
    }
}