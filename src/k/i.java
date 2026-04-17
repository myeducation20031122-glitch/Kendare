package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.recyclerview.widget.g1;
import java.io.IOException;
import l.o;
import l.r;
import m.t1;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f13922e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f13923f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13924a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13925b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f13926c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13927d;

    static {
        Class[] clsArr = {Context.class};
        f13922e = clsArr;
        f13923f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f13926c = context;
        Object[] objArr = {context};
        this.f13924a = objArr;
        this.f13925b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        r rVar;
        ColorStateList colorStateList;
        h hVar = new h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z7 = false;
        boolean z10 = false;
        String str = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i10) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z10 && name2.equals(str)) {
                        z10 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        hVar.f13897b = 0;
                        hVar.f13898c = 0;
                        hVar.f13899d = 0;
                        hVar.f13900e = 0;
                        hVar.f13901f = true;
                        hVar.f13902g = true;
                    } else if (name2.equals("item")) {
                        if (!hVar.f13903h) {
                            r rVar2 = hVar.f13921z;
                            if (rVar2 == null || !rVar2.f14411b.hasSubMenu()) {
                                hVar.f13903h = true;
                                hVar.b(hVar.f13896a.add(hVar.f13897b, hVar.f13904i, hVar.f13905j, hVar.f13906k));
                            } else {
                                hVar.f13903h = true;
                                hVar.b(hVar.f13896a.addSubMenu(hVar.f13897b, hVar.f13904i, hVar.f13905j, hVar.f13906k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z7 = true;
                    }
                }
            } else if (!z10) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                i iVar = hVar.E;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = iVar.f13926c.obtainStyledAttributes(attributeSet, f.a.f12639p);
                    hVar.f13897b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    hVar.f13898c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    hVar.f13899d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    hVar.f13900e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    hVar.f13901f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    hVar.f13902g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = iVar.f13926c;
                    g.e eVar = new g.e(context, context.obtainStyledAttributes(attributeSet, f.a.f12640q));
                    hVar.f13904i = eVar.B(2, 0);
                    hVar.f13905j = (eVar.y(5, hVar.f13898c) & (-65536)) | (eVar.y(6, hVar.f13899d) & 65535);
                    hVar.f13906k = eVar.E(7);
                    hVar.f13907l = eVar.E(8);
                    hVar.f13908m = eVar.B(0, 0);
                    String strC = eVar.C(9);
                    hVar.f13909n = strC == null ? (char) 0 : strC.charAt(0);
                    hVar.f13910o = eVar.y(16, g1.FLAG_APPEARED_IN_PRE_LAYOUT);
                    String strC2 = eVar.C(10);
                    hVar.f13911p = strC2 == null ? (char) 0 : strC2.charAt(0);
                    hVar.f13912q = eVar.y(20, g1.FLAG_APPEARED_IN_PRE_LAYOUT);
                    hVar.f13913r = eVar.F(11) ? eVar.q(11, false) : hVar.f13900e;
                    hVar.f13914s = eVar.q(3, false);
                    hVar.f13915t = eVar.q(4, hVar.f13901f);
                    hVar.f13916u = eVar.q(1, hVar.f13902g);
                    hVar.f13917v = eVar.y(21, -1);
                    hVar.f13920y = eVar.C(12);
                    hVar.f13918w = eVar.B(13, 0);
                    hVar.f13919x = eVar.C(15);
                    String strC3 = eVar.C(14);
                    boolean z11 = strC3 != null;
                    if (z11 && hVar.f13918w == 0 && hVar.f13919x == null) {
                        rVar = (r) hVar.a(strC3, f13923f, iVar.f13925b);
                    } else {
                        if (z11) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        rVar = null;
                    }
                    hVar.f13921z = rVar;
                    hVar.A = eVar.E(17);
                    hVar.B = eVar.E(22);
                    if (eVar.F(19)) {
                        hVar.D = t1.c(eVar.y(19, -1), hVar.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        hVar.D = null;
                    }
                    if (eVar.F(18)) {
                        hVar.C = eVar.r(18);
                    } else {
                        hVar.C = colorStateList;
                    }
                    eVar.L();
                    hVar.f13903h = false;
                } else if (name3.equals("menu")) {
                    hVar.f13903h = true;
                    SubMenu subMenuAddSubMenu = hVar.f13896a.addSubMenu(hVar.f13897b, hVar.f13904i, hVar.f13905j, hVar.f13906k);
                    hVar.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z10 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i10 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof j0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z7 = false;
        try {
            try {
                layout = this.f13926c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o) {
                    o oVar = (o) menu;
                    if (!oVar.f14372p) {
                        oVar.w();
                        z7 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z7) {
                    ((o) menu).v();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z7) {
                ((o) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}