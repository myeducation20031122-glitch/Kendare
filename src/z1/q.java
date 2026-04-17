package z1;

import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends y {
    public q(Class cls) {
        this.f19499c = new HashSet();
        this.f19497a = UUID.randomUUID();
        this.f19498b = new i2.j(this.f19497a.toString(), cls.getName());
        this.f19499c.add(cls.getName());
        this.f19498b.f13261d = OverwritingInputMerger.class.getName();
    }
}