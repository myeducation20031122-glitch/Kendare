package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14934a;

    /* renamed from: b, reason: collision with root package name */
    public int f14935b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14936c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14937d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14938e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14939f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14940g;

    public t() {
        this.f14934a = 2;
        this.f14935b = 1;
        this.f14939f = Collections.emptyList();
        this.f14940g = Collections.emptyList();
    }

    public static t b(Context context, int i10) throws Resources.NotFoundException {
        g5.a.b("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, y5.a.f19280q);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM = j4.m(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM2 = j4.m(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM3 = j4.m(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        v6.j jVarA = v6.j.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new v6.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new t(colorStateListM, colorStateListM2, colorStateListM3, dimensionPixelSize, jVarA, rect);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t k(JsonReader jsonReader) {
        char c10;
        int i10;
        String strNextString;
        int i11;
        t tVar = new t();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            c10 = 0;
            i10 = 3;
            switch (strNextName) {
                case "consent_signal":
                    String strNextString2 = jsonReader.nextString();
                    strNextString2.getClass();
                    switch (strNextString2.hashCode()) {
                        case -2058725357:
                            if (!strNextString2.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                c10 = 65535;
                                break;
                            }
                            break;
                        case -1969035850:
                            if (strNextString2.equals("CONSENT_SIGNAL_ERROR")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1263695752:
                            if (strNextString2.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -954325659:
                            if (strNextString2.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -918677260:
                            if (strNextString2.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 429411856:
                            if (strNextString2.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 467888915:
                            if (strNextString2.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 1725474845:
                            if (strNextString2.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                c10 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            i10 = 5;
                            tVar.f14935b = i10;
                            break;
                        case QueueFuseable.SYNC /* 1 */:
                            i10 = 7;
                            tVar.f14935b = i10;
                            break;
                        case 2:
                            i10 = 1;
                            tVar.f14935b = i10;
                            break;
                        case 3:
                            tVar.f14935b = i10;
                            break;
                        case 4:
                            i10 = 8;
                            tVar.f14935b = i10;
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            i10 = 4;
                            tVar.f14935b = i10;
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            i10 = 2;
                            tVar.f14935b = i10;
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            i10 = 6;
                            tVar.f14935b = i10;
                            break;
                        default:
                            throw new IOException(strNextString2.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString2) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
                    }
                case "error_message":
                    tVar.f14938e = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    tVar.f14937d = jsonReader.nextString();
                    break;
                case "actions":
                    tVar.f14940g = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        o5.t tVar2 = new o5.t();
                        tVar2.f15792b = 1;
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("action_type")) {
                                strNextString = jsonReader.nextString();
                                strNextString.getClass();
                                switch (strNextString) {
                                    case "CLEAR":
                                        i11 = 3;
                                        break;
                                    case "WRITE":
                                        i11 = 2;
                                        break;
                                    case "UNKNOWN_ACTION_TYPE":
                                        i11 = 1;
                                        break;
                                    default:
                                        throw new IOException(strNextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
                                }
                                tVar2.f15792b = i11;
                            } else if (strNextName2.equals("args_json")) {
                                tVar2.f15791a = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        ((List) tVar.f14940g).add(tVar2);
                    }
                    jsonReader.endArray();
                    break;
                case "request_info_keys":
                    tVar.f14939f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ((List) tVar.f14939f).add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "consent_form_payload":
                    tVar.f14936c = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return tVar;
    }

    public final void a() {
        Drawable background = ((View) this.f14936c).getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : ((f3) this.f14938e) != null) {
                if (((f3) this.f14940g) == null) {
                    this.f14940g = new f3(0);
                }
                f3 f3Var = (f3) this.f14940g;
                f3Var.f14778c = null;
                f3Var.f14777b = false;
                f3Var.f14779d = null;
                f3Var.f14776a = false;
                View view = (View) this.f14936c;
                WeakHashMap weakHashMap = o0.c1.f15515a;
                ColorStateList colorStateListG = o0.q0.g(view);
                if (colorStateListG != null) {
                    f3Var.f14777b = true;
                    f3Var.f14778c = colorStateListG;
                }
                PorterDuff.Mode modeH = o0.q0.h((View) this.f14936c);
                if (modeH != null) {
                    f3Var.f14776a = true;
                    f3Var.f14779d = modeH;
                }
                if (f3Var.f14777b || f3Var.f14776a) {
                    x.e(background, f3Var, ((View) this.f14936c).getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.f14939f;
            if (f3Var2 != null) {
                x.e(background, f3Var2, ((View) this.f14936c).getDrawableState());
                return;
            }
            f3 f3Var3 = (f3) this.f14938e;
            if (f3Var3 != null) {
                x.e(background, f3Var3, ((View) this.f14936c).getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f14939f;
        if (((f3) obj) != null) {
            return (ColorStateList) ((f3) obj).f14778c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f14939f;
        if (((f3) obj) != null) {
            return (PorterDuff.Mode) ((f3) obj).f14779d;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListI;
        Context context = ((View) this.f14936c).getContext();
        int[] iArr = f.a.f12649z;
        g.e eVarI = g.e.I(context, attributeSet, iArr, i10);
        View view = (View) this.f14936c;
        o0.c1.q(view, view.getContext(), iArr, attributeSet, (TypedArray) eVarI.f12764f, i10);
        try {
            if (eVarI.F(0)) {
                this.f14935b = eVarI.B(0, -1);
                x xVar = (x) this.f14937d;
                Context context2 = ((View) this.f14936c).getContext();
                int i11 = this.f14935b;
                synchronized (xVar) {
                    colorStateListI = xVar.f14989a.i(context2, i11);
                }
                if (colorStateListI != null) {
                    h(colorStateListI);
                }
            }
            if (eVarI.F(1)) {
                o0.c1.t((View) this.f14936c, eVarI.r(1));
            }
            if (eVarI.F(2)) {
                View view2 = (View) this.f14936c;
                PorterDuff.Mode modeC = t1.c(eVarI.y(2, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                o0.q0.r(view2, modeC);
                if (i12 == 21) {
                    Drawable background = view2.getBackground();
                    boolean z7 = (o0.q0.g(view2) == null && o0.q0.h(view2) == null) ? false : true;
                    if (background != null && z7) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        view2.setBackground(background);
                    }
                }
            }
            eVarI.L();
        } catch (Throwable th) {
            eVarI.L();
            throw th;
        }
    }

    public final void f() {
        this.f14935b = -1;
        h(null);
        a();
    }

    public final void g(int i10) {
        ColorStateList colorStateListI;
        this.f14935b = i10;
        x xVar = (x) this.f14937d;
        if (xVar != null) {
            Context context = ((View) this.f14936c).getContext();
            synchronized (xVar) {
                colorStateListI = xVar.f14989a.i(context, i10);
            }
        } else {
            colorStateListI = null;
        }
        h(colorStateListI);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((f3) this.f14938e) == null) {
                this.f14938e = new f3(0);
            }
            Object obj = this.f14938e;
            ((f3) obj).f14778c = colorStateList;
            ((f3) obj).f14777b = true;
        } else {
            this.f14938e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((f3) this.f14939f) == null) {
            this.f14939f = new f3(0);
        }
        f3 f3Var = (f3) this.f14939f;
        f3Var.f14778c = colorStateList;
        f3Var.f14777b = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((f3) this.f14939f) == null) {
            this.f14939f = new f3(0);
        }
        f3 f3Var = (f3) this.f14939f;
        f3Var.f14779d = mode;
        f3Var.f14776a = true;
        a();
    }

    public final String toString() {
        switch (this.f14934a) {
            case QueueFuseable.SYNC /* 1 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f14936c) + ", mProviderPackage: " + ((String) this.f14937d) + ", mQuery: " + ((String) this.f14938e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f14939f).size(); i10++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f14939f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f14935b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, v6.j jVar, Rect rect) {
        this.f14934a = 3;
        g5.a.d(rect.left);
        g5.a.d(rect.top);
        g5.a.d(rect.right);
        g5.a.d(rect.bottom);
        this.f14936c = rect;
        this.f14937d = colorStateList2;
        this.f14938e = colorStateList;
        this.f14939f = colorStateList3;
        this.f14935b = i10;
        this.f14940g = jVar;
    }

    public t(View view) {
        this.f14934a = 0;
        this.f14935b = -1;
        this.f14936c = view;
        this.f14937d = x.a();
    }

    public t(String str, String str2, String str3, List list) {
        this.f14934a = 1;
        str.getClass();
        this.f14936c = str;
        str2.getClass();
        this.f14937d = str2;
        this.f14938e = str3;
        list.getClass();
        this.f14939f = list;
        this.f14935b = 0;
        this.f14940g = str + "-" + str2 + "-" + str3;
    }
}