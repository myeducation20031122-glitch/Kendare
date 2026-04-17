package k4;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.wr;
import j4.o;
import j4.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends FrameLayout implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f14007b;

    /* renamed from: e, reason: collision with root package name */
    public final b f14008e;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(Activity activity, j jVar, b bVar) {
        Resources resourcesA;
        super(activity);
        this.f14008e = bVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(activity);
        this.f14007b = imageButton;
        String str = (String) q.f13781d.f13784c.a(ge.N0);
        if (TextUtils.isEmpty(str) || "default".equals(str) || (resourcesA = i4.k.A.f13352g.a()) == null) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            try {
            } catch (Resources.NotFoundException unused) {
                wr.b("Close button resource not found, falling back to default.");
            }
            Drawable drawable = "white".equals(str) ? resourcesA.getDrawable(2131165304) : "black".equals(str) ? resourcesA.getDrawable(2131165303) : null;
            if (drawable != null) {
                imageButton.setImageDrawable(drawable);
                imageButton.setScaleType(ImageView.ScaleType.CENTER);
            }
        }
        this.f14007b.setBackgroundColor(0);
        this.f14007b.setOnClickListener(this);
        ImageButton imageButton2 = this.f14007b;
        sr srVar = o.f13771f.f13772a;
        imageButton2.setPadding(sr.i(activity.getResources().getDisplayMetrics(), jVar.f14003a), sr.i(activity.getResources().getDisplayMetrics(), 0), sr.i(activity.getResources().getDisplayMetrics(), jVar.f14004b), sr.i(activity.getResources().getDisplayMetrics(), jVar.f14005c));
        this.f14007b.setContentDescription("Interstitial close button");
        addView(this.f14007b, new FrameLayout.LayoutParams(sr.i(activity.getResources().getDisplayMetrics(), jVar.f14006d + jVar.f14003a + jVar.f14004b), sr.i(activity.getResources().getDisplayMetrics(), jVar.f14006d + jVar.f14005c), 17));
        ce ceVar = ge.O0;
        q qVar = q.f13781d;
        long jLongValue = ((Long) qVar.f13784c.a(ceVar)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        m.d dVar = ((Boolean) qVar.f13784c.a(ge.P0)).booleanValue() ? new m.d(this, 3) : null;
        this.f14007b.setAlpha(0.0f);
        this.f14007b.animate().alpha(1.0f).setDuration(jLongValue).setListener(dVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f14008e;
        if (bVar != null) {
            h hVar = (h) bVar;
            hVar.X = 2;
            hVar.f13995e.finish();
        }
    }
}