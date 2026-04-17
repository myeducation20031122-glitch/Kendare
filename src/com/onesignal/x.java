package com.onesignal;

import android.content.pm.PackageInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12217a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f12218b;

    public x(PackageInfo packageInfo, boolean z7) {
        this.f12217a = z7;
        this.f12218b = packageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f12217a == xVar.f12217a && Intrinsics.a(this.f12218b, xVar.f12218b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z7 = this.f12217a;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        PackageInfo packageInfo = this.f12218b;
        return i10 + (packageInfo == null ? 0 : packageInfo.hashCode());
    }

    public final String toString() {
        return "GetPackageInfoResult(successful=" + this.f12217a + ", packageInfo=" + this.f12218b + ')';
    }
}