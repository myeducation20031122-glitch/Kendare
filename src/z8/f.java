package z8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.c2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19771a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f19772b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f19773c;

    public f(g gVar, View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131296707);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.name)");
        this.f19771a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131296613);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.lagna)");
        TextView textView = (TextView) viewFindViewById2;
        this.f19772b = textView;
        View viewFindViewById3 = view.findViewById(2131296476);
        Intrinsics.e(viewFindViewById3, "view.findViewById(R.id.delete)");
        this.f19773c = (ImageView) viewFindViewById3;
        textView.setTypeface(gVar.f19776c);
    }
}