package r4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.lv0;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.rz0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class o implements rz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16504b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f16503a = i10;
        this.f16504b = obj;
    }

    @Override // com.google.android.gms.internal.ads.rz0
    public final h01 zza(Object obj) {
        int i10 = this.f16503a;
        Object obj2 = this.f16504b;
        switch (i10) {
            case 0:
                final b bVar = (b) obj2;
                final Uri uri = (Uri) obj;
                final int i11 = 0;
                return dq0.T2(bVar.t3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new lv0() { // from class: r4.m
                    @Override // com.google.android.gms.internal.ads.lv0
                    public final Object apply(Object obj3) {
                        int i12 = i11;
                        Object obj4 = uri;
                        switch (i12) {
                            case 0:
                                Uri uri2 = (Uri) obj4;
                                String str = (String) obj3;
                                return !TextUtils.isEmpty(str) ? b.x3(uri2, "nas", str) : uri2;
                            default:
                                String str2 = (String) obj3;
                                b bVar2 = bVar;
                                bVar2.getClass();
                                ArrayList arrayList = new ArrayList();
                                for (Uri uriX3 : (List) obj4) {
                                    if (b.w3(uriX3, bVar2.f16455e0, bVar2.f16457f0) && !TextUtils.isEmpty(str2)) {
                                        uriX3 = b.x3(uriX3, "nas", str2);
                                    }
                                    arrayList.add(uriX3);
                                }
                                return arrayList;
                        }
                    }
                }, bVar.f16461t);
            case QueueFuseable.SYNC /* 1 */:
                final b bVar2 = (b) obj2;
                final ArrayList arrayList = (ArrayList) obj;
                final int i12 = 1;
                return dq0.T2(bVar2.t3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new lv0() { // from class: r4.m
                    @Override // com.google.android.gms.internal.ads.lv0
                    public final Object apply(Object obj3) {
                        int i122 = i12;
                        Object obj4 = arrayList;
                        switch (i122) {
                            case 0:
                                Uri uri2 = (Uri) obj4;
                                String str = (String) obj3;
                                return !TextUtils.isEmpty(str) ? b.x3(uri2, "nas", str) : uri2;
                            default:
                                String str2 = (String) obj3;
                                b bVar22 = bVar2;
                                bVar22.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (Uri uriX3 : (List) obj4) {
                                    if (b.w3(uriX3, bVar22.f16455e0, bVar22.f16457f0) && !TextUtils.isEmpty(str2)) {
                                        uriX3 = b.x3(uriX3, "nas", str2);
                                    }
                                    arrayList2.add(uriX3);
                                }
                                return arrayList2;
                        }
                    }
                }, bVar2.f16461t);
            default:
                h hVar = new h(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    hVar.f16483b = j4.o.f13771f.f13772a.f(((po) obj2).f7450b).toString();
                } catch (JSONException unused) {
                    hVar.f16483b = "{}";
                }
                return dq0.x2(hVar);
        }
    }
}