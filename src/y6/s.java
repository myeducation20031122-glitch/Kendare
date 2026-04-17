package y6;

import android.view.View;
import android.widget.AdapterView;
import m.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f19377b;

    public s(u uVar) {
        this.f19377b = uVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item;
        u uVar = this.f19377b;
        if (i10 < 0) {
            m2 m2Var = uVar.f19381m;
            item = !m2Var.f14841c0.isShowing() ? null : m2Var.f14843f.getSelectedItem();
        } else {
            item = uVar.getAdapter().getItem(i10);
        }
        u.a(uVar, item);
        AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
        m2 m2Var2 = uVar.f19381m;
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                view = m2Var2.f14841c0.isShowing() ? m2Var2.f14843f.getSelectedView() : null;
                i10 = !m2Var2.f14841c0.isShowing() ? -1 : m2Var2.f14843f.getSelectedItemPosition();
                j10 = !m2Var2.f14841c0.isShowing() ? Long.MIN_VALUE : m2Var2.f14843f.getSelectedItemId();
            }
            onItemClickListener.onItemClick(m2Var2.f14843f, view, i10, j10);
        }
        m2Var2.dismiss();
    }
}