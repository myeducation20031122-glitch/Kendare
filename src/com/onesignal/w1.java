package com.onesignal;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12213a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OSInAppMessagePrompt{key=");
        switch (((y1) this).f12224b) {
            case 0:
                str = "push";
                break;
            default:
                str = "location";
                break;
        }
        sb.append(str);
        sb.append(" prompted=");
        sb.append(this.f12213a);
        sb.append('}');
        return sb.toString();
    }
}