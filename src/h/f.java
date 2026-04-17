package h;

import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13104b = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f13105e;

    public f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f13104b) {
            case 0:
                break;
            default:
                ((u1.e) this.f13105e).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f13104b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13105e;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            default:
                ((u1.e) this.f13105e).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f13104b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f13105e;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                ((u1.e) this.f13105e).unscheduleSelf(runnable);
                break;
        }
    }

    public f(u1.e eVar) {
        this.f13105e = eVar;
    }
}