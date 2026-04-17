package j6;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p0.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends x0.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f13801q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f13801q = chip;
    }

    @Override // x0.b
    public final void l(ArrayList arrayList) {
        boolean z7 = false;
        arrayList.add(0);
        Rect rect = Chip.f11401c0;
        Chip chip = this.f13801q;
        if (chip.c()) {
            f fVar = chip.f11406m;
            if (fVar != null && fVar.f13827o0) {
                z7 = true;
            }
            if (!z7 || chip.f11409u == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // x0.b
    public final void o(int i10, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f15862a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f11401c0);
            return;
        }
        Chip chip = this.f13801q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.isEmpty(text) ? "" : text;
            accessibilityNodeInfo.setContentDescription(context.getString(2131886667, objArr).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        hVar.b(p0.c.f15848e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}