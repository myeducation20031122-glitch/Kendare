package j4;

import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class d3 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d3 f13671b = new d3();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = c4.p.f2122e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}