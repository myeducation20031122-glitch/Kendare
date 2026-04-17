package j1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13532a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13533b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13534c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13535d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13537f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f13538g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f13539h;

    public b(AssetManager assetManager, n.a aVar, d dVar, String str, File file) {
        this.f13532a = aVar;
        this.f13533b = dVar;
        this.f13536e = str;
        this.f13535d = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e.f13557i;
                    break;
                case 26:
                    bArr = e.f13556h;
                    break;
                case 27:
                    bArr = e.f13555g;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f13554f;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f13553e;
                    break;
            }
        }
        this.f13534c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f13533b.r();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f13532a.execute(new a(this, i10, serializable, 0));
    }
}