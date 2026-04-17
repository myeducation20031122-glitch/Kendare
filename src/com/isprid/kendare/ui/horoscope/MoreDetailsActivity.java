package com.isprid.kendare.ui.horoscope;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.m;
import androidx.viewpager.widget.ViewPager;
import c4.i;
import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.internal.ads.c31;
import com.isprid.kendare.MyApplication;
import com.isprid.kendare.ui.horoscope.MoreDetailsActivity;
import e9.d;
import e9.e;
import e9.f;
import f9.a;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kc.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import m.s3;
import s9.c;
import t7.z0;
import y4.g;
import z8.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/isprid/kendare/ui/horoscope/MoreDetailsActivity;", "Lj9/b;", "<init>", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class MoreDetailsActivity extends b {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f11650w = 0;

    /* renamed from: f, reason: collision with root package name */
    public s3 f11651f;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f11652j;

    /* renamed from: m, reason: collision with root package name */
    public d f11653m;

    /* renamed from: n, reason: collision with root package name */
    public final String[] f11654n = new String[6];

    /* renamed from: t, reason: collision with root package name */
    public e f11655t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f11656u;

    public final String k() throws Resources.NotFoundException {
        f fVar;
        f fVar2;
        String str;
        String str2;
        f fVar3;
        String str3;
        f fVar4;
        String str4;
        String str5;
        f fVar5;
        String str6;
        String str7;
        String str8;
        String strL;
        StringBuilder sb = new StringBuilder();
        d dVar = this.f11653m;
        if (dVar == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        e eVar = dVar.f12593n.f12575d;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        String strB = dVar.f12595p.b();
        s9.f fVar6 = c.f16951a;
        sb2.append(getResources().getString(c.b(this, strB)));
        sb2.append(", ");
        sb2.append(getResources().getString(c.b(this, dVar.f12593n.f12574c.f12565d.b())));
        String string = sb2.toString();
        String str9 = getResources().getString(c.b(this, ((e9.c) dVar.f12595p.f3243b).g())) + ", " + getResources().getString(c.b(this, ((e9.c) dVar.f12593n.f12574c.f12565d.f3243b).g()));
        int iJ = dVar.j();
        n7.c cVar = MyApplication.f11640b;
        String string2 = getResources().getString(c.b(this, r.d("daySin", iJ)));
        f fVar7 = new f("nekathap", eVar.d(), true);
        f fVar8 = new f("gana");
        f fVar9 = new f("mahendra", eVar.d(), true);
        f fVar10 = new f("dirga", eVar.d(), true);
        f fVar11 = new f("yoni");
        f fVar12 = new f("raship", string, false);
        f fVar13 = new f("rashiAdipathi", str9, false);
        f fVar14 = new f("rajju");
        f fVar15 = new f("vashi", string, false);
        StringBuilder sb3 = sb;
        f fVar16 = new f("weda", eVar.d(), true);
        f fVar17 = new f("wruksha");
        f fVar18 = new f("ayu", eVar.d(), true);
        f fVar19 = new f("pakshi");
        f fVar20 = new f("butha");
        f fVar21 = new f("gothra");
        f fVar22 = new f("warana");
        f fVar23 = new f("linga");
        f fVar24 = new f("dina", string2, false);
        f fVar25 = new f("nadi");
        f fVar26 = new f("grahap", "?", false);
        arrayList.add(fVar7);
        arrayList.add(fVar8);
        arrayList.add(fVar9);
        arrayList.add(fVar10);
        arrayList.add(fVar11);
        arrayList.add(fVar12);
        arrayList.add(fVar13);
        arrayList.add(fVar14);
        arrayList.add(fVar15);
        arrayList.add(fVar16);
        arrayList.add(fVar17);
        arrayList.add(fVar18);
        arrayList.add(fVar19);
        arrayList.add(fVar20);
        arrayList.add(fVar21);
        arrayList.add(fVar22);
        arrayList.add(fVar23);
        arrayList.add(fVar24);
        arrayList.add(fVar25);
        arrayList.add(fVar26);
        ArrayList arrayList2 = arrayList;
        String str10 = "purusha";
        switch (eVar.f12606c) {
            case QueueFuseable.SYNC /* 1 */:
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "ashwa";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "godakaduru";
                fVar19.f12614c = "rajaliya";
                fVar20.f12614c = "pathawi";
                fVar21.f12614c = "maritchi";
                fVar22.f12614c = "brahmana";
                fVar.f12614c = "purusha";
                fVar2 = fVar25;
                str = "purwa";
                fVar2.f12614c = str;
                break;
            case 2:
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "ath";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "nelli";
                fVar19.f12614c = "rajaliya";
                fVar20.f12614c = "pathawi";
                fVar21.f12614c = "maritchi";
                fVar22.f12614c = "kshathriya";
                fVar.f12614c = "purusha";
                str2 = "madya";
                fVar3 = fVar25;
                fVar3.f12614c = str2;
                fVar2 = fVar3;
                break;
            case 3:
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "eludena";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "attana";
                fVar19.f12614c = "rajaliya";
                fVar20.f12614c = "pathawi";
                fVar21.f12614c = "maritchi";
                fVar22.f12614c = "waishya";
                fVar.f12614c = "sthree";
                fVar2 = fVar25;
                str = "anthya";
                fVar2.f12614c = str;
                break;
            case 4:
                fVar2 = fVar25;
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "sarpa";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "madan";
                fVar19.f12614c = "rajaliya";
                fVar20.f12614c = "pathawi";
                fVar21.f12614c = "maritchi";
                fVar22.f12614c = "kshudra";
                fVar.f12614c = "purusha";
                str = "anthya";
                fVar2.f12614c = str;
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                fVar2 = fVar25;
                str3 = "madya";
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "sapini";
                fVar14.f12614c = "shiro";
                fVar17.f12614c = "kaluwara";
                fVar19.f12614c = "rajaliya";
                fVar20.f12614c = "pathawi";
                fVar21.f12614c = "athri";
                fVar22.f12614c = "panchama";
                fVar.f12614c = "napunsaka";
                fVar2.f12614c = str3;
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "sunaka";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "kihiri";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "athri";
                fVar22.f12614c = "sankara";
                fVar.f12614c = "purusha";
                str = "purwa";
                fVar2 = fVar25;
                fVar2.f12614c = str;
                break;
            case g.NETWORK_ERROR /* 7 */:
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "balal";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "una";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "athri";
                fVar22.f12614c = "brahmana";
                fVar.f12614c = "purusha";
                fVar2 = fVar25;
                fVar2.f12614c = "purwa";
                break;
            case 8:
                str3 = "madya";
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "elu";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "bo";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "athri";
                fVar22.f12614c = "kshathriya";
                fVar.f12614c = "purusha";
                fVar2 = fVar25;
                fVar2.f12614c = str3;
                break;
            case 9:
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "balali";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "doba";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "wishishta";
                fVar22.f12614c = "waishya";
                fVar.f12614c = "sthree";
                str = "anthya";
                fVar2 = fVar25;
                fVar2.f12614c = str;
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "mushikadena";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "nuga";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "wishishta";
                fVar22.f12614c = "kshudra";
                fVar.f12614c = "purusha";
                fVar2 = fVar25;
                str3 = "anthya";
                fVar2.f12614c = str3;
                break;
            case 11:
                fVar4 = fVar25;
                str4 = "madya";
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "mushika";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "kela";
                fVar19.f12614c = "bakamuna";
                fVar20.f12614c = "apo";
                fVar21.f12614c = "wishishta";
                fVar22.f12614c = "panchama";
                fVar.f12614c = "sthree";
                fVar4.f12614c = str4;
                fVar2 = fVar4;
                break;
            case 12:
                fVar4 = fVar25;
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "gawadena";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "araliya";
                fVar19.f12614c = "kaputa";
                fVar20.f12614c = "thejo";
                fVar21.f12614c = "wishishta";
                fVar22.f12614c = "sankara";
                fVar.f12614c = "sthree";
                fVar4.f12614c = "purwa";
                fVar2 = fVar4;
                break;
            case g.ERROR /* 13 */:
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "midena";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "dibul";
                fVar19.f12614c = "kaputa";
                fVar20.f12614c = "thejo";
                fVar21.f12614c = "angiri";
                fVar22.f12614c = "brahmana";
                fVar.f12614c = "sthree";
                fVar4 = fVar25;
                str4 = "purwa";
                fVar4.f12614c = str4;
                fVar2 = fVar4;
                break;
            case g.INTERRUPTED /* 14 */:
                str5 = "kshathriya";
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "wyagra";
                fVar14.f12614c = "shiro";
                fVar17.f12614c = "beli";
                fVar19.f12614c = "kaputa";
                fVar20.f12614c = "thejo";
                fVar21.f12614c = "angiri";
                fVar22.f12614c = str5;
                fVar.f12614c = str10;
                fVar2 = fVar25;
                str3 = "madya";
                fVar2.f12614c = str3;
                break;
            case g.TIMEOUT /* 15 */:
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "migon";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "kubuk";
                fVar19.f12614c = "kaputa";
                fVar20.f12614c = "thejo";
                fVar21.f12614c = "angiri";
                fVar22.f12614c = "waishya";
                fVar.f12614c = "purusha";
                fVar3 = fVar25;
                str2 = "anthya";
                fVar3.f12614c = str2;
                fVar2 = fVar3;
                break;
            case g.CANCELED /* 16 */:
                fVar3 = fVar25;
                str2 = "anthya";
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "wyagradena";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "sapu";
                fVar19.f12614c = "kaputa";
                fVar20.f12614c = "thejo";
                fVar21.f12614c = "angiri";
                fVar22.f12614c = "kshudra";
                fVar.f12614c = "sthree";
                fVar3.f12614c = str2;
                fVar2 = fVar3;
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                str5 = "panchama";
                fVar = fVar23;
                str10 = "sthree";
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "muwadena";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "mumel";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulasthi";
                fVar22.f12614c = str5;
                fVar.f12614c = str10;
                fVar2 = fVar25;
                str3 = "madya";
                fVar2.f12614c = str3;
                break;
            case 18:
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "muwa";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "wetake";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulasthi";
                fVar22.f12614c = "sankara";
                fVar.f12614c = "purusha";
                fVar2 = fVar25;
                str3 = "purwa";
                fVar2.f12614c = str3;
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "sunaki";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "imbul";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulasthi";
                fVar22.f12614c = "brahmana";
                fVar.f12614c = "napunsaka";
                fVar3 = fVar25;
                str2 = "purwa";
                fVar3.f12614c = str2;
                fVar2 = fVar3;
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "wadari";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "gopalu";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulasthi";
                fVar22.f12614c = "kshathriya";
                fVar.f12614c = "sthree";
                fVar2 = fVar25;
                fVar2.f12614c = "madya";
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "mugatidena";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "kos";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulaga";
                fVar22.f12614c = "waishya";
                fVar.f12614c = "sthree";
                fVar25.f12614c = "anthya";
                fVar2 = fVar25;
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                fVar5 = fVar25;
                str6 = "anthya";
                fVar = fVar23;
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "wadura";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "wara";
                fVar19.f12614c = "kukula";
                fVar20.f12614c = "wayo";
                fVar21.f12614c = "pulaga";
                fVar22.f12614c = "kshudra";
                fVar.f12614c = "purusha";
                fVar5.f12614c = str6;
                fVar2 = fVar5;
                break;
            case 23:
                fVar5 = fVar25;
                str7 = "madya";
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "sinhadena";
                fVar14.f12614c = "shiro";
                fVar17.f12614c = "samadara";
                fVar19.f12614c = "monara";
                fVar20.f12614c = "akasha";
                fVar21.f12614c = "pulaga";
                fVar22.f12614c = "panchama";
                fVar.f12614c = "sthree";
                fVar5.f12614c = str7;
                fVar2 = fVar5;
                break;
            case 24:
                fVar5 = fVar25;
                str8 = "purwa";
                fVar = fVar23;
                fVar8.f12614c = "rakshya";
                fVar11.f12614c = "welamba";
                fVar14.f12614c = "bahu";
                fVar17.f12614c = "kolon";
                fVar19.f12614c = "monara";
                fVar20.f12614c = "akasha";
                fVar21.f12614c = "kathru";
                fVar22.f12614c = "sankara";
                fVar.f12614c = "napunsaka";
                fVar5.f12614c = str8;
                fVar2 = fVar5;
                break;
            case 25:
                fVar5 = fVar25;
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "sinhaya";
                fVar14.f12614c = "nabi";
                fVar17.f12614c = "meaba";
                fVar19.f12614c = "monara";
                fVar20.f12614c = "akasha";
                fVar21.f12614c = "kathru";
                fVar22.f12614c = "brahmana";
                fVar.f12614c = "purusha";
                str8 = "purwa";
                fVar5.f12614c = str8;
                fVar2 = fVar5;
                break;
            case 26:
                fVar5 = fVar25;
                fVar = fVar23;
                fVar8.f12614c = "manusha";
                fVar11.f12614c = "gon";
                fVar14.f12614c = "uru";
                fVar17.f12614c = "kohoba";
                fVar19.f12614c = "monara";
                fVar20.f12614c = "akasha";
                fVar21.f12614c = "kathru";
                fVar22.f12614c = "kshathriya";
                fVar.f12614c = "purusha";
                str7 = "madya";
                fVar5.f12614c = str7;
                fVar2 = fVar5;
                break;
            case 27:
                fVar8.f12614c = "dewa";
                fVar11.f12614c = "athini";
                fVar14.f12614c = "pada";
                fVar17.f12614c = "mee";
                fVar19.f12614c = "monara";
                fVar20.f12614c = "akasha";
                fVar21.f12614c = "kathru";
                fVar22.f12614c = "waishya";
                fVar = fVar23;
                fVar.f12614c = "sthree";
                fVar5 = fVar25;
                str6 = "anthya";
                fVar5.f12614c = str6;
                fVar2 = fVar5;
                break;
            default:
                fVar2 = fVar25;
                fVar = fVar23;
                break;
        }
        fVar8.f12614c = r.g(new StringBuilder(), fVar8.f12614c, "Sin");
        fVar11.f12614c = r.g(new StringBuilder(), fVar11.f12614c, "Sin");
        fVar14.f12614c = r.g(new StringBuilder(), fVar14.f12614c, "Sin");
        fVar17.f12614c = r.g(new StringBuilder(), fVar17.f12614c, "Sin");
        fVar19.f12614c = r.g(new StringBuilder(), fVar19.f12614c, "Sin");
        fVar20.f12614c = r.g(new StringBuilder(), fVar20.f12614c, "Sin");
        fVar21.f12614c = r.g(new StringBuilder(), fVar21.f12614c, "Sin");
        fVar22.f12614c = r.g(new StringBuilder(), fVar22.f12614c, "Sin");
        fVar.f12614c = r.g(new StringBuilder(), fVar.f12614c, "Sin");
        fVar2.f12614c = r.g(new StringBuilder(), fVar2.f12614c, "Sin");
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f fVar27 = (f) it.next();
            ArrayList arrayList3 = arrayList2;
            int iIndexOf = arrayList3.indexOf(fVar27);
            StringBuilder sb4 = sb3;
            sb4.append(iIndexOf + 1);
            sb4.append(" ");
            fVar27.getClass();
            n7.c cVar2 = MyApplication.f11640b;
            String str11 = fVar27.f12613b + "Sin";
            Intrinsics.e(str11, "porondam.nameLan");
            sb4.append(l(str11));
            sb4.append(" : ");
            if (fVar27.f12612a) {
                String str12 = fVar27.f12614c;
                Intrinsics.e(str12, "porondam.value");
                strL = l(str12);
            } else {
                strL = fVar27.f12614c;
            }
            sb4.append(strL);
            if (arrayList3.size() - 1 != iIndexOf) {
                sb4.append("\n");
            }
            arrayList2 = arrayList3;
            sb3 = sb4;
        }
        String string3 = sb3.toString();
        Intrinsics.e(string3, "sb.toString()");
        return string3;
    }

    public final String l(String str) throws Resources.NotFoundException {
        s9.f fVar = c.f16951a;
        String string = getResources().getString(c.b(this, str));
        Intrinsics.e(string, "getString(this, key)");
        return string;
    }

    public final void m(e9.b bVar, StringBuilder sb) {
        String strG = bVar.f12569d.g();
        Intrinsics.e(strG, "dasa.graha.nameCode");
        sb.append(l(strG));
        sb.append(" : ");
        sb.append(e9.b.a(this, bVar.f12571f));
        sb.append(" - ");
        sb.append(e9.b.a(this, bVar.f12568c));
    }

    public final void n(StringBuilder sb, e9.c cVar) {
        sb.append("\n");
        c31 c31Var = cVar.f12574c.f12565d;
        Intrinsics.e(c31Var, "graha.house.rashi()");
        e eVar = cVar.f12575d;
        Intrinsics.e(eVar, "graha.nekatha");
        int i10 = cVar.f12574c.f12564c;
        double d10 = cVar.f12578g;
        String strG = cVar.g();
        Intrinsics.e(strG, "graha.nameCode");
        o(sb, c31Var, eVar, i10, d10 - (((int) (d10 / 30.0d)) * 30.0d), strG);
    }

    public final void o(StringBuilder sb, c31 c31Var, e eVar, int i10, double d10, String str) {
        sb.append(l(str));
        sb.append(" : ");
        sb.append(i10);
        sb.append(" : ");
        String strB = c31Var.b();
        Intrinsics.e(strB, "rashi.nameCode");
        sb.append(l(strB));
        sb.append(" : ");
        int[] iArrV = com.bumptech.glide.f.v(d10);
        StringCompanionObject stringCompanionObject = StringCompanionObject.f14209a;
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[0])}, 1));
        Intrinsics.e(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(" ");
        String str3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[1])}, 1));
        Intrinsics.e(str3, "format(format, *args)");
        sb.append(str3);
        sb.append(" ");
        String str4 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrV[2])}, 1));
        Intrinsics.e(str4, "format(format, *args)");
        sb.append(str4);
        sb.append(" : ");
        String strD = eVar.d();
        Intrinsics.e(strD, "nekatha.nameCode");
        sb.append(l(strD));
        sb.append(" (");
        sb.append(eVar.f12610g);
        sb.append(")");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Log.e("FAN ", "No need to show Ad at the moment");
        super.onBackPressed();
        overridePendingTransition(2130771980, 2130771983);
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        int i10;
        a aVarA;
        e eVar;
        d dVar;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131492896, (ViewGroup) null, false);
        int i11 = 2131296373;
        LinearLayout linearLayout = (LinearLayout) g5.a.l(viewInflate, 2131296373);
        if (linearLayout != null) {
            i11 = 2131296724;
            ImageView imageView = (ImageView) g5.a.l(viewInflate, 2131296724);
            if (imageView != null) {
                i11 = 2131296801;
                ImageView imageView2 = (ImageView) g5.a.l(viewInflate, 2131296801);
                if (imageView2 != null) {
                    i11 = 2131296955;
                    TextView textView = (TextView) g5.a.l(viewInflate, 2131296955);
                    if (textView != null) {
                        i11 = 2131296959;
                        Toolbar toolbar = (Toolbar) g5.a.l(viewInflate, 2131296959);
                        if (toolbar != null) {
                            i11 = 2131296990;
                            ViewPager viewPager = (ViewPager) g5.a.l(viewInflate, 2131296990);
                            if (viewPager != null) {
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                s3 s3Var = new s3();
                                s3Var.f14927b = coordinatorLayout;
                                s3Var.f14928e = linearLayout;
                                s3Var.f14930j = imageView;
                                s3Var.f14931m = imageView2;
                                s3Var.f14929f = textView;
                                s3Var.f14932n = toolbar;
                                s3Var.f14933t = viewPager;
                                this.f11651f = s3Var;
                                setContentView(coordinatorLayout);
                                s3 s3Var2 = this.f11651f;
                                if (s3Var2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                setSupportActionBar((Toolbar) s3Var2.f14932n);
                                n7.c cVar = MyApplication.f11640b;
                                g.b supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    String string = getString(2131886654);
                                    Intrinsics.e(string, "getString(R.string.more_details_sin)");
                                    com.bumptech.glide.e.M(supportActionBar, this, string, true, 8);
                                }
                                Typeface typefaceA = s9.d.a(this);
                                Intrinsics.e(typefaceA, "getTypeFace(this, FontUtil.TypeFace.SINHALA)");
                                this.f11656u = typefaceA;
                                s3 s3Var3 = this.f11651f;
                                if (s3Var3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((TextView) s3Var3.f14929f).setTypeface(typefaceA, 1);
                                s3 s3Var4 = this.f11651f;
                                if (s3Var4 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((TextView) s3Var4.f14929f).setTextSize(0, getResources().getDimension(2131100495));
                                d dVarO = d.o(this);
                                Intrinsics.e(dVarO, "getInstance(this)");
                                this.f11653m = dVarO;
                                try {
                                    eVar = dVarO.f12593n.f12575d;
                                    Intrinsics.e(eVar, "mHoroscope.moon.nekatha");
                                    this.f11655t = eVar;
                                    dVar = this.f11653m;
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    Log.e("Nekatha", String.valueOf(e10.getMessage()));
                                    z0.k(this, "Something went wrong. Please try again");
                                    finish();
                                }
                                if (dVar == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                ArrayList arrayListA = eVar.a(dVar.f12585f);
                                Intrinsics.e(arrayListA, "mNekatha.getDasaList(mHo…e.birthDateTimeCorrected)");
                                this.f11652j = arrayListA;
                                StringBuilder sb = new StringBuilder();
                                d dVar2 = this.f11653m;
                                if (dVar2 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int iJ = dVar2.j();
                                n7.c cVar2 = MyApplication.f11640b;
                                sb.append(getString(2131886382));
                                sb.append(" : ");
                                sb.append(l("daySin" + iJ));
                                e eVar2 = this.f11655t;
                                if (eVar2 == null) {
                                    Intrinsics.n("mNekatha");
                                    throw null;
                                }
                                sb.append("\n");
                                if (eVar2.f12606c > 0) {
                                    sb.append(getString(2131886799));
                                    sb.append(" : ");
                                    e eVar3 = this.f11655t;
                                    if (eVar3 == null) {
                                        Intrinsics.n("mNekatha");
                                        throw null;
                                    }
                                    String strD = eVar3.d();
                                    Intrinsics.e(strD, "mNekatha.nameCode");
                                    sb.append(l(strD));
                                    sb.append(" ");
                                    sb.append(eVar2.f12610g);
                                    sb.append(" ");
                                    sb.append(getString(2131886831));
                                }
                                d dVar3 = this.f11653m;
                                if (dVar3 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i12 = dVar3.f12601v;
                                sb.append("\n");
                                if (i12 > 0) {
                                    sb.append(getString(2131887080));
                                    sb.append(" : ");
                                    sb.append(l("thithiSin" + i12));
                                }
                                d dVar4 = this.f11653m;
                                if (dVar4 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i13 = dVar4.f12603x;
                                sb.append("\n");
                                if (i13 > 0) {
                                    sb.append(getString(2131887198));
                                    sb.append(" : ");
                                    sb.append(l("yogaSin" + i13));
                                }
                                d dVar5 = this.f11653m;
                                if (dVar5 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i14 = dVar5.f12590k;
                                sb.append("\n");
                                if (i14 > 0) {
                                    sb.append(getString(2131886522));
                                    sb.append(" : ");
                                    sb.append(l("karanaSin" + i14));
                                }
                                d dVar6 = this.f11653m;
                                if (dVar6 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a31 a31Var = dVar6.f12595p;
                                sb.append("\n\n");
                                sb.append(getString(2131886551));
                                sb.append(" : ");
                                String strB = a31Var.b();
                                Intrinsics.e(strB, "lagnaRashi.nameCode");
                                sb.append(l(strB));
                                sb.append(" - ");
                                String strG = ((e9.c) a31Var.f3243b).g();
                                Intrinsics.e(strG, "lagnaRashi.adipathi.nameCode");
                                sb.append(l(strG));
                                d dVar7 = this.f11653m;
                                if (dVar7 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i15 = dVar7.f12595p.f3242a % 2;
                                double d10 = dVar7.f12584e;
                                a aVarA2 = (i15 != 1 ? d10 >= 15.0d : d10 < 15.0d) ? e9.c.a(0, null, 0.0d, false) : e9.c.a(1, null, 0.0d, false);
                                sb.append("\n");
                                sb.append(getString(2131886921));
                                sb.append(" : ");
                                String strG2 = aVarA2.g();
                                Intrinsics.e(strG2, "rashyardaGraha.nameCode");
                                sb.append(l(strG2));
                                d dVar8 = this.f11653m;
                                if (dVar8 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i16 = dVar8.f12595p.f3242a;
                                int i17 = dVar8.f12587h;
                                if (i17 != 1) {
                                    i16 = ((i17 == 2 ? i16 + 3 : i16 + 7) % 12) + 1;
                                }
                                a31 a31VarA = c31.a(i16);
                                sb.append("\n");
                                sb.append(getString(2131886372));
                                sb.append(" : ");
                                String strB2 = a31VarA.b();
                                Intrinsics.e(strB2, "dekarnaRashi.nameCode");
                                sb.append(l(strB2));
                                sb.append(" - ");
                                String strG3 = ((e9.c) a31VarA.f3243b).g();
                                Intrinsics.e(strG3, "dekarnaRashi.adipathi.nameCode");
                                sb.append(l(strG3));
                                d dVar9 = this.f11653m;
                                if (dVar9 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a31 a31Var2 = dVar9.f12596q;
                                sb.append("\n");
                                sb.append(getString(2131886743));
                                sb.append(" : ");
                                String strB3 = a31Var2.b();
                                Intrinsics.e(strB3, "nawanshakaRashi.nameCode");
                                sb.append(l(strB3));
                                sb.append(" - ");
                                String strG4 = ((e9.c) a31Var2.f3243b).g();
                                Intrinsics.e(strG4, "nawanshakaRashi.adipathi.nameCode");
                                sb.append(l(strG4));
                                d dVar10 = this.f11653m;
                                if (dVar10 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a31 a31VarA2 = c31.a((((dVar10.f12595p.f3242a + dVar10.f12588i) - 2) % 12) + 1);
                                sb.append("\n");
                                sb.append(getString(2131886390));
                                sb.append(" : ");
                                String strB4 = a31VarA2.b();
                                Intrinsics.e(strB4, "dwadshanshakaRashi.nameCode");
                                sb.append(l(strB4));
                                sb.append(" - ");
                                String strG5 = ((e9.c) a31VarA2.f3243b).g();
                                Intrinsics.e(strG5, "dwadshanshakaRashi.adipathi.nameCode");
                                sb.append(l(strG5));
                                d dVar11 = this.f11653m;
                                if (dVar11 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                if (dVar11.f12595p.f3242a % 2 == 1) {
                                    double d11 = dVar11.f12584e;
                                    if (d11 < 5.0d) {
                                        aVarA = e9.c.a(4, null, 0.0d, false);
                                    } else {
                                        if (d11 < 10.0d) {
                                            i10 = 6;
                                        } else {
                                            if (d11 >= 18.0d) {
                                                if (d11 < 25.0d) {
                                                    aVarA = e9.c.a(2, null, 0.0d, false);
                                                } else {
                                                    i10 = 3;
                                                }
                                            }
                                        }
                                        aVarA = e9.c.a(i10, null, 0.0d, false);
                                    }
                                } else {
                                    i10 = 3;
                                    double d12 = dVar11.f12584e;
                                    if (d12 >= 5.0d) {
                                        if (d12 < 12.0d) {
                                            i10 = 2;
                                        } else {
                                            aVarA = d12 < 20.0d ? e9.c.a(5, null, 0.0d, false) : d12 < 25.0d ? e9.c.a(6, null, 0.0d, false) : e9.c.a(4, null, 0.0d, false);
                                        }
                                    }
                                    aVarA = e9.c.a(i10, null, 0.0d, false);
                                }
                                sb.append("\n");
                                sb.append(getString(2131887086));
                                sb.append(" : ");
                                String strG6 = aVarA.g();
                                Intrinsics.e(strG6, "thrishanshakaGraha.nameCode");
                                sb.append(l(strG6));
                                sb.append("\n\n");
                                d dVar12 = this.f11653m;
                                if (dVar12 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                int i18 = dVar12.m(8).f12565d.f3242a;
                                int i19 = dVar12.f12587h;
                                if (i19 != 1) {
                                    i18 = ((i19 == 2 ? i18 + 3 : i18 + 7) % 12) + 1;
                                }
                                a31 a31VarA3 = c31.a(i18);
                                sb.append(getString(2131886372));
                                sb.append(" 22 : ");
                                String strB5 = a31VarA3.b();
                                Intrinsics.e(strB5, "dekarna22Rashi.nameCode");
                                sb.append(l(strB5));
                                sb.append(" - ");
                                String strG7 = ((e9.c) a31VarA3.f3243b).g();
                                Intrinsics.e(strG7, "dekarna22Rashi.adipathi.nameCode");
                                sb.append(l(strG7));
                                d dVar13 = this.f11653m;
                                if (dVar13 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a31 a31VarA4 = c31.a((((dVar13.f12596q.f3242a + dVar13.t(8).f12565d.f3242a) - 2) % 12) + 1);
                                sb.append("\n");
                                sb.append(getString(2131886743));
                                sb.append(" 64 : ");
                                String strB6 = a31VarA4.b();
                                Intrinsics.e(strB6, "nawanshakaya64Rashi.nameCode");
                                sb.append(l(strB6));
                                sb.append(" - ");
                                String strG8 = ((e9.c) a31VarA4.f3243b).g();
                                Intrinsics.e(strG8, "nawanshakaya64Rashi.adipathi.nameCode");
                                sb.append(l(strG8));
                                String string2 = sb.toString();
                                Intrinsics.e(string2, "sb.toString()");
                                String[] strArr = this.f11654n;
                                strArr[0] = string2;
                                StringBuilder sb2 = new StringBuilder();
                                String strA = c.a(this, "grahaya");
                                Intrinsics.e(strA, "getStringLan(this, key)");
                                sb2.append(strA);
                                sb2.append(" : ");
                                String strA2 = c.a(this, "bawa");
                                Intrinsics.e(strA2, "getStringLan(this, key)");
                                sb2.append(strA2);
                                sb2.append(" : ");
                                String strA3 = c.a(this, "rashiya");
                                Intrinsics.e(strA3, "getStringLan(this, key)");
                                sb2.append(strA3);
                                sb2.append(" : ");
                                String strA4 = c.a(this, "sputaya");
                                Intrinsics.e(strA4, "getStringLan(this, key)");
                                sb2.append(strA4);
                                sb2.append(" : ");
                                String strA5 = c.a(this, "nekatha");
                                Intrinsics.e(strA5, "getStringLan(this, key)");
                                sb2.append(strA5);
                                sb2.append("\n\n");
                                d dVar14 = this.f11653m;
                                if (dVar14 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a31 a31Var3 = dVar14.f12595p;
                                Intrinsics.e(a31Var3, "mHoroscope.rashiLagna");
                                d dVar15 = this.f11653m;
                                if (dVar15 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e eVar4 = dVar15.f12591l;
                                Intrinsics.e(eVar4, "mHoroscope.lagnaNekatha");
                                d dVar16 = this.f11653m;
                                if (dVar16 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                String str = "\n\n";
                                String str2 = " - ";
                                o(sb2, a31Var3, eVar4, 1, dVar16.f12584e, "lagnaya_sin");
                                d dVar17 = this.f11653m;
                                if (dVar17 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a aVar = dVar17.f12597r;
                                Intrinsics.e(aVar, "mHoroscope.sun");
                                n(sb2, aVar);
                                d dVar18 = this.f11653m;
                                if (dVar18 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                a aVar2 = dVar18.f12593n;
                                Intrinsics.e(aVar2, "mHoroscope.moon");
                                n(sb2, aVar2);
                                d dVar19 = this.f11653m;
                                if (dVar19 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK = dVar19.k(2);
                                Intrinsics.e(cVarK, "mHoroscope.getGraha(2)");
                                n(sb2, cVarK);
                                d dVar20 = this.f11653m;
                                if (dVar20 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK2 = dVar20.k(3);
                                Intrinsics.e(cVarK2, "mHoroscope.getGraha(3)");
                                n(sb2, cVarK2);
                                d dVar21 = this.f11653m;
                                if (dVar21 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK3 = dVar21.k(4);
                                Intrinsics.e(cVarK3, "mHoroscope.getGraha(4)");
                                n(sb2, cVarK3);
                                d dVar22 = this.f11653m;
                                if (dVar22 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK4 = dVar22.k(5);
                                Intrinsics.e(cVarK4, "mHoroscope.getGraha(5)");
                                n(sb2, cVarK4);
                                d dVar23 = this.f11653m;
                                if (dVar23 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK5 = dVar23.k(6);
                                Intrinsics.e(cVarK5, "mHoroscope.getGraha(6)");
                                n(sb2, cVarK5);
                                d dVar24 = this.f11653m;
                                if (dVar24 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK6 = dVar24.k(11);
                                Intrinsics.e(cVarK6, "mHoroscope.getGraha(11)");
                                n(sb2, cVarK6);
                                d dVar25 = this.f11653m;
                                if (dVar25 == null) {
                                    Intrinsics.n("mHoroscope");
                                    throw null;
                                }
                                e9.c cVarK7 = dVar25.k(10);
                                Intrinsics.e(cVarK7, "mHoroscope.getGraha(10)");
                                n(sb2, cVarK7);
                                String string3 = sb2.toString();
                                Intrinsics.e(string3, "sb.toString()");
                                strArr[1] = string3;
                                strArr[2] = k();
                                StringBuilder sb3 = new StringBuilder();
                                ArrayList arrayList = this.f11652j;
                                if (arrayList == null) {
                                    Intrinsics.n("mDasaList");
                                    throw null;
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    e9.b bVar = (e9.b) it.next();
                                    if (bVar.f12567b) {
                                        sb3.append("‣ ");
                                        String strG9 = bVar.f12569d.g();
                                        Intrinsics.e(strG9, "dasa.graha.nameCode");
                                        sb3.append(l(strG9));
                                        sb3.append(" ");
                                        n7.c cVar3 = MyApplication.f11640b;
                                        String string4 = getString(2131886584);
                                        Intrinsics.e(string4, "if (isSinhala()) getStri…ing(R.string.maha_dasawa)");
                                        sb3.append(string4);
                                        sb3.append("\n");
                                        sb3.append(e9.b.a(this, bVar.f12571f));
                                        String str3 = str2;
                                        sb3.append(str3);
                                        sb3.append(e9.b.a(this, bVar.f12568c));
                                        Iterator it2 = bVar.f12566a.iterator();
                                        while (it2.hasNext()) {
                                            e9.b bVar2 = (e9.b) it2.next();
                                            if (bVar2.f12567b) {
                                                String str4 = str;
                                                sb3.append(str4);
                                                sb3.append("‣ ");
                                                String strG10 = bVar2.f12569d.g();
                                                Intrinsics.e(strG10, "antharDasa.graha.nameCode");
                                                sb3.append(l(strG10));
                                                sb3.append(" ");
                                                n7.c cVar4 = MyApplication.f11640b;
                                                String string5 = getString(2131886128);
                                                Intrinsics.e(string5, "if (isSinhala()) getStri…g(R.string.anthar_dasawa)");
                                                sb3.append(string5);
                                                sb3.append("\n");
                                                sb3.append(e9.b.a(this, bVar2.f12571f));
                                                sb3.append(str3);
                                                sb3.append(e9.b.a(this, bVar2.f12568c));
                                                sb3.append(str4);
                                                sb3.append("‣ ");
                                                String string6 = getString(2131887134);
                                                Intrinsics.e(string6, "if (isSinhala()) getStri…etString(R.string.widasa)");
                                                sb3.append(string6);
                                                Iterator it3 = bVar2.f12566a.iterator();
                                                while (it3.hasNext()) {
                                                    e9.b bVar3 = (e9.b) it3.next();
                                                    sb3.append("\n- ");
                                                    if (bVar3.f12567b) {
                                                        sb3.append("* ");
                                                    }
                                                    m(bVar3, sb3);
                                                }
                                                str = str4;
                                            }
                                        }
                                        str2 = str3;
                                    }
                                }
                                String str5 = str;
                                String str6 = str2;
                                String string7 = sb3.toString();
                                Intrinsics.e(string7, "sb.toString()");
                                strArr[3] = string7;
                                StringBuilder sb4 = new StringBuilder();
                                ArrayList arrayList2 = this.f11652j;
                                if (arrayList2 == null) {
                                    Intrinsics.n("mDasaList");
                                    throw null;
                                }
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    e9.b bVar4 = (e9.b) it4.next();
                                    m(bVar4, sb4);
                                    ArrayList arrayList3 = this.f11652j;
                                    if (arrayList3 == null) {
                                        Intrinsics.n("mDasaList");
                                        throw null;
                                    }
                                    int iIndexOf = arrayList3.indexOf(bVar4);
                                    ArrayList arrayList4 = this.f11652j;
                                    if (arrayList4 == null) {
                                        Intrinsics.n("mDasaList");
                                        throw null;
                                    }
                                    if (iIndexOf < arrayList4.size() - 1) {
                                        sb4.append(str5);
                                    }
                                }
                                String string8 = sb4.toString();
                                Intrinsics.e(string8, "sb.toString()");
                                strArr[4] = string8;
                                StringBuilder sb5 = new StringBuilder();
                                ArrayList arrayList5 = this.f11652j;
                                if (arrayList5 == null) {
                                    Intrinsics.n("mDasaList");
                                    throw null;
                                }
                                Iterator it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    e9.b bVar5 = (e9.b) it5.next();
                                    Iterator it6 = bVar5.f12566a.iterator();
                                    while (it6.hasNext()) {
                                        e9.b antharDasa = (e9.b) it6.next();
                                        String strG11 = bVar5.f12569d.g();
                                        Intrinsics.e(strG11, "dasa.graha.nameCode");
                                        sb5.append(l(strG11));
                                        sb5.append(str6);
                                        Intrinsics.e(antharDasa, "antharDasa");
                                        m(antharDasa, sb5);
                                        ArrayList arrayList6 = antharDasa.f12566a;
                                        Iterator it7 = arrayList6.iterator();
                                        while (it7.hasNext()) {
                                            e9.b widasa = (e9.b) it7.next();
                                            sb5.append("\n- ");
                                            Intrinsics.e(widasa, "widasa");
                                            m(widasa, sb5);
                                        }
                                        if (arrayList6.indexOf(bVar5) < arrayList6.size() - 1) {
                                            sb5.append(str5);
                                        }
                                    }
                                    ArrayList arrayList7 = this.f11652j;
                                    if (arrayList7 == null) {
                                        Intrinsics.n("mDasaList");
                                        throw null;
                                    }
                                    int iIndexOf2 = arrayList7.indexOf(bVar5);
                                    if (iIndexOf2 > 0) {
                                        ArrayList arrayList8 = this.f11652j;
                                        if (arrayList8 == null) {
                                            Intrinsics.n("mDasaList");
                                            throw null;
                                        }
                                        if (iIndexOf2 < arrayList8.size() - 1) {
                                            sb5.append("************************************");
                                            sb5.append(str5);
                                        }
                                    }
                                }
                                String string9 = sb5.toString();
                                Intrinsics.e(string9, "sb.toString()");
                                strArr[5] = string9;
                                s3 s3Var5 = this.f11651f;
                                if (s3Var5 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ViewPager viewPager2 = (ViewPager) s3Var5.f14933t;
                                Typeface typeface = this.f11656u;
                                if (typeface == null) {
                                    Intrinsics.n("mTypefaceSin");
                                    throw null;
                                }
                                viewPager2.setAdapter(new h(strArr, typeface));
                                final int i20 = 0;
                                p(0);
                                s3 s3Var6 = this.f11651f;
                                if (s3Var6 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ((ImageView) s3Var6.f14930j).setOnClickListener(new View.OnClickListener(this) { // from class: l9.f

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ MoreDetailsActivity f14698e;

                                    {
                                        this.f14698e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) throws Resources.NotFoundException {
                                        int i21 = i20;
                                        MoreDetailsActivity this$0 = this.f14698e;
                                        switch (i21) {
                                            case 0:
                                                int i22 = MoreDetailsActivity.f11650w;
                                                Intrinsics.f(this$0, "this$0");
                                                s3 s3Var7 = this$0.f11651f;
                                                if (s3Var7 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ViewPager viewPager3 = (ViewPager) s3Var7.f14933t;
                                                viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
                                                return;
                                            default:
                                                int i23 = MoreDetailsActivity.f11650w;
                                                Intrinsics.f(this$0, "this$0");
                                                s3 s3Var8 = this$0.f11651f;
                                                if (s3Var8 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ((ViewPager) s3Var8.f14933t).setCurrentItem(r5.getCurrentItem() - 1);
                                                return;
                                        }
                                    }
                                });
                                s3 s3Var7 = this.f11651f;
                                if (s3Var7 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                final int i21 = 1;
                                ((ImageView) s3Var7.f14931m).setOnClickListener(new View.OnClickListener(this) { // from class: l9.f

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ MoreDetailsActivity f14698e;

                                    {
                                        this.f14698e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) throws Resources.NotFoundException {
                                        int i212 = i21;
                                        MoreDetailsActivity this$0 = this.f14698e;
                                        switch (i212) {
                                            case 0:
                                                int i22 = MoreDetailsActivity.f11650w;
                                                Intrinsics.f(this$0, "this$0");
                                                s3 s3Var72 = this$0.f11651f;
                                                if (s3Var72 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ViewPager viewPager3 = (ViewPager) s3Var72.f14933t;
                                                viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
                                                return;
                                            default:
                                                int i23 = MoreDetailsActivity.f11650w;
                                                Intrinsics.f(this$0, "this$0");
                                                s3 s3Var8 = this$0.f11651f;
                                                if (s3Var8 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ((ViewPager) s3Var8.f14933t).setCurrentItem(r5.getCurrentItem() - 1);
                                                return;
                                        }
                                    }
                                });
                                s3 s3Var8 = this.f11651f;
                                if (s3Var8 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ViewPager viewPager3 = (ViewPager) s3Var8.f14933t;
                                l9.g gVar = new l9.g(this);
                                if (viewPager3.f1735w0 == null) {
                                    viewPager3.f1735w0 = new ArrayList();
                                }
                                viewPager3.f1735w0.add(gVar);
                                s3 s3Var9 = this.f11651f;
                                if (s3Var9 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ImageView imageView3 = (ImageView) s3Var9.f14931m;
                                Intrinsics.e(imageView3, "binding.prev");
                                com.bumptech.glide.f.l(imageView3);
                                s3 s3Var10 = this.f11651f;
                                if (s3Var10 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ImageView imageView4 = (ImageView) s3Var10.f14930j;
                                Intrinsics.e(imageView4, "binding.next");
                                com.bumptech.glide.f.x(imageView4);
                                s3 s3Var11 = this.f11651f;
                                if (s3Var11 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout2 = (LinearLayout) s3Var11.f14928e;
                                Intrinsics.e(linearLayout2, "binding.bannerAd");
                                if (!g5.a.f13038j || n7.c.u() || !n7.c.n(this)) {
                                    com.bumptech.glide.f.l(linearLayout2);
                                    return;
                                }
                                i iVar = new i(this);
                                String str7 = g5.a.f13041m;
                                if (str7.length() == 0) {
                                    return;
                                }
                                iVar.setAdUnitId(str7);
                                linearLayout2.removeAllViews();
                                linearLayout2.addView(iVar);
                                linearLayout2.post(new m(this, linearLayout2, iVar, 3));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.f(item, "item");
        if (item.getItemId() == 16908332) {
            getOnBackPressedDispatcher().b();
        }
        return super.onOptionsItemSelected(item);
    }

    public final void p(int i10) {
        int i11;
        String strG;
        switch (i10) {
            case 0:
                n7.c cVar = MyApplication.f11640b;
                i11 = 2131886839;
                strG = getString(i11);
                break;
            case QueueFuseable.SYNC /* 1 */:
                n7.c cVar2 = MyApplication.f11640b;
                i11 = 2131886990;
                strG = getString(i11);
                break;
            case 2:
            case g.RESOLUTION_REQUIRED /* 6 */:
                n7.c cVar3 = MyApplication.f11640b;
                i11 = 2131886863;
                strG = getString(i11);
                break;
            case 3:
                n7.c cVar4 = MyApplication.f11640b;
                strG = a0.h.G(getString(2131886816), " ", getString(2131886355));
                break;
            case 4:
                n7.c cVar5 = MyApplication.f11640b;
                i11 = 2131886582;
                strG = getString(i11);
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                n7.c cVar6 = MyApplication.f11640b;
                i11 = 2131886352;
                strG = getString(i11);
                break;
            default:
                strG = null;
                break;
        }
        s3 s3Var = this.f11651f;
        if (s3Var != null) {
            ((TextView) s3Var.f14929f).setText(strG);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Intrinsics.f(intent, "intent");
        super.startActivity(intent);
        overridePendingTransition(2130772024, 2130772022);
    }
}