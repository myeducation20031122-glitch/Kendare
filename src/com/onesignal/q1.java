package com.onesignal;

import android.content.DialogInterface;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q1 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f12065b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f12066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f12067f;

    public q1(s1 s1Var, u1 u1Var, List list) {
        this.f12067f = s1Var;
        this.f12065b = u1Var;
        this.f12066e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f12067f.q0(this.f12065b, this.f12066e);
    }
}