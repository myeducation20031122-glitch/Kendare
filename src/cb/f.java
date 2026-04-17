package cb;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class f extends FunctionReference implements Function1 {
    public static final f b = new f(1);

    public final String getName() {
        return "isSynthetic";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        Intrinsics.f(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}