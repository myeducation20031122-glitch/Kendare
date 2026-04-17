package com.onesignal;

import android.util.Base64;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public String f11794a;

    /* renamed from: b, reason: collision with root package name */
    public String f11795b;

    /* renamed from: c, reason: collision with root package name */
    public String f11796c;

    public f2(String str, String str2, String str3) {
        this.f11794a = str == null ? "onesignal-shared-public" : str;
        this.f11795b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
        this.f11796c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
    }
}