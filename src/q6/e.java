package q6;

import android.content.Context;
import android.view.SubMenu;
import kc.r;
import l.o;
import l.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends o {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f16278z;

    public e(Context context, Class cls, int i10) {
        super(context);
        this.f16278z = cls;
        this.A = i10;
    }

    @Override // l.o
    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = this.f14362f.size() + 1;
        int i13 = this.A;
        if (size <= i13) {
            w();
            q qVarA = super.a(i10, i11, i12, charSequence);
            qVarA.g(true);
            v();
            return qVarA;
        }
        String simpleName = this.f16278z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i13);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(r.g(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // l.o, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f16278z.getSimpleName().concat(" does not support submenus"));
    }
}