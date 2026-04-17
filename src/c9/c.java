package c9;

import android.content.DialogInterface;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2183b;

    public /* synthetic */ c(int i10) {
        this.f2183b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f2183b) {
            case 0:
                dialogInterface.dismiss();
                break;
            case QueueFuseable.SYNC /* 1 */:
                int i11 = g.Y;
                dialogInterface.dismiss();
                break;
            case 3:
                int i12 = l9.a.f14688a0;
                dialogInterface.dismiss();
                break;
            case 4:
                int i13 = l9.e.f14696a0;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    break;
                }
                break;
        }
    }
}