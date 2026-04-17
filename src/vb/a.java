package vb;

import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends g {
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LockBasedStorageManager lockBasedStorageManager, Function0 function0, EmptyList emptyList) {
        super(lockBasedStorageManager, function0);
        this.j = emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.c
    public final j c(boolean z) {
        return new j(this.j, false);
    }
}