package z8;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.c2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19785c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19786a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f19787b;

    public m(p pVar, View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131296707);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.name)");
        this.f19786a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131296774);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.phone)");
        this.f19787b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131296953);
        Intrinsics.e(viewFindViewById3, "view.findViewById(R.id.thumbnail)");
        view.setOnClickListener(new x6.l(2, pVar, this));
    }
}