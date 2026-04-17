package q9;

import androidx.lifecycle.c0;
import androidx.lifecycle.y0;
import com.isprid.kendare.network.client.ArticlesApiClient;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16353a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public final c0 f16354b = new c0();

    /* renamed from: c, reason: collision with root package name */
    public final ArticlesApiClient f16355c = new ArticlesApiClient();

    /* renamed from: d, reason: collision with root package name */
    public final CompositeDisposable f16356d = new CompositeDisposable();

    @Override // androidx.lifecycle.y0
    public final void onCleared() {
        this.f16356d.clear();
    }
}