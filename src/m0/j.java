package m0;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import fc.t;
import g.p;
import java.util.Queue;
import t5.a4;
import t5.b4;
import t5.h4;
import t5.i3;
import w2.a0;
import w2.u;
import w2.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j implements v, h4 {

    /* renamed from: b, reason: collision with root package name */
    public Object f15046b;

    public /* synthetic */ j(Object obj) {
        this.f15046b = obj;
    }

    public static j j(Activity activity) {
        return Build.VERSION.SDK_INT < 23 ? new jc.a(activity, 1) : activity instanceof p ? new jc.b((p) activity, 0) : new jc.a(activity, 0);
    }

    @Override // t5.h4
    public final w2.k S() {
        throw null;
    }

    @Override // t5.h4
    public final Context b() {
        throw null;
    }

    @Override // t5.h4
    public final i3 c() {
        throw null;
    }

    @Override // t5.h4
    public final e5.a d() {
        throw null;
    }

    public abstract boolean e();

    public abstract void f(String[] strArr, int i10);

    public Context g() {
        return (Context) this.f15046b;
    }

    public final String h() {
        return g().getPackageName() + "_preferences";
    }

    public final boolean i(CharSequence charSequence, int i10) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        i iVar = (i) this.f15046b;
        if (iVar == null) {
            return e();
        }
        int iA = iVar.a(charSequence, i10);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return e();
        }
        return false;
    }

    public final void k(t2.k kVar) {
        Object obj = this.f15046b;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(kVar);
        }
    }

    public final void l(String str, String str2) {
        Context contextG = g();
        SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        }
    }

    public abstract boolean m(String str);

    public abstract void n(String str, String str2, String str3, int i10, int i11, String... strArr);

    public void o() {
        a4 a4Var = ((b4) this.f15046b).M;
        b4.i(a4Var);
        a4Var.o();
    }

    @Override // w2.v
    public final u v(a0 a0Var) {
        return new w2.e((w2.j) this.f15046b, 2);
    }

    @Override // t5.h4
    public final a4 zzaz() {
        throw null;
    }

    public j(b4 b4Var) {
        t.k(b4Var);
        this.f15046b = b4Var;
    }
}