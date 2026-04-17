package com.isprid.kendare.ui.horoscope;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.m;
import androidx.fragment.app.Fragment;
import b9.a;
import c4.i;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.maps.model.LatLng;
import com.isprid.kendare.MyApplication;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import com.isprid.kendare.ui.horoscope.MoreDetailsActivity;
import com.isprid.kendare.ui.horoscope.ReportActivity;
import e9.d;
import ec.h;
import fc.t;
import ic.c;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.j;
import pub.devrel.easypermissions.AppSettingsDialogHolderActivity;
import t5.j4;
import y4.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0005\u001a\u00020\u0004H\u0003J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/isprid/kendare/ui/horoscope/HoroscopeActivity;", "Lj9/b;", "Landroid/view/View$OnClickListener;", "Lic/c;", "", "requestPermissionAndShare", "Landroid/view/View;", "view", "onClick", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class HoroscopeActivity extends b implements View.OnClickListener, c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f11645t = 0;

    /* renamed from: f, reason: collision with root package name */
    public a f11646f;

    /* renamed from: j, reason: collision with root package name */
    public d f11647j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11648m = true;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f11649n;

    public static String l(Context context, Calendar calendar) {
        String time = new SimpleDateFormat("hh:mm a").format(calendar.getTime());
        n7.c cVar = MyApplication.f11640b;
        Intrinsics.e(time, "time");
        String string = context.getString(2131886861);
        Intrinsics.e(string, "context.getString(R.string.pm)");
        String strA = h.A(time, "PM", string);
        String string2 = context.getString(2131886861);
        Intrinsics.e(string2, "context.getString(R.string.pm)");
        String strA2 = h.A(strA, "pm", string2);
        String string3 = context.getString(2131886121);
        Intrinsics.e(string3, "context.getString(R.string.am)");
        String strA3 = h.A(strA2, "AM", string3);
        String string4 = context.getString(2131886121);
        Intrinsics.e(string4, "context.getString(R.string.am)");
        return h.A(strA3, "am", string4);
    }

    @ic.a(101)
    private final void requestPermissionAndShare() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (j4.u(this, (String[]) Arrays.copyOf(strArr, 2))) {
            a aVar = this.f11646f;
            if (aVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            aVar.f1975d.buildDrawingCache();
            a aVar2 = this.f11646f;
            if (aVar2 != null) {
                s9.c.c(this, aVar2.f1975d.getDrawingCache());
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 2);
        j jVarJ = j.j(this);
        String string = jVarJ.g().getString(R.string.ok);
        String string2 = jVarJ.g().getString(R.string.cancel);
        String[] strArr3 = (String[]) strArr2.clone();
        if (j4.u(jVarJ.g(), (String[]) strArr3.clone())) {
            String[] strArr4 = (String[]) strArr3.clone();
            int[] iArr = new int[strArr4.length];
            for (int i10 = 0; i10 < strArr4.length; i10++) {
                iArr[i10] = 0;
            }
            j4.H(101, strArr4, iArr, jVarJ.f15046b);
            return;
        }
        String[] strArr5 = (String[]) strArr3.clone();
        for (String str : strArr5) {
            if (jVarJ.m(str)) {
                jVarJ.n("This app needs access to your storage to save horoscope.", string, string2, -1, 101, strArr5);
                return;
            }
        }
        jVarJ.f(strArr5, 101);
    }

    public final void m(List perms) {
        Intrinsics.f(perms, "perms");
        j jVarJ = j.j(this);
        Iterator it = perms.iterator();
        while (it.hasNext()) {
            if (!jVarJ.m((String) it.next())) {
                Parcelable bVar = new ic.b(this, TextUtils.isEmpty(null) ? getString(2131886923) : null, TextUtils.isEmpty(null) ? getString(2131887096) : null, TextUtils.isEmpty(null) ? getString(R.string.ok) : null, TextUtils.isEmpty(null) ? getString(R.string.cancel) : null, 16061);
                Intent intent = new Intent(((ic.b) bVar).w, (Class<?>) AppSettingsDialogHolderActivity.class);
                intent.putExtra("extra_app_settings", bVar);
                Object obj = ((ic.b) bVar).u;
                boolean z7 = obj instanceof Activity;
                int i10 = ((ic.b) bVar).n;
                if (z7) {
                    ((Activity) obj).startActivityForResult(intent, i10);
                    return;
                } else {
                    if (obj instanceof Fragment) {
                        ((Fragment) obj).startActivityForResult(intent, i10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void n(int i10) {
        t.K(this, new l9.d(this, i10, 0));
    }

    public final void o(TextView textView) {
        int i10;
        n7.c cVar = MyApplication.f11640b;
        if (TextUtils.isDigitsOnly(textView.getText().toString())) {
            textView.setTypeface(null, 1);
            i10 = 2131100486;
        } else {
            Typeface typeface = this.f11649n;
            if (typeface == null) {
                Intrinsics.n("mTypefaceSin");
                throw null;
            }
            textView.setTypeface(typeface, 1);
            i10 = 2131100487;
        }
        j4.O(textView, i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        t.K(this, new l9.c(this, 0));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10;
        a aVar = this.f11646f;
        if (aVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (Intrinsics.a(view, aVar.f1973b.f1982b)) {
            i10 = 1;
        } else {
            a aVar2 = this.f11646f;
            if (aVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (Intrinsics.a(view, aVar2.f1973b.f1986f)) {
                i10 = 2;
            } else {
                a aVar3 = this.f11646f;
                if (aVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (Intrinsics.a(view, aVar3.f1973b.f1987g)) {
                    i10 = 3;
                } else {
                    a aVar4 = this.f11646f;
                    if (aVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    if (Intrinsics.a(view, aVar4.f1973b.f1988h)) {
                        i10 = 4;
                    } else {
                        a aVar5 = this.f11646f;
                        if (aVar5 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        if (Intrinsics.a(view, aVar5.f1973b.f1989i)) {
                            i10 = 5;
                        } else {
                            a aVar6 = this.f11646f;
                            if (aVar6 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (Intrinsics.a(view, aVar6.f1973b.f1990j)) {
                                i10 = 6;
                            } else {
                                a aVar7 = this.f11646f;
                                if (aVar7 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (Intrinsics.a(view, aVar7.f1973b.f1991k)) {
                                    i10 = 7;
                                } else {
                                    a aVar8 = this.f11646f;
                                    if (aVar8 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (Intrinsics.a(view, aVar8.f1973b.f1992l)) {
                                        i10 = 8;
                                    } else {
                                        a aVar9 = this.f11646f;
                                        if (aVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (Intrinsics.a(view, aVar9.f1973b.f1993m)) {
                                            i10 = 9;
                                        } else {
                                            a aVar10 = this.f11646f;
                                            if (aVar10 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            if (Intrinsics.a(view, aVar10.f1973b.f1983c)) {
                                                i10 = 10;
                                            } else {
                                                a aVar11 = this.f11646f;
                                                if (aVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                if (Intrinsics.a(view, aVar11.f1973b.f1984d)) {
                                                    i10 = 11;
                                                } else {
                                                    a aVar12 = this.f11646f;
                                                    if (aVar12 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    if (!Intrinsics.a(view, aVar12.f1973b.f1985e)) {
                                                        return;
                                                    } else {
                                                        i10 = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n(i10);
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        super.onCreate(bundle);
        final int i10 = 0;
        View viewInflate = getLayoutInflater().inflate(2131492894, (ViewGroup) null, false);
        int i11 = 2131296373;
        LinearLayout linearLayout = (LinearLayout) g5.a.l(viewInflate, 2131296373);
        if (linearLayout != null) {
            i11 = 2131296379;
            if (((ImageView) g5.a.l(viewInflate, 2131296379)) != null) {
                i11 = 2131296384;
                if (((ImageView) g5.a.l(viewInflate, 2131296384)) != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                    if (((TextView) g5.a.l(viewInflate, 2131296530)) != null) {
                        View viewL = g5.a.l(viewInflate, 2131296600);
                        if (viewL != null) {
                            int i12 = 2131296562;
                            TextView textView = (TextView) g5.a.l(viewL, 2131296562);
                            if (textView != null) {
                                i12 = 2131296573;
                                TextView textView2 = (TextView) g5.a.l(viewL, 2131296573);
                                if (textView2 != null) {
                                    i12 = 2131296563;
                                    TextView textView3 = (TextView) g5.a.l(viewL, 2131296563);
                                    if (textView3 != null) {
                                        i12 = 2131296564;
                                        TextView textView4 = (TextView) g5.a.l(viewL, 2131296564);
                                        if (textView4 != null) {
                                            i12 = 2131296565;
                                            TextView textView5 = (TextView) g5.a.l(viewL, 2131296565);
                                            if (textView5 != null) {
                                                i12 = 2131296566;
                                                TextView textView6 = (TextView) g5.a.l(viewL, 2131296566);
                                                if (textView6 != null) {
                                                    i12 = 2131296567;
                                                    TextView textView7 = (TextView) g5.a.l(viewL, 2131296567);
                                                    if (textView7 != null) {
                                                        i12 = 2131296568;
                                                        TextView textView8 = (TextView) g5.a.l(viewL, 2131296568);
                                                        if (textView8 != null) {
                                                            i12 = 2131296569;
                                                            TextView textView9 = (TextView) g5.a.l(viewL, 2131296569);
                                                            if (textView9 != null) {
                                                                i12 = 2131296570;
                                                                TextView textView10 = (TextView) g5.a.l(viewL, 2131296570);
                                                                if (textView10 != null) {
                                                                    i12 = 2131296571;
                                                                    TextView textView11 = (TextView) g5.a.l(viewL, 2131296571);
                                                                    if (textView11 != null) {
                                                                        i12 = 2131296572;
                                                                        TextView textView12 = (TextView) g5.a.l(viewL, 2131296572);
                                                                        if (textView12 != null) {
                                                                            LinearLayout linearLayout2 = (LinearLayout) viewL;
                                                                            i12 = 2131296583;
                                                                            ImageView imageView = (ImageView) g5.a.l(viewL, 2131296583);
                                                                            if (imageView != null) {
                                                                                i12 = 2131296614;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) g5.a.l(viewL, 2131296614);
                                                                                if (relativeLayout != null) {
                                                                                    i12 = 2131296707;
                                                                                    TextView textView13 = (TextView) g5.a.l(viewL, 2131296707);
                                                                                    if (textView13 != null) {
                                                                                        b9.b bVar = new b9.b(linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, imageView, relativeLayout, textView13);
                                                                                        Button button = (Button) g5.a.l(viewInflate, 2131296603);
                                                                                        if (button == null) {
                                                                                            i11 = 2131296603;
                                                                                        } else if (((LinearLayout) g5.a.l(viewInflate, 2131296604)) != null) {
                                                                                            LinearLayout linearLayout3 = (LinearLayout) g5.a.l(viewInflate, 2131296616);
                                                                                            if (linearLayout3 == null) {
                                                                                                i11 = 2131296616;
                                                                                            } else if (((RelativeLayout) g5.a.l(viewInflate, 2131296617)) == null) {
                                                                                                i11 = 2131296617;
                                                                                            } else if (((ConstraintLayout) g5.a.l(viewInflate, 2131296626)) == null) {
                                                                                                i11 = 2131296626;
                                                                                            } else if (((LinearLayout) g5.a.l(viewInflate, 2131296627)) != null) {
                                                                                                Button button2 = (Button) g5.a.l(viewInflate, 2131296811);
                                                                                                if (button2 != null) {
                                                                                                    TextView textView14 = (TextView) g5.a.l(viewInflate, 2131296928);
                                                                                                    if (textView14 != null) {
                                                                                                        TextView textView15 = (TextView) g5.a.l(viewInflate, 2131296929);
                                                                                                        if (textView15 != null) {
                                                                                                            TextView textView16 = (TextView) g5.a.l(viewInflate, 2131296945);
                                                                                                            if (textView16 != null) {
                                                                                                                TextView textView17 = (TextView) g5.a.l(viewInflate, 2131296946);
                                                                                                                if (textView17 != null) {
                                                                                                                    this.f11646f = new a(coordinatorLayout, linearLayout, bVar, button, linearLayout3, button2, textView14, textView15, textView16, textView17);
                                                                                                                    setContentView(coordinatorLayout);
                                                                                                                    g.b supportActionBar = getSupportActionBar();
                                                                                                                    final int i13 = 1;
                                                                                                                    if (supportActionBar != null) {
                                                                                                                        String string = getString(2131886529);
                                                                                                                        Intrinsics.e(string, "getString(R.string.kendaraya)");
                                                                                                                        e.M(supportActionBar, this, string, true, 8);
                                                                                                                    }
                                                                                                                    f.d(getApplicationContext());
                                                                                                                    d dVarO = d.o(getApplicationContext());
                                                                                                                    Intrinsics.e(dVarO, "getInstance(applicationContext)");
                                                                                                                    this.f11647j = dVarO;
                                                                                                                    dVarO.L();
                                                                                                                    Typeface typefaceA = s9.d.a(this);
                                                                                                                    Intrinsics.e(typefaceA, "getTypeFace(this, FontUtil.TypeFace.SINHALA)");
                                                                                                                    this.f11649n = typefaceA;
                                                                                                                    Calendar.getInstance().set(1, 1990);
                                                                                                                    a aVar = this.f11646f;
                                                                                                                    if (aVar == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    b9.b bVar2 = aVar.f1973b;
                                                                                                                    bVar2.f1982b.setOnClickListener(this);
                                                                                                                    bVar2.f1986f.setOnClickListener(this);
                                                                                                                    bVar2.f1987g.setOnClickListener(this);
                                                                                                                    bVar2.f1988h.setOnClickListener(this);
                                                                                                                    bVar2.f1989i.setOnClickListener(this);
                                                                                                                    bVar2.f1990j.setOnClickListener(this);
                                                                                                                    bVar2.f1991k.setOnClickListener(this);
                                                                                                                    bVar2.f1992l.setOnClickListener(this);
                                                                                                                    bVar2.f1993m.setOnClickListener(this);
                                                                                                                    bVar2.f1983c.setOnClickListener(this);
                                                                                                                    bVar2.f1984d.setOnClickListener(this);
                                                                                                                    bVar2.f1985e.setOnClickListener(this);
                                                                                                                    int i14 = 3;
                                                                                                                    int i15 = getResources().getDisplayMetrics().widthPixels / 3;
                                                                                                                    ImageView imageView2 = bVar2.f1994n;
                                                                                                                    imageView2.getLayoutParams().width = i15;
                                                                                                                    imageView2.getLayoutParams().height = i15;
                                                                                                                    LatLng latLng = (LatLng) getIntent().getParcelableExtra("latLng");
                                                                                                                    String stringExtra = getIntent().getStringExtra("place");
                                                                                                                    Serializable serializableExtra = getIntent().getSerializableExtra("dateTime");
                                                                                                                    Intrinsics.d(serializableExtra, "null cannot be cast to non-null type java.util.Calendar");
                                                                                                                    Calendar calendar = (Calendar) serializableExtra;
                                                                                                                    Serializable serializableExtra2 = getIntent().getSerializableExtra("birthDateTime");
                                                                                                                    Intrinsics.d(serializableExtra2, "null cannot be cast to non-null type java.util.Calendar");
                                                                                                                    Calendar calendar2 = (Calendar) serializableExtra2;
                                                                                                                    Log.e("H Data", "latLng > " + latLng);
                                                                                                                    Log.e("H Data", "place > " + stringExtra);
                                                                                                                    Log.e("H Data", "dateTime > ".concat(l(this, calendar)));
                                                                                                                    Log.e("H Data", "birthDateTime > ".concat(l(this, calendar2)));
                                                                                                                    d dVar = this.f11647j;
                                                                                                                    if (dVar == null) {
                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    dVar.f12592m = latLng;
                                                                                                                    dVar.f12586g = stringExtra;
                                                                                                                    dVar.f12585f = calendar;
                                                                                                                    dVar.f12602w = 5.5d;
                                                                                                                    dVar.a();
                                                                                                                    a aVar2 = this.f11646f;
                                                                                                                    if (aVar2 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar2.f1973b.f1995o.setOnClickListener(new View.OnClickListener(this) { // from class: l9.b

                                                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                                                        public final /* synthetic */ HoroscopeActivity f14690e;

                                                                                                                        {
                                                                                                                            this.f14690e = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(View view) {
                                                                                                                            int i16 = i10;
                                                                                                                            HoroscopeActivity this$0 = this.f14690e;
                                                                                                                            switch (i16) {
                                                                                                                                case 0:
                                                                                                                                    int i17 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    t.K(this$0, new c(this$0, 1));
                                                                                                                                    return;
                                                                                                                                case QueueFuseable.SYNC /* 1 */:
                                                                                                                                    int i18 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar2 = this$0.f11647j;
                                                                                                                                    if (dVar2 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar2.f12595p == null) {
                                                                                                                                        n7.c cVar = MyApplication.f11640b;
                                                                                                                                        String string2 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string2, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string2, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent = new Intent(this$0, (Class<?>) MoreDetailsActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    int i19 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar3 = this$0.f11647j;
                                                                                                                                    if (dVar3 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar3.f12595p == null) {
                                                                                                                                        n7.c cVar2 = MyApplication.f11640b;
                                                                                                                                        String string3 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string3, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string3, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent2 = new Intent(this$0, (Class<?>) ReportActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent2);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent2);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    a aVar3 = this.f11646f;
                                                                                                                    if (aVar3 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar3.f1974c.setOnClickListener(new View.OnClickListener(this) { // from class: l9.b

                                                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                                                        public final /* synthetic */ HoroscopeActivity f14690e;

                                                                                                                        {
                                                                                                                            this.f14690e = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(View view) {
                                                                                                                            int i16 = i13;
                                                                                                                            HoroscopeActivity this$0 = this.f14690e;
                                                                                                                            switch (i16) {
                                                                                                                                case 0:
                                                                                                                                    int i17 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    t.K(this$0, new c(this$0, 1));
                                                                                                                                    return;
                                                                                                                                case QueueFuseable.SYNC /* 1 */:
                                                                                                                                    int i18 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar2 = this$0.f11647j;
                                                                                                                                    if (dVar2 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar2.f12595p == null) {
                                                                                                                                        n7.c cVar = MyApplication.f11640b;
                                                                                                                                        String string2 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string2, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string2, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent = new Intent(this$0, (Class<?>) MoreDetailsActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    int i19 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar3 = this$0.f11647j;
                                                                                                                                    if (dVar3 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar3.f12595p == null) {
                                                                                                                                        n7.c cVar2 = MyApplication.f11640b;
                                                                                                                                        String string3 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string3, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string3, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent2 = new Intent(this$0, (Class<?>) ReportActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent2);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent2);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    a aVar4 = this.f11646f;
                                                                                                                    if (aVar4 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    final int i16 = 2;
                                                                                                                    aVar4.f1976e.setOnClickListener(new View.OnClickListener(this) { // from class: l9.b

                                                                                                                        /* renamed from: e, reason: collision with root package name */
                                                                                                                        public final /* synthetic */ HoroscopeActivity f14690e;

                                                                                                                        {
                                                                                                                            this.f14690e = this;
                                                                                                                        }

                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(View view) {
                                                                                                                            int i162 = i16;
                                                                                                                            HoroscopeActivity this$0 = this.f14690e;
                                                                                                                            switch (i162) {
                                                                                                                                case 0:
                                                                                                                                    int i17 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    t.K(this$0, new c(this$0, 1));
                                                                                                                                    return;
                                                                                                                                case QueueFuseable.SYNC /* 1 */:
                                                                                                                                    int i18 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar2 = this$0.f11647j;
                                                                                                                                    if (dVar2 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar2.f12595p == null) {
                                                                                                                                        n7.c cVar = MyApplication.f11640b;
                                                                                                                                        String string2 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string2, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string2, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent = new Intent(this$0, (Class<?>) MoreDetailsActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    int i19 = HoroscopeActivity.f11645t;
                                                                                                                                    Intrinsics.f(this$0, "this$0");
                                                                                                                                    e9.d dVar3 = this$0.f11647j;
                                                                                                                                    if (dVar3 == null) {
                                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (dVar3.f12595p == null) {
                                                                                                                                        n7.c cVar2 = MyApplication.f11640b;
                                                                                                                                        String string3 = this$0.getString(2131886409);
                                                                                                                                        Intrinsics.e(string3, "if (MyApplication.getLan…rst\n                    )");
                                                                                                                                        Toast.makeText(this$0, string3, 0).show();
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    Intent intent2 = new Intent(this$0, (Class<?>) ReportActivity.class);
                                                                                                                                    if (t.w()) {
                                                                                                                                        t.L(this$0, intent2);
                                                                                                                                    } else {
                                                                                                                                        this$0.startActivity(intent2);
                                                                                                                                    }
                                                                                                                                    this$0.overridePendingTransition(2130771982, 2130771981);
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    p();
                                                                                                                    n7.c cVar = MyApplication.f11640b;
                                                                                                                    a aVar5 = this.f11646f;
                                                                                                                    if (aVar5 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar5.f1976e.setText(getString(2131886925));
                                                                                                                    a aVar6 = this.f11646f;
                                                                                                                    if (aVar6 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar6.f1974c.setText(getString(2131886654));
                                                                                                                    a aVar7 = this.f11646f;
                                                                                                                    if (aVar7 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar7.f1979h.setText(getString(2131886289));
                                                                                                                    a aVar8 = this.f11646f;
                                                                                                                    if (aVar8 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar8.f1980i.setText(getString(2131886293));
                                                                                                                    a aVar9 = this.f11646f;
                                                                                                                    if (aVar9 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    d dVar2 = this.f11647j;
                                                                                                                    if (dVar2 == null) {
                                                                                                                        Intrinsics.n("mHoroscope");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar9.f1977f.setText(dVar2.i(this));
                                                                                                                    a aVar10 = this.f11646f;
                                                                                                                    if (aVar10 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    aVar10.f1978g.setText(l(this, calendar2));
                                                                                                                    a aVar11 = this.f11646f;
                                                                                                                    if (aVar11 == null) {
                                                                                                                        Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    LinearLayout linearLayout4 = aVar11.f1972a;
                                                                                                                    Intrinsics.e(linearLayout4, "binding.bannerAd");
                                                                                                                    if (!g5.a.f13038j || n7.c.u() || !n7.c.n(this)) {
                                                                                                                        f.l(linearLayout4);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    i iVar = new i(this);
                                                                                                                    String str = g5.a.f13041m;
                                                                                                                    if (str.length() == 0) {
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    iVar.setAdUnitId(str);
                                                                                                                    linearLayout4.removeAllViews();
                                                                                                                    linearLayout4.addView(iVar);
                                                                                                                    linearLayout4.post(new m(this, linearLayout4, iVar, i14));
                                                                                                                    return;
                                                                                                                }
                                                                                                                i11 = 2131296946;
                                                                                                            } else {
                                                                                                                i11 = 2131296945;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i11 = 2131296929;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i11 = 2131296928;
                                                                                                    }
                                                                                                } else {
                                                                                                    i11 = 2131296811;
                                                                                                }
                                                                                            } else {
                                                                                                i11 = 2131296627;
                                                                                            }
                                                                                        } else {
                                                                                            i11 = 2131296604;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewL.getResources().getResourceName(i12)));
                        }
                        i11 = 2131296600;
                    } else {
                        i11 = 2131296530;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.f(menu, "menu");
        getMenuInflater().inflate(2131623937, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.f(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId == 2131296669) {
            t.K(this, new l9.c(this, 2));
            return true;
        }
        if (itemId != 2131296670) {
            return super.onOptionsItemSelected(item);
        }
        d dVar = this.f11647j;
        if (dVar == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        if (dVar.f12595p != null) {
            t.K(this, new l9.c(this, 3));
            return true;
        }
        n7.c cVar = MyApplication.f11640b;
        String string = getString(2131886409);
        Intrinsics.e(string, "if (MyApplication.getLan…                        )");
        Toast.makeText(this, string, 0).show();
        return true;
    }

    @Override // androidx.fragment.app.d0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.f(permissions, "permissions");
        Intrinsics.f(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        j4.H(i10, permissions, grantResults, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() throws Resources.NotFoundException {
        ArrayList<e9.a> arrayList;
        String str;
        a31 a31Var;
        String str2;
        int i10;
        SpannableString spannableString;
        Object obj;
        TextView textView;
        int i11;
        if (this.f11648m) {
            d dVar = this.f11647j;
            if (dVar == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            arrayList = dVar.f12589j;
            str = "{\n            mHoroscope.houseList\n        }";
        } else {
            d dVar2 = this.f11647j;
            if (dVar2 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            arrayList = dVar2.f12594o;
            str = "{\n            mHoroscope.nawanshakaList\n        }";
        }
        Intrinsics.e(arrayList, str);
        for (e9.a aVar : arrayList) {
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(aVar.f12562a);
            arrayList2.addAll(aVar.f12563b);
            int iIndexOf = arrayList.indexOf(aVar) + 1;
            Iterator it = arrayList2.iterator();
            String strF = "";
            String strF2 = "";
            while (it.hasNext()) {
                String strG = ((e9.c) it.next()).g();
                s9.f fVar = s9.c.f16951a;
                String string = getResources().getString(s9.c.b(this, strG));
                strF2 = strF2.length() == 0 ? a0.h.F(strF2, string) : a0.h.G(strF2, ",", string);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                e9.c cVar = (e9.c) it2.next();
                cVar.getClass();
                n7.c cVar2 = MyApplication.f11640b;
                Log.e("HoroscopeActivity", "getShortNameCode > " + ("grahaShortSin" + cVar.f12573b));
                String str3 = "grahaShortSin" + cVar.f12573b;
                s9.f fVar2 = s9.c.f16951a;
                String string2 = getResources().getString(s9.c.b(this, str3));
                Log.e("HoroscopeActivity", "graharahaShort > " + string2);
                if (cVar.f12576e) {
                    string2 = a0.h.w("(", string2, ")");
                }
                if (cVar.o()) {
                    i11 = 2131034151;
                } else if (cVar.i().equals("nicha")) {
                    arrayList4.add(Integer.valueOf(f0.f.b(this, 2131034906)));
                    d dVar3 = this.f11647j;
                    if (dVar3 == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    if (dVar3.E(cVar.f12573b, this.f11648m)) {
                        string2 = a0.h.F(string2, "*");
                    }
                    strF = strF.length() != 0 ? a0.h.F(strF, string2) : a0.h.G(strF, arrayList2.size() / 2 == arrayList2.indexOf(cVar) ? "\n" : " ", string2);
                    arrayList3.add(Integer.valueOf(strF.length()));
                } else {
                    i11 = cVar.n() ? 2131035290 : 2131034150;
                }
                arrayList4.add(Integer.valueOf(f0.f.b(this, i11)));
                if (strF.length() != 0) {
                }
                strF = strF.length() != 0 ? a0.h.F(strF, string2) : a0.h.G(strF, arrayList2.size() / 2 == arrayList2.indexOf(cVar) ? "\n" : " ", string2);
                arrayList3.add(Integer.valueOf(strF.length()));
            }
            if (TextUtils.isEmpty(strF)) {
                spannableString = new SpannableString(String.valueOf(iIndexOf));
            } else {
                spannableString = new SpannableString(strF);
                Iterator it3 = arrayList3.iterator();
                int iIntValue = 0;
                while (it3.hasNext()) {
                    Integer intValue = (Integer) it3.next();
                    Intrinsics.e(intValue, "intValue");
                    Object obj2 = arrayList4.get(arrayList3.indexOf(Integer.valueOf(intValue.intValue())));
                    Intrinsics.e(obj2, "colors[arrayList.indexOf…                       )]");
                    spannableString.setSpan(new ForegroundColorSpan(((Number) obj2).intValue()), iIntValue, intValue.intValue(), 33);
                    iIntValue = intValue.intValue();
                }
            }
            switch (iIndexOf) {
                case QueueFuseable.SYNC /* 1 */:
                    obj = null;
                    a aVar2 = this.f11646f;
                    if (aVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar2.f1973b.f1982b;
                    textView.setText(spannableString);
                case 2:
                    obj = null;
                    a aVar3 = this.f11646f;
                    if (aVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar3.f1973b.f1986f;
                    textView.setText(spannableString);
                case 3:
                    obj = null;
                    a aVar4 = this.f11646f;
                    if (aVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar4.f1973b.f1987g;
                    textView.setText(spannableString);
                case 4:
                    obj = null;
                    a aVar5 = this.f11646f;
                    if (aVar5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar5.f1973b.f1988h;
                    textView.setText(spannableString);
                case g.INVALID_ACCOUNT /* 5 */:
                    obj = null;
                    a aVar6 = this.f11646f;
                    if (aVar6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar6.f1973b.f1989i;
                    textView.setText(spannableString);
                case g.RESOLUTION_REQUIRED /* 6 */:
                    obj = null;
                    a aVar7 = this.f11646f;
                    if (aVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar7.f1973b.f1990j;
                    textView.setText(spannableString);
                case g.NETWORK_ERROR /* 7 */:
                    obj = null;
                    a aVar8 = this.f11646f;
                    if (aVar8 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar8.f1973b.f1991k;
                    textView.setText(spannableString);
                case 8:
                    obj = null;
                    a aVar9 = this.f11646f;
                    if (aVar9 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar9.f1973b.f1992l;
                    textView.setText(spannableString);
                case 9:
                    obj = null;
                    a aVar10 = this.f11646f;
                    if (aVar10 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar10.f1973b.f1993m;
                    textView.setText(spannableString);
                case g.DEVELOPER_ERROR /* 10 */:
                    obj = null;
                    a aVar11 = this.f11646f;
                    if (aVar11 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar11.f1973b.f1983c;
                    textView.setText(spannableString);
                case 11:
                    obj = null;
                    a aVar12 = this.f11646f;
                    if (aVar12 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    textView = aVar12.f1973b.f1984d;
                    textView.setText(spannableString);
                case 12:
                    a aVar13 = this.f11646f;
                    if (aVar13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    aVar13.f1973b.f1985e.setText(spannableString);
            }
        }
        a aVar14 = this.f11646f;
        if (aVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = aVar14.f1973b.f1982b;
        Intrinsics.e(textView2, "binding.includeChartLayout.house1");
        o(textView2);
        a aVar15 = this.f11646f;
        if (aVar15 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView3 = aVar15.f1973b.f1986f;
        Intrinsics.e(textView3, "binding.includeChartLayout.house2");
        o(textView3);
        a aVar16 = this.f11646f;
        if (aVar16 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView4 = aVar16.f1973b.f1987g;
        Intrinsics.e(textView4, "binding.includeChartLayout.house3");
        o(textView4);
        a aVar17 = this.f11646f;
        if (aVar17 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView5 = aVar17.f1973b.f1988h;
        Intrinsics.e(textView5, "binding.includeChartLayout.house4");
        o(textView5);
        a aVar18 = this.f11646f;
        if (aVar18 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView6 = aVar18.f1973b.f1989i;
        Intrinsics.e(textView6, "binding.includeChartLayout.house5");
        o(textView6);
        a aVar19 = this.f11646f;
        if (aVar19 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView7 = aVar19.f1973b.f1990j;
        Intrinsics.e(textView7, "binding.includeChartLayout.house6");
        o(textView7);
        a aVar20 = this.f11646f;
        if (aVar20 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView8 = aVar20.f1973b.f1991k;
        Intrinsics.e(textView8, "binding.includeChartLayout.house7");
        o(textView8);
        a aVar21 = this.f11646f;
        if (aVar21 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView9 = aVar21.f1973b.f1992l;
        Intrinsics.e(textView9, "binding.includeChartLayout.house8");
        o(textView9);
        a aVar22 = this.f11646f;
        if (aVar22 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView10 = aVar22.f1973b.f1993m;
        Intrinsics.e(textView10, "binding.includeChartLayout.house9");
        o(textView10);
        a aVar23 = this.f11646f;
        if (aVar23 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView11 = aVar23.f1973b.f1983c;
        Intrinsics.e(textView11, "binding.includeChartLayout.house10");
        o(textView11);
        a aVar24 = this.f11646f;
        if (aVar24 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView12 = aVar24.f1973b.f1984d;
        Intrinsics.e(textView12, "binding.includeChartLayout.house11");
        o(textView12);
        a aVar25 = this.f11646f;
        if (aVar25 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView13 = aVar25.f1973b.f1985e;
        Intrinsics.e(textView13, "binding.includeChartLayout.house12");
        o(textView13);
        n7.c cVar3 = MyApplication.f11640b;
        g.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String string3 = getString(this.f11648m ? 2131886529 : 2131886743);
            Intrinsics.e(string3, "getString(if (mShowingLa….string.nawanshakaya_sin)");
            e.M(supportActionBar, this, string3, true, 8);
            Unit unit = Unit.f14090a;
        }
        if (this.f11648m) {
            d dVar4 = this.f11647j;
            if (dVar4 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            a31Var = dVar4.f12595p;
            str2 = "{\n            mHoroscope.rashiLagna\n        }";
        } else {
            d dVar5 = this.f11647j;
            if (dVar5 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            a31Var = dVar5.f12596q;
            str2 = "{\n            mHoroscope.rashiNawanshaka\n        }";
        }
        Intrinsics.e(a31Var, str2);
        a aVar26 = this.f11646f;
        if (aVar26 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar26.f1973b.f1994n.setVisibility(0);
        a aVar27 = this.f11646f;
        if (aVar27 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar27.f1973b.f1996p.setVisibility(0);
        a aVar28 = this.f11646f;
        if (aVar28 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        aVar28.f1973b.f1981a.setVisibility(0);
        a aVar29 = this.f11646f;
        if (aVar29 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ImageView imageView = aVar29.f1973b.f1994n;
        switch (a31Var.f2540c) {
            case 0:
                i10 = 2131165492;
                break;
            case QueueFuseable.SYNC /* 1 */:
                i10 = 2131165505;
                break;
            case 2:
                i10 = 2131165327;
                break;
            case 3:
                i10 = 2131165306;
                break;
            case 4:
                i10 = 2131165328;
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                i10 = 2131165483;
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                i10 = 2131165307;
                break;
            case g.NETWORK_ERROR /* 7 */:
                i10 = 2131165356;
                break;
            case 8:
                i10 = 2131165408;
                break;
            case 9:
                i10 = 2131165409;
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                i10 = 2131165501;
                break;
            default:
                i10 = 2131165493;
                break;
        }
        imageView.setImageResource(i10);
        a aVar30 = this.f11646f;
        if (aVar30 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView14 = aVar30.f1973b.f1996p;
        String strB = a31Var.b();
        s9.f fVar3 = s9.c.f16951a;
        textView14.setText(getResources().getString(s9.c.b(this, strB)));
        a aVar31 = this.f11646f;
        if (aVar31 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView15 = aVar31.f1973b.f1996p;
        Typeface typeface = this.f11649n;
        if (typeface == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView15.setTypeface(typeface, 1);
        a aVar32 = this.f11646f;
        if (aVar32 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView16 = aVar32.f1973b.f1996p;
        Intrinsics.e(textView16, "binding.includeChartLayout.name");
        j4.O(textView16, 2131100489);
    }
}