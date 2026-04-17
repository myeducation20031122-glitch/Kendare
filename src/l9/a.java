package l9;

import a0.h;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.q;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.yl0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import t5.j4;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll9/a;", "Landroidx/fragment/app/q;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends q {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f14688a0 = 0;
    public e9.c T;
    public e9.d U;
    public e9.a V;
    public int W;
    public boolean X;
    public StringBuilder Y;
    public Typeface Z;

    @Override // androidx.fragment.app.q
    public final Dialog i() throws Resources.NotFoundException {
        e9.c cVarP;
        String str;
        boolean z7;
        String str2;
        String strG;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList;
        String strG2;
        String str7;
        String str8;
        String strG3;
        String string;
        yl0 yl0Var = new yl0(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(2131492902, (ViewGroup) null);
        yl0Var.n(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(2131296955);
        TextView textView2 = (TextView) viewInflate.findViewById(2131296603);
        Typeface typefaceA = s9.d.a(requireContext());
        Intrinsics.e(typefaceA, "getTypeFace(requireConte…ontUtil.TypeFace.SINHALA)");
        this.Z = typefaceA;
        if (this.X) {
            e9.d dVar = this.U;
            if (dVar == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            e9.a aVarM = dVar.m(this.W);
            Intrinsics.e(aVarM, "mHoroscope.getHouseTh(mHouseCode)");
            this.V = aVarM;
            e9.d dVar2 = this.U;
            if (dVar2 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            cVarP = dVar2.e(this.W);
            str = "mHoroscope.getAdipathi(mHouseCode)";
        } else {
            e9.d dVar3 = this.U;
            if (dVar3 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            e9.a aVarT = dVar3.t(this.W);
            Intrinsics.e(aVarT, "mHoroscope.getNawanshakaHouseTh(mHouseCode)");
            this.V = aVarT;
            e9.d dVar4 = this.U;
            if (dVar4 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            cVarP = dVar4.p(this.W);
            str = "mHoroscope.getNawanshakaAdipathi(mHouseCode)";
        }
        Intrinsics.e(cVarP, str);
        this.T = cVarP;
        String strN = n("bawa");
        int i10 = this.W;
        StringBuilder sb = new StringBuilder();
        sb.append(strN);
        String str9 = " ";
        sb.append(" ");
        sb.append(i10);
        textView.setText(sb.toString());
        Typeface typeface = this.Z;
        if (typeface == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView.setTypeface(typeface);
        Typeface typeface2 = this.Z;
        if (typeface2 == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        textView2.setTypeface(typeface2);
        j4.O(textView, 2131100487);
        j4.O(textView2, 2131100493);
        StringBuilder sb2 = new StringBuilder();
        this.Y = sb2;
        sb2.append(n("rashiya"));
        StringBuilder sb3 = this.Y;
        if (sb3 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String str10 = " : ";
        sb3.append(" : ");
        StringBuilder sb4 = this.Y;
        if (sb4 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.a aVar = this.V;
        if (aVar == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        String strB = aVar.f12565d.b();
        Intrinsics.e(strB, "mHouse.rashi().nameCode");
        sb4.append(m(strB));
        StringBuilder sb5 = this.Y;
        if (sb5 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb5.append(" (");
        StringBuilder sb6 = this.Y;
        if (sb6 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.a aVar2 = this.V;
        if (aVar2 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        c31 c31Var = aVar2.f12565d;
        sb6.append(n(c31Var.d() ? "chara" : c31Var.f() ? "thira" : "ubhaya"));
        StringBuilder sb7 = this.Y;
        if (sb7 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String str11 = ", ";
        sb7.append(", ");
        StringBuilder sb8 = this.Y;
        if (sb8 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.a aVar3 = this.V;
        if (aVar3 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        c31 c31Var2 = aVar3.f12565d;
        sb8.append(n(c31Var2.c() ? "apo" : c31Var2.e() ? "thejo" : c31Var2.h() ? "wayo" : "pathawi"));
        StringBuilder sb9 = this.Y;
        if (sb9 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb9.append(")");
        StringBuilder sb10 = this.Y;
        if (sb10 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb10.append("\n");
        StringBuilder sb11 = this.Y;
        if (sb11 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb11.append(n("sthana"));
        StringBuilder sb12 = this.Y;
        if (sb12 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb12.append(" : ");
        int i11 = 0;
        if (this.W == 1) {
            StringBuilder sb13 = this.Y;
            if (sb13 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb13.append(n("lagnaya"));
            z7 = true;
        } else {
            z7 = false;
        }
        e9.a aVar4 = this.V;
        if (aVar4 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        if (aVar4.k()) {
            if (z7) {
                StringBuilder sb14 = this.Y;
                if (sb14 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb14.append(", ");
            }
            StringBuilder sb15 = this.Y;
            if (sb15 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb15.append(n("kendara"));
            z7 = true;
        }
        e9.a aVar5 = this.V;
        if (aVar5 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i12 = aVar5.f12564c;
        if (i12 == 2 || i12 == 5 || i12 == 8 || i12 == 11) {
            if (z7) {
                StringBuilder sb16 = this.Y;
                if (sb16 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb16.append(", ");
            }
            StringBuilder sb17 = this.Y;
            if (sb17 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb17.append(n("panapara"));
            z7 = true;
        }
        e9.a aVar6 = this.V;
        if (aVar6 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i13 = aVar6.f12564c;
        if (i13 == 3 || i13 == 6 || i13 == 9 || i13 == 12) {
            if (z7) {
                StringBuilder sb18 = this.Y;
                if (sb18 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb18.append(", ");
            }
            StringBuilder sb19 = this.Y;
            if (sb19 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb19.append(n("apokalima"));
            z7 = true;
        }
        e9.a aVar7 = this.V;
        if (aVar7 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i14 = aVar7.f12564c;
        if (i14 == 5 || i14 == 9) {
            if (z7) {
                StringBuilder sb20 = this.Y;
                if (sb20 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb20.append(", ");
            }
            StringBuilder sb21 = this.Y;
            if (sb21 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb21.append(n("thrikona"));
            z7 = true;
        }
        e9.a aVar8 = this.V;
        if (aVar8 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i15 = aVar8.f12564c;
        if (i15 == 4 || i15 == 8) {
            if (z7) {
                StringBuilder sb22 = this.Y;
                if (sb22 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb22.append(", ");
            }
            StringBuilder sb23 = this.Y;
            if (sb23 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb23.append(n("chathurasra"));
            z7 = true;
        }
        e9.a aVar9 = this.V;
        if (aVar9 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i16 = aVar9.f12564c;
        if (i16 == 2 || i16 == 7) {
            if (z7) {
                StringBuilder sb24 = this.Y;
                if (sb24 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb24.append(", ");
            }
            StringBuilder sb25 = this.Y;
            if (sb25 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb25.append(n("maraka"));
            z7 = true;
        }
        e9.a aVar10 = this.V;
        if (aVar10 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i17 = aVar10.f12564c;
        if (i17 == 3 || i17 == 8) {
            if (z7) {
                StringBuilder sb26 = this.Y;
                if (sb26 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb26.append(", ");
            }
            StringBuilder sb27 = this.Y;
            if (sb27 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb27.append(n("ayus"));
            z7 = true;
        }
        e9.a aVar11 = this.V;
        if (aVar11 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i18 = aVar11.f12564c;
        if (i18 == 6 || i18 == 8 || i18 == 12) {
            if (z7) {
                StringBuilder sb28 = this.Y;
                if (sb28 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb28.append(", ");
            }
            StringBuilder sb29 = this.Y;
            if (sb29 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb29.append(n("dushta"));
            z7 = true;
        }
        e9.a aVar12 = this.V;
        if (aVar12 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        int i19 = aVar12.f12564c;
        if (i19 == 3 || i19 == 6 || i19 == 10 || i19 == 11) {
            if (z7) {
                StringBuilder sb30 = this.Y;
                if (sb30 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb30.append(", ");
            }
            StringBuilder sb31 = this.Y;
            if (sb31 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb31.append(n("upachaya"));
        }
        if (this.W == 1) {
            e9.d dVar5 = this.U;
            if (dVar5 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            p(dVar5.f12584e);
            e9.d dVar6 = this.U;
            if (dVar6 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            e9.e eVar = dVar6.f12591l;
            Intrinsics.e(eVar, "mHoroscope.lagnaNekatha");
            o(eVar);
        }
        StringBuilder sb32 = this.Y;
        if (sb32 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb32.append("\n");
        StringBuilder sb33 = this.Y;
        if (sb33 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb33.append("\n");
        StringBuilder sb34 = this.Y;
        if (sb34 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb34.append("• ");
        StringBuilder sb35 = this.Y;
        if (sb35 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String strN2 = n("bawadipathi");
        String str12 = "<b>";
        StringBuilder sb36 = new StringBuilder("<b>");
        sb36.append(strN2);
        String str13 = "</b>";
        sb36.append("</b>");
        sb35.append(sb36.toString());
        StringBuilder sb37 = this.Y;
        if (sb37 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb37.append(" : ");
        StringBuilder sb38 = this.Y;
        if (sb38 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar = this.T;
        if (cVar == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        String strG4 = cVar.g();
        Intrinsics.e(strG4, "mAdipathi.nameCode");
        sb38.append("<b>" + m(strG4) + "</b>");
        StringBuilder sb39 = this.Y;
        if (sb39 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb39.append("\n");
        StringBuilder sb40 = this.Y;
        if (sb40 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb40.append(n("sitina_bawaya"));
        StringBuilder sb41 = this.Y;
        if (sb41 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb41.append(" : ");
        StringBuilder sb42 = this.Y;
        if (sb42 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar2 = this.T;
        if (cVar2 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        sb42.append(cVar2.f12574c.f12564c);
        StringBuilder sb43 = this.Y;
        if (sb43 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb43.append(" - ");
        StringBuilder sb44 = this.Y;
        if (sb44 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar3 = this.T;
        if (cVar3 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        sb44.append(n(cVar3.c()));
        StringBuilder sb45 = this.Y;
        if (sb45 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb45.append("\n");
        StringBuilder sb46 = this.Y;
        if (sb46 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb46.append(n("sitina_rashiya"));
        StringBuilder sb47 = this.Y;
        if (sb47 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb47.append(" : ");
        StringBuilder sb48 = this.Y;
        if (sb48 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar4 = this.T;
        if (cVar4 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        String strB2 = cVar4.f12574c.f12565d.b();
        Intrinsics.e(strB2, "mAdipathi.house.rashi().nameCode");
        sb48.append(m(strB2));
        StringBuilder sb49 = this.Y;
        if (sb49 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb49.append(" (");
        StringBuilder sb50 = this.Y;
        if (sb50 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar5 = this.T;
        if (cVar5 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        c31 c31Var3 = cVar5.f12574c.f12565d;
        sb50.append(n(c31Var3.d() ? "chara" : c31Var3.f() ? "thira" : "ubhaya"));
        StringBuilder sb51 = this.Y;
        if (sb51 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb51.append(", ");
        StringBuilder sb52 = this.Y;
        if (sb52 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar6 = this.T;
        if (cVar6 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        c31 c31Var4 = cVar6.f12574c.f12565d;
        sb52.append(n(c31Var4.c() ? "apo" : c31Var4.e() ? "thejo" : c31Var4.h() ? "wayo" : "pathawi"));
        StringBuilder sb53 = this.Y;
        if (sb53 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb53.append(")");
        StringBuilder sb54 = this.Y;
        if (sb54 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb54.append(" - ");
        StringBuilder sb55 = this.Y;
        if (sb55 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar7 = this.T;
        if (cVar7 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        String strI = cVar7.i();
        Intrinsics.e(strI, "mAdipathi.uchchaNicha");
        sb55.append(n(strI));
        StringBuilder sb56 = this.Y;
        if (sb56 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        e9.c cVar8 = this.T;
        if (cVar8 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        sb56.append(l(cVar8.f12573b));
        StringBuilder sb57 = this.Y;
        if (sb57 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb57.append("\n");
        StringBuilder sb58 = this.Y;
        if (sb58 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb58.append(n("sitina_anekuth_graha"));
        StringBuilder sb59 = this.Y;
        if (sb59 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb59.append(" : ");
        e9.c cVar9 = this.T;
        if (cVar9 == null) {
            Intrinsics.n("mAdipathi");
            throw null;
        }
        e9.a aVar13 = cVar9.f12574c;
        e9.d dVar7 = this.U;
        if (dVar7 == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        boolean z10 = this.X;
        int[] iArr = {cVar9.f12573b};
        Iterator it = aVar13.f12562a.iterator();
        String str14 = "";
        String strV = "";
        while (true) {
            str2 = str14;
            if (!it.hasNext()) {
                break;
            }
            Iterator it2 = it;
            e9.c cVar10 = (e9.c) it.next();
            String str15 = str11;
            String str16 = str10;
            if (cVar10.f12573b != iArr[0]) {
                String strE = cVar10.e(dVar7, z10);
                strV = TextUtils.isEmpty(strV) ? h.v("\n     ", strE) : h.G(strV, ",\n     ", strE);
            }
            str11 = str15;
            str14 = str2;
            it = it2;
            str10 = str16;
        }
        String str17 = str10;
        String str18 = str11;
        String str19 = strV;
        if (TextUtils.isEmpty(str19)) {
            StringBuilder sb60 = this.Y;
            if (sb60 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb60.append(n("netha"));
        } else {
            StringBuilder sb61 = this.Y;
            if (sb61 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb61.append(str19);
        }
        if (this.X) {
            e9.d dVar8 = this.U;
            if (dVar8 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            Iterator it3 = dVar8.f12589j.iterator();
            strG = null;
            while (it3.hasNext()) {
                e9.a aVar14 = (e9.a) it3.next();
                if (aVar14.f12564c != this.W) {
                    Iterator it4 = aVar14.f12562a.iterator();
                    while (it4.hasNext()) {
                        e9.c cVar11 = (e9.c) it4.next();
                        e9.d dVar9 = this.U;
                        if (dVar9 == null) {
                            Intrinsics.n("mHoroscope");
                            throw null;
                        }
                        Iterator it5 = it3;
                        Iterator it6 = it4;
                        if (dVar9.u(cVar11.f12573b, this.W)) {
                            int i20 = cVar11.f12574c.f12564c;
                            if (i20 < 10) {
                                string = r.d(" ", i20);
                            } else {
                                StringBuilder sb62 = new StringBuilder();
                                sb62.append(i20);
                                string = sb62.toString();
                            }
                            e9.d dVar10 = this.U;
                            if (dVar10 == null) {
                                Intrinsics.n("mHoroscope");
                                throw null;
                            }
                            String strG5 = h.G(string, " - ", cVar11.e(dVar10, this.X));
                            if (strG == null || (strG = h.G(strG, "\n", strG5)) == null) {
                                strG = strG5;
                            }
                        }
                        it3 = it5;
                        it4 = it6;
                    }
                }
            }
        } else {
            e9.d dVar11 = this.U;
            if (dVar11 == null) {
                Intrinsics.n("mHoroscope");
                throw null;
            }
            Iterator it7 = dVar11.f12594o.iterator();
            strG = null;
            while (it7.hasNext()) {
                e9.a aVar15 = (e9.a) it7.next();
                if (aVar15.f12564c != this.W) {
                    Iterator it8 = aVar15.f12562a.iterator();
                    while (it8.hasNext()) {
                        e9.c cVar12 = (e9.c) it8.next();
                        e9.d dVar12 = this.U;
                        if (dVar12 == null) {
                            Intrinsics.n("mHoroscope");
                            throw null;
                        }
                        Iterator it9 = it7;
                        int i21 = cVar12.f12573b;
                        Iterator it10 = it8;
                        int i22 = this.W;
                        e9.c cVarS = dVar12.s(i21);
                        String str20 = str9;
                        if (e9.d.J(dVar12.t(cVarS.f12574c.f12564c), dVar12.t(i22), cVarS.d())) {
                            if (strG == null) {
                                e9.d dVar13 = this.U;
                                if (dVar13 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                strG = cVar12.e(dVar13, this.X);
                            } else {
                                e9.d dVar14 = this.U;
                                if (dVar14 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                strG = h.G(strG, "\n", cVar12.e(dVar14, this.X));
                            }
                        }
                        it7 = it9;
                        it8 = it10;
                        str9 = str20;
                    }
                }
            }
        }
        String str21 = str9;
        StringBuilder sb63 = this.Y;
        if (sb63 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb63.append("\n");
        StringBuilder sb64 = this.Y;
        if (sb64 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb64.append("\n");
        StringBuilder sb65 = this.Y;
        if (sb65 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb65.append("• ");
        StringBuilder sb66 = this.Y;
        if (sb66 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb66.append("<b>" + n("graha_drushti") + "</b>");
        StringBuilder sb67 = this.Y;
        if (sb67 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb67.append("\n");
        StringBuilder sb68 = this.Y;
        if (strG != null) {
            if (sb68 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb68.append(strG);
        } else {
            if (sb68 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb68.append(n("netha"));
        }
        StringBuilder sb69 = this.Y;
        if (sb69 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String str22 = "\n\n• ";
        sb69.append("\n\n• ");
        StringBuilder sb70 = this.Y;
        if (sb70 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb70.append("<b>" + n("graha") + "</b>");
        e9.a aVar16 = this.V;
        if (aVar16 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        if (aVar16.f12562a.isEmpty()) {
            StringBuilder sb71 = this.Y;
            if (sb71 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb71.append("\n");
            StringBuilder sb72 = this.Y;
            if (sb72 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb72.append(n("netha"));
        }
        e9.a aVar17 = this.V;
        if (aVar17 == null) {
            Intrinsics.n("mHouse");
            throw null;
        }
        Iterator it11 = aVar17.f12562a.iterator();
        while (it11.hasNext()) {
            int i23 = i11 + 1;
            e9.c cVar13 = (e9.c) it11.next();
            StringBuilder sb73 = this.Y;
            if (i11 == 0) {
                if (sb73 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb73.append("\n");
            } else {
                if (sb73 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb73.append("\n\n");
            }
            StringBuilder sb74 = this.Y;
            if (sb74 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb74.append("- ");
            StringBuilder sb75 = this.Y;
            if (sb75 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            String strG6 = cVar13.g();
            Iterator it12 = it11;
            Intrinsics.e(strG6, "graha.nameCode");
            sb75.append(m(strG6));
            StringBuilder sb76 = this.Y;
            if (sb76 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb76.append("\n");
            StringBuilder sb77 = this.Y;
            if (sb77 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb77.append(n("rashiyata"));
            StringBuilder sb78 = this.Y;
            if (sb78 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            String str23 = str17;
            sb78.append(str23);
            StringBuilder sb79 = this.Y;
            if (sb79 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            String strI2 = cVar13.i();
            Intrinsics.e(strI2, "graha.uchchaNicha");
            sb79.append(n(strI2));
            StringBuilder sb80 = this.Y;
            if (sb80 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb80.append(l(cVar13.f12573b));
            StringBuilder sb81 = this.Y;
            if (sb81 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb81.append("\n");
            StringBuilder sb82 = this.Y;
            if (sb82 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb82.append(n("bawayata"));
            StringBuilder sb83 = this.Y;
            if (sb83 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb83.append(str23);
            StringBuilder sb84 = this.Y;
            if (sb84 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb84.append(n(cVar13.c()));
            if (cVar13.l()) {
                StringBuilder sb85 = this.Y;
                if (sb85 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                str3 = str18;
                sb85.append(str3);
                StringBuilder sb86 = this.Y;
                if (sb86 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb86.append(n("digbala"));
            } else {
                str3 = str18;
            }
            String str24 = str13;
            String str25 = str12;
            p(cVar13.f12578g - (((int) (r14 / 30.0d)) * 30.0d));
            e9.e eVar2 = cVar13.f12575d;
            Intrinsics.e(eVar2, "graha.nekatha");
            o(eVar2);
            int i24 = cVar13.f12573b;
            if (i24 == 10 || i24 == 11) {
                str4 = str22;
                str5 = str3;
                str6 = str21;
            } else {
                if (this.X) {
                    e9.d dVar15 = this.U;
                    if (dVar15 == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    arrayList = new ArrayList();
                    Iterator it13 = dVar15.f12589j.iterator();
                    while (it13.hasNext()) {
                        e9.a aVar18 = (e9.a) it13.next();
                        Iterator it14 = it13;
                        if (((e9.c) aVar18.f12565d.f3243b).f12573b == i24) {
                            arrayList.add(aVar18);
                        }
                        it13 = it14;
                    }
                } else {
                    e9.d dVar16 = this.U;
                    if (dVar16 == null) {
                        Intrinsics.n("mHoroscope");
                        throw null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it15 = dVar16.f12594o.iterator();
                    while (it15.hasNext()) {
                        e9.a aVar19 = (e9.a) it15.next();
                        Iterator it16 = it15;
                        if (((e9.c) aVar19.f12565d.f3243b).f12573b == i24) {
                            arrayList2.add(aVar19);
                        }
                        it15 = it16;
                    }
                    arrayList = arrayList2;
                }
                Iterator it17 = arrayList.iterator();
                String str26 = str2;
                String string2 = str26;
                while (it17.hasNext()) {
                    Iterator it18 = it17;
                    e9.a aVar20 = (e9.a) it17.next();
                    int iIndexOf = arrayList.indexOf(aVar20);
                    ArrayList arrayList3 = arrayList;
                    String strB3 = aVar20.f12565d.b();
                    String str27 = str22;
                    Intrinsics.e(strB3, "house.rashi().nameCode");
                    String strM = m(strB3);
                    String strValueOf = String.valueOf(aVar20.f12564c);
                    if (iIndexOf == 0) {
                        strG2 = h.v("\n     ", strValueOf);
                    } else {
                        strM = h.G(str26, str3, strM);
                        strG2 = h.G(string2, " \n     ", strValueOf);
                    }
                    str26 = strM;
                    Intrinsics.e(aVar20.f12562a, "house.grahaList");
                    if (!r2.isEmpty()) {
                        Iterator it19 = aVar20.f12562a.iterator();
                        String str28 = str2;
                        while (it19.hasNext()) {
                            e9.c cVar14 = (e9.c) it19.next();
                            Iterator it20 = it19;
                            String str29 = str3;
                            if (cVar14.f12573b != cVar13.f12573b) {
                                if (TextUtils.isEmpty(str28)) {
                                    e9.d dVar17 = this.U;
                                    if (dVar17 == null) {
                                        Intrinsics.n("mHoroscope");
                                        throw null;
                                    }
                                    strG3 = cVar14.e(dVar17, this.X);
                                    Intrinsics.e(strG3, "{\n                      …                        }");
                                } else {
                                    e9.d dVar18 = this.U;
                                    if (dVar18 == null) {
                                        Intrinsics.n("mHoroscope");
                                        throw null;
                                    }
                                    strG3 = h.G(str28, "\n           ", cVar14.e(dVar18, this.X));
                                }
                                str28 = strG3;
                            }
                            it19 = it20;
                            str3 = str29;
                        }
                        str7 = str3;
                        string2 = h.G(strG2, " - ", str28);
                        str8 = str21;
                    } else {
                        str7 = str3;
                        String strN3 = n("graha");
                        String strN4 = n("netha");
                        StringBuilder sb87 = new StringBuilder();
                        sb87.append(strG2);
                        sb87.append(" - ");
                        sb87.append(strN3);
                        str8 = str21;
                        sb87.append(str8);
                        sb87.append(strN4);
                        string2 = sb87.toString();
                    }
                    str21 = str8;
                    it17 = it18;
                    arrayList = arrayList3;
                    str22 = str27;
                    str3 = str7;
                }
                str4 = str22;
                str5 = str3;
                str6 = str21;
                StringBuilder sb88 = this.Y;
                if (sb88 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb88.append("\n");
                StringBuilder sb89 = this.Y;
                if (sb89 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb89.append(n("bawadipathi_wana_bawa"));
                StringBuilder sb90 = this.Y;
                if (sb90 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb90.append(str23);
                StringBuilder sb91 = this.Y;
                if (sb91 == null) {
                    Intrinsics.n("mSb");
                    throw null;
                }
                sb91.append(string2);
            }
            str21 = str6;
            it11 = it12;
            str12 = str25;
            i11 = i23;
            str13 = str24;
            str22 = str4;
            str18 = str5;
            str17 = str23;
        }
        String str30 = str12;
        String str31 = str22;
        String str32 = str17;
        String str33 = str13;
        StringBuilder sb92 = this.Y;
        if (sb92 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb92.append(str31);
        StringBuilder sb93 = this.Y;
        if (sb93 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb93.append(str30 + n("bawa_sthanaya") + str33);
        StringBuilder sb94 = this.Y;
        if (sb94 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb94.append("\n");
        StringBuilder sb95 = this.Y;
        if (sb95 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb95.append(n("sthanaya"));
        StringBuilder sb96 = this.Y;
        if (sb96 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb96.append(str32);
        StringBuilder sb97 = this.Y;
        if (sb97 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb97.append(n("bawa_sthanaya" + this.W));
        StringBuilder sb98 = this.Y;
        if (sb98 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb98.append("\n");
        StringBuilder sb99 = this.Y;
        if (sb99 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb99.append(n("sharira_kotasa"));
        StringBuilder sb100 = this.Y;
        if (sb100 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb100.append(str32);
        StringBuilder sb101 = this.Y;
        if (sb101 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb101.append(n("bawa_shariraya" + this.W));
        StringBuilder sb102 = this.Y;
        if (sb102 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb102.append("\n");
        if (this.W != 12) {
            StringBuilder sb103 = this.Y;
            if (sb103 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb103.append(n("bawa_relation"));
            StringBuilder sb104 = this.Y;
            if (sb104 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb104.append(str32);
            StringBuilder sb105 = this.Y;
            if (sb105 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb105.append(n("bawa_relation" + this.W));
            StringBuilder sb106 = this.Y;
            if (sb106 == null) {
                Intrinsics.n("mSb");
                throw null;
            }
            sb106.append("\n");
        }
        StringBuilder sb107 = this.Y;
        if (sb107 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb107.append("\n");
        StringBuilder sb108 = this.Y;
        if (sb108 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb108.append(n("thorathuru"));
        StringBuilder sb109 = this.Y;
        if (sb109 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb109.append(str32);
        StringBuilder sb110 = this.Y;
        if (sb110 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb110.append(n("bawa" + this.W));
        StringBuilder sb111 = this.Y;
        if (sb111 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        textView2.setText(com.bumptech.glide.f.n(sb111.toString()));
        yl0Var.l(n("cancel"), new c9.c(3));
        this.f1079t = true;
        Dialog dialog = this.O;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        return yl0Var.i();
    }

    public final String l(int i10) {
        e9.d dVar = this.U;
        if (dVar != null) {
            return !dVar.E(i10, this.X) ? "" : "*".concat(n("banga"));
        }
        Intrinsics.n("mHoroscope");
        throw null;
    }

    public final String m(String str) throws Resources.NotFoundException {
        Context context = getContext();
        s9.f fVar = s9.c.f16951a;
        String string = context.getResources().getString(s9.c.b(context, str));
        Intrinsics.e(string, "getString(context, key)");
        return string;
    }

    public final String n(String str) {
        String strA = s9.c.a(getContext(), str);
        Intrinsics.e(strA, "getStringLan(context, key)");
        return strA;
    }

    public final void o(e9.e eVar) {
        StringBuilder sb = this.Y;
        if (sb == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb.append("\n");
        StringBuilder sb2 = this.Y;
        if (sb2 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb2.append(n("nekatha"));
        StringBuilder sb3 = this.Y;
        if (sb3 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb3.append(" : ");
        StringBuilder sb4 = this.Y;
        if (sb4 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String strD = eVar.d();
        Intrinsics.e(strD, "nekatha.nameCode");
        sb4.append(m(strD));
        StringBuilder sb5 = this.Y;
        if (sb5 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb5.append(" (");
        StringBuilder sb6 = this.Y;
        if (sb6 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb6.append(eVar.f12610g);
        StringBuilder sb7 = this.Y;
        if (sb7 != null) {
            sb7.append(")");
        } else {
            Intrinsics.n("mSb");
            throw null;
        }
    }

    public final void p(double d10) {
        StringBuilder sb = this.Y;
        if (sb == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb.append("\n");
        StringBuilder sb2 = this.Y;
        if (sb2 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb2.append(n("sputaya"));
        StringBuilder sb3 = this.Y;
        if (sb3 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb3.append(" : ");
        int[] iArrV = com.bumptech.glide.f.v(d10);
        StringBuilder sb4 = this.Y;
        if (sb4 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f14209a;
        String str = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[0])}, 1));
        Intrinsics.e(str, "format(format, *args)");
        sb4.append(str);
        StringBuilder sb5 = this.Y;
        if (sb5 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb5.append(" ");
        StringBuilder sb6 = this.Y;
        if (sb6 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[1])}, 1));
        Intrinsics.e(str2, "format(format, *args)");
        sb6.append(str2);
        StringBuilder sb7 = this.Y;
        if (sb7 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        sb7.append(" ");
        StringBuilder sb8 = this.Y;
        if (sb8 == null) {
            Intrinsics.n("mSb");
            throw null;
        }
        String str3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[2])}, 1));
        Intrinsics.e(str3, "format(format, *args)");
        sb8.append(str3);
    }
}