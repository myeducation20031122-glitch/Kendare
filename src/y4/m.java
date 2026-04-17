package y4;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(int i10) {
        String str;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i10);
        HashMap map = f7.a.f12706a;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = f7.a.f12707b;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) map2.get(numValueOf)) + ")";
            } else {
                str = "";
            }
        }
        objArr[1] = str;
        super(new Status(i10, String.format(locale, "Install Error(%d): %s", objArr), null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}