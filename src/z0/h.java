package z0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends v6.e {

    /* renamed from: j, reason: collision with root package name */
    public final TextView f19438j;

    /* renamed from: m, reason: collision with root package name */
    public final f f19439m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19440n;

    public h(TextView textView) {
        super(10, (Object) null);
        this.f19438j = textView;
        this.f19440n = true;
        this.f19439m = new f(textView);
    }

    @Override // v6.e
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        if (!this.f19440n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof f) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f19439m;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == fVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // v6.e
    public final boolean q() {
        return this.f19440n;
    }

    @Override // v6.e
    public final void t(boolean z7) {
        if (z7) {
            TextView textView = this.f19438j;
            textView.setTransformationMethod(y(textView.getTransformationMethod()));
        }
    }

    @Override // v6.e
    public final void w(boolean z7) {
        this.f19440n = z7;
        TextView textView = this.f19438j;
        textView.setTransformationMethod(y(textView.getTransformationMethod()));
        textView.setFilters(i(textView.getFilters()));
    }

    @Override // v6.e
    public final TransformationMethod y(TransformationMethod transformationMethod) {
        return this.f19440n ? ((transformationMethod instanceof k) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new k(transformationMethod) : transformationMethod instanceof k ? ((k) transformationMethod).f19446a : transformationMethod;
    }
}