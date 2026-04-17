package q8;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public enum e extends h {
    public e() {
        super("LOWER_CASE_WITH_UNDERSCORES", 4);
    }

    @Override // q8.i
    public final String c(Field field) {
        return h.e('_', field.getName()).toLowerCase(Locale.ENGLISH);
    }
}