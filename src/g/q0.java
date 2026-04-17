package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f12884b;

    /* renamed from: e, reason: collision with root package name */
    public final String f12885e;

    /* renamed from: f, reason: collision with root package name */
    public Method f12886f;

    /* renamed from: j, reason: collision with root package name */
    public Context f12887j;

    public q0(View view, String str) {
        this.f12884b = view;
        this.f12885e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f12886f == null) {
            View view2 = this.f12884b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f12885e;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbA = a0.h.A("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbA.append(view2.getClass());
                    sbA.append(str);
                    throw new IllegalStateException(sbA.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f12886f = method;
                        this.f12887j = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f12886f.invoke(this.f12887j, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}