package t1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends t {

    /* renamed from: f0, reason: collision with root package name */
    public static final String[] f17037f0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: e0, reason: collision with root package name */
    public int f17038e0;

    public g(int i10) {
        this.f17038e0 = 3;
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f17038e0 = i10;
    }

    public static void M(c0 c0Var) {
        int visibility = c0Var.f17018b.getVisibility();
        HashMap map = c0Var.f17017a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0Var.f17018b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float O(c0 c0Var, float f10) {
        Float f11;
        return (c0Var == null || (f11 = (Float) c0Var.f17017a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r0.f17083e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.f17081c == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q0 P(c0 c0Var, c0 c0Var2) {
        q0 q0Var = new q0();
        q0Var.f17079a = false;
        q0Var.f17080b = false;
        ViewGroup viewGroup = null;
        if (c0Var != null) {
            HashMap map = c0Var.f17017a;
            if (map.containsKey("android:visibility:visibility")) {
                q0Var.f17081c = ((Integer) map.get("android:visibility:visibility")).intValue();
                q0Var.f17083e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                q0Var.f17081c = -1;
                q0Var.f17083e = null;
            }
        }
        if (c0Var2 != null) {
            HashMap map2 = c0Var2.f17017a;
            if (map2.containsKey("android:visibility:visibility")) {
                q0Var.f17082d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                viewGroup = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                q0Var.f17082d = -1;
            }
        }
        q0Var.f17084f = viewGroup;
        if (c0Var != null && c0Var2 != null) {
            int i10 = q0Var.f17081c;
            int i11 = q0Var.f17082d;
            if (i10 != i11 || q0Var.f17083e != q0Var.f17084f) {
                if (i10 != i11) {
                    if (i10 != 0) {
                    }
                    q0Var.f17080b = false;
                } else {
                    if (q0Var.f17084f != null) {
                    }
                    q0Var.f17080b = false;
                }
            }
            return q0Var;
        }
        if (c0Var != null || q0Var.f17082d != 0) {
            if (c0Var2 == null) {
            }
            return q0Var;
        }
        q0Var.f17080b = true;
        q0Var.f17079a = true;
        return q0Var;
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        e0.f17033a.i(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, e0.f17034b, f11);
        f fVar = new f(view);
        objectAnimatorOfFloat.addListener(fVar);
        q().b(fVar);
        return objectAnimatorOfFloat;
    }

    @Override // t1.t
    public final void e(c0 c0Var) {
        M(c0Var);
    }

    @Override // t1.t
    public final void i(c0 c0Var) {
        M(c0Var);
        View view = c0Var.f17018b;
        Float fValueOf = (Float) view.getTag(2131296973);
        if (fValueOf == null) {
            fValueOf = Float.valueOf(view.getVisibility() == 0 ? e0.f17033a.g(view) : 0.0f);
        }
        c0Var.f17017a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    @Override // t1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator m(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        View view;
        boolean z7;
        int i10;
        View view2;
        View view3;
        ViewGroup viewGroup2;
        int i11;
        Bitmap bitmapCreateBitmap;
        ObjectAnimator objectAnimatorN;
        q0 q0VarP = P(c0Var, c0Var2);
        if (q0VarP.f17079a && (q0VarP.f17083e != null || q0VarP.f17084f != null)) {
            boolean z10 = false;
            if (q0VarP.f17080b) {
                if ((this.f17038e0 & 1) != 1 || c0Var2 == null) {
                    objectAnimatorN = null;
                } else {
                    View view4 = c0Var2.f17018b;
                    if (c0Var == null) {
                        View view5 = (View) view4.getParent();
                        if (P(p(view5, false), t(view5, false)).f17079a) {
                        }
                    }
                    e0.f17033a.getClass();
                    objectAnimatorN = N(view4, O(c0Var, 0.0f), 1.0f);
                }
                return objectAnimatorN;
            }
            int i12 = q0VarP.f17082d;
            if ((this.f17038e0 & 2) == 2 && c0Var != null) {
                View view6 = c0Var2 != null ? c0Var2.f17018b : null;
                View view7 = c0Var.f17018b;
                View view8 = (View) view7.getTag(2131296828);
                if (view8 != null) {
                    i10 = i12;
                    view3 = null;
                    z10 = true;
                } else {
                    if (view6 == null || view6.getParent() == null) {
                        if (view6 != null) {
                            view = null;
                            z7 = false;
                        }
                        view6 = null;
                        view = null;
                        z7 = true;
                    } else {
                        if (i12 == 4 || view7 == view6) {
                            view = view6;
                            view6 = null;
                            z7 = false;
                        }
                        view6 = null;
                        view = null;
                        z7 = true;
                    }
                    if (!z7) {
                        i10 = i12;
                        view2 = view;
                        view8 = view6;
                        view3 = view2;
                        z10 = false;
                    } else if (view7.getParent() == null) {
                        i10 = i12;
                        view3 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            View view9 = (View) view7.getParent();
                            if (P(t(view9, true), p(view9, true)).f17079a) {
                                i10 = i12;
                                view2 = view;
                                int id = view9.getId();
                                if (view9.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                boolean z11 = b0.f17014a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                h0 h0Var = e0.f17033a;
                                h0Var.k(view7, matrix);
                                h0Var.l(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix.mapRect(rectF);
                                int iRound = Math.round(rectF.left);
                                int iRound2 = Math.round(rectF.top);
                                int iRound3 = Math.round(rectF.right);
                                int iRound4 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                boolean z12 = !view7.isAttachedToWindow();
                                boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                if (!z12) {
                                    view2 = view;
                                    viewGroup2 = null;
                                    i11 = 0;
                                } else if (zIsAttachedToWindow) {
                                    ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                    int iIndexOfChild = viewGroup3.indexOfChild(view7);
                                    viewGroup.getOverlay().add(view7);
                                    viewGroup2 = viewGroup3;
                                    view2 = view;
                                    i11 = iIndexOfChild;
                                } else {
                                    i10 = i12;
                                    view2 = view;
                                    bitmapCreateBitmap = null;
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                    imageView.layout(iRound, iRound2, iRound3, iRound4);
                                    view8 = imageView;
                                    view3 = view2;
                                    z10 = false;
                                }
                                i10 = i12;
                                int iRound5 = Math.round(rectF.width());
                                int iRound6 = Math.round(rectF.height());
                                if (iRound5 <= 0 || iRound6 <= 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                    int iRound7 = Math.round(iRound5 * fMin);
                                    int iRound8 = Math.round(iRound6 * fMin);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(fMin, fMin);
                                    if (b0.f17014a) {
                                        Picture picture = new Picture();
                                        Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                        canvasBeginRecording.concat(matrix);
                                        view7.draw(canvasBeginRecording);
                                        picture.endRecording();
                                        bitmapCreateBitmap = a0.a(picture);
                                    } else {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.concat(matrix);
                                        view7.draw(canvas);
                                    }
                                }
                                if (z12) {
                                    viewGroup.getOverlay().remove(view7);
                                    viewGroup2.addView(view7, i11);
                                }
                                if (bitmapCreateBitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view8 = imageView;
                                view3 = view2;
                                z10 = false;
                            }
                        }
                        view8 = view6;
                        view3 = view2;
                        z10 = false;
                    }
                }
                if (view8 != null) {
                    if (!z10) {
                        int[] iArr = (int[]) c0Var.f17017a.get("android:visibility:screenLocation");
                        int i13 = iArr[0];
                        int i14 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view8.offsetLeftAndRight((i13 - iArr2[0]) - view8.getLeft());
                        view8.offsetTopAndBottom((i14 - iArr2[1]) - view8.getTop());
                        viewGroup.getOverlay().add(view8);
                    }
                    h0 h0Var2 = e0.f17033a;
                    h0Var2.getClass();
                    ObjectAnimator objectAnimatorN2 = N(view8, O(c0Var, 1.0f), 0.0f);
                    if (objectAnimatorN2 == null) {
                        h0Var2.i(view8, O(c0Var2, 1.0f));
                    }
                    if (z10) {
                        return objectAnimatorN2;
                    }
                    if (objectAnimatorN2 == null) {
                        viewGroup.getOverlay().remove(view8);
                        return objectAnimatorN2;
                    }
                    view7.setTag(2131296828, view8);
                    p0 p0Var = new p0(this, viewGroup, view8, view7);
                    objectAnimatorN2.addListener(p0Var);
                    objectAnimatorN2.addPauseListener(p0Var);
                    q().b(p0Var);
                    return objectAnimatorN2;
                }
                if (view3 != null) {
                    int visibility = view3.getVisibility();
                    e0.b(view3, 0);
                    h0 h0Var3 = e0.f17033a;
                    h0Var3.getClass();
                    ObjectAnimator objectAnimatorN3 = N(view3, O(c0Var, 1.0f), 0.0f);
                    if (objectAnimatorN3 == null) {
                        h0Var3.i(view3, O(c0Var2, 1.0f));
                    }
                    if (objectAnimatorN3 != null) {
                        o0 o0Var = new o0(i10, view3);
                        objectAnimatorN3.addListener(o0Var);
                        q().b(o0Var);
                    } else {
                        e0.b(view3, visibility);
                    }
                    return objectAnimatorN3;
                }
            }
        }
        return null;
    }

    @Override // t1.t
    public final /* bridge */ /* synthetic */ String[] s() {
        return f17037f0;
    }

    @Override // t1.t
    public final boolean v(c0 c0Var, c0 c0Var2) {
        if (c0Var == null && c0Var2 == null) {
            return false;
        }
        if (c0Var != null && c0Var2 != null && c0Var2.f17017a.containsKey("android:visibility:visibility") != c0Var.f17017a.containsKey("android:visibility:visibility")) {
            return false;
        }
        q0 q0VarP = P(c0Var, c0Var2);
        if (q0VarP.f17079a) {
            return q0VarP.f17081c == 0 || q0VarP.f17082d == 0;
        }
        return false;
    }
}