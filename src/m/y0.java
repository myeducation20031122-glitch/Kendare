package m;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import t5.l5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15004b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15006f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15007j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15008m;

    public /* synthetic */ y0(androidx.emoji2.text.o oVar, int i10, t5.i3 i3Var, Intent intent) {
        this.f15006f = oVar;
        this.f15005e = i10;
        this.f15007j = i3Var;
        this.f15008m = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15004b;
        int i11 = this.f15005e;
        Object obj = this.f15007j;
        Object obj2 = this.f15006f;
        switch (i10) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i11);
                break;
            default:
                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) obj2;
                t5.i3 i3Var = (t5.i3) obj;
                Intent intent = (Intent) this.f15008m;
                if (((l5) oVar.f883b).zzc(i11)) {
                    i3Var.Q.b(Integer.valueOf(i11), "Local AppMeasurementService processed last upload request. StartId");
                    oVar.n().Q.a("Completed wakeful intent.");
                    ((l5) oVar.f883b).a(intent);
                    break;
                }
                break;
        }
    }

    public y0(d1 d1Var, TextView textView, Typeface typeface, int i10) {
        this.f15008m = d1Var;
        this.f15006f = textView;
        this.f15007j = typeface;
        this.f15005e = i10;
    }
}