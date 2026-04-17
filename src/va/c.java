package va;

import ab.i;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ DeclarationDescriptor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(Object obj, DeclarationDescriptor declarationDescriptor, int i) {
        this.b = i;
        this.f = obj;
        this.e = declarationDescriptor;
    }

    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        switch (i) {
            case 0:
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                ModuleDescriptorImpl moduleDescriptorImpl = kotlinBuiltIns.a;
                DeclarationDescriptor declarationDescriptor = this.e;
                if (moduleDescriptorImpl == null) {
                    kotlinBuiltIns.a = (ModuleDescriptorImpl) declarationDescriptor;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.a + " (attempting to reset to " + ((ModuleDescriptorImpl) declarationDescriptor) + ")");
            default:
                i iVar = (i) obj;
                iVar.getClass();
                HashSet hashSet = new HashSet();
                for (Name name : (Set) iVar.e.N.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.n;
                    hashSet.addAll(iVar.a(name, noLookupLocation));
                    hashSet.addAll(iVar.d(name, noLookupLocation));
                }
                return hashSet;
        }
    }
}