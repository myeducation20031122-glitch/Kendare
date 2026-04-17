package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f14822l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f14823m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f14824a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14825b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f14826c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f14827d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f14828e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f14829f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f14830g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f14831h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f14832i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f14833j;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f14834k;

    public m1(TextView textView) {
        this.f14832i = textView;
        this.f14833j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f14834k = i10 >= 29 ? new k1() : i10 >= 23 ? new j1() : new l1();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f14823m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f14825b) {
                if (this.f14832i.getMeasuredHeight() <= 0 || this.f14832i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f14834k.b(this.f14832i) ? 1048576 : (this.f14832i.getMeasuredWidth() - this.f14832i.getTotalPaddingLeft()) - this.f14832i.getTotalPaddingRight();
                int height = (this.f14832i.getHeight() - this.f14832i.getCompoundPaddingBottom()) - this.f14832i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f14822l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f14832i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f14825b = true;
        }
    }

    public final int c(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f14829f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f14829f[i13];
            TextView textView = this.f14832i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f14831h;
            if (textPaint == null) {
                this.f14831h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f14831h.set(textView.getPaint());
            this.f14831h.setTextSize(i14);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = i1.a(text, alignment, iRound, maxLines, this.f14832i, this.f14831h, this.f14834k);
            } else {
                staticLayout = new StaticLayout(text, this.f14831h, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f14829f[i12];
    }

    public final boolean f() {
        return j() && this.f14824a != 0;
    }

    public final void g(int i10, float f10) {
        Context context = this.f14833j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f14832i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f14825b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f14824a == 1) {
            if (!this.f14830g || this.f14829f.length == 0) {
                int iFloor = ((int) Math.floor((this.f14828e - this.f14827d) / this.f14826c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f14826c) + this.f14827d);
                }
                this.f14829f = b(iArr);
            }
            this.f14825b = true;
        } else {
            this.f14825b = false;
        }
        return this.f14825b;
    }

    public final boolean i() {
        boolean z7 = this.f14829f.length > 0;
        this.f14830g = z7;
        if (z7) {
            this.f14824a = 1;
            this.f14827d = r0[0];
            this.f14828e = r0[r1 - 1];
            this.f14826c = -1.0f;
        }
        return z7;
    }

    public final boolean j() {
        return !(this.f14832i instanceof z);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f14824a = 1;
        this.f14827d = f10;
        this.f14828e = f11;
        this.f14826c = f12;
        this.f14830g = false;
    }
}