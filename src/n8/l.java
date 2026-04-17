package n8;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class l implements x5.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f15421b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f15423f;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, String str, t tVar) {
        this.f15421b = firebaseMessaging;
        this.f15422e = str;
        this.f15423f = tVar;
    }

    public final x5.s a() {
        FirebaseMessaging firebaseMessaging = this.f15421b;
        v7.b bVar = firebaseMessaging.f11632c;
        return bVar.e(bVar.n(com.android.volley.toolbox.e.d((i7.g) bVar.f18509b), "*", new Bundle())).k(firebaseMessaging.f11636g, new l(firebaseMessaging, this.f15422e, this.f15423f));
    }

    @Override // x5.j
    public final x5.k then(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f15421b;
        String str = this.f15422e;
        t tVar = this.f15423f;
        String str2 = (String) obj;
        p5.g gVarC = FirebaseMessaging.c(firebaseMessaging.f11631b);
        i7.g gVar = firebaseMessaging.f11630a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f13428b) ? "" : gVar.d();
        String strA = firebaseMessaging.f11637h.a();
        synchronized (gVarC) {
            String strA2 = t.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) gVarC.f15951b).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f15440a)) {
            i7.g gVar2 = firebaseMessaging.f11630a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f13428b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f13428b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new i(firebaseMessaging.f11631b).b(intent);
            }
        }
        return j4.i(str2);
    }
}