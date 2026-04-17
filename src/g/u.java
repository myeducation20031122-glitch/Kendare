package g;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.i1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.isprid.kendare.ui.main.MainActivity;
import com.isprid.kendare.ui.premium.PremiumActivity;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12899b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12901f;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f12899b = i10;
        this.f12900e = obj;
        this.f12901f = obj2;
    }

    private final void a() {
        i8.a aVar;
        m7.q qVar = (m7.q) this.f12900e;
        i8.c cVar = (i8.c) this.f12901f;
        if (qVar.f15219b != m7.q.f15217d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (qVar) {
            aVar = qVar.f15218a;
            qVar.f15218a = null;
            qVar.f15219b = cVar;
        }
        aVar.d(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        Object obj;
        int i10 = 1;
        switch (this.f12899b) {
            case 0:
                v vVar = (v) this.f12900e;
                Runnable runnable = (Runnable) this.f12901f;
                vVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    vVar.a();
                }
            case QueueFuseable.SYNC /* 1 */:
                ((com.bumptech.glide.d) this.f12900e).w((Typeface) this.f12901f);
                return;
            case 2:
            case 8:
            default:
                p9.a aVar = (p9.a) this.f12900e;
                String error = (String) this.f12901f;
                Date date = t9.g.N;
                aVar.getClass();
                Intrinsics.f(error, "error");
                Log.e("PremiumActivity", "onSkuDetailsError > ".concat(error));
                int i11 = PremiumActivity.N;
                PremiumActivity premiumActivity = aVar.f16076a;
                premiumActivity.k();
                Toast.makeText(premiumActivity, "Something went wrong, Please try again", 1).show();
                return;
            case 3:
                String str = (String) this.f12900e;
                c1.j violation = (c1.j) this.f12901f;
                c1.b bVar = c1.c.f2051a;
                Intrinsics.f(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 4:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f12900e;
                Context context = (Context) this.f12901f;
                profileInstallerInitializer.getClass();
                (Build.VERSION.SDK_INT >= 28 ? j1.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new r(context, i10), new Random().nextInt(Math.max(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS, 1)) + 5000);
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f12900e;
                JobParameters jobParameters = (JobParameters) this.f12901f;
                int i12 = JobInfoSchedulerService.f2425b;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                a();
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                m7.o oVar = (m7.o) this.f12900e;
                i8.c cVar = (i8.c) this.f12901f;
                synchronized (oVar) {
                    try {
                        if (oVar.f15215b == null) {
                            set = oVar.f15214a;
                            obj = cVar;
                        } else {
                            set = oVar.f15215b;
                            obj = cVar.get();
                        }
                        set.add(obj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 9:
                i1 i1Var = (i1) this.f12900e;
                Intent intent = (Intent) this.f12901f;
                i1Var.getClass();
                i1.a(intent);
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12900e;
                x5.l lVar = (x5.l) this.f12901f;
                p5.g gVar = FirebaseMessaging.f11627k;
                firebaseMessaging.getClass();
                try {
                    lVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    lVar.a(e10);
                    return;
                }
            case 11:
                n8.m mVar = (n8.m) this.f12900e;
                x5.l lVar2 = (x5.l) this.f12901f;
                mVar.getClass();
                try {
                    lVar2.b(mVar.a());
                    return;
                } catch (Exception e11) {
                    lVar2.a(e11);
                    return;
                }
            case 12:
                MainActivity this$0 = (MainActivity) this.f12900e;
                String title = (String) this.f12901f;
                int i13 = MainActivity.f11666w;
                Intrinsics.f(this$0, "this$0");
                Intrinsics.f(title, "$title");
                b supportActionBar = this$0.getSupportActionBar();
                if (supportActionBar != null) {
                    com.bumptech.glide.e.M(supportActionBar, this$0, title, false, 12);
                    return;
                }
                return;
            case y4.g.ERROR /* 13 */:
                p9.a aVar2 = (p9.a) this.f12900e;
                List products = (List) this.f12901f;
                Date date2 = t9.g.N;
                aVar2.getClass();
                Intrinsics.f(products, "products");
                boolean zIsEmpty = true ^ products.isEmpty();
                PremiumActivity premiumActivity2 = aVar2.f16076a;
                if (zIsEmpty) {
                    premiumActivity2.runOnUiThread(new androidx.emoji2.text.m(premiumActivity2, aVar2.f16077b, products, 2));
                    return;
                } else {
                    int i14 = PremiumActivity.N;
                    premiumActivity2.k();
                    return;
                }
        }
    }
}