package z0;

import android.text.Editable;
import androidx.emoji2.text.d0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19427a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f19428b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f19429c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f19429c;
        return cls != null ? new d0(cls, charSequence) : super.newEditable(charSequence);
    }
}