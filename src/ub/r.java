package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public interface r {
    Collection a(Name name, NoLookupLocation noLookupLocation);

    Set b();

    Set c();

    Collection d(Name name, NoLookupLocation noLookupLocation);

    void e(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1);

    Set f();

    TypeAliasDescriptor g(Name name);
}