package z0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.l;
import androidx.emoji2.text.v;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f19436a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.e f19437b;

    public g(KeyListener keyListener) {
        g8.e eVar = new g8.e();
        this.f19436a = keyListener;
        this.f19437b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f19436a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f19436a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zA;
        this.f19437b.getClass();
        Object obj = l.f866j;
        if (i10 != 67) {
            if (i10 == 112) {
                zA = v.a(editable, keyEvent, true);
            }
            return !this.f19436a.onKeyDown(view, editable, i10, keyEvent);
        }
        zA = v.a(editable, keyEvent, false);
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (!this.f19436a.onKeyDown(view, editable, i10, keyEvent)) {
        }
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f19436a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f19436a.onKeyUp(view, editable, i10, keyEvent);
    }
}