package ec;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.MatcherMatchResult$groups$1;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d implements MatchResult {
    public final Matcher a;
    public MatcherMatchResult$groupValues$1 b;

    public d(Matcher matcher, String str) {
        this.a = matcher;
        new MatcherMatchResult$groups$1(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatcherMatchResult$groupValues$1] */
    public final List a() {
        if (this.b == null) {
            this.b = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return super/*kotlin.collections.AbstractCollection*/.contains((String) obj);
                    }
                    return false;
                }

                public final Object get(int i) {
                    String strGroup = this.b.a.group(i);
                    return strGroup == null ? HttpUrl.FRAGMENT_ENCODE_SET : strGroup;
                }

                public final int getSize() {
                    return this.b.a.groupCount() + 1;
                }

                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.indexOf((String) obj);
                    }
                    return -1;
                }

                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.lastIndexOf((String) obj);
                    }
                    return -1;
                }
            };
        }
        AbstractList abstractList = this.b;
        Intrinsics.c(abstractList);
        return abstractList;
    }
}