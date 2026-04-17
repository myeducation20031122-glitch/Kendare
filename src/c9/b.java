package c9;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.wh0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m9.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2181b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2182e;

    public /* synthetic */ b(Object obj, int i10) {
        this.f2181b = i10;
        this.f2182e = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        int i11 = this.f2181b;
        Object obj = this.f2182e;
        switch (i11) {
            case 0:
                d this$0 = (d) obj;
                Intrinsics.f(this$0, "this$0");
                if (i10 == 4) {
                    if (!this$0.V) {
                        j jVar = this$0.X;
                        jVar.getClass();
                        jVar.f15239a.finish();
                        break;
                    } else {
                        dialogInterface.dismiss();
                        break;
                    }
                }
                break;
            default:
                wh0 this$02 = (wh0) obj;
                Intrinsics.f(this$02, "this$0");
                if (i10 == 4) {
                    Function0 function0 = (Function0) this$02.f9519w;
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                }
                break;
        }
        return false;
    }
}