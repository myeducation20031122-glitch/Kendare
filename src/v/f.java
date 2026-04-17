package v;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18346b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18347e;

    public /* synthetic */ f(Object obj, int i10) {
        this.f18346b = i10;
        this.f18347e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f18346b;
        Object obj3 = this.f18347e;
        switch (i10) {
            case 0:
                return ((i) obj).f18354e - ((i) obj2).f18354e;
            case QueueFuseable.SYNC /* 1 */:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 2:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Function2 tmp0 = (Function2) obj3;
                KDeclarationContainerImpl.Companion companion = KDeclarationContainerImpl.b;
                Intrinsics.f(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }
    }
}