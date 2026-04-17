package n9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.f;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import com.isprid.kendare.ui.info.AboutAppActivity;
import com.isprid.kendare.ui.info.PrivacyPolicy;
import com.isprid.kendare.ui.premium.PremiumActivity;
import e9.d;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.e;
import t5.j4;
import y4.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln9/b;", "Lj9/c;", "La9/a;", "Le9/d;", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c implements a9.a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15478j = 0;

    /* renamed from: f, reason: collision with root package name */
    public b9.c f15479f;

    @Override // a9.a
    public final void a(Object obj) {
        d horoscope = (d) obj;
        Intrinsics.f(horoscope, "horoscope");
        Calendar calendar = Calendar.getInstance();
        boolean z7 = true;
        boolean z10 = false;
        if (j4.E(horoscope.f12585f)) {
            calendar = j4.y(horoscope.f12585f);
        } else if (j4.D(horoscope.f12585f)) {
            calendar = j4.x(horoscope.f12585f);
            z7 = false;
            z10 = true;
        } else {
            z7 = false;
        }
        Intent intent = new Intent(requireContext(), (Class<?>) HoroscopeActivity.class);
        intent.putExtra("latLng", horoscope.f12592m);
        intent.putExtra("place", horoscope.f12586g);
        intent.putExtra("dateTime", horoscope.f12585f);
        if (z7 || z10) {
            intent.putExtra("birthDateTime", calendar);
        } else {
            intent.putExtra("birthDateTime", horoscope.f12585f);
        }
        startActivity(intent);
    }

    @Override // j9.c
    public final void h() {
        Intrinsics.e(requireContext(), "requireContext()");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.f(inflater, "inflater");
        final int i10 = 0;
        View viewInflate = inflater.inflate(2131492927, viewGroup, false);
        int i11 = 2131296436;
        ConstraintLayout constraintLayout = (ConstraintLayout) g5.a.l(viewInflate, 2131296436);
        if (constraintLayout != null) {
            i11 = 2131296437;
            if (((ConstraintLayout) g5.a.l(viewInflate, 2131296437)) != null) {
                i11 = 2131296438;
                if (((ConstraintLayout) g5.a.l(viewInflate, 2131296438)) != null) {
                    i11 = 2131296439;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) g5.a.l(viewInflate, 2131296439);
                    if (constraintLayout2 != null) {
                        i11 = 2131296440;
                        if (((ConstraintLayout) g5.a.l(viewInflate, 2131296440)) != null) {
                            i11 = 2131296441;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) g5.a.l(viewInflate, 2131296441);
                            if (constraintLayout3 != null) {
                                i11 = 2131296442;
                                if (((ConstraintLayout) g5.a.l(viewInflate, 2131296442)) != null) {
                                    i11 = 2131296443;
                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) g5.a.l(viewInflate, 2131296443);
                                    if (constraintLayout4 != null) {
                                        i11 = 2131296444;
                                        if (((ConstraintLayout) g5.a.l(viewInflate, 2131296444)) != null) {
                                            i11 = 2131296445;
                                            if (((ConstraintLayout) g5.a.l(viewInflate, 2131296445)) != null) {
                                                i11 = 2131296446;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) g5.a.l(viewInflate, 2131296446);
                                                if (constraintLayout5 != null) {
                                                    i11 = 2131296447;
                                                    if (((ConstraintLayout) g5.a.l(viewInflate, 2131296447)) != null) {
                                                        i11 = 2131296448;
                                                        if (((ConstraintLayout) g5.a.l(viewInflate, 2131296448)) != null) {
                                                            i11 = 2131296449;
                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) g5.a.l(viewInflate, 2131296449);
                                                            if (constraintLayout6 != null) {
                                                                i11 = 2131296450;
                                                                if (((ConstraintLayout) g5.a.l(viewInflate, 2131296450)) != null) {
                                                                    i11 = 2131296584;
                                                                    if (((ImageView) g5.a.l(viewInflate, 2131296584)) != null) {
                                                                        i11 = 2131296585;
                                                                        if (((ImageView) g5.a.l(viewInflate, 2131296585)) != null) {
                                                                            i11 = 2131296587;
                                                                            if (((ImageView) g5.a.l(viewInflate, 2131296587)) != null) {
                                                                                i11 = 2131296588;
                                                                                if (((ImageView) g5.a.l(viewInflate, 2131296588)) != null) {
                                                                                    i11 = 2131296589;
                                                                                    if (((ImageView) g5.a.l(viewInflate, 2131296589)) != null) {
                                                                                        i11 = 2131296590;
                                                                                        if (((ImageView) g5.a.l(viewInflate, 2131296590)) != null) {
                                                                                            i11 = 2131296591;
                                                                                            if (((ImageView) g5.a.l(viewInflate, 2131296591)) != null) {
                                                                                                i11 = 2131296592;
                                                                                                if (((ImageView) g5.a.l(viewInflate, 2131296592)) != null) {
                                                                                                    i11 = 2131296593;
                                                                                                    if (((ImageView) g5.a.l(viewInflate, 2131296593)) != null) {
                                                                                                        i11 = 2131296594;
                                                                                                        if (((ImageView) g5.a.l(viewInflate, 2131296594)) != null) {
                                                                                                            i11 = 2131296595;
                                                                                                            if (((ImageView) g5.a.l(viewInflate, 2131296595)) != null) {
                                                                                                                i11 = 2131296926;
                                                                                                                if (((TextView) g5.a.l(viewInflate, 2131296926)) != null) {
                                                                                                                    i11 = 2131296935;
                                                                                                                    if (((TextView) g5.a.l(viewInflate, 2131296935)) != null) {
                                                                                                                        i11 = 2131296936;
                                                                                                                        if (((TextView) g5.a.l(viewInflate, 2131296936)) != null) {
                                                                                                                            i11 = 2131296940;
                                                                                                                            if (((TextView) g5.a.l(viewInflate, 2131296940)) != null) {
                                                                                                                                i11 = 2131296941;
                                                                                                                                if (((TextView) g5.a.l(viewInflate, 2131296941)) != null) {
                                                                                                                                    i11 = 2131296942;
                                                                                                                                    if (((TextView) g5.a.l(viewInflate, 2131296942)) != null) {
                                                                                                                                        i11 = 2131296943;
                                                                                                                                        if (((TextView) g5.a.l(viewInflate, 2131296943)) != null) {
                                                                                                                                            this.f15479f = new b9.c((ConstraintLayout) viewInflate, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6);
                                                                                                                                            constraintLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i12 = i10;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i12) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i13 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i14 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i15 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i16 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar = this.f15479f;
                                                                                                                                            if (cVar == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i12 = 1;
                                                                                                                                            cVar.f2000d.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i12;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i13 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i14 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i15 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i16 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar2 = this.f15479f;
                                                                                                                                            if (cVar2 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i13 = 2;
                                                                                                                                            cVar2.f1998b.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i13;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i132 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i14 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i15 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i16 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar3 = this.f15479f;
                                                                                                                                            if (cVar3 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i14 = 3;
                                                                                                                                            cVar3.f2001e.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i14;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i132 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i142 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i15 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i16 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar4 = this.f15479f;
                                                                                                                                            if (cVar4 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i15 = 4;
                                                                                                                                            cVar4.f1999c.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i15;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i132 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i142 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i152 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i16 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar5 = this.f15479f;
                                                                                                                                            if (cVar5 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i16 = 5;
                                                                                                                                            cVar5.f2002f.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i16;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i132 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i142 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i152 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i162 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i17 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar6 = this.f15479f;
                                                                                                                                            if (cVar6 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            final int i17 = 6;
                                                                                                                                            cVar6.f2000d.setOnClickListener(new View.OnClickListener(this) { // from class: n9.a

                                                                                                                                                /* renamed from: e, reason: collision with root package name */
                                                                                                                                                public final /* synthetic */ b f15477e;

                                                                                                                                                {
                                                                                                                                                    this.f15477e = this;
                                                                                                                                                }

                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                    int i122 = i17;
                                                                                                                                                    b this$0 = this.f15477e;
                                                                                                                                                    switch (i122) {
                                                                                                                                                        case 0:
                                                                                                                                                            int i132 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            e eVar = new e();
                                                                                                                                                            eVar.T = this$0;
                                                                                                                                                            eVar.k(this$0.getChildFragmentManager(), "saveList");
                                                                                                                                                            break;
                                                                                                                                                        case QueueFuseable.SYNC /* 1 */:
                                                                                                                                                            int i142 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "spridsolutions@gmail.com", null));
                                                                                                                                                                intent.putExtra("android.intent.extra.SUBJECT", contextRequireContext.getString(2131886136) + " " + q6.b.d(contextRequireContext));
                                                                                                                                                                contextRequireContext.startActivity(Intent.createChooser(intent, "Send email..."));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                                e10.printStackTrace();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case 2:
                                                                                                                                                            int i152 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) AboutAppActivity.class));
                                                                                                                                                            break;
                                                                                                                                                        case 3:
                                                                                                                                                            int i162 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PrivacyPolicy.class));
                                                                                                                                                            break;
                                                                                                                                                        case 4:
                                                                                                                                                            int i172 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext2 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext2, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                contextRequireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(contextRequireContext2.getResources().getString(2131886860))));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused) {
                                                                                                                                                                Toast.makeText(contextRequireContext2, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        case g.INVALID_ACCOUNT /* 5 */:
                                                                                                                                                            int i18 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            Context contextRequireContext3 = this$0.requireContext();
                                                                                                                                                            Intrinsics.e(contextRequireContext3, "requireContext()");
                                                                                                                                                            try {
                                                                                                                                                                Intent intent2 = new Intent("android.intent.action.SEND");
                                                                                                                                                                intent2.setType("text/plain");
                                                                                                                                                                intent2.putExtra("android.intent.extra.SUBJECT", contextRequireContext3.getString(2131886136));
                                                                                                                                                                intent2.putExtra("android.intent.extra.TEXT", contextRequireContext3.getResources().getString(2131886552) + "\n\nhttps://play.google.com/store/apps/details?id=" + contextRequireContext3.getPackageName());
                                                                                                                                                                contextRequireContext3.startActivity(Intent.createChooser(intent2, "Share Using"));
                                                                                                                                                                break;
                                                                                                                                                            } catch (Exception unused2) {
                                                                                                                                                                Toast.makeText(contextRequireContext3, "Failed when create share data", 0).show();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        default:
                                                                                                                                                            int i19 = b.f15478j;
                                                                                                                                                            Intrinsics.f(this$0, "this$0");
                                                                                                                                                            this$0.j(new Intent(this$0.requireContext(), (Class<?>) PremiumActivity.class));
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            b9.c cVar7 = this.f15479f;
                                                                                                                                            if (cVar7 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            ConstraintLayout constraintLayout7 = cVar7.f2000d;
                                                                                                                                            Intrinsics.e(constraintLayout7, "binding.constraintPremiumContainer");
                                                                                                                                            f.l(constraintLayout7);
                                                                                                                                            b9.c cVar8 = this.f15479f;
                                                                                                                                            if (cVar8 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            ConstraintLayout constraintLayout8 = cVar8.f1997a;
                                                                                                                                            Intrinsics.e(constraintLayout8, "binding.root");
                                                                                                                                            return constraintLayout8;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}