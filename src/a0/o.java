package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f160d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f161e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f162f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f163a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f164b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f165c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f161e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f162f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.P) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.P.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z7) {
        int i10;
        String str;
        String str2;
        SparseIntArray sparseIntArray;
        String string;
        int i11;
        String str3;
        int dimensionPixelOffset;
        int i12;
        float dimension;
        int i13;
        int i14;
        String string2;
        float f10;
        int i15;
        int i16;
        boolean z10;
        int i17;
        int i18;
        int integer;
        StringBuilder sb;
        int i19;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? s.f169c : s.f167a);
        int[] iArr = f160d;
        SparseIntArray sparseIntArray2 = f161e;
        String[] strArr = w.a.f18518a;
        m mVar = jVar.f85b;
        n nVar = jVar.f88e;
        l lVar = jVar.f86c;
        k kVar = jVar.f87d;
        String str4 = "Unknown attribute 0x";
        if (z7) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            i iVar = new i();
            iVar.f72a = new int[10];
            iVar.f73b = new int[10];
            iVar.f74c = 0;
            iVar.f75d = new int[10];
            iVar.f76e = new float[10];
            iVar.f77f = 0;
            iVar.f78g = new int[5];
            iVar.f79h = new String[5];
            iVar.f80i = 0;
            iVar.f81j = new int[4];
            iVar.f82k = new boolean[4];
            iVar.f83l = 0;
            lVar.getClass();
            kVar.getClass();
            mVar.getClass();
            nVar.getClass();
            int i20 = 0;
            while (i20 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i20);
                int i21 = indexCount;
                switch (f162f.get(index)) {
                    case 2:
                        str3 = str4;
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case y4.g.DEVELOPER_ERROR /* 10 */:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb = new StringBuilder(str4);
                        str3 = str4;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case y4.g.INVALID_ACCOUNT /* 5 */:
                        str3 = str4;
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.C);
                        i12 = 6;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.NETWORK_ERROR /* 7 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.D);
                        i12 = 7;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 8:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.J);
                        i12 = 8;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 11:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.P);
                        i12 = 11;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 12:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Q);
                        i12 = 12;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.ERROR /* 13 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.M);
                        i12 = 13;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.INTERRUPTED /* 14 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.O);
                        i12 = 14;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.TIMEOUT /* 15 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.R);
                        i12 = 15;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.CANCELED /* 16 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.N);
                        i12 = 16;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.API_NOT_CONNECTED /* 17 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f97d);
                        i12 = 17;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 18:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f99e);
                        i12 = 18;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.REMOTE_EXCEPTION /* 19 */:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f101f);
                        i13 = 19;
                        iVar.a(i13, dimension);
                        break;
                    case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f128w);
                        i13 = 20;
                        iVar.a(i13, dimension);
                        break;
                    case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f95c);
                        i12 = 21;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                        str3 = str4;
                        dimensionPixelOffset = iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.f142a)];
                        i12 = 22;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 23:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f93b);
                        i12 = 23;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 24:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.F);
                        i12 = 24;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 27:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.E);
                        i12 = 27;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 28:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.G);
                        i12 = 28;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 31:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.K);
                        i12 = 31;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 34:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.H);
                        i12 = 34;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 37:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f129x);
                        i13 = 37;
                        iVar.a(i13, dimension);
                        break;
                    case 38:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f84a);
                        jVar.f84a = dimensionPixelOffset;
                        i12 = 38;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 39:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.U);
                        i13 = 39;
                        iVar.a(i13, dimension);
                        break;
                    case 40:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.T);
                        i13 = 40;
                        iVar.a(i13, dimension);
                        break;
                    case 41:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.V);
                        i12 = 41;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 42:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.W);
                        i12 = 42;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 43:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f144c);
                        i13 = 43;
                        iVar.a(i13, dimension);
                        break;
                    case 44:
                        str3 = str4;
                        iVar.d(44, true);
                        iVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, nVar.f159m));
                        break;
                    case 45:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, nVar.f148b);
                        i13 = 45;
                        iVar.a(i13, dimension);
                        break;
                    case 46:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, nVar.f149c);
                        i13 = 46;
                        iVar.a(i13, dimension);
                        break;
                    case 47:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, nVar.f150d);
                        i13 = 47;
                        iVar.a(i13, dimension);
                        break;
                    case 48:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, nVar.f151e);
                        i13 = 48;
                        iVar.a(i13, dimension);
                        break;
                    case 49:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, nVar.f152f);
                        i13 = 49;
                        iVar.a(i13, dimension);
                        break;
                    case 50:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, nVar.f153g);
                        i13 = 50;
                        iVar.a(i13, dimension);
                        break;
                    case 51:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, nVar.f155i);
                        i13 = 51;
                        iVar.a(i13, dimension);
                        break;
                    case 52:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, nVar.f156j);
                        i13 = 52;
                        iVar.a(i13, dimension);
                        break;
                    case 53:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, nVar.f157k);
                        i13 = 53;
                        iVar.a(i13, dimension);
                        break;
                    case 54:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.X);
                        i12 = 54;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 55:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.Y);
                        i12 = 55;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 56:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Z);
                        i12 = 56;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 57:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f92a0);
                        i12 = 57;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 58:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f94b0);
                        i12 = 58;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 59:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f96c0);
                        i12 = 59;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 60:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, nVar.f147a);
                        i13 = 60;
                        iVar.a(i13, dimension);
                        break;
                    case 62:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.A);
                        i12 = 62;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 63:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.B);
                        i13 = 63;
                        iVar.a(i13, dimension);
                        break;
                    case 64:
                        str3 = str4;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, lVar.f133a);
                        i12 = 64;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 65:
                        str3 = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            string2 = typedArrayObtainStyledAttributes.getString(index);
                            i14 = 65;
                        } else {
                            i14 = 65;
                            string2 = strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        iVar.c(i14, string2);
                        break;
                    case 66:
                        str3 = str4;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, lVar.f137e);
                        i13 = 67;
                        iVar.a(i13, dimension);
                        break;
                    case 68:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f145d);
                        i13 = 68;
                        iVar.a(i13, dimension);
                        break;
                    case 69:
                        str3 = str4;
                        f10 = 1.0f;
                        i15 = 69;
                        iVar.a(i15, typedArrayObtainStyledAttributes.getFloat(index, f10));
                        break;
                    case 70:
                        str3 = str4;
                        i15 = 70;
                        f10 = 1.0f;
                        iVar.a(i15, typedArrayObtainStyledAttributes.getFloat(index, f10));
                        break;
                    case 71:
                        str3 = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.f102f0);
                        i12 = 72;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 73:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f104g0);
                        i12 = 73;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 74:
                        str3 = str4;
                        i16 = 74;
                        iVar.c(i16, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str3 = str4;
                        z10 = typedArrayObtainStyledAttributes.getBoolean(index, kVar.f118n0);
                        i17 = 75;
                        iVar.d(i17, z10);
                        break;
                    case 76:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, lVar.f135c);
                        i12 = 76;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 77:
                        str3 = str4;
                        i16 = 77;
                        iVar.c(i16, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 78 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, mVar.f143b);
                        i12 = 78;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 79:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, lVar.f136d);
                        i13 = 79;
                        iVar.a(i13, dimension);
                        break;
                    case 80:
                        str3 = str4;
                        z10 = typedArrayObtainStyledAttributes.getBoolean(index, kVar.f114l0);
                        i17 = 80;
                        iVar.d(i17, z10);
                        break;
                    case 81:
                        str3 = str4;
                        z10 = typedArrayObtainStyledAttributes.getBoolean(index, kVar.f116m0);
                        i17 = 81;
                        iVar.d(i17, z10);
                        break;
                    case 82:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, lVar.f134b);
                        i12 = 82;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 83:
                        str3 = str4;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, nVar.f154h);
                        i12 = 83;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 84:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, lVar.f139g);
                        i12 = 84;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 85:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, lVar.f138f);
                        i13 = 85;
                        iVar.a(i13, dimension);
                        break;
                    case 86:
                        str3 = str4;
                        int i22 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i22 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.f141i = resourceId;
                            iVar.b(89, resourceId);
                            if (lVar.f141i != -1) {
                                dimensionPixelOffset = -2;
                                i12 = 88;
                                iVar.b(i12, dimensionPixelOffset);
                            }
                        } else {
                            if (i22 == 3) {
                                String string3 = typedArrayObtainStyledAttributes.getString(index);
                                lVar.f140h = string3;
                                iVar.c(90, string3);
                                if (lVar.f140h.indexOf("/") > 0) {
                                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    lVar.f141i = resourceId2;
                                    iVar.b(89, resourceId2);
                                    iVar.b(88, -2);
                                } else {
                                    integer = -1;
                                    i18 = 88;
                                }
                            } else {
                                i18 = 88;
                                integer = typedArrayObtainStyledAttributes.getInteger(index, lVar.f141i);
                            }
                            iVar.b(i18, integer);
                        }
                        break;
                    case 87:
                        str3 = str4;
                        sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 93:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.L);
                        i12 = 93;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 94:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.S);
                        i12 = 94;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 95:
                        str3 = str4;
                        i19 = 0;
                        g(iVar, typedArrayObtainStyledAttributes, index, i19);
                        break;
                    case 96:
                        str3 = str4;
                        i19 = 1;
                        g(iVar, typedArrayObtainStyledAttributes, index, i19);
                        break;
                    case 97:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.f120o0);
                        i12 = 97;
                        iVar.b(i12, dimensionPixelOffset);
                        break;
                    case 98:
                        str3 = str4;
                        int i23 = z.a.V;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            jVar.f84a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f84a);
                        }
                        break;
                    case 99:
                        str3 = str4;
                        z10 = typedArrayObtainStyledAttributes.getBoolean(index, kVar.f103g);
                        i17 = 99;
                        iVar.d(i17, z10);
                        break;
                }
                i20++;
                indexCount = i21;
                str4 = str3;
            }
        } else {
            String str5 = "CURRENTLY UNSUPPORTED";
            String str6 = "Unknown attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i24 = 0;
            while (i24 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i24);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    lVar.getClass();
                    kVar.getClass();
                    mVar.getClass();
                    nVar.getClass();
                }
                switch (sparseIntArray2.get(index2)) {
                    case QueueFuseable.SYNC /* 1 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f121p = f(typedArrayObtainStyledAttributes, index2, kVar.f121p);
                        break;
                    case 2:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        break;
                    case 3:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f119o = f(typedArrayObtainStyledAttributes, index2, kVar.f119o);
                        break;
                    case 4:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f117n = f(typedArrayObtainStyledAttributes, index2, kVar.f117n);
                        break;
                    case y4.g.INVALID_ACCOUNT /* 5 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f130y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case y4.g.RESOLUTION_REQUIRED /* 6 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        break;
                    case y4.g.NETWORK_ERROR /* 7 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.D);
                        break;
                    case 8:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        break;
                    case 9:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f127v = f(typedArrayObtainStyledAttributes, index2, kVar.f127v);
                        break;
                    case y4.g.DEVELOPER_ERROR /* 10 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f126u = f(typedArrayObtainStyledAttributes, index2, kVar.f126u);
                        break;
                    case 11:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        break;
                    case 12:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        break;
                    case y4.g.ERROR /* 13 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        break;
                    case y4.g.INTERRUPTED /* 14 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        break;
                    case y4.g.TIMEOUT /* 15 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        break;
                    case y4.g.CANCELED /* 16 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        break;
                    case y4.g.API_NOT_CONNECTED /* 17 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f97d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f97d);
                        break;
                    case 18:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f99e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f99e);
                        break;
                    case y4.g.REMOTE_EXCEPTION /* 19 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f101f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f101f);
                        break;
                    case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f128w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f128w);
                        break;
                    case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f95c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f95c);
                        break;
                    case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f142a = iArr[typedArrayObtainStyledAttributes.getInt(index2, mVar.f142a)];
                        break;
                    case 23:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f93b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f93b);
                        break;
                    case 24:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        break;
                    case 25:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f105h = f(typedArrayObtainStyledAttributes, index2, kVar.f105h);
                        break;
                    case 26:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f107i = f(typedArrayObtainStyledAttributes, index2, kVar.f107i);
                        break;
                    case 27:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.E = typedArrayObtainStyledAttributes.getInt(index2, kVar.E);
                        break;
                    case 28:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        break;
                    case 29:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f109j = f(typedArrayObtainStyledAttributes, index2, kVar.f109j);
                        break;
                    case 30:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f111k = f(typedArrayObtainStyledAttributes, index2, kVar.f111k);
                        break;
                    case 31:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        break;
                    case 32:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f124s = f(typedArrayObtainStyledAttributes, index2, kVar.f124s);
                        break;
                    case 33:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f125t = f(typedArrayObtainStyledAttributes, index2, kVar.f125t);
                        break;
                    case 34:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        break;
                    case 35:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f115m = f(typedArrayObtainStyledAttributes, index2, kVar.f115m);
                        break;
                    case 36:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f113l = f(typedArrayObtainStyledAttributes, index2, kVar.f113l);
                        break;
                    case 37:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f129x = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f129x);
                        break;
                    case 38:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f84a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.f84a);
                        break;
                    case 39:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.U = typedArrayObtainStyledAttributes.getFloat(index2, kVar.U);
                        break;
                    case 40:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.T);
                        break;
                    case 41:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.V = typedArrayObtainStyledAttributes.getInt(index2, kVar.V);
                        break;
                    case 42:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.W = typedArrayObtainStyledAttributes.getInt(index2, kVar.W);
                        break;
                    case 43:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f144c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f144c);
                        break;
                    case 44:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f158l = true;
                        nVar.f159m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f159m);
                        break;
                    case 45:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f148b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f148b);
                        break;
                    case 46:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f149c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f149c);
                        break;
                    case 47:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f150d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f150d);
                        break;
                    case 48:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f151e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f151e);
                        break;
                    case 49:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f152f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f152f);
                        break;
                    case 50:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f153g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f153g);
                        break;
                    case 51:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f155i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f155i);
                        break;
                    case 52:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f156j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f156j);
                        break;
                    case 53:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f157k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f157k);
                        break;
                    case 54:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.X = typedArrayObtainStyledAttributes.getInt(index2, kVar.X);
                        break;
                    case 55:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.Y = typedArrayObtainStyledAttributes.getInt(index2, kVar.Y);
                        break;
                    case 56:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        break;
                    case 57:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f92a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f92a0);
                        break;
                    case 58:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f94b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f94b0);
                        break;
                    case 59:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f96c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f96c0);
                        break;
                    case 60:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        nVar.f147a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f147a);
                        break;
                    case 61:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f131z = f(typedArrayObtainStyledAttributes, index2, kVar.f131z);
                        break;
                    case 62:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.A);
                        break;
                    case 63:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.B = typedArrayObtainStyledAttributes.getFloat(index2, kVar.B);
                        break;
                    case 64:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f133a = f(typedArrayObtainStyledAttributes, index2, lVar.f133a);
                        break;
                    case 65:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str7 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        lVar.getClass();
                        break;
                    case 66:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 67:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        lVar.f137e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f137e);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 68:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        mVar.f145d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f145d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 69:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        kVar.f98d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 70:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        kVar.f100e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 71:
                        i10 = indexCount2;
                        str = str5;
                        str2 = str6;
                        Log.e("ConstraintSet", str);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 72:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f102f0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f102f0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 73:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f104g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f104g0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 74:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f110j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 75:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f118n0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f118n0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 76:
                        i10 = indexCount2;
                        str2 = str6;
                        lVar.f135c = typedArrayObtainStyledAttributes.getInt(index2, lVar.f135c);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 77:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f112k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 78 */:
                        i10 = indexCount2;
                        str2 = str6;
                        mVar.f143b = typedArrayObtainStyledAttributes.getInt(index2, mVar.f143b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 79:
                        i10 = indexCount2;
                        str2 = str6;
                        lVar.f136d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f136d);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 80:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f114l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f114l0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 81:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f116m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f116m0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 82:
                        i10 = indexCount2;
                        str2 = str6;
                        lVar.f134b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f134b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 83:
                        i10 = indexCount2;
                        str2 = str6;
                        nVar.f154h = f(typedArrayObtainStyledAttributes, index2, nVar.f154h);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 84:
                        i10 = indexCount2;
                        str2 = str6;
                        lVar.f139g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f139g);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 85:
                        i10 = indexCount2;
                        str2 = str6;
                        lVar.f138f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f138f);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 86:
                        i10 = indexCount2;
                        str2 = str6;
                        int i25 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i25 == 1) {
                            lVar.f141i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i25 == 3) {
                            String string4 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.f140h = string4;
                            if (string4.indexOf("/") > 0) {
                                lVar.f141i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.f141i);
                        }
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 87:
                        i10 = indexCount2;
                        str2 = str6;
                        string = "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray2.get(index2);
                        Log.w("ConstraintSet", string);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str6;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i10 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray2.get(index2));
                        string = sb2.toString();
                        Log.w("ConstraintSet", string);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 91:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f122q = f(typedArrayObtainStyledAttributes, index2, kVar.f122q);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 92:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f123r = f(typedArrayObtainStyledAttributes, index2, kVar.f123r);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 93:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 94:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.S);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 95:
                        i10 = indexCount2;
                        str2 = str6;
                        i11 = 0;
                        g(kVar, typedArrayObtainStyledAttributes, index2, i11);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 96:
                        i10 = indexCount2;
                        str2 = str6;
                        i11 = 1;
                        g(kVar, typedArrayObtainStyledAttributes, index2, i11);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 97:
                        i10 = indexCount2;
                        str2 = str6;
                        kVar.f120o0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f120o0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                }
                i24++;
                indexCount2 = i10;
                str6 = str2;
                sparseIntArray2 = sparseIntArray;
                str5 = str;
            }
            if (kVar.f110j0 != null) {
                kVar.f108i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i10, int i11) {
        int i12;
        int i13;
        int dimensionPixelSize;
        int i14;
        if (obj == null) {
            return;
        }
        int i15 = typedArray.peekValue(i10).type;
        boolean z7 = true;
        int i16 = 0;
        if (i15 == 3) {
            String string = typedArray.getString(i10);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, strTrim2);
                        return;
                    }
                    if (obj instanceof k) {
                        ((k) obj).f130y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof i) {
                            ((i) obj).c(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f10 = Float.parseFloat(strTrim2);
                        if (obj instanceof e) {
                            e eVar2 = (e) obj;
                            if (i11 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.H = f10;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.I = f10;
                                return;
                            }
                        }
                        if (obj instanceof k) {
                            k kVar = (k) obj;
                            if (i11 == 0) {
                                kVar.f93b = 0;
                                kVar.U = f10;
                                return;
                            } else {
                                kVar.f95c = 0;
                                kVar.T = f10;
                                return;
                            }
                        }
                        if (obj instanceof i) {
                            i iVar = (i) obj;
                            if (i11 == 0) {
                                iVar.b(23, 0);
                                i13 = 39;
                            } else {
                                iVar.b(21, 0);
                                i13 = 40;
                            }
                            iVar.a(i13, f10);
                            return;
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i11 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.R = fMax;
                                eVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.S = fMax;
                                eVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof k) {
                            k kVar2 = (k) obj;
                            if (i11 == 0) {
                                kVar2.f93b = 0;
                                kVar2.f98d0 = fMax;
                                kVar2.X = 2;
                                return;
                            } else {
                                kVar2.f95c = 0;
                                kVar2.f100e0 = fMax;
                                kVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof i) {
                            i iVar2 = (i) obj;
                            if (i11 == 0) {
                                iVar2.b(23, 0);
                                i12 = 54;
                            } else {
                                iVar2.b(21, 0);
                                i12 = 55;
                            }
                            iVar2.b(i12, 2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i15 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize != -4) {
                if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                }
                z7 = false;
                if (obj instanceof e) {
                    e eVar4 = (e) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar4).width = i16;
                        eVar4.W = z7;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar4).height = i16;
                        eVar4.X = z7;
                        return;
                    }
                }
                if (obj instanceof k) {
                    k kVar3 = (k) obj;
                    if (i11 == 0) {
                        kVar3.f93b = i16;
                        kVar3.f114l0 = z7;
                        return;
                    } else {
                        kVar3.f95c = i16;
                        kVar3.f116m0 = z7;
                        return;
                    }
                }
                if (obj instanceof i) {
                    i iVar3 = (i) obj;
                    if (i11 == 0) {
                        iVar3.b(23, i16);
                        i14 = 80;
                    } else {
                        iVar3.b(21, i16);
                        i14 = 81;
                    }
                    iVar3.d(i14, z7);
                    return;
                }
                return;
            }
            i16 = -2;
            if (obj instanceof e) {
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        }
        i16 = dimensionPixelSize;
        z7 = false;
        if (obj instanceof e) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i10;
        int i11;
        String resourceEntryName;
        o oVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap map = oVar.f165c;
        HashSet hashSet = new HashSet(map.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout2.getChildAt(i12);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (oVar.f164b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        j jVar = (j) map.get(Integer.valueOf(id));
                        if (jVar != null) {
                            if (childAt instanceof a) {
                                k kVar = jVar.f87d;
                                kVar.f106h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(kVar.f102f0);
                                aVar.setMargin(kVar.f104g0);
                                aVar.setAllowsGoneWidget(kVar.f118n0);
                                int[] iArr = kVar.f108i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = kVar.f110j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        kVar.f108i0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap map2 = jVar.f89f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                b bVar = (b) map2.get(str2);
                                String strV = !bVar.f4a ? h.v("set", str2) : str2;
                                HashMap map3 = map2;
                                try {
                                    switch (v.h.b(bVar.f5b)) {
                                        case 0:
                                            i11 = childCount;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strV, clsArr).invoke(childAt, Integer.valueOf(bVar.f6c));
                                            } catch (IllegalAccessException e10) {
                                                e = e10;
                                                StringBuilder sbA = h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA.append(cls.getName());
                                                Log.e("TransitionLayout", sbA.toString());
                                                e.printStackTrace();
                                                map2 = map3;
                                                childCount = i11;
                                            } catch (NoSuchMethodException e11) {
                                                e = e11;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strV);
                                                map2 = map3;
                                                childCount = i11;
                                            } catch (InvocationTargetException e12) {
                                                e = e12;
                                                StringBuilder sbA2 = h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA2.append(cls.getName());
                                                Log.e("TransitionLayout", sbA2.toString());
                                                e.printStackTrace();
                                                map2 = map3;
                                                childCount = i11;
                                            }
                                        case QueueFuseable.SYNC /* 1 */:
                                            i11 = childCount;
                                            cls.getMethod(strV, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f7d));
                                            break;
                                        case 2:
                                            i11 = childCount;
                                            cls.getMethod(strV, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f10g));
                                            break;
                                        case 3:
                                            i11 = childCount;
                                            Method method = cls.getMethod(strV, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f10g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i11 = childCount;
                                            cls.getMethod(strV, CharSequence.class).invoke(childAt, bVar.f8e);
                                            break;
                                        case y4.g.INVALID_ACCOUNT /* 5 */:
                                            i11 = childCount;
                                            cls.getMethod(strV, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f9f));
                                            break;
                                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                                            i11 = childCount;
                                            cls.getMethod(strV, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f7d));
                                            break;
                                        case y4.g.NETWORK_ERROR /* 7 */:
                                            i11 = childCount;
                                            try {
                                                cls.getMethod(strV, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f6c));
                                            } catch (IllegalAccessException e13) {
                                                e = e13;
                                                StringBuilder sbA22 = h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA22.append(cls.getName());
                                                Log.e("TransitionLayout", sbA22.toString());
                                                e.printStackTrace();
                                                map2 = map3;
                                                childCount = i11;
                                            } catch (NoSuchMethodException e14) {
                                                e = e14;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strV);
                                                map2 = map3;
                                                childCount = i11;
                                            } catch (InvocationTargetException e15) {
                                                e = e15;
                                                StringBuilder sbA222 = h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA222.append(cls.getName());
                                                Log.e("TransitionLayout", sbA222.toString());
                                                e.printStackTrace();
                                                map2 = map3;
                                                childCount = i11;
                                            }
                                        default:
                                            i11 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e16) {
                                    e = e16;
                                    i11 = childCount;
                                } catch (NoSuchMethodException e17) {
                                    e = e17;
                                    i11 = childCount;
                                } catch (InvocationTargetException e18) {
                                    e = e18;
                                    i11 = childCount;
                                }
                                map2 = map3;
                                childCount = i11;
                            }
                            i10 = childCount;
                            childAt.setLayoutParams(eVar);
                            m mVar = jVar.f85b;
                            if (mVar.f143b == 0) {
                                childAt.setVisibility(mVar.f142a);
                            }
                            childAt.setAlpha(mVar.f144c);
                            n nVar = jVar.f88e;
                            childAt.setRotation(nVar.f147a);
                            childAt.setRotationX(nVar.f148b);
                            childAt.setRotationY(nVar.f149c);
                            childAt.setScaleX(nVar.f150d);
                            childAt.setScaleY(nVar.f151e);
                            if (nVar.f154h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f154h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f152f)) {
                                    childAt.setPivotX(nVar.f152f);
                                }
                                if (!Float.isNaN(nVar.f153g)) {
                                    childAt.setPivotY(nVar.f153g);
                                }
                            }
                            childAt.setTranslationX(nVar.f155i);
                            childAt.setTranslationY(nVar.f156j);
                            childAt.setTranslationZ(nVar.f157k);
                            if (nVar.f158l) {
                                childAt.setElevation(nVar.f159m);
                            }
                        }
                    } else {
                        i10 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i12++;
                oVar = this;
                constraintLayout2 = constraintLayout;
                childCount = i10;
            }
            i10 = childCount;
            i12++;
            oVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i10;
        }
        int i13 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) map.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f87d;
                if (kVar2.f106h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f11b = new int[32];
                    aVar2.f17t = new HashMap();
                    aVar2.f13f = context;
                    aVar2.g(null);
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f108i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = kVar2.f110j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            kVar2.f108i0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.f102f0);
                    aVar2.setMargin(kVar2.f104g0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.i();
                    jVar2.a(eVarG);
                    viewGroup = constraintLayout;
                    viewGroup.addView(aVar2, eVarG);
                } else {
                    viewGroup = constraintLayout;
                }
                if (kVar2.f91a) {
                    q qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    jVar2.a(eVarG2);
                    viewGroup.addView(qVar, eVarG2);
                }
            }
        }
        for (int i14 = 0; i14 < i13; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = oVar.f165c;
        map.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f164b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) map.get(Integer.valueOf(id));
            if (jVar == null) {
                i10 = childCount;
            } else {
                HashMap map2 = oVar.f163a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    b bVar = (b) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            try {
                                map3.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i11;
                            }
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        i11 = childCount;
                        e.printStackTrace();
                        childCount = i11;
                    }
                    childCount = i11;
                }
                i10 = childCount;
                jVar.f89f = map3;
                jVar.f84a = id;
                int i13 = eVar.f27e;
                k kVar = jVar.f87d;
                kVar.f105h = i13;
                kVar.f107i = eVar.f29f;
                kVar.f109j = eVar.f31g;
                kVar.f111k = eVar.f33h;
                kVar.f113l = eVar.f35i;
                kVar.f115m = eVar.f37j;
                kVar.f117n = eVar.f39k;
                kVar.f119o = eVar.f41l;
                kVar.f121p = eVar.f43m;
                kVar.f122q = eVar.f45n;
                kVar.f123r = eVar.f47o;
                kVar.f124s = eVar.f53s;
                kVar.f125t = eVar.f54t;
                kVar.f126u = eVar.f55u;
                kVar.f127v = eVar.f56v;
                kVar.f128w = eVar.E;
                kVar.f129x = eVar.F;
                kVar.f130y = eVar.G;
                kVar.f131z = eVar.f49p;
                kVar.A = eVar.f51q;
                kVar.B = eVar.f52r;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.E = eVar.V;
                kVar.f101f = eVar.f23c;
                kVar.f97d = eVar.f19a;
                kVar.f99e = eVar.f21b;
                kVar.f93b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f95c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.L = eVar.D;
                kVar.T = eVar.I;
                kVar.U = eVar.H;
                kVar.W = eVar.K;
                kVar.V = eVar.J;
                kVar.f114l0 = eVar.W;
                kVar.f116m0 = eVar.X;
                kVar.X = eVar.L;
                kVar.Y = eVar.M;
                kVar.Z = eVar.P;
                kVar.f92a0 = eVar.Q;
                kVar.f94b0 = eVar.N;
                kVar.f96c0 = eVar.O;
                kVar.f98d0 = eVar.R;
                kVar.f100e0 = eVar.S;
                kVar.f112k0 = eVar.Y;
                kVar.N = eVar.f58x;
                kVar.P = eVar.f60z;
                kVar.M = eVar.f57w;
                kVar.O = eVar.f59y;
                kVar.R = eVar.A;
                kVar.Q = eVar.B;
                kVar.S = eVar.C;
                kVar.f120o0 = eVar.Z;
                kVar.J = eVar.getMarginEnd();
                kVar.K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = jVar.f85b;
                mVar.f142a = visibility;
                mVar.f144c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = jVar.f88e;
                nVar.f147a = rotation;
                nVar.f148b = childAt.getRotationX();
                nVar.f149c = childAt.getRotationY();
                nVar.f150d = childAt.getScaleX();
                nVar.f151e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f152f = pivotX;
                    nVar.f153g = pivotY;
                }
                nVar.f155i = childAt.getTranslationX();
                nVar.f156j = childAt.getTranslationY();
                nVar.f157k = childAt.getTranslationZ();
                if (nVar.f158l) {
                    nVar.f159m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f118n0 = aVar.getAllowsGoneWidget();
                    kVar.f108i0 = aVar.getReferencedIds();
                    kVar.f102f0 = aVar.getType();
                    kVar.f104g0 = aVar.getMargin();
                }
            }
            i12++;
            oVar = this;
            childCount = i10;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.f87d.f91a = true;
                    }
                    this.f165c.put(Integer.valueOf(jVarD.f84a), jVarD);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}