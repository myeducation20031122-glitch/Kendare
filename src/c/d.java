package c;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import androidx.activity.h;
import androidx.emoji2.text.j;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.v0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2010b;

    /* renamed from: e, reason: collision with root package name */
    public final int f2011e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2012f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2013j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, ArrayList arrayList) {
        this(arrayList, i10, null);
        this.f2010b = 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b bVar;
        int i10 = this.f2010b;
        int i11 = 0;
        int i12 = this.f2011e;
        Object obj = this.f2012f;
        Object obj2 = this.f2013j;
        switch (i10) {
            case 0:
                ((e) obj2).a(i12, (Bundle) obj);
                return;
            case QueueFuseable.SYNC /* 1 */:
                h hVar = (h) obj2;
                Object obj3 = ((d9.c) obj).f12366b;
                String str = (String) hVar.f573a.get(Integer.valueOf(i12));
                if (str == null) {
                    return;
                }
                androidx.activity.result.e eVar = (androidx.activity.result.e) hVar.f577e.get(str);
                if (eVar == null || (bVar = eVar.f569a) == null) {
                    hVar.f579g.remove(str);
                    hVar.f578f.put(str, obj3);
                    return;
                } else {
                    if (hVar.f576d.remove(str)) {
                        bVar.g(obj3);
                        return;
                    }
                    return;
                }
            case 2:
                ((h) obj2).a(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 3:
                ((q.a) obj2).getClass();
                throw null;
            case 4:
                String[] strArr = (String[]) obj;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj2;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((e0.e) activity).onRequestPermissionsResult(i12, strArr, iArr);
                return;
            case g.INVALID_ACCOUNT /* 5 */:
                com.bumptech.glide.d dVar = (com.bumptech.glide.d) ((v0) obj).f12909e;
                if (dVar != null) {
                    dVar.v(i12);
                    return;
                }
                return;
            case g.RESOLUTION_REQUIRED /* 6 */:
                List list = (List) obj;
                int size = list.size();
                if (i12 != 1) {
                    while (i11 < size) {
                        ((j) list.get(i11)).a();
                        i11++;
                    }
                    return;
                } else {
                    while (i11 < size) {
                        ((j) list.get(i11)).b();
                        i11++;
                    }
                    return;
                }
            case g.NETWORK_ERROR /* 7 */:
                ((c2.h) obj).b((Intent) obj2, i12);
                return;
            case 8:
                ((SystemForegroundService) obj2).f1815m.notify(i12, (Notification) obj);
                return;
            default:
                ((BottomSheetBehavior) obj2).F(i12, (View) obj, false);
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(j jVar, int i10) {
        this.f2010b = 6;
        j[] jVarArr = new j[1];
        if (jVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        jVarArr[0] = jVar;
        this(Arrays.asList(jVarArr), i10, null);
    }

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.f2010b = i11;
        this.f2013j = obj;
        this.f2011e = i10;
        this.f2012f = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f2010b = i11;
        this.f2012f = obj;
        this.f2013j = obj2;
        this.f2011e = i10;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f2010b = i11;
        this.f2013j = obj;
        this.f2012f = obj2;
        this.f2011e = i10;
    }

    public d(List list, int i10, Throwable th) {
        this.f2010b = 6;
        if (list == null) {
            throw new NullPointerException("initCallbacks cannot be null");
        }
        this.f2012f = new ArrayList(list);
        this.f2011e = i10;
        this.f2013j = th;
    }
}