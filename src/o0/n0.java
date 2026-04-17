package o0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15586a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f15587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15589d;

    public n0(int i10, Class cls, int i11, int i12) {
        this.f15586a = i10;
        this.f15587b = cls;
        this.f15589d = i11;
        this.f15588c = i12;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f15588c) {
            Object tag = view.getTag(this.f15586a);
            if (this.f15587b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i10 = ((l0) this).f15579e;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(v0.d(view));
                    default:
                        return Boolean.valueOf(v0.c(view));
                }
            case QueueFuseable.SYNC /* 1 */:
                switch (i10) {
                    case QueueFuseable.SYNC /* 1 */:
                        return v0.b(view);
                    default:
                        return x0.b(view);
                }
            case 2:
                switch (i10) {
                    case QueueFuseable.SYNC /* 1 */:
                        return v0.b(view);
                    default:
                        return x0.b(view);
                }
            default:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(v0.d(view));
                    default:
                        return Boolean.valueOf(v0.c(view));
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, Object obj) {
        boolean zEquals;
        boolean z7;
        if (Build.VERSION.SDK_INT >= this.f15588c) {
            int i10 = ((l0) this).f15579e;
            switch (i10) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            v0.j(view, bool.booleanValue());
                            break;
                        default:
                            v0.g(view, bool.booleanValue());
                            break;
                    }
                case QueueFuseable.SYNC /* 1 */:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i10) {
                        case QueueFuseable.SYNC /* 1 */:
                            v0.h(view, charSequence);
                            break;
                        default:
                            x0.f(view, charSequence);
                            break;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i10) {
                        case QueueFuseable.SYNC /* 1 */:
                            v0.h(view, charSequence2);
                            break;
                        default:
                            x0.f(view, charSequence2);
                            break;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            v0.j(view, bool2.booleanValue());
                            break;
                        default:
                            v0.g(view, bool2.booleanValue());
                            break;
                    }
            }
        }
        Object objA = a(view);
        boolean z10 = false;
        int i11 = ((l0) this).f15579e;
        switch (i11) {
            case 0:
                Boolean bool3 = (Boolean) objA;
                Boolean bool4 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                            z10 = true;
                            break;
                        }
                        break;
                    default:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                        }
                        break;
                }
                z7 = !z10;
                break;
            case QueueFuseable.SYNC /* 1 */:
                CharSequence charSequence3 = (CharSequence) objA;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i11) {
                    case QueueFuseable.SYNC /* 1 */:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
                z7 = !zEquals;
                break;
            case 2:
                CharSequence charSequence5 = (CharSequence) objA;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i11) {
                    case QueueFuseable.SYNC /* 1 */:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
                z7 = !zEquals;
                break;
            default:
                Boolean bool5 = (Boolean) objA;
                Boolean bool6 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                        }
                        break;
                    default:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                        }
                        break;
                }
                z7 = !z10;
                break;
        }
        if (z7) {
            View.AccessibilityDelegate accessibilityDelegateD = c1.d(view);
            b bVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f15496a : new b(accessibilityDelegateD);
            if (bVar == null) {
                bVar = new b();
            }
            c1.r(view, bVar);
            view.setTag(this.f15586a, obj);
            c1.j(view, this.f15589d);
        }
    }
}