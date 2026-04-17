package a5;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.ads.ic1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Account f330a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f331b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f332c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f333d;

    /* renamed from: e, reason: collision with root package name */
    public final View f334e;

    /* renamed from: f, reason: collision with root package name */
    public final String f335f;

    /* renamed from: g, reason: collision with root package name */
    public final String f336g;

    /* renamed from: h, reason: collision with root package name */
    public final u5.a f337h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f338i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    public h(Account account, Set set, t.b bVar, String str, String str2, u5.a aVar) {
        this.f330a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f331b = setEmptySet;
        t.b bVarEmptyMap = bVar == null ? Collections.emptyMap() : bVar;
        this.f333d = bVarEmptyMap;
        this.f335f = str;
        this.f336g = str2;
        this.f337h = aVar == null ? u5.a.f18280b : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = bVarEmptyMap.values().iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
        this.f332c = Collections.unmodifiableSet(hashSet);
    }
}