package g;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import m.d2;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends o0 implements DialogInterface {

    /* renamed from: n, reason: collision with root package name */
    public final l f12851n;

    public m(Context context, int i10) {
        super(context, g(context, i10));
        this.f12851n = new l(getContext(), this, getWindow());
    }

    public static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903093, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3 A[PHI: r4
      0x02d3: PHI (r4v5 android.view.View) = (r4v4 android.view.View), (r4v13 android.view.View) binds: [B:123:0x02d1, B:120:0x02c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // g.o0, androidx.activity.o, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i10;
        View view;
        View viewFindViewById;
        ListAdapter listAdapter;
        View view2;
        View view3;
        f fVar;
        View viewFindViewById2;
        Button button;
        super.onCreate(bundle);
        l lVar = this.f12851n;
        lVar.f12810b.setContentView(lVar.F);
        Window window = lVar.f12811c;
        View viewFindViewById3 = window.findViewById(2131296764);
        View viewFindViewById4 = viewFindViewById3.findViewById(2131296965);
        View viewFindViewById5 = viewFindViewById3.findViewById(2131296455);
        View viewFindViewById6 = viewFindViewById3.findViewById(2131296401);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(2131296467);
        View viewInflate = lVar.f12816h;
        int i11 = 0;
        Context context = lVar.f12809a;
        if (viewInflate == null) {
            viewInflate = lVar.f12817i != 0 ? LayoutInflater.from(context).inflate(lVar.f12817i, viewGroup, false) : null;
        }
        boolean z7 = viewInflate != null;
        if (!z7 || !l.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z7) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296466);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (lVar.f12818j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (lVar.f12815g != null) {
                ((LinearLayout.LayoutParams) ((d2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(2131296965);
        View viewFindViewById8 = viewGroup.findViewById(2131296455);
        View viewFindViewById9 = viewGroup.findViewById(2131296401);
        ViewGroup viewGroupC = l.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC2 = l.c(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupC3 = l.c(viewFindViewById9, viewFindViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296835);
        lVar.f12831w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        lVar.f12831w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(R.id.message);
        lVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = lVar.f12814f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                lVar.f12831w.removeView(lVar.B);
                if (lVar.f12815g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) lVar.f12831w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(lVar.f12831w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(lVar.f12815g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupC2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupC3.findViewById(R.id.button1);
        lVar.f12819k = button2;
        d dVar = lVar.L;
        button2.setOnClickListener(dVar);
        boolean zIsEmpty = TextUtils.isEmpty(lVar.f12820l);
        int i12 = lVar.f12812d;
        if (zIsEmpty && lVar.f12822n == null) {
            lVar.f12819k.setVisibility(8);
            i10 = 0;
        } else {
            lVar.f12819k.setText(lVar.f12820l);
            Drawable drawable = lVar.f12822n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i12, i12);
                lVar.f12819k.setCompoundDrawables(lVar.f12822n, null, null, null);
            }
            lVar.f12819k.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroupC3.findViewById(R.id.button2);
        lVar.f12823o = button3;
        button3.setOnClickListener(dVar);
        if (TextUtils.isEmpty(lVar.f12824p) && lVar.f12826r == null) {
            lVar.f12823o.setVisibility(8);
        } else {
            lVar.f12823o.setText(lVar.f12824p);
            Drawable drawable2 = lVar.f12826r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i12, i12);
                lVar.f12823o.setCompoundDrawables(lVar.f12826r, null, null, null);
            }
            lVar.f12823o.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroupC3.findViewById(R.id.button3);
        lVar.f12827s = button4;
        button4.setOnClickListener(dVar);
        if (TextUtils.isEmpty(lVar.f12828t) && lVar.f12830v == null) {
            lVar.f12827s.setVisibility(8);
            view = null;
        } else {
            lVar.f12827s.setText(lVar.f12828t);
            Drawable drawable3 = lVar.f12830v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i12, i12);
                view = null;
                lVar.f12827s.setCompoundDrawables(lVar.f12830v, null, null, null);
            } else {
                view = null;
            }
            lVar.f12827s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903091, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                button = lVar.f12819k;
            } else if (i10 == 2) {
                button = lVar.f12823o;
            } else if (i10 == 4) {
                button = lVar.f12827s;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (i10 == 0) {
            viewGroupC3.setVisibility(8);
        }
        if (lVar.C != null) {
            viewGroupC.addView(lVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296957).setVisibility(8);
        } else {
            lVar.f12834z = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(lVar.f12813e)) && lVar.J) {
                TextView textView2 = (TextView) window.findViewById(2131296351);
                lVar.A = textView2;
                textView2.setText(lVar.f12813e);
                int i13 = lVar.f12832x;
                if (i13 != 0) {
                    lVar.f12834z.setImageResource(i13);
                } else {
                    Drawable drawable4 = lVar.f12833y;
                    if (drawable4 != null) {
                        lVar.f12834z.setImageDrawable(drawable4);
                    } else {
                        lVar.A.setPadding(lVar.f12834z.getPaddingLeft(), lVar.f12834z.getPaddingTop(), lVar.f12834z.getPaddingRight(), lVar.f12834z.getPaddingBottom());
                        lVar.f12834z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(2131296957).setVisibility(8);
                lVar.f12834z.setVisibility(8);
                viewGroupC.setVisibility(8);
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i14 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupC3.getVisibility() != 8;
        if (!z11 && (viewFindViewById2 = viewGroupC2.findViewById(2131296915)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i14 != 0) {
            NestedScrollView nestedScrollView2 = lVar.f12831w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            viewFindViewById = (lVar.f12814f == null && lVar.f12815g == null) ? view : viewGroupC.findViewById(2131296956);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            viewFindViewById = viewGroupC2.findViewById(2131296916);
            if (viewFindViewById != null) {
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = lVar.f12815g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z11 || i14 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i14 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f608b, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f609e);
            }
        }
        if (!z10) {
            View view4 = lVar.f12815g;
            if (view4 == null) {
                view4 = lVar.f12831w;
            }
            if (view4 != null) {
                int i15 = (z11 ? 2 : 0) | i14;
                View viewFindViewById10 = window.findViewById(2131296834);
                View viewFindViewById11 = window.findViewById(2131296833);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 23) {
                    WeakHashMap weakHashMap = c1.f15515a;
                    if (i16 >= 23) {
                        o0.r0.d(view4, i15, 3);
                    }
                    if (viewFindViewById10 != null) {
                        viewGroupC2.removeView(viewFindViewById10);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupC2.removeView(viewFindViewById11);
                    }
                } else {
                    if (viewFindViewById10 != null && (i15 & 1) == 0) {
                        viewGroupC2.removeView(viewFindViewById10);
                        viewFindViewById10 = view;
                    }
                    if (viewFindViewById11 == null || (i15 & 2) != 0) {
                        view2 = viewFindViewById11;
                    } else {
                        viewGroupC2.removeView(viewFindViewById11);
                        view2 = view;
                    }
                    if (viewFindViewById10 != null || view2 != null) {
                        if (lVar.f12814f != null) {
                            lVar.f12831w.setOnScrollChangeListener(new e(lVar, viewFindViewById10, view2, i11));
                            view3 = lVar.f12831w;
                            fVar = new f(lVar, viewFindViewById10, view2, i11);
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = lVar.f12815g;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new g(viewFindViewById10, view2));
                                view3 = lVar.f12815g;
                                fVar = new f(lVar, viewFindViewById10, view2, 1);
                            } else {
                                if (viewFindViewById10 != null) {
                                    viewGroupC2.removeView(viewFindViewById10);
                                }
                                if (view2 != null) {
                                    viewGroupC2.removeView(view2);
                                }
                            }
                        }
                        view3.post(fVar);
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = lVar.f12815g;
        if (alertController$RecycleListView3 == null || (listAdapter = lVar.D) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i17 = lVar.E;
        if (i17 > -1) {
            alertController$RecycleListView3.setItemChecked(i17, true);
            alertController$RecycleListView3.setSelection(i17);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12851n.f12831w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12851n.f12831w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // g.o0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        l lVar = this.f12851n;
        lVar.f12813e = charSequence;
        TextView textView = lVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}