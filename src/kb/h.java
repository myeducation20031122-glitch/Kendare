package kb;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor a;

    public h(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor) {
        this.a = readKotlinClassHeaderAnnotationVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void b(Name name, ClassLiteralValue classLiteralValue) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId, Name name) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void d(Name name, ClassId classId, Name name2) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor e(Name name) {
        String strE = name.e();
        if ("data".equals(strE) || "filePartClassNames".equals(strE)) {
            return new f(this);
        }
        if ("strings".equals(strE)) {
            return new g(this);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void f(Object obj, Name name) {
        String strE = name.e();
        boolean zEquals = "version".equals(strE);
        ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = this.a;
        if (zEquals) {
            if (obj instanceof int[]) {
                readKotlinClassHeaderAnnotationVisitor.a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strE)) {
            readKotlinClassHeaderAnnotationVisitor.b = obj instanceof String ? (String) obj : null;
        }
    }
}