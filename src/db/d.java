package db;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class d extends FunctionReference implements Function1 {
    public static final d b = new d(1);

    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.c(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
    }

    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    public final Object invoke(Object obj) {
        FqName fqName = (FqName) obj;
        Intrinsics.f(fqName, "p0");
        FqName fqName2 = JavaNullabilityAnnotationSettingsKt.a;
        NullabilityAnnotationStates.a.getClass();
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = NullabilityAnnotationStates.Companion.b;
        KotlinVersion kotlinVersion = new KotlinVersion(7, 20);
        Intrinsics.f(nullabilityAnnotationStatesImpl, "configuredReportLevels");
        ReportLevel reportLevel = (ReportLevel) nullabilityAnnotationStatesImpl.c.invoke(fqName);
        if (reportLevel != null) {
            return reportLevel;
        }
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl2 = JavaNullabilityAnnotationSettingsKt.c;
        nullabilityAnnotationStatesImpl2.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) nullabilityAnnotationStatesImpl2.c.invoke(fqName);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        KotlinVersion kotlinVersion2 = javaNullabilityAnnotationsStatus.b;
        return (kotlinVersion2 == null || kotlinVersion2.j - kotlinVersion.j > 0) ? javaNullabilityAnnotationsStatus.a : javaNullabilityAnnotationsStatus.c;
    }
}