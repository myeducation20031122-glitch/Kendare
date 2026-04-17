package y6;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l4.j0;
import m.h1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends o0.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f19401d;

    public y(TextInputLayout textInputLayout) {
        this.f19401d = textInputLayout;
    }

    @Override // o0.b
    public final void d(View view, p0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f15504a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f15862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f19401d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z7 = !zIsEmpty;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(hint);
        boolean z12 = !textInputLayout.X0;
        boolean z13 = !TextUtils.isEmpty(error);
        if (!z13 && TextUtils.isEmpty(counterOverflowDescription)) {
            z10 = false;
        }
        String string = z11 ? hint.toString() : "";
        w wVar = textInputLayout.f11547e;
        View view2 = wVar.f19390e;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(view2);
            if (Build.VERSION.SDK_INT >= 22) {
                com.onesignal.k.d(view2, accessibilityNodeInfo);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            view2 = wVar.f19392j;
            com.onesignal.k.d(view2, accessibilityNodeInfo);
        }
        if (z7) {
            hVar.m(text);
        } else if (!TextUtils.isEmpty(string)) {
            hVar.m(string);
            if (z12 && placeholderText != null) {
                hVar.m(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            hVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hVar.k(string);
            } else {
                if (z7) {
                    string = ((Object) text) + ", " + string;
                }
                hVar.m(string);
            }
            if (i10 >= 26) {
                j0.x(accessibilityNodeInfo, zIsEmpty);
            } else {
                hVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            accessibilityNodeInfo.setError(z13 ? error : counterOverflowDescription);
        }
        h1 h1Var = textInputLayout.M.f19375y;
        if (h1Var != null) {
            accessibilityNodeInfo.setLabelFor(h1Var);
        }
        textInputLayout.f11550f.b().n(hVar);
    }

    @Override // o0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f19401d.f11550f.b().o(accessibilityEvent);
    }
}