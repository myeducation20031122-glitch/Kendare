package o0;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i1 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f15564b;

    public /* synthetic */ i1(ViewGroup viewGroup, int i10) {
        this.f15563a = i10;
        this.f15564b = viewGroup;
    }

    public final Iterator iterator() {
        int i10 = this.f15563a;
        ViewGroup viewGroup = this.f15564b;
        switch (i10) {
            case 0:
                return new j1(viewGroup);
            default:
                return new g0(new i1(viewGroup, 0).iterator());
        }
    }
}