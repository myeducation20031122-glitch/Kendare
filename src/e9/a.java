package e9;

import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12562a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12563b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f12564c;

    /* renamed from: d, reason: collision with root package name */
    public final c31 f12565d;

    public a(int i10, a31 a31Var) {
        this.f12564c = i10;
        this.f12565d = a31Var;
    }

    public final void a(f9.a aVar) {
        ArrayList arrayList;
        switch (aVar.f12708h) {
            case g.INVALID_ACCOUNT /* 5 */:
            case g.RESOLUTION_REQUIRED /* 6 */:
            case 11:
                arrayList = this.f12563b;
                break;
            default:
                arrayList = this.f12562a;
                break;
        }
        arrayList.add(aVar);
    }

    public final String b() {
        Iterator it = this.f12562a.iterator();
        String strConcat = "";
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i10 = cVar.f12573b;
            if (i10 != 11 && i10 != 10) {
                if (strConcat.equals("")) {
                    strConcat = cVar.f().concat("");
                } else {
                    StringBuilder sbO = ic1.o(strConcat, ",");
                    sbO.append(cVar.f());
                    strConcat = sbO.toString();
                }
            }
        }
        return strConcat;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c c() {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.getClass();
            int i10 = ((f9.a) cVar).f12708h;
            switch (i10) {
                case 2:
                case g.DEVELOPER_ERROR /* 10 */:
                    return cVar;
                default:
                    switch (i10) {
                        case 0:
                        case QueueFuseable.SYNC /* 1 */:
                            return cVar;
                    }
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    public final int d(int i10) {
        return (((this.f12564c + i10) - 2) % 12) + 1;
    }

    public final boolean e() {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            switch (((f9.a) ((c) it.next())).f12708h) {
                case 3:
                case 4:
                case g.NETWORK_ERROR /* 7 */:
                case 8:
                case 9:
                    return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12564c == aVar.f12564c && this.f12565d.equals(aVar.f12565d);
    }

    public final boolean f(int i10) {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f12573b == i10) {
                return true;
            }
        }
        return false;
    }

    public final void g(int... iArr) {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            for (int i10 : iArr) {
                cVar.getClass();
            }
        }
    }

    public final boolean h() {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            int i10 = ((c) it.next()).f12573b;
            if (i10 != 11 && i10 != 10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12564c ^ 1000003) * 1000003) ^ this.f12565d.hashCode();
    }

    public final boolean i() {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            switch (((f9.a) ((c) it.next())).f12708h) {
                case 2:
                case g.DEVELOPER_ERROR /* 10 */:
                    return true;
            }
        }
        return false;
    }

    public final boolean j() {
        Iterator it = this.f12562a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.getClass();
            int i10 = ((f9.a) cVar).f12708h;
            switch (i10) {
                case 2:
                case g.DEVELOPER_ERROR /* 10 */:
                    return true;
                default:
                    switch (i10) {
                        case 0:
                        case QueueFuseable.SYNC /* 1 */:
                            return true;
                    }
            }
        }
        return false;
    }

    public final boolean k() {
        int i10 = this.f12564c;
        return i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10;
    }

    public final boolean l() {
        int i10 = this.f12564c;
        return i10 == 1 || i10 == 5 || i10 == 9;
    }

    public final String toString() {
        return "House{code=" + this.f12564c + ", rashi=" + this.f12565d + "}";
    }
}