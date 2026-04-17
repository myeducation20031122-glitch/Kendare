package l3;

import android.util.Property;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i10) {
        super(Float.class, str);
        this.f14535a = i10;
        if (i10 != 1) {
        } else {
            super(Integer.class, str);
        }
    }

    public abstract void a(int i10, Object obj);

    public abstract void b(Object obj, float f10);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f14535a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                break;
            default:
                a(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}