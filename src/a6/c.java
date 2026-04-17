package a6;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo f(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder g() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ void r() {
    }

    public static /* bridge */ /* synthetic */ boolean z(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}