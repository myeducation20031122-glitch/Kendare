package com.onesignal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f12237b;

    public z(Activity activity) {
        this.f12237b = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws PendingIntent.CanceledException {
        Activity activity = this.f12237b;
        try {
            x4.f fVar = x4.f.f18962d;
            PendingIntent pendingIntentC = fVar.c(activity, fVar.d(z3.f12248b, x4.g.f18963a), 9000, null);
            if (pendingIntentC != null) {
                pendingIntentC.send();
            }
        } catch (PendingIntent.CanceledException e10) {
            e10.printStackTrace();
        }
    }
}