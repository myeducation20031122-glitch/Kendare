package com.onesignal;

import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11789a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11790b;

    public f0(int i10) {
        this.f11789a = i10;
        if (i10 == 2) {
            this.f11790b = new Bundle();
            return;
        }
        if (i10 == 3) {
            this.f11790b = new PersistableBundle();
            return;
        }
        if (i10 == 4) {
            this.f11790b = new JSONObject();
            return;
        }
        if (i10 != 5) {
            this.f11790b = null;
            return;
        }
        HashMap map = new HashMap();
        this.f11790b = map;
        map.put(p.class.getName(), new p(1));
        ((HashMap) this.f11790b).put(p.class.getName(), new p(0));
    }

    public final r a() {
        r rVar = (r) ((HashMap) this.f11790b).get(p.class.getName());
        Iterator it = rVar.d().iterator();
        while (it.hasNext()) {
            if (((x9.a) it.next()).f19113a.c()) {
                return rVar;
            }
        }
        return (r) ((HashMap) this.f11790b).get(p.class.getName());
    }

    public final r b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((x9.a) it.next()).f19113a.c()) {
                return (r) ((HashMap) this.f11790b).get(p.class.getName());
            }
        }
        return (r) ((HashMap) this.f11790b).get(p.class.getName());
    }

    public final String toString() {
        switch (this.f11789a) {
            case 4:
                return "ImmutableJSONObject{jsonObject=" + ((JSONObject) this.f11790b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f0(Object obj, int i10) {
        this.f11789a = i10;
        this.f11790b = obj;
    }
}