package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k1 extends j1 {
    @Override // m.j1, m.l1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.l1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}