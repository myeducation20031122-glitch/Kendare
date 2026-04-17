package com.onesignal;

import java.util.concurrent.ArrayBlockingQueue;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11899b;

    public /* synthetic */ j(int i10) {
        this.f11899b = i10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() throws JSONException, InterruptedException {
        switch (this.f11899b) {
            case 0:
                Thread.currentThread().setPriority(10);
                return;
            default:
                synchronized (b1.f11726c) {
                    e3.d().f11783d = 0L;
                }
                if (z3.s() != null) {
                    z3.f12252d = z3.q(z3.f12248b);
                    p4.b().q();
                    p4.a().q();
                    p4.c().q();
                    try {
                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                        o0.d(z3.f12248b, false, false, new d3(arrayBlockingQueue));
                        Object objTake = arrayBlockingQueue.take();
                        if (objTake instanceof m0) {
                            p4.f((m0) objTake);
                        }
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                    p4.b().y(true);
                    p4.a().y(true);
                    p4.c().y(true);
                    s sVarM = z3.m();
                    sVarM.getClass();
                    if (!z3.f12268n) {
                        r rVarA = ((f0) sVarM.f12108d).a();
                        if (rVarA.e() >= rVarA.f12084a) {
                            rVarA.l();
                        }
                    }
                }
                a();
                return;
        }
    }
}