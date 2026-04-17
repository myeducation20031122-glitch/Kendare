package w1;

import android.os.Parcel;
import android.os.Parcelable;
import kc.r;
import m.m3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends w0.b {
    public static final Parcelable.Creator<g> CREATOR = new m3(5);

    /* renamed from: f, reason: collision with root package name */
    public int f18533f;

    /* renamed from: j, reason: collision with root package name */
    public Parcelable f18534j;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
        this.f18533f = parcel.readInt();
        this.f18534j = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return r.f(sb, this.f18533f, "}");
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f18520b, i10);
        parcel.writeInt(this.f18533f);
        parcel.writeParcelable(this.f18534j, i10);
    }
}