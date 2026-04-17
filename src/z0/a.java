package z0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.c3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends g8.e {

    /* renamed from: e, reason: collision with root package name */
    public final EditText f19422e;

    /* renamed from: f, reason: collision with root package name */
    public final j f19423f;

    public a(EditText editText) {
        this.f19422e = editText;
        j jVar = new j(editText);
        this.f19423f = jVar;
        editText.addTextChangedListener(jVar);
        if (c.f19428b == null) {
            synchronized (c.f19427a) {
                try {
                    if (c.f19428b == null) {
                        c cVar = new c();
                        try {
                            c.f19429c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f19428b = cVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f19428b);
    }

    @Override // g8.e
    public final KeyListener B(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    @Override // g8.e
    public final InputConnection E(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f19422e, inputConnection, editorInfo);
    }

    @Override // g8.e
    public final void H(boolean z7) {
        j jVar = this.f19423f;
        if (jVar.f19445j != z7) {
            if (jVar.f19444f != null) {
                l lVarA = l.a();
                c3 c3Var = jVar.f19444f;
                lVarA.getClass();
                g5.a.e(c3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f868a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f869b.remove(c3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f19445j = z7;
            if (z7) {
                j.a(jVar.f19442b, l.a().b());
            }
        }
    }
}