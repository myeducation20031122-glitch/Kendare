package o5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.n3;
import g.u0;
import g.v0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static String f15793a;

    /* renamed from: b, reason: collision with root package name */
    public static final z1.o f15794b = new z1.o(25);

    /* JADX WARN: Removed duplicated region for block: B:185:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0692 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(x.e eVar, v.d dVar, ArrayList arrayList, int i10) {
        int i11;
        x.b[] bVarArr;
        int i12;
        int i13;
        boolean z7;
        float f10;
        x.d dVar2;
        boolean z10;
        boolean z11;
        x.c[] cVarArr;
        int i14;
        x.b[] bVarArr2;
        x.d dVar3;
        int i15;
        int i16;
        int i17;
        x.d dVar4;
        int i18;
        int i19;
        x.d dVar5;
        v.i iVar;
        v.i iVar2;
        x.c cVar;
        x.c cVar2;
        x.c cVar3;
        v.i iVar3;
        x.d dVar6;
        x.d dVar7;
        x.d dVar8;
        x.d dVar9;
        v.i iVar4;
        int size;
        x.b bVar;
        ArrayList arrayList2;
        int i20;
        x.d dVar10;
        v.b bVar2;
        x.d dVar11;
        x.b bVar3;
        x.d dVar12;
        x.d dVar13;
        int i21;
        int i22;
        x.d dVar14;
        x.e eVar2 = eVar;
        ArrayList arrayList3 = arrayList;
        int i23 = 2;
        if (i10 == 0) {
            i11 = eVar2.f18816z0;
            bVarArr = eVar2.C0;
            i12 = 0;
        } else {
            i11 = eVar2.A0;
            bVarArr = eVar2.B0;
            i12 = 2;
        }
        int i24 = 0;
        while (i24 < i11) {
            x.b bVar4 = bVarArr[i24];
            boolean z12 = bVar4.f18756q;
            x.d dVar15 = bVar4.f18740a;
            int i25 = 3;
            int i26 = 1;
            int i27 = 8;
            if (z12) {
                i13 = i24;
            } else {
                int i28 = bVar4.f18751l;
                int i29 = i28 * 2;
                x.d dVar16 = dVar15;
                x.d dVar17 = dVar16;
                boolean z13 = false;
                while (!z13) {
                    bVar4.f18748i += i26;
                    dVar16.f18791m0[i28] = null;
                    dVar16.f18789l0[i28] = null;
                    int i30 = dVar16.f18779g0;
                    x.c[] cVarArr2 = dVar16.Q;
                    if (i30 != i27) {
                        dVar16.k(i28);
                        cVarArr2[i29].e();
                        int i31 = i29 + 1;
                        cVarArr2[i31].e();
                        cVarArr2[i29].e();
                        cVarArr2[i31].e();
                        if (bVar4.f18741b == null) {
                            bVar4.f18741b = dVar16;
                        }
                        bVar4.f18743d = dVar16;
                        int i32 = dVar16.f18797p0[i28];
                        if (i32 == i25) {
                            int i33 = dVar16.f18801t[i28];
                            if (i33 == 0 || i33 == i25 || i33 == i23) {
                                bVar4.f18749j++;
                                float f11 = dVar16.f18787k0[i28];
                                if (f11 > 0.0f) {
                                    bVar4.f18750k += f11;
                                }
                                i22 = i24;
                                if (dVar16.f18779g0 != 8 && i32 == 3 && (i33 == 0 || i33 == 3)) {
                                    if (f11 < 0.0f) {
                                        bVar4.f18753n = true;
                                    } else {
                                        bVar4.f18754o = true;
                                    }
                                    if (bVar4.f18747h == null) {
                                        bVar4.f18747h = new ArrayList();
                                    }
                                    bVar4.f18747h.add(dVar16);
                                }
                                if (bVar4.f18745f == null) {
                                    bVar4.f18745f = dVar16;
                                }
                                x.d dVar18 = bVar4.f18746g;
                                if (dVar18 != null) {
                                    dVar18.f18789l0[i28] = dVar16;
                                }
                                bVar4.f18746g = dVar16;
                            } else {
                                i22 = i24;
                            }
                            if (i28 == 0) {
                                if (dVar16.f18799r == 0 && dVar16.f18802u == 0) {
                                    int i34 = dVar16.f18803v;
                                }
                            } else if (dVar16.f18800s == 0 && dVar16.f18805x == 0) {
                                int i35 = dVar16.f18806y;
                            }
                        } else {
                            i22 = i24;
                        }
                    }
                    x.d dVar19 = dVar17;
                    if (dVar19 != dVar16) {
                        dVar19.f18791m0[i28] = dVar16;
                    }
                    x.c cVar4 = cVarArr2[i29 + 1].f18762f;
                    if (cVar4 != null) {
                        dVar14 = cVar4.f18760d;
                        x.c cVar5 = dVar14.Q[i29].f18762f;
                        if (cVar5 == null || cVar5.f18760d != dVar16) {
                            dVar14 = null;
                        }
                    }
                    if (dVar14 == null) {
                        dVar14 = dVar16;
                        z13 = true;
                    }
                    dVar17 = dVar16;
                    i24 = i22;
                    i26 = 1;
                    i27 = 8;
                    i23 = 2;
                    dVar16 = dVar14;
                    i25 = 3;
                }
                i13 = i24;
                x.d dVar20 = bVar4.f18741b;
                if (dVar20 != null) {
                    dVar20.Q[i29].e();
                }
                x.d dVar21 = bVar4.f18743d;
                if (dVar21 != null) {
                    dVar21.Q[i29 + 1].e();
                }
                bVar4.f18742c = dVar16;
                if (i28 == 0 && bVar4.f18752m) {
                    bVar4.f18744e = dVar16;
                } else {
                    bVar4.f18744e = dVar15;
                }
                bVar4.f18755p = bVar4.f18754o && bVar4.f18753n;
            }
            bVar4.f18756q = true;
            if (arrayList3 == null || arrayList3.contains(dVar15)) {
                x.d dVar22 = bVar4.f18742c;
                x.d dVar23 = bVar4.f18741b;
                x.d dVar24 = bVar4.f18743d;
                x.d dVar25 = bVar4.f18744e;
                float f12 = bVar4.f18750k;
                boolean z14 = eVar2.f18797p0[i10] == 2;
                if (i10 == 0) {
                    int i36 = dVar25.f18783i0;
                    boolean z15 = i36 == 0;
                    z11 = i36 == 1;
                    z7 = i36 == 2;
                    f10 = f12;
                    dVar2 = dVar15;
                    z10 = z15;
                } else {
                    int i37 = dVar25.f18785j0;
                    boolean z16 = i37 == 0;
                    boolean z17 = i37 == 1;
                    z7 = i37 == 2;
                    f10 = f12;
                    dVar2 = dVar15;
                    z10 = z16;
                    z11 = z17;
                }
                boolean z18 = false;
                while (true) {
                    cVarArr = eVar2.Q;
                    if (z18) {
                        break;
                    }
                    x.c cVar6 = dVar2.Q[i12];
                    int i38 = z7 ? 1 : 4;
                    int iE = cVar6.e();
                    boolean z19 = z18;
                    int[] iArr = dVar2.f18797p0;
                    int i39 = i11;
                    x.b[] bVarArr3 = bVarArr;
                    boolean z20 = iArr[i10] == 3 && dVar2.f18801t[i10] == 0;
                    x.c cVar7 = cVar6.f18762f;
                    if (cVar7 != null && dVar2 != dVar15) {
                        iE = cVar7.e() + iE;
                    }
                    int i40 = iE;
                    if (!z7 || dVar2 == dVar15 || dVar2 == dVar23) {
                        dVar11 = dVar25;
                    } else {
                        dVar11 = dVar25;
                        i38 = 8;
                    }
                    x.c cVar8 = cVar6.f18762f;
                    if (cVar8 != null) {
                        if (dVar2 == dVar23) {
                            dVar12 = dVar15;
                            bVar3 = bVar4;
                            dVar.f(cVar6.f18765i, cVar8.f18765i, i40, 6);
                        } else {
                            bVar3 = bVar4;
                            dVar12 = dVar15;
                            dVar.f(cVar6.f18765i, cVar8.f18765i, i40, 8);
                        }
                        if (z20 && !z7) {
                            i38 = 5;
                        }
                        dVar.e(cVar6.f18765i, cVar6.f18762f.f18765i, i40, (dVar2 == dVar23 && z7 && dVar2.S[i10]) ? 5 : i38);
                    } else {
                        bVar3 = bVar4;
                        dVar12 = dVar15;
                    }
                    x.c[] cVarArr3 = dVar2.Q;
                    if (z14) {
                        if (dVar2.f18779g0 == 8 || iArr[i10] != 3) {
                            i21 = 0;
                        } else {
                            i21 = 0;
                            dVar.f(cVarArr3[i12 + 1].f18765i, cVarArr3[i12].f18765i, 0, 5);
                        }
                        dVar.f(cVarArr3[i12].f18765i, cVarArr[i12].f18765i, i21, 8);
                    }
                    x.c cVar9 = cVarArr3[i12 + 1].f18762f;
                    if (cVar9 != null) {
                        dVar13 = cVar9.f18760d;
                        x.c cVar10 = dVar13.Q[i12].f18762f;
                        if (cVar10 == null || cVar10.f18760d != dVar2) {
                            dVar13 = null;
                        }
                    }
                    if (dVar13 != null) {
                        dVar2 = dVar13;
                        z18 = z19;
                    } else {
                        z18 = true;
                    }
                    dVar25 = dVar11;
                    i11 = i39;
                    bVarArr = bVarArr3;
                    dVar15 = dVar12;
                    bVar4 = bVar3;
                }
                x.b bVar5 = bVar4;
                x.d dVar26 = dVar25;
                x.d dVar27 = dVar15;
                i14 = i11;
                bVarArr2 = bVarArr;
                if (dVar24 != null) {
                    int i41 = i12 + 1;
                    if (dVar22.Q[i41].f18762f != null) {
                        x.c cVar11 = dVar24.Q[i41];
                        if (dVar24.f18797p0[i10] == 3 && dVar24.f18801t[i10] == 0 && !z7) {
                            x.c cVar12 = cVar11.f18762f;
                            if (cVar12.f18760d == eVar2) {
                                dVar.e(cVar11.f18765i, cVar12.f18765i, -cVar11.e(), 5);
                            }
                            dVar.g(cVar11.f18765i, dVar22.Q[i41].f18762f.f18765i, -cVar11.e(), 6);
                        } else {
                            if (z7) {
                                x.c cVar13 = cVar11.f18762f;
                                if (cVar13.f18760d == eVar2) {
                                    dVar.e(cVar11.f18765i, cVar13.f18765i, -cVar11.e(), 4);
                                }
                            }
                            dVar.g(cVar11.f18765i, dVar22.Q[i41].f18762f.f18765i, -cVar11.e(), 6);
                        }
                    }
                    if (z14) {
                        int i42 = i12 + 1;
                        v.i iVar5 = cVarArr[i42].f18765i;
                        x.c cVar14 = dVar22.Q[i42];
                        dVar.f(iVar5, cVar14.f18765i, cVar14.e(), 8);
                    }
                    x.b bVar6 = bVar5;
                    ArrayList arrayList4 = bVar6.f18747h;
                    if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                        float f13 = (!bVar6.f18753n || bVar6.f18755p) ? f10 : bVar6.f18749j;
                        x.d dVar28 = null;
                        float f14 = 0.0f;
                        int i43 = 0;
                        while (i43 < size) {
                            x.d dVar29 = (x.d) arrayList4.get(i43);
                            float f15 = dVar29.f18787k0[i10];
                            x.c[] cVarArr4 = dVar29.Q;
                            if (f15 < 0.0f) {
                                if (bVar6.f18755p) {
                                    dVar.e(cVarArr4[i12 + 1].f18765i, cVarArr4[i12].f18765i, 0, 4);
                                    bVar = bVar6;
                                    arrayList2 = arrayList4;
                                    i20 = size;
                                    i43++;
                                    bVar6 = bVar;
                                    size = i20;
                                    arrayList4 = arrayList2;
                                } else {
                                    f15 = 1.0f;
                                }
                            }
                            if (f15 == 0.0f) {
                                dVar.e(cVarArr4[i12 + 1].f18765i, cVarArr4[i12].f18765i, 0, 8);
                                bVar = bVar6;
                                arrayList2 = arrayList4;
                                i20 = size;
                                i43++;
                                bVar6 = bVar;
                                size = i20;
                                arrayList4 = arrayList2;
                            } else {
                                if (dVar28 != null) {
                                    x.c[] cVarArr5 = dVar28.Q;
                                    v.i iVar6 = cVarArr5[i12].f18765i;
                                    int i44 = i12 + 1;
                                    v.i iVar7 = cVarArr5[i44].f18765i;
                                    arrayList2 = arrayList4;
                                    v.i iVar8 = cVarArr4[i12].f18765i;
                                    v.i iVar9 = cVarArr4[i44].f18765i;
                                    i20 = size;
                                    v.c cVarL = dVar.l();
                                    dVar10 = dVar29;
                                    cVarL.f18322b = 0.0f;
                                    bVar = bVar6;
                                    float f16 = -1.0f;
                                    if (f13 == 0.0f || f14 == f15) {
                                        cVarL.f18324d.c(iVar6, 1.0f);
                                        cVarL.f18324d.c(iVar7, -1.0f);
                                        cVarL.f18324d.c(iVar9, 1.0f);
                                        bVar2 = cVarL.f18324d;
                                    } else {
                                        if (f14 == 0.0f) {
                                            cVarL.f18324d.c(iVar6, 1.0f);
                                            cVarL.f18324d.c(iVar7, -1.0f);
                                        } else if (f15 == 0.0f) {
                                            cVarL.f18324d.c(iVar8, 1.0f);
                                            cVarL.f18324d.c(iVar9, -1.0f);
                                        } else {
                                            float f17 = (f14 / f13) / (f15 / f13);
                                            cVarL.f18324d.c(iVar6, 1.0f);
                                            cVarL.f18324d.c(iVar7, -1.0f);
                                            cVarL.f18324d.c(iVar9, f17);
                                            bVar2 = cVarL.f18324d;
                                            f16 = -f17;
                                        }
                                        dVar.c(cVarL);
                                    }
                                    bVar2.c(iVar8, f16);
                                    dVar.c(cVarL);
                                } else {
                                    bVar = bVar6;
                                    arrayList2 = arrayList4;
                                    i20 = size;
                                    dVar10 = dVar29;
                                }
                                f14 = f15;
                                dVar28 = dVar10;
                                i43++;
                                bVar6 = bVar;
                                size = i20;
                                arrayList4 = arrayList2;
                            }
                        }
                    }
                    x.b bVar7 = bVar6;
                    if (dVar23 == null || !(dVar23 == dVar24 || z7)) {
                        dVar3 = dVar24;
                        i15 = i13;
                        if (!z10 || dVar23 == null) {
                            int i45 = 8;
                            if (z11 && dVar23 != null) {
                                int i46 = bVar7.f18749j;
                                boolean z21 = i46 > 0 && bVar7.f18748i == i46;
                                x.d dVar30 = dVar23;
                                x.d dVar31 = dVar30;
                                while (dVar31 != null) {
                                    x.d dVar32 = dVar31.f18791m0[i10];
                                    while (dVar32 != null && dVar32.f18779g0 == i45) {
                                        dVar32 = dVar32.f18791m0[i10];
                                    }
                                    if (dVar31 == dVar23 || dVar31 == dVar3 || dVar32 == null) {
                                        dVar4 = dVar30;
                                        i18 = i15;
                                        i19 = 8;
                                    } else {
                                        x.d dVar33 = dVar32 == dVar3 ? null : dVar32;
                                        x.c[] cVarArr6 = dVar31.Q;
                                        x.c cVar15 = cVarArr6[i12];
                                        v.i iVar10 = cVar15.f18765i;
                                        int i47 = i12 + 1;
                                        v.i iVar11 = dVar30.Q[i47].f18765i;
                                        int iE2 = cVar15.e();
                                        int iE3 = cVarArr6[i47].e();
                                        if (dVar33 != null) {
                                            cVar = dVar33.Q[i12];
                                            iVar = cVar.f18765i;
                                            dVar5 = dVar33;
                                            x.c cVar16 = cVar.f18762f;
                                            iVar2 = cVar16 != null ? cVar16.f18765i : null;
                                        } else {
                                            dVar5 = dVar33;
                                            x.c cVar17 = dVar3.Q[i12];
                                            iVar = cVar17 != null ? cVar17.f18765i : null;
                                            iVar2 = cVarArr6[i47].f18765i;
                                            cVar = cVar17;
                                        }
                                        int iE4 = cVar != null ? cVar.e() + iE3 : iE3;
                                        int iE5 = dVar30.Q[i47].e() + iE2;
                                        int i48 = z21 ? 8 : 4;
                                        if (iVar10 == null || iVar11 == null || iVar == null || iVar2 == null) {
                                            dVar4 = dVar30;
                                            i18 = i15;
                                            i19 = 8;
                                        } else {
                                            dVar4 = dVar30;
                                            int i49 = iE4;
                                            i18 = i15;
                                            i19 = 8;
                                            dVar.b(iVar10, iVar11, iE5, 0.5f, iVar, iVar2, i49, i48);
                                        }
                                        dVar32 = dVar5;
                                    }
                                    dVar30 = dVar31.f18779g0 != i19 ? dVar31 : dVar4;
                                    dVar31 = dVar32;
                                    i15 = i18;
                                    i45 = 8;
                                }
                                i16 = i15;
                                x.c cVar18 = dVar23.Q[i12];
                                x.c cVar19 = dVar27.Q[i12].f18762f;
                                int i50 = i12 + 1;
                                x.c cVar20 = dVar3.Q[i50];
                                x.c cVar21 = dVar22.Q[i50].f18762f;
                                if (cVar19 == null) {
                                    i17 = 5;
                                    if (cVar21 != null && dVar23 != dVar3) {
                                        dVar.e(cVar20.f18765i, cVar21.f18765i, -cVar20.e(), i17);
                                    }
                                } else {
                                    if (dVar23 != dVar3) {
                                        dVar.e(cVar18.f18765i, cVar19.f18765i, cVar18.e(), 5);
                                    } else {
                                        if (cVar21 != null) {
                                            i17 = 5;
                                            dVar.b(cVar18.f18765i, cVar19.f18765i, cVar18.e(), 0.5f, cVar20.f18765i, cVar21.f18765i, cVar20.e(), 5);
                                        }
                                        if (cVar21 != null) {
                                            dVar.e(cVar20.f18765i, cVar21.f18765i, -cVar20.e(), i17);
                                        }
                                    }
                                    i17 = 5;
                                    if (cVar21 != null) {
                                    }
                                }
                            }
                            if ((z10 || z11) && dVar23 != null && dVar23 != dVar3) {
                                x.c[] cVarArr7 = dVar23.Q;
                                x.c cVar22 = cVarArr7[i12];
                                dVar9 = dVar3 == null ? dVar23 : dVar3;
                                int i51 = i12 + 1;
                                x.c[] cVarArr8 = dVar9.Q;
                                x.c cVar23 = cVarArr8[i51];
                                x.c cVar24 = cVar22.f18762f;
                                iVar4 = cVar24 != null ? cVar24.f18765i : null;
                                x.c cVar25 = cVar23.f18762f;
                                v.i iVar12 = cVar25 != null ? cVar25.f18765i : null;
                                if (dVar22 != dVar9) {
                                    x.c cVar26 = dVar22.Q[i51].f18762f;
                                    iVar12 = cVar26 != null ? cVar26.f18765i : null;
                                }
                                if (dVar23 == dVar9) {
                                    cVar23 = cVarArr7[i51];
                                }
                                if (iVar4 != null && iVar12 != null) {
                                    dVar.b(cVar22.f18765i, iVar4, cVar22.e(), 0.5f, iVar12, cVar23.f18765i, cVarArr8[i51].e(), 5);
                                }
                            }
                        } else {
                            int i52 = bVar7.f18749j;
                            boolean z22 = i52 > 0 && bVar7.f18748i == i52;
                            x.d dVar34 = dVar23;
                            for (x.d dVar35 = dVar34; dVar35 != null; dVar35 = dVar7) {
                                x.d dVar36 = dVar35.f18791m0[i10];
                                while (dVar36 != null && dVar36.f18779g0 == 8) {
                                    dVar36 = dVar36.f18791m0[i10];
                                }
                                if (dVar36 != null || dVar35 == dVar3) {
                                    x.c[] cVarArr9 = dVar35.Q;
                                    x.c cVar27 = cVarArr9[i12];
                                    v.i iVar13 = cVar27.f18765i;
                                    x.c cVar28 = cVar27.f18762f;
                                    v.i iVar14 = cVar28 != null ? cVar28.f18765i : null;
                                    if (dVar34 != dVar35) {
                                        cVar2 = dVar34.Q[i12 + 1];
                                    } else {
                                        if (dVar35 == dVar23) {
                                            cVar2 = dVar27.Q[i12].f18762f;
                                            if (cVar2 == null) {
                                                iVar14 = null;
                                            }
                                        }
                                        int iE6 = cVar27.e();
                                        int i53 = i12 + 1;
                                        int iE7 = cVarArr9[i53].e();
                                        if (dVar36 == null) {
                                            cVar3 = dVar36.Q[i12];
                                        } else {
                                            cVar3 = dVar22.Q[i53].f18762f;
                                            if (cVar3 == null) {
                                                iVar3 = null;
                                            }
                                            v.i iVar15 = cVarArr9[i53].f18765i;
                                            if (cVar3 != null) {
                                                iE7 = cVar3.e() + iE7;
                                            }
                                            int iE8 = dVar34.Q[i53].e() + iE6;
                                            if (iVar13 == null || iVar14 == null || iVar3 == null || iVar15 == null) {
                                                dVar7 = dVar36;
                                                dVar6 = dVar34;
                                                dVar8 = dVar35;
                                            } else {
                                                if (dVar35 == dVar23) {
                                                    iE8 = dVar23.Q[i12].e();
                                                }
                                                if (dVar35 == dVar3) {
                                                    iE7 = dVar3.Q[i53].e();
                                                }
                                                v.i iVar16 = iVar14;
                                                int i54 = iE8;
                                                v.i iVar17 = iVar3;
                                                dVar6 = dVar34;
                                                int i55 = iE7;
                                                dVar7 = dVar36;
                                                dVar8 = dVar35;
                                                dVar.b(iVar13, iVar16, i54, 0.5f, iVar17, iVar15, i55, z22 ? 8 : 5);
                                            }
                                        }
                                        iVar3 = cVar3.f18765i;
                                        v.i iVar152 = cVarArr9[i53].f18765i;
                                        if (cVar3 != null) {
                                        }
                                        int iE82 = dVar34.Q[i53].e() + iE6;
                                        if (iVar13 == null) {
                                            dVar7 = dVar36;
                                            dVar6 = dVar34;
                                            dVar8 = dVar35;
                                        }
                                    }
                                    iVar14 = cVar2.f18765i;
                                    int iE62 = cVar27.e();
                                    int i532 = i12 + 1;
                                    int iE72 = cVarArr9[i532].e();
                                    if (dVar36 == null) {
                                    }
                                    iVar3 = cVar3.f18765i;
                                    v.i iVar1522 = cVarArr9[i532].f18765i;
                                    if (cVar3 != null) {
                                    }
                                    int iE822 = dVar34.Q[i532].e() + iE62;
                                    if (iVar13 == null) {
                                    }
                                }
                                dVar34 = dVar8.f18779g0 != 8 ? dVar8 : dVar6;
                            }
                        }
                    } else {
                        x.c cVar29 = dVar27.Q[i12];
                        int i56 = i12 + 1;
                        x.c cVar30 = dVar22.Q[i56];
                        x.c cVar31 = cVar29.f18762f;
                        v.i iVar18 = cVar31 != null ? cVar31.f18765i : null;
                        x.c cVar32 = cVar30.f18762f;
                        v.i iVar19 = cVar32 != null ? cVar32.f18765i : null;
                        x.c cVar33 = dVar23.Q[i12];
                        if (dVar24 != null) {
                            cVar30 = dVar24.Q[i56];
                        }
                        if (iVar18 == null || iVar19 == null) {
                            dVar3 = dVar24;
                            i15 = i13;
                        } else {
                            dVar3 = dVar24;
                            i15 = i13;
                            dVar.b(cVar33.f18765i, iVar18, cVar33.e(), i10 == 0 ? dVar26.f18773d0 : dVar26.f18775e0, iVar19, cVar30.f18765i, cVar30.e(), 7);
                        }
                    }
                    i16 = i15;
                    if (z10) {
                        x.c[] cVarArr72 = dVar23.Q;
                        x.c cVar222 = cVarArr72[i12];
                        if (dVar3 == null) {
                        }
                        int i512 = i12 + 1;
                        x.c[] cVarArr82 = dVar9.Q;
                        x.c cVar232 = cVarArr82[i512];
                        x.c cVar242 = cVar222.f18762f;
                        if (cVar242 != null) {
                        }
                        x.c cVar252 = cVar232.f18762f;
                        if (cVar252 != null) {
                        }
                        if (dVar22 != dVar9) {
                        }
                        if (dVar23 == dVar9) {
                        }
                        if (iVar4 != null) {
                        }
                    } else {
                        x.c[] cVarArr722 = dVar23.Q;
                        x.c cVar2222 = cVarArr722[i12];
                        if (dVar3 == null) {
                        }
                        int i5122 = i12 + 1;
                        x.c[] cVarArr822 = dVar9.Q;
                        x.c cVar2322 = cVarArr822[i5122];
                        x.c cVar2422 = cVar2222.f18762f;
                        if (cVar2422 != null) {
                        }
                        x.c cVar2522 = cVar2322.f18762f;
                        if (cVar2522 != null) {
                        }
                        if (dVar22 != dVar9) {
                        }
                        if (dVar23 == dVar9) {
                        }
                        if (iVar4 != null) {
                        }
                    }
                }
            } else {
                i14 = i11;
                bVarArr2 = bVarArr;
                i16 = i13;
            }
            i24 = i16 + 1;
            i23 = 2;
            eVar2 = eVar;
            arrayList3 = arrayList;
            i11 = i14;
            bVarArr = bVarArr2;
        }
    }

    public static boolean b(h0.g[] gVarArr, h0.g[] gVarArr2) {
        if (gVarArr == null || gVarArr2 == null || gVarArr.length != gVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            h0.g gVar = gVarArr[i10];
            char c10 = gVar.f13151a;
            h0.g gVar2 = gVarArr2[i10];
            if (c10 != gVar2.f13151a || gVar.f13152b.length != gVar2.f13152b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static com.bumptech.glide.l d(com.bumptech.glide.b bVar, List list) {
        q2.p fVar;
        q2.p aVar;
        t2.d dVar;
        int i10;
        String str;
        t2.d dVar2 = bVar.f2230b;
        com.bumptech.glide.h hVar = bVar.f2232f;
        Context applicationContext = hVar.getApplicationContext();
        z1.f fVar2 = hVar.f2273h;
        com.bumptech.glide.l lVar = new com.bumptech.glide.l();
        z2.l lVar2 = new z2.l();
        f1.d dVar3 = lVar.f2287g;
        synchronized (dVar3) {
            dVar3.f12657a.add(lVar2);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            lVar.k(new z2.t());
        }
        Resources resources = applicationContext.getResources();
        List listF = lVar.f();
        t2.h hVar2 = bVar.f2233j;
        b3.a aVar2 = new b3.a(applicationContext, listF, dVar2, hVar2);
        z2.h0 h0Var = new z2.h0(dVar2, new z1.o(5));
        z2.p pVar = new z2.p(lVar.f(), resources.getDisplayMetrics(), dVar2, hVar2);
        int i12 = 2;
        int i13 = 0;
        if (i11 < 28 || !fVar2.f19470a.containsKey(com.bumptech.glide.c.class)) {
            fVar = new z2.f(pVar, i13);
            aVar = new z2.a(i12, pVar, hVar2);
        } else {
            aVar = new z2.g(1);
            fVar = new z2.g(0);
        }
        if (i11 >= 28) {
            i10 = i11;
            dVar = dVar2;
            lVar.d(new a3.b(new n3(27, listF, hVar2), 1), InputStream.class, Drawable.class, "Animation");
            lVar.d(new a3.b(new n3(27, listF, hVar2), 0), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            dVar = dVar2;
            i10 = i11;
        }
        a3.e eVar = new a3.e(applicationContext);
        u0 u0Var = new u0(resources, 23);
        w2.b0 b0Var = new w2.b0(resources, 1);
        w2.c0 c0Var = new w2.c0(resources, 0);
        w2.b0 b0Var2 = new w2.b0(resources, 0);
        z2.b bVar2 = new z2.b(hVar2);
        yl0 yl0Var = new yl0(6);
        w2.k kVar = new w2.k(7);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        lVar.b(ByteBuffer.class, new g8.e());
        lVar.b(InputStream.class, new v0(hVar2, 17));
        lVar.d(fVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        lVar.d(aVar, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            lVar.d(new z2.f(pVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            str = "Animation";
        }
        lVar.d(h0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        t2.d dVar4 = dVar;
        lVar.d(new z2.h0(dVar4, new w2.k()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        w2.e0 e0Var = w2.e0.f18552b;
        lVar.a(Bitmap.class, Bitmap.class, e0Var);
        lVar.d(new z2.d0(0), Bitmap.class, Bitmap.class, "Bitmap");
        lVar.c(Bitmap.class, bVar2);
        lVar.d(new z2.a(resources, fVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        lVar.d(new z2.a(resources, aVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        lVar.d(new z2.a(resources, h0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        lVar.c(BitmapDrawable.class, new n3(25, dVar4, bVar2));
        b3.j jVar = new b3.j(listF, aVar2, hVar2);
        String str3 = str;
        lVar.d(jVar, InputStream.class, b3.c.class, str3);
        lVar.d(aVar2, ByteBuffer.class, b3.c.class, str3);
        lVar.c(b3.c.class, new z1.o(6));
        lVar.a(p2.a.class, p2.a.class, e0Var);
        lVar.d(new z2.c(dVar4), p2.a.class, Bitmap.class, "Bitmap");
        lVar.d(eVar, Uri.class, Drawable.class, "legacy_append");
        lVar.d(new z2.a(1, eVar, dVar4), Uri.class, Bitmap.class, "legacy_append");
        lVar.i(new com.bumptech.glide.load.data.h(2));
        lVar.a(File.class, ByteBuffer.class, new kotlinx.coroutines.scheduling.a());
        lVar.a(File.class, InputStream.class, new w2.i(1));
        lVar.d(new z2.d0(2), File.class, File.class, "legacy_append");
        lVar.a(File.class, ParcelFileDescriptor.class, new w2.i(0));
        lVar.a(File.class, File.class, e0Var);
        lVar.i(new com.bumptech.glide.load.data.m(hVar2));
        int i14 = 1;
        if (!"robolectric".equals(str2)) {
            lVar.i(new com.bumptech.glide.load.data.h(i14));
        }
        Class cls = Integer.TYPE;
        lVar.a(cls, InputStream.class, u0Var);
        lVar.a(cls, ParcelFileDescriptor.class, c0Var);
        lVar.a(Integer.class, InputStream.class, u0Var);
        lVar.a(Integer.class, ParcelFileDescriptor.class, c0Var);
        lVar.a(Integer.class, Uri.class, b0Var);
        lVar.a(cls, AssetFileDescriptor.class, b0Var2);
        lVar.a(Integer.class, AssetFileDescriptor.class, b0Var2);
        lVar.a(cls, Uri.class, b0Var);
        lVar.a(String.class, InputStream.class, new u0(21));
        lVar.a(Uri.class, InputStream.class, new u0(21));
        lVar.a(String.class, InputStream.class, new w2.k(2));
        int i15 = 1;
        lVar.a(String.class, ParcelFileDescriptor.class, new z1.o(i15));
        lVar.a(String.class, AssetFileDescriptor.class, new w2.k(i15));
        lVar.a(Uri.class, InputStream.class, new v0(applicationContext.getAssets(), 14));
        lVar.a(Uri.class, AssetFileDescriptor.class, new p8.c(applicationContext.getAssets(), 15));
        lVar.a(Uri.class, InputStream.class, new a2.f(applicationContext, 2));
        lVar.a(Uri.class, InputStream.class, new androidx.emoji2.text.o(applicationContext));
        int i16 = i10;
        if (i16 >= 29) {
            lVar.a(Uri.class, InputStream.class, new x2.b(applicationContext, 1));
            lVar.a(Uri.class, ParcelFileDescriptor.class, new x2.b(applicationContext, 0));
        }
        lVar.a(Uri.class, InputStream.class, new v0(contentResolver, 18));
        lVar.a(Uri.class, ParcelFileDescriptor.class, new p8.c(contentResolver, 17));
        lVar.a(Uri.class, AssetFileDescriptor.class, new u0(contentResolver, 24));
        lVar.a(Uri.class, InputStream.class, new z1.o(2));
        lVar.a(URL.class, InputStream.class, new w2.k(3));
        lVar.a(Uri.class, File.class, new a2.f(applicationContext, 1));
        lVar.a(w2.l.class, InputStream.class, new u0(25));
        lVar.a(byte[].class, ByteBuffer.class, new g8.e());
        lVar.a(byte[].class, InputStream.class, new v6.e(28, (Object) null));
        lVar.a(Uri.class, Uri.class, e0Var);
        lVar.a(Drawable.class, Drawable.class, e0Var);
        lVar.d(new z2.d0(1), Drawable.class, Drawable.class, "legacy_append");
        lVar.j(Bitmap.class, BitmapDrawable.class, new w2.c0(resources, 1));
        lVar.j(Bitmap.class, byte[].class, yl0Var);
        lVar.j(Drawable.class, byte[].class, new g.e(dVar4, yl0Var, kVar, 20, 0));
        lVar.j(b3.c.class, byte[].class, kVar);
        if (i16 >= 23) {
            z2.h0 h0Var2 = new z2.h0(dVar4, new z1.o(4));
            lVar.d(h0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
            lVar.d(new z2.a(resources, h0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return lVar;
        }
        ic1.v(it.next());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0.g[] e(String str) {
        int i10;
        String strTrim;
        float[] fArrC;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char cCharAt = str.charAt(i12);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i12++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i12++;
                } else {
                    strTrim = str.substring(i13, i12).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i11) == 'z' || strTrim.charAt(i11) == 'Z') {
                            fArrC = new float[i11];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i14 = 1;
                                int i15 = 0;
                                while (i14 < length) {
                                    boolean z7 = false;
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    for (int i16 = i14; i16 < strTrim.length(); i16++) {
                                        char cCharAt2 = strTrim.charAt(i16);
                                        if (cCharAt2 == ' ') {
                                            z7 = false;
                                            z11 = true;
                                            if (z11) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i16 != i14 && !z7) {
                                                            z7 = false;
                                                            z11 = true;
                                                            z12 = true;
                                                            break;
                                                        }
                                                        z7 = false;
                                                        break;
                                                    case '.':
                                                        if (z10) {
                                                            z7 = false;
                                                            z11 = true;
                                                            z12 = true;
                                                            break;
                                                        } else {
                                                            z7 = false;
                                                            z10 = true;
                                                            break;
                                                        }
                                                    default:
                                                        z7 = false;
                                                        break;
                                                }
                                            } else {
                                                z7 = true;
                                            }
                                            if (z11) {
                                            }
                                        }
                                        if (i14 < i16) {
                                            fArr[i15] = Float.parseFloat(strTrim.substring(i14, i16));
                                            i15++;
                                        }
                                        i14 = !z12 ? i16 : i16 + 1;
                                    }
                                    if (i14 < i16) {
                                    }
                                    if (!z12) {
                                    }
                                }
                                fArrC = c(fArr, i15);
                                i11 = 0;
                            } catch (NumberFormatException e10) {
                                throw new RuntimeException(a0.h.w("error in parsing \"", strTrim, "\""), e10);
                            }
                        }
                        arrayList.add(new h0.g(strTrim.charAt(i11), fArrC));
                    }
                    i13 = i12;
                    i12++;
                    i11 = 0;
                }
            }
            strTrim = str.substring(i13, i12).trim();
            if (!strTrim.isEmpty()) {
            }
            i13 = i12;
            i12++;
            i11 = 0;
        }
        if (i12 - i13 != 1 || i13 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new h0.g(str.charAt(i13), new float[0]));
        }
        return (h0.g[]) arrayList.toArray(new h0.g[i10]);
    }

    public static Path f(String str) {
        Path path = new Path();
        try {
            h0.g.b(e(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static h0.g[] g(h0.g[] gVarArr) {
        h0.g[] gVarArr2 = new h0.g[gVarArr.length];
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            gVarArr2[i10] = new h0.g(gVarArr[i10]);
        }
        return gVarArr2;
    }

    public static androidx.emoji2.text.a0 h(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j10 = length - 22;
        if (j10 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65558;
        long j12 = j11 >= 0 ? j11 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j10);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                androidx.emoji2.text.a0 a0Var = new androidx.emoji2.text.a0();
                a0Var.f840b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                a0Var.f839a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return a0Var;
            }
            j10--;
        } while (j10 >= j12);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m0.f i(TextView textView) {
        int iA;
        int iD;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new m0.f(u0.o.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (i10 >= 23) {
            iA = 1;
            iD = 1;
        } else {
            iA = 0;
            iD = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i10 >= 23) {
            iA = u0.m.a(textView);
            iD = u0.m.d(textView);
        }
        if (!(textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (i10 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z7 = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case y4.g.INVALID_ACCOUNT /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                        break;
                    default:
                        if (z7) {
                        }
                        break;
                    case y4.g.NETWORK_ERROR /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(u0.o.b(u0.n.a(textView.getTextLocale()))[0].codePointAt(0));
                if (directionality == 1 || directionality == 2) {
                }
            }
        }
        return new m0.f(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static String j(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static void k(TextView textView, int i10) {
        g5.a.d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            u0.o.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l(TextView textView, int i10) {
        g5.a.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void m(TextView textView, int i10) {
        g5.a.d(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public static void n(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static ActionMode.Callback o(ActionMode.Callback callback) {
        return (!(callback instanceof u0.q) || Build.VERSION.SDK_INT < 26) ? callback : ((u0.q) callback).f18133a;
    }

    public static ActionMode.Callback p(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof u0.q) || callback == null) ? callback : new u0.q(callback, textView);
    }

    public static synchronized String q(Context context) {
        String str;
        try {
            if (f15793a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || r()) {
                    string = "emulator";
                }
                int i10 = 0;
                while (true) {
                    str = "";
                    if (i10 >= 3) {
                        break;
                    }
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                        i10++;
                    }
                }
                f15793a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15793a;
    }

    public static boolean r() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }
}