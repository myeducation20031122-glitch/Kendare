package w8;

import java.sql.Timestamp;
import java.util.Date;
import t8.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Class cls, int i10) {
        super(cls);
        this.f18724a = i10;
    }

    @Override // t8.g
    public final Date a(Date date) {
        switch (this.f18724a) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}