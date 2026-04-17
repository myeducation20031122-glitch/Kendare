package pub.devrel.easypermissions;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.yl0;
import g.i;
import g.m;
import g.p;
import ic.b;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public class AppSettingsDialogHolderActivity extends p implements DialogInterface.OnClickListener {
    public m b;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.d0*/.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.e);
            startActivityForResult(data, 7534);
        } else {
            if (i != -2) {
                throw new IllegalStateException(r.d("Unknown button type: ", i));
            }
            setResult(0);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.d0*/.onCreate(bundle);
        Intent intent = getIntent();
        b bVar = (b) intent.getParcelableExtra("extra_app_settings");
        if (bVar == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            bVar = new b(this, TextUtils.isEmpty(null) ? getString(2131886923) : null, TextUtils.isEmpty(null) ? getString(2131887096) : null, TextUtils.isEmpty(null) ? getString(R.string.ok) : null, TextUtils.isEmpty(null) ? getString(R.string.cancel) : null, 16061);
        }
        bVar.a(this);
        this.e = bVar.t;
        int i = bVar.b;
        yl0 yl0Var = i != -1 ? new yl0(bVar.w, i) : new yl0(bVar.w);
        Object obj = yl0Var.f;
        ((i) obj).k = false;
        ((i) obj).d = bVar.f;
        ((i) obj).f = bVar.e;
        yl0Var.m(bVar.j, this);
        yl0Var.l(bVar.m, this);
        m mVarI = yl0Var.i();
        mVarI.show();
        this.b = mVarI;
    }

    public final void onDestroy() {
        super.onDestroy();
        m mVar = this.b;
        if (mVar == null || !mVar.isShowing()) {
            return;
        }
        this.b.dismiss();
    }
}