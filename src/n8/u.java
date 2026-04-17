package n8;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15443d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f15444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15446c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f15443d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f15444a = strSubstring;
        this.f15445b = str;
        this.f15446c = a0.h.G(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f15444a.equals(uVar.f15444a) && this.f15445b.equals(uVar.f15445b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15445b, this.f15444a});
    }
}