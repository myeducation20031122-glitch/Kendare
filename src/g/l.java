package g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final j K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12809a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f12810b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f12811c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12812d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12813e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f12814f;

    /* renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f12815g;

    /* renamed from: h, reason: collision with root package name */
    public View f12816h;

    /* renamed from: i, reason: collision with root package name */
    public int f12817i;

    /* renamed from: k, reason: collision with root package name */
    public Button f12819k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f12820l;

    /* renamed from: m, reason: collision with root package name */
    public Message f12821m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f12822n;

    /* renamed from: o, reason: collision with root package name */
    public Button f12823o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f12824p;

    /* renamed from: q, reason: collision with root package name */
    public Message f12825q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f12826r;

    /* renamed from: s, reason: collision with root package name */
    public Button f12827s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f12828t;

    /* renamed from: u, reason: collision with root package name */
    public Message f12829u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f12830v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f12831w;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f12833y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f12834z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12818j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f12832x = 0;
    public int E = -1;
    public final d L = new d(this, 0);

    public l(Context context, o0 o0Var, Window window) {
        this.f12809a = context;
        this.f12810b = o0Var;
        this.f12811c = window;
        this.K = new j(o0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f12628e, 2130903092, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.J = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12812d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        o0Var.d().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.K.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f12828t = charSequence;
            this.f12829u = messageObtainMessage;
            this.f12830v = null;
        } else if (i10 == -2) {
            this.f12824p = charSequence;
            this.f12825q = messageObtainMessage;
            this.f12826r = null;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f12820l = charSequence;
            this.f12821m = messageObtainMessage;
            this.f12822n = null;
        }
    }
}