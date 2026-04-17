package m;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c3 extends androidx.emoji2.text.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14730a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f14731b;

    public c3(EditText editText) {
        this.f14731b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.j
    public final void a() {
        switch (this.f14730a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f14731b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.j
    public final void b() {
        WeakReference weakReference = this.f14731b;
        switch (this.f14730a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
            default:
                z0.j.a((EditText) weakReference.get(), 1);
                break;
        }
    }

    public c3(SwitchCompat switchCompat) {
        this.f14731b = new WeakReference(switchCompat);
    }
}