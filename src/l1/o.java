package l1;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public final String f14492b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14493c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f14494d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f14495e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f14496f;

    /* renamed from: g, reason: collision with root package name */
    public p1.c f14497g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14498h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14500j;

    /* renamed from: l, reason: collision with root package name */
    public HashSet f14502l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f14491a = WorkDatabase.class;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14499i = true;

    /* renamed from: k, reason: collision with root package name */
    public final p8.c f14501k = new p8.c(12);

    public o(Context context, String str) {
        this.f14493c = context;
        this.f14492b = str;
    }

    public final void a(m1.a... aVarArr) {
        if (this.f14502l == null) {
            this.f14502l = new HashSet();
        }
        for (m1.a aVar : aVarArr) {
            this.f14502l.add(Integer.valueOf(aVar.f15052a));
            this.f14502l.add(Integer.valueOf(aVar.f15053b));
        }
        p8.c cVar = this.f14501k;
        cVar.getClass();
        for (m1.a aVar2 : aVarArr) {
            int i10 = aVar2.f15052a;
            TreeMap treeMap = (TreeMap) ((HashMap) cVar.f16073e).get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) cVar.f16073e).put(Integer.valueOf(i10), treeMap);
            }
            int i11 = aVar2.f15053b;
            m1.a aVar3 = (m1.a) treeMap.get(Integer.valueOf(i11));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i11), aVar2);
        }
    }
}