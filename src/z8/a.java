package z8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.c2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f19758a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f19759b;

    /* renamed from: c, reason: collision with root package name */
    public final View f19760c;

    public a(View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131296586);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.image_article)");
        this.f19758a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131296927);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.text_article_title)");
        this.f19759b = (TextView) viewFindViewById2;
        this.f19760c = view;
    }
}