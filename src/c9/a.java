package c9;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m9.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2179b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2180e;

    public /* synthetic */ a(Object obj, int i10) {
        this.f2179b = i10;
        this.f2180e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f2179b;
        Object obj = this.f2180e;
        switch (i11) {
            case 0:
                d this$0 = (d) obj;
                Intrinsics.f(this$0, "this$0");
                j jVar = this$0.X;
                jVar.getClass();
                jVar.f15239a.finish();
                break;
            default:
                Function0 function0 = (Function0) obj;
                dialogInterface.dismiss();
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }
}