package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q2 extends z1 {
    public final int P;
    public final int Q;
    public n2 R;
    public l.q S;

    public q2(Context context, boolean z7) {
        super(context, z7);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.P = 21;
            this.Q = 22;
        } else {
            this.P = 22;
            this.Q = 21;
        }
    }

    @Override // m.z1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.l lVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.R != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                lVar = (l.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (l.l) adapter;
                headersCount = 0;
            }
            l.q item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= lVar.getCount()) ? null : lVar.getItem(i10);
            l.q qVar = this.S;
            if (qVar != item) {
                l.o oVar = lVar.f14350a;
                if (qVar != null) {
                    this.R.q(oVar, qVar);
                }
                this.S = item;
                if (item != null) {
                    this.R.m(oVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.P) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.Q) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        ((l.l) adapter).f14350a.c(false);
        return true;
    }

    public void setHoverListener(n2 n2Var) {
        this.R = n2Var;
    }

    @Override // m.z1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}