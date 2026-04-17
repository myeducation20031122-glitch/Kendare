package lb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import vb.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a implements Function1 {
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Name.j((String) obj);
            case 1:
                DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj;
                descriptorRendererOptions.i();
                descriptorRendererOptions.f();
                AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
                descriptorRendererOptions.g();
                descriptorRendererOptions.d(DescriptorRendererModifier.f);
                return Unit.a;
            case 2:
                return (CallableMemberDescriptor) obj;
            case 3:
                return (CallableMemberDescriptor) obj;
            default:
                return ((e) obj).b.invoke();
        }
    }
}