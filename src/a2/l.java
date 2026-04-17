package a2;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.DeadSystemException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern g(int i10, int i11) {
        return new MediaCodec.CryptoInfo.Pattern(i10, i11);
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean z(Throwable th) {
        return th instanceof DeadSystemException;
    }
}