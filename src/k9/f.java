package k9;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.o;
import androidx.fragment.app.d0;
import androidx.fragment.app.x0;
import androidx.lifecycle.d1;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.q;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.yh;
import com.isprid.kendare.MyApplication;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import ec.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.e0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q2.j;
import t5.j4;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lk9/f;", "Lj9/c;", "La9/a;", "Le9/d;", "Lm9/a;", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends j9.c implements a9.a, m9.a {
    public static final /* synthetic */ int O = 0;
    public Calendar M;
    public r9.e N;

    /* renamed from: f, reason: collision with root package name */
    public o5.c f14054f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14055j;

    /* renamed from: m, reason: collision with root package name */
    public e9.d f14056m;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f14057n;

    /* renamed from: t, reason: collision with root package name */
    public o f14058t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14059u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14060w;

    public static String k(Context context, Calendar calendar) {
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

    @Override // a9.a
    public final void a(Object obj) {
        String strK;
        e9.d horoscope = (e9.d) obj;
        Intrinsics.f(horoscope, "horoscope");
        e9.d dVar = this.f14056m;
        if (dVar == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        dVar.f12585f = horoscope.f12585f;
        dVar.f12592m = horoscope.f12592m;
        dVar.f12602w = horoscope.f12602w;
        dVar.f12582c = horoscope.f12582c;
        dVar.f12580a = horoscope.f12580a;
        dVar.f12581b = horoscope.f12581b;
        dVar.f12586g = horoscope.f12586g;
        Calendar calBirthDate = Calendar.getInstance();
        boolean z7 = true;
        boolean z10 = false;
        if (j4.E(horoscope.f12585f)) {
            calBirthDate = j4.y(horoscope.f12585f);
        } else if (j4.D(horoscope.f12585f)) {
            calBirthDate = j4.x(horoscope.f12585f);
            z7 = false;
            z10 = true;
        } else {
            z7 = false;
        }
        Log.e("onCommand", "latLng > " + horoscope.f12592m);
        Log.e("onCommand", "place > " + horoscope.f12586g);
        Context contextRequireContext = requireContext();
        Intrinsics.e(contextRequireContext, "requireContext()");
        Calendar calendar = horoscope.f12585f;
        Intrinsics.e(calendar, "horoscope.birthDateTimeReal");
        Log.e("onCommand", "dateTime > ".concat(k(contextRequireContext, calendar)));
        if (z7 || z10) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.e(contextRequireContext2, "requireContext()");
            Intrinsics.e(calBirthDate, "calBirthDate");
            strK = k(contextRequireContext2, calBirthDate);
        } else {
            Context contextRequireContext3 = requireContext();
            Intrinsics.e(contextRequireContext3, "requireContext()");
            Calendar calendar2 = horoscope.f12585f;
            Intrinsics.e(calendar2, "horoscope.birthDateTimeReal");
            strK = k(contextRequireContext3, calendar2);
        }
        Log.e("onCommand", "birthDateTime > ".concat(strK));
        Intent intent = new Intent(requireContext(), (Class<?>) HoroscopeActivity.class);
        intent.putExtra("latLng", horoscope.f12592m);
        intent.putExtra("place", horoscope.f12586g);
        intent.putExtra("dateTime", horoscope.f12585f);
        if (!z7 && !z10) {
            calBirthDate = horoscope.f12585f;
        }
        intent.putExtra("birthDateTime", calBirthDate);
        startActivity(intent);
    }

    @Override // j9.c
    public final void h() {
    }

    public final void l() {
        if (!g5.a.f13040l || n7.c.u()) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.e(contextRequireContext, "requireContext()");
        if (n7.c.n(contextRequireContext)) {
            String str = g5.a.f13042n;
            Log.e("HomeFragment", "Native adUnitId:  ".concat(str));
            if (str.length() == 0) {
                return;
            }
            c4.d dVar = new c4.d(requireContext(), str);
            e0 e0Var = dVar.f2100b;
            try {
                e0Var.D2(new yh(new a(this), 1));
            } catch (RemoteException e10) {
                wr.h("Failed to add google native ad listener", e10);
            }
            dVar.b(new d(this, 0));
            try {
                e0Var.c2(new fg(4, false, -1, false, 1, null, false, 0, 0, false));
            } catch (RemoteException e11) {
                wr.h("Failed to specify native ad options", e11);
            }
            dVar.a().a(new c4.f(new p8.c(22)));
        }
    }

    public final void m() {
        if (this.f14060w || this.f14059u) {
            o5.c cVar = this.f14054f;
            if (cVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            EditText editText = (EditText) cVar.f15716j;
            Intrinsics.e(editText, "binding.correctBirthTimeText");
            com.bumptech.glide.f.x(editText);
            o5.c cVar2 = this.f14054f;
            if (cVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = (TextView) cVar2.f15715i;
            Intrinsics.e(textView, "binding.correctBirthTimeLabel");
            com.bumptech.glide.f.x(textView);
            return;
        }
        o5.c cVar3 = this.f14054f;
        if (cVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText2 = (EditText) cVar3.f15716j;
        Intrinsics.e(editText2, "binding.correctBirthTimeText");
        com.bumptech.glide.f.l(editText2);
        o5.c cVar4 = this.f14054f;
        if (cVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = (TextView) cVar4.f15715i;
        Intrinsics.e(textView2, "binding.correctBirthTimeLabel");
        com.bumptech.glide.f.l(textView2);
    }

    public final void n() {
        n7.c cVar = MyApplication.f11640b;
        o5.c cVar2 = this.f14054f;
        if (cVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((Button) cVar2.f15714h).setText(getString(2131886410));
        o5.c cVar3 = this.f14054f;
        if (cVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Button button = (Button) cVar3.f15714h;
        Typeface typeface = this.f14057n;
        if (typeface == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        button.setTypeface(typeface, 1);
        o5.c cVar4 = this.f14054f;
        if (cVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar4.f15708b).setText(getString(2131886289));
        o5.c cVar5 = this.f14054f;
        if (cVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = (TextView) cVar5.f15708b;
        Typeface typeface2 = this.f14057n;
        if (typeface2 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView.setTypeface(typeface2, 1);
        o5.c cVar6 = this.f14054f;
        if (cVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar6.f15708b).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar7 = this.f14054f;
        if (cVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar7.f15712f).setText(getString(2131886293));
        o5.c cVar8 = this.f14054f;
        if (cVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = (TextView) cVar8.f15712f;
        Typeface typeface3 = this.f14057n;
        if (typeface3 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView2.setTypeface(typeface3, 1);
        o5.c cVar9 = this.f14054f;
        if (cVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar9.f15712f).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar10 = this.f14054f;
        if (cVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar10.f15715i).setText(getString(2131886349));
        o5.c cVar11 = this.f14054f;
        if (cVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView3 = (TextView) cVar11.f15715i;
        Typeface typeface4 = this.f14057n;
        if (typeface4 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView3.setTypeface(typeface4, 1);
        o5.c cVar12 = this.f14054f;
        if (cVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar12.f15715i).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar13 = this.f14054f;
        if (cVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar13.f15710d).setText(getString(2131886291));
        o5.c cVar14 = this.f14054f;
        if (cVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView4 = (TextView) cVar14.f15710d;
        Typeface typeface5 = this.f14057n;
        if (typeface5 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView4.setTypeface(typeface5, 1);
        o5.c cVar15 = this.f14054f;
        if (cVar15 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) cVar15.f15710d).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar16 = this.f14054f;
        if (cVar16 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText = (EditText) cVar16.f15709c;
        Typeface typeface6 = this.f14057n;
        if (typeface6 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        editText.setTypeface(typeface6, 1);
        o5.c cVar17 = this.f14054f;
        if (cVar17 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((EditText) cVar17.f15709c).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar18 = this.f14054f;
        if (cVar18 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText2 = (EditText) cVar18.f15713g;
        Typeface typeface7 = this.f14057n;
        if (typeface7 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        editText2.setTypeface(typeface7, 1);
        o5.c cVar19 = this.f14054f;
        if (cVar19 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((EditText) cVar19.f15713g).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar20 = this.f14054f;
        if (cVar20 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText3 = (EditText) cVar20.f15716j;
        Typeface typeface8 = this.f14057n;
        if (typeface8 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        editText3.setTypeface(typeface8, 1);
        o5.c cVar21 = this.f14054f;
        if (cVar21 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((EditText) cVar21.f15716j).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar22 = this.f14054f;
        if (cVar22 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText4 = (EditText) cVar22.f15711e;
        Typeface typeface9 = this.f14057n;
        if (typeface9 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        editText4.setTypeface(typeface9, 1);
        o5.c cVar23 = this.f14054f;
        if (cVar23 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((EditText) cVar23.f15711e).setTextSize(0, getResources().getDimension(2131100493));
        o5.c cVar24 = this.f14054f;
        if (cVar24 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText5 = (EditText) cVar24.f15709c;
        e9.d dVar = this.f14056m;
        if (dVar == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        editText5.setText(dVar.i(requireContext()));
        o5.c cVar25 = this.f14054f;
        if (cVar25 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText6 = (EditText) cVar25.f15716j;
        e9.d dVar2 = this.f14056m;
        if (dVar2 == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        Context contextRequireContext = requireContext();
        editText6.setText(new SimpleDateFormat("hh:mm a").format(dVar2.f12585f.getTime()).replace("PM", contextRequireContext.getString(2131886861)).replace("AM", contextRequireContext.getString(2131886121)));
        o5.c cVar26 = this.f14054f;
        if (cVar26 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText7 = (EditText) cVar26.f15711e;
        e9.d dVar3 = this.f14056m;
        if (dVar3 != null) {
            editText7.setText(dVar3.f12586g);
        } else {
            Intrinsics.n("mHoroscope");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) throws PackageManager.NameNotFoundException {
        q qVarA;
        PackageInfo packageInfo;
        Intrinsics.f(inflater, "inflater");
        final int i10 = 0;
        View viewInflate = inflater.inflate(2131492925, viewGroup, false);
        int i11 = 2131296380;
        TextView textView = (TextView) g5.a.l(viewInflate, 2131296380);
        if (textView != null) {
            i11 = 2131296381;
            EditText editText = (EditText) g5.a.l(viewInflate, 2131296381);
            if (editText != null) {
                i11 = 2131296382;
                TextView textView2 = (TextView) g5.a.l(viewInflate, 2131296382);
                if (textView2 != null) {
                    i11 = 2131296383;
                    EditText editText2 = (EditText) g5.a.l(viewInflate, 2131296383);
                    if (editText2 != null) {
                        i11 = 2131296385;
                        TextView textView3 = (TextView) g5.a.l(viewInflate, 2131296385);
                        if (textView3 != null) {
                            i11 = 2131296386;
                            EditText editText3 = (EditText) g5.a.l(viewInflate, 2131296386);
                            if (editText3 != null) {
                                i11 = 2131296400;
                                Button button = (Button) g5.a.l(viewInflate, 2131296400);
                                if (button != null) {
                                    i11 = 2131296459;
                                    TextView textView4 = (TextView) g5.a.l(viewInflate, 2131296459);
                                    if (textView4 != null) {
                                        i11 = 2131296460;
                                        EditText editText4 = (EditText) g5.a.l(viewInflate, 2131296460);
                                        if (editText4 != null) {
                                            i11 = 2131296543;
                                            FrameLayout frameLayout = (FrameLayout) g5.a.l(viewInflate, 2131296543);
                                            if (frameLayout != null) {
                                                i11 = 2131296629;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) g5.a.l(viewInflate, 2131296629);
                                                if (constraintLayout != null) {
                                                    i11 = 2131296708;
                                                    NativeAdView nativeAdView = (NativeAdView) g5.a.l(viewInflate, 2131296708);
                                                    if (nativeAdView != null) {
                                                        this.f14054f = new o5.c((ConstraintLayout) viewInflate, textView, editText, textView2, editText2, textView3, editText3, button, textView4, editText4, frameLayout, constraintLayout, nativeAdView);
                                                        r9.e eVar = (r9.e) new g.e((d1) this).o(r9.e.class);
                                                        this.N = eVar;
                                                        eVar.f16654a.e(getViewLifecycleOwner(), new a(this));
                                                        Context contextRequireContext = requireContext();
                                                        Intrinsics.e(contextRequireContext, "requireContext()");
                                                        this.f14058t = new o(contextRequireContext, 4);
                                                        e9.d dVarO = e9.d.o(requireContext());
                                                        Intrinsics.e(dVarO, "getInstance(requireContext())");
                                                        this.f14056m = dVarO;
                                                        dVarO.L();
                                                        Typeface typefaceA = s9.d.a(requireContext());
                                                        Intrinsics.e(typefaceA, "getTypeFace(requireConte…ontUtil.TypeFace.SINHALA)");
                                                        this.f14057n = typefaceA;
                                                        final int i12 = 1;
                                                        Calendar.getInstance().set(1, 1990);
                                                        o5.c cVar = this.f14054f;
                                                        if (cVar == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        EditText editText5 = (EditText) cVar.f15716j;
                                                        Intrinsics.e(editText5, "binding.correctBirthTimeText");
                                                        com.bumptech.glide.f.l(editText5);
                                                        o5.c cVar2 = this.f14054f;
                                                        if (cVar2 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        TextView textView5 = (TextView) cVar2.f15715i;
                                                        Intrinsics.e(textView5, "binding.correctBirthTimeLabel");
                                                        com.bumptech.glide.f.l(textView5);
                                                        View viewInflate2 = LayoutInflater.from(requireContext()).inflate(2131492935, (ViewGroup) null);
                                                        Intrinsics.d(viewInflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                        LinearLayout linearLayout = (LinearLayout) viewInflate2;
                                                        ImageView imageView = (ImageView) linearLayout.findViewById(2131296596);
                                                        Context context = getContext();
                                                        if (context == null) {
                                                            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                                                        }
                                                        m mVar = com.bumptech.glide.b.b(context).f2234m;
                                                        mVar.getClass();
                                                        if (getContext() == null) {
                                                            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
                                                        }
                                                        char[] cArr = i3.o.f13305a;
                                                        if (!(Looper.myLooper() == Looper.getMainLooper())) {
                                                            qVarA = mVar.b(getContext().getApplicationContext());
                                                        } else {
                                                            if (b() != null) {
                                                                b();
                                                                mVar.f2347t.c();
                                                            }
                                                            x0 childFragmentManager = getChildFragmentManager();
                                                            Context context2 = getContext();
                                                            qVarA = mVar.f2346n.f19470a.containsKey(com.bumptech.glide.e.class) ? mVar.f2348u.a(context2, com.bumptech.glide.b.b(context2.getApplicationContext()), getLifecycle(), childFragmentManager, isVisible()) : mVar.f(context2, childFragmentManager, this, isVisible());
                                                        }
                                                        qVarA.getClass();
                                                        com.bumptech.glide.o oVar = new com.bumptech.glide.o(qVarA.f2390b, qVarA, Drawable.class, qVarA.f2391e);
                                                        com.bumptech.glide.o oVarY = oVar.y(2131165310);
                                                        ConcurrentHashMap concurrentHashMap = h3.b.f13191a;
                                                        Context context3 = oVar.f2376d0;
                                                        String packageName = context3.getPackageName();
                                                        ConcurrentHashMap concurrentHashMap2 = h3.b.f13191a;
                                                        j jVar = (j) concurrentHashMap2.get(packageName);
                                                        if (jVar == null) {
                                                            try {
                                                                packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                                                            } catch (PackageManager.NameNotFoundException e10) {
                                                                Log.e("AppVersionSignature", "Cannot resolve info for" + context3.getPackageName(), e10);
                                                                packageInfo = null;
                                                            }
                                                            h3.d dVar = new h3.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                                                            jVar = (j) concurrentHashMap2.putIfAbsent(packageName, dVar);
                                                            if (jVar == null) {
                                                                jVar = dVar;
                                                            }
                                                        }
                                                        oVarY.t((e3.e) new e3.e().n(new h3.a(context3.getResources().getConfiguration().uiMode & 48, jVar))).w(imageView);
                                                        o5.c cVar3 = this.f14054f;
                                                        if (cVar3 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ((FrameLayout) cVar3.f15717k).removeAllViews();
                                                        o5.c cVar4 = this.f14054f;
                                                        if (cVar4 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ((FrameLayout) cVar4.f15717k).addView(linearLayout);
                                                        o5.c cVar5 = this.f14054f;
                                                        if (cVar5 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        FrameLayout frameLayout2 = (FrameLayout) cVar5.f15717k;
                                                        Intrinsics.e(frameLayout2, "binding.frameNative");
                                                        com.bumptech.glide.f.x(frameLayout2);
                                                        o5.c cVar6 = this.f14054f;
                                                        if (cVar6 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        NativeAdView nativeAdView2 = (NativeAdView) cVar6.f15719m;
                                                        Intrinsics.e(nativeAdView2, "binding.nativeAdContainer");
                                                        com.bumptech.glide.f.l(nativeAdView2);
                                                        e9.d dVar2 = this.f14056m;
                                                        if (dVar2 == null) {
                                                            Intrinsics.n("mHoroscope");
                                                            throw null;
                                                        }
                                                        dVar2.f12602w = 5.5d;
                                                        o5.c cVar7 = this.f14054f;
                                                        if (cVar7 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ((EditText) cVar7.f15709c).setOnClickListener(new View.OnClickListener(this) { // from class: k9.b

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ f f14048e;

                                                            {
                                                                this.f14048e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                int i13 = i10;
                                                                f this$0 = this.f14048e;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        final Calendar newCalendar = Calendar.getInstance();
                                                                        if (this$0.f14055j) {
                                                                            e9.d dVar3 = this$0.f14056m;
                                                                            if (dVar3 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            newCalendar = dVar3.f12585f;
                                                                        }
                                                                        d0 d0VarB = this$0.b();
                                                                        if (d0VarB != null) {
                                                                            Intrinsics.e(newCalendar, "newCalendar");
                                                                            final u9.f fVar = new u9.f(new c(this$0, 0), 0);
                                                                            new DatePickerDialog(d0VarB, 3, new DatePickerDialog.OnDateSetListener() { // from class: u9.d
                                                                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                                                                public final void onDateSet(DatePicker datePicker, int i15, int i16, int i17) {
                                                                                    Calendar calendar = newCalendar;
                                                                                    Intrinsics.f(calendar, "$calendar");
                                                                                    Function1 func = fVar;
                                                                                    Intrinsics.f(func, "$func");
                                                                                    calendar.set(1, i15);
                                                                                    calendar.set(2, i16);
                                                                                    calendar.set(5, i17);
                                                                                    func.invoke(calendar);
                                                                                }
                                                                            }, newCalendar.get(1), newCalendar.get(2), newCalendar.get(5)).show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case QueueFuseable.SYNC /* 1 */:
                                                                        int i15 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        d0 d0VarB2 = this$0.b();
                                                                        if (d0VarB2 != null) {
                                                                            e9.d dVar4 = this$0.f14056m;
                                                                            if (dVar4 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            Calendar calendar = dVar4.f12585f;
                                                                            Intrinsics.e(calendar, "mHoroscope.birthDateTimeReal");
                                                                            final e eVar2 = new e(this$0);
                                                                            TimePickerDialog timePickerDialog = new TimePickerDialog(d0VarB2, new TimePickerDialog.OnTimeSetListener() { // from class: u9.e
                                                                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                                                                public final void onTimeSet(TimePicker timePicker, int i16, int i17) {
                                                                                    Function2 time = eVar2;
                                                                                    Intrinsics.f(time, "$time");
                                                                                    time.invoke(Integer.valueOf(i16), Integer.valueOf(i17));
                                                                                }
                                                                            }, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(d0VarB2));
                                                                            timePickerDialog.setTitle("Select Time");
                                                                            timePickerDialog.show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        int i16 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        try {
                                                                            m9.c cVar8 = new m9.c();
                                                                            cVar8.W = this$0;
                                                                            cVar8.k(this$0.getChildFragmentManager(), "HomeFragment");
                                                                            return;
                                                                        } catch (Exception e11) {
                                                                            e11.printStackTrace();
                                                                            return;
                                                                        }
                                                                    default:
                                                                        int i17 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        Intent intent = new Intent(this$0.requireContext(), (Class<?>) HoroscopeActivity.class);
                                                                        e9.d dVar5 = this$0.f14056m;
                                                                        if (dVar5 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("latLng", dVar5.f12592m);
                                                                        e9.d dVar6 = this$0.f14056m;
                                                                        if (dVar6 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("place", dVar6.f12586g);
                                                                        e9.d dVar7 = this$0.f14056m;
                                                                        if (dVar7 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("dateTime", dVar7.f12585f);
                                                                        Calendar calendar2 = this$0.M;
                                                                        if (calendar2 == null) {
                                                                            Intrinsics.n("calBirthDate");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("birthDateTime", calendar2);
                                                                        this$0.j(intent);
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        o5.c cVar8 = this.f14054f;
                                                        if (cVar8 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ((EditText) cVar8.f15713g).setOnClickListener(new View.OnClickListener(this) { // from class: k9.b

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ f f14048e;

                                                            {
                                                                this.f14048e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                int i13 = i12;
                                                                f this$0 = this.f14048e;
                                                                switch (i13) {
                                                                    case 0:
                                                                        int i14 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        final Calendar newCalendar = Calendar.getInstance();
                                                                        if (this$0.f14055j) {
                                                                            e9.d dVar3 = this$0.f14056m;
                                                                            if (dVar3 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            newCalendar = dVar3.f12585f;
                                                                        }
                                                                        d0 d0VarB = this$0.b();
                                                                        if (d0VarB != null) {
                                                                            Intrinsics.e(newCalendar, "newCalendar");
                                                                            final u9.f fVar = new u9.f(new c(this$0, 0), 0);
                                                                            new DatePickerDialog(d0VarB, 3, new DatePickerDialog.OnDateSetListener() { // from class: u9.d
                                                                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                                                                public final void onDateSet(DatePicker datePicker, int i15, int i16, int i17) {
                                                                                    Calendar calendar = newCalendar;
                                                                                    Intrinsics.f(calendar, "$calendar");
                                                                                    Function1 func = fVar;
                                                                                    Intrinsics.f(func, "$func");
                                                                                    calendar.set(1, i15);
                                                                                    calendar.set(2, i16);
                                                                                    calendar.set(5, i17);
                                                                                    func.invoke(calendar);
                                                                                }
                                                                            }, newCalendar.get(1), newCalendar.get(2), newCalendar.get(5)).show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case QueueFuseable.SYNC /* 1 */:
                                                                        int i15 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        d0 d0VarB2 = this$0.b();
                                                                        if (d0VarB2 != null) {
                                                                            e9.d dVar4 = this$0.f14056m;
                                                                            if (dVar4 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            Calendar calendar = dVar4.f12585f;
                                                                            Intrinsics.e(calendar, "mHoroscope.birthDateTimeReal");
                                                                            final e eVar2 = new e(this$0);
                                                                            TimePickerDialog timePickerDialog = new TimePickerDialog(d0VarB2, new TimePickerDialog.OnTimeSetListener() { // from class: u9.e
                                                                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                                                                public final void onTimeSet(TimePicker timePicker, int i16, int i17) {
                                                                                    Function2 time = eVar2;
                                                                                    Intrinsics.f(time, "$time");
                                                                                    time.invoke(Integer.valueOf(i16), Integer.valueOf(i17));
                                                                                }
                                                                            }, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(d0VarB2));
                                                                            timePickerDialog.setTitle("Select Time");
                                                                            timePickerDialog.show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        int i16 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        try {
                                                                            m9.c cVar82 = new m9.c();
                                                                            cVar82.W = this$0;
                                                                            cVar82.k(this$0.getChildFragmentManager(), "HomeFragment");
                                                                            return;
                                                                        } catch (Exception e11) {
                                                                            e11.printStackTrace();
                                                                            return;
                                                                        }
                                                                    default:
                                                                        int i17 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        Intent intent = new Intent(this$0.requireContext(), (Class<?>) HoroscopeActivity.class);
                                                                        e9.d dVar5 = this$0.f14056m;
                                                                        if (dVar5 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("latLng", dVar5.f12592m);
                                                                        e9.d dVar6 = this$0.f14056m;
                                                                        if (dVar6 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("place", dVar6.f12586g);
                                                                        e9.d dVar7 = this$0.f14056m;
                                                                        if (dVar7 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("dateTime", dVar7.f12585f);
                                                                        Calendar calendar2 = this$0.M;
                                                                        if (calendar2 == null) {
                                                                            Intrinsics.n("calBirthDate");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("birthDateTime", calendar2);
                                                                        this$0.j(intent);
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        o5.c cVar9 = this.f14054f;
                                                        if (cVar9 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        final int i13 = 2;
                                                        ((EditText) cVar9.f15711e).setOnClickListener(new View.OnClickListener(this) { // from class: k9.b

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ f f14048e;

                                                            {
                                                                this.f14048e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                int i132 = i13;
                                                                f this$0 = this.f14048e;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i14 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        final Calendar newCalendar = Calendar.getInstance();
                                                                        if (this$0.f14055j) {
                                                                            e9.d dVar3 = this$0.f14056m;
                                                                            if (dVar3 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            newCalendar = dVar3.f12585f;
                                                                        }
                                                                        d0 d0VarB = this$0.b();
                                                                        if (d0VarB != null) {
                                                                            Intrinsics.e(newCalendar, "newCalendar");
                                                                            final u9.f fVar = new u9.f(new c(this$0, 0), 0);
                                                                            new DatePickerDialog(d0VarB, 3, new DatePickerDialog.OnDateSetListener() { // from class: u9.d
                                                                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                                                                public final void onDateSet(DatePicker datePicker, int i15, int i16, int i17) {
                                                                                    Calendar calendar = newCalendar;
                                                                                    Intrinsics.f(calendar, "$calendar");
                                                                                    Function1 func = fVar;
                                                                                    Intrinsics.f(func, "$func");
                                                                                    calendar.set(1, i15);
                                                                                    calendar.set(2, i16);
                                                                                    calendar.set(5, i17);
                                                                                    func.invoke(calendar);
                                                                                }
                                                                            }, newCalendar.get(1), newCalendar.get(2), newCalendar.get(5)).show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case QueueFuseable.SYNC /* 1 */:
                                                                        int i15 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        d0 d0VarB2 = this$0.b();
                                                                        if (d0VarB2 != null) {
                                                                            e9.d dVar4 = this$0.f14056m;
                                                                            if (dVar4 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            Calendar calendar = dVar4.f12585f;
                                                                            Intrinsics.e(calendar, "mHoroscope.birthDateTimeReal");
                                                                            final e eVar2 = new e(this$0);
                                                                            TimePickerDialog timePickerDialog = new TimePickerDialog(d0VarB2, new TimePickerDialog.OnTimeSetListener() { // from class: u9.e
                                                                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                                                                public final void onTimeSet(TimePicker timePicker, int i16, int i17) {
                                                                                    Function2 time = eVar2;
                                                                                    Intrinsics.f(time, "$time");
                                                                                    time.invoke(Integer.valueOf(i16), Integer.valueOf(i17));
                                                                                }
                                                                            }, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(d0VarB2));
                                                                            timePickerDialog.setTitle("Select Time");
                                                                            timePickerDialog.show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        int i16 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        try {
                                                                            m9.c cVar82 = new m9.c();
                                                                            cVar82.W = this$0;
                                                                            cVar82.k(this$0.getChildFragmentManager(), "HomeFragment");
                                                                            return;
                                                                        } catch (Exception e11) {
                                                                            e11.printStackTrace();
                                                                            return;
                                                                        }
                                                                    default:
                                                                        int i17 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        Intent intent = new Intent(this$0.requireContext(), (Class<?>) HoroscopeActivity.class);
                                                                        e9.d dVar5 = this$0.f14056m;
                                                                        if (dVar5 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("latLng", dVar5.f12592m);
                                                                        e9.d dVar6 = this$0.f14056m;
                                                                        if (dVar6 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("place", dVar6.f12586g);
                                                                        e9.d dVar7 = this$0.f14056m;
                                                                        if (dVar7 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("dateTime", dVar7.f12585f);
                                                                        Calendar calendar2 = this$0.M;
                                                                        if (calendar2 == null) {
                                                                            Intrinsics.n("calBirthDate");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("birthDateTime", calendar2);
                                                                        this$0.j(intent);
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        o5.c cVar10 = this.f14054f;
                                                        if (cVar10 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        final int i14 = 3;
                                                        ((Button) cVar10.f15714h).setOnClickListener(new View.OnClickListener(this) { // from class: k9.b

                                                            /* renamed from: e, reason: collision with root package name */
                                                            public final /* synthetic */ f f14048e;

                                                            {
                                                                this.f14048e = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                int i132 = i14;
                                                                f this$0 = this.f14048e;
                                                                switch (i132) {
                                                                    case 0:
                                                                        int i142 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        final Calendar newCalendar = Calendar.getInstance();
                                                                        if (this$0.f14055j) {
                                                                            e9.d dVar3 = this$0.f14056m;
                                                                            if (dVar3 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            newCalendar = dVar3.f12585f;
                                                                        }
                                                                        d0 d0VarB = this$0.b();
                                                                        if (d0VarB != null) {
                                                                            Intrinsics.e(newCalendar, "newCalendar");
                                                                            final u9.f fVar = new u9.f(new c(this$0, 0), 0);
                                                                            new DatePickerDialog(d0VarB, 3, new DatePickerDialog.OnDateSetListener() { // from class: u9.d
                                                                                @Override // android.app.DatePickerDialog.OnDateSetListener
                                                                                public final void onDateSet(DatePicker datePicker, int i15, int i16, int i17) {
                                                                                    Calendar calendar = newCalendar;
                                                                                    Intrinsics.f(calendar, "$calendar");
                                                                                    Function1 func = fVar;
                                                                                    Intrinsics.f(func, "$func");
                                                                                    calendar.set(1, i15);
                                                                                    calendar.set(2, i16);
                                                                                    calendar.set(5, i17);
                                                                                    func.invoke(calendar);
                                                                                }
                                                                            }, newCalendar.get(1), newCalendar.get(2), newCalendar.get(5)).show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case QueueFuseable.SYNC /* 1 */:
                                                                        int i15 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        d0 d0VarB2 = this$0.b();
                                                                        if (d0VarB2 != null) {
                                                                            e9.d dVar4 = this$0.f14056m;
                                                                            if (dVar4 == null) {
                                                                                Intrinsics.n("mHoroscope");
                                                                                throw null;
                                                                            }
                                                                            Calendar calendar = dVar4.f12585f;
                                                                            Intrinsics.e(calendar, "mHoroscope.birthDateTimeReal");
                                                                            final e eVar2 = new e(this$0);
                                                                            TimePickerDialog timePickerDialog = new TimePickerDialog(d0VarB2, new TimePickerDialog.OnTimeSetListener() { // from class: u9.e
                                                                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                                                                public final void onTimeSet(TimePicker timePicker, int i16, int i17) {
                                                                                    Function2 time = eVar2;
                                                                                    Intrinsics.f(time, "$time");
                                                                                    time.invoke(Integer.valueOf(i16), Integer.valueOf(i17));
                                                                                }
                                                                            }, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(d0VarB2));
                                                                            timePickerDialog.setTitle("Select Time");
                                                                            timePickerDialog.show();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        int i16 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        try {
                                                                            m9.c cVar82 = new m9.c();
                                                                            cVar82.W = this$0;
                                                                            cVar82.k(this$0.getChildFragmentManager(), "HomeFragment");
                                                                            return;
                                                                        } catch (Exception e11) {
                                                                            e11.printStackTrace();
                                                                            return;
                                                                        }
                                                                    default:
                                                                        int i17 = f.O;
                                                                        Intrinsics.f(this$0, "this$0");
                                                                        Intent intent = new Intent(this$0.requireContext(), (Class<?>) HoroscopeActivity.class);
                                                                        e9.d dVar5 = this$0.f14056m;
                                                                        if (dVar5 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("latLng", dVar5.f12592m);
                                                                        e9.d dVar6 = this$0.f14056m;
                                                                        if (dVar6 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("place", dVar6.f12586g);
                                                                        e9.d dVar7 = this$0.f14056m;
                                                                        if (dVar7 == null) {
                                                                            Intrinsics.n("mHoroscope");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("dateTime", dVar7.f12585f);
                                                                        Calendar calendar2 = this$0.M;
                                                                        if (calendar2 == null) {
                                                                            Intrinsics.n("calBirthDate");
                                                                            throw null;
                                                                        }
                                                                        intent.putExtra("birthDateTime", calendar2);
                                                                        this$0.j(intent);
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        n();
                                                        Calendar calendar = Calendar.getInstance();
                                                        calendar.set(13, 0);
                                                        calendar.set(14, 0);
                                                        o5.c cVar11 = this.f14054f;
                                                        if (cVar11 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        EditText editText6 = (EditText) cVar11.f15713g;
                                                        Context contextRequireContext2 = requireContext();
                                                        Intrinsics.e(contextRequireContext2, "requireContext()");
                                                        editText6.setText(k(contextRequireContext2, calendar));
                                                        Calendar calendar2 = Calendar.getInstance();
                                                        Intrinsics.e(calendar2, "getInstance()");
                                                        this.M = calendar2;
                                                        calendar2.set(13, 0);
                                                        Calendar calendar3 = this.M;
                                                        if (calendar3 == null) {
                                                            Intrinsics.n("calBirthDate");
                                                            throw null;
                                                        }
                                                        calendar3.set(14, 0);
                                                        Context contextRequireContext3 = requireContext();
                                                        Intrinsics.e(contextRequireContext3, "requireContext()");
                                                        if (n7.c.t(contextRequireContext3)) {
                                                            r9.e eVar2 = this.N;
                                                            if (eVar2 == null) {
                                                                Intrinsics.n("viewModel");
                                                                throw null;
                                                            }
                                                            eVar2.b();
                                                        }
                                                        o5.c cVar12 = this.f14054f;
                                                        if (cVar12 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) cVar12.f15707a;
                                                        Intrinsics.e(constraintLayout2, "binding.root");
                                                        return constraintLayout2;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}