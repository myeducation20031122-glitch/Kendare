package t5;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends g4 {

    /* renamed from: f, reason: collision with root package name */
    public long f17486f;

    /* renamed from: j, reason: collision with root package name */
    public String f17487j;

    /* renamed from: m, reason: collision with root package name */
    public AccountManager f17488m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f17489n;

    /* renamed from: t, reason: collision with root package name */
    public long f17490t;

    @Override // t5.g4
    public final boolean p() {
        Calendar calendar = Calendar.getInstance();
        this.f17486f = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f17487j = a0.h.G(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long s() {
        o();
        return this.f17490t;
    }

    public final long t() {
        q();
        return this.f17486f;
    }

    public final String u() {
        q();
        return this.f17487j;
    }
}