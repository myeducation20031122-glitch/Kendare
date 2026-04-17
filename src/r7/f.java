package r7;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class f implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16567a;

    public /* synthetic */ f(int i10) {
        this.f16567a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f16567a) {
            case 0:
                return str.startsWith(".ae");
            case QueueFuseable.SYNC /* 1 */:
                Charset charset = v7.a.f18501d;
                return str.startsWith("event") && !str.endsWith("_");
            default:
                Charset charset2 = v7.a.f18501d;
                return str.startsWith("event");
        }
    }
}