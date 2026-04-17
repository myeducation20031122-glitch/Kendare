package com.isprid.kendare.util;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s9.g;
import z8.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/isprid/kendare/util/LollipopFixedWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class LollipopFixedWebView extends WebView {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11690b = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public LollipopFixedWebView(Context context, AttributeSet attributeSet) {
        Intrinsics.f(context, "context");
        Context contextCreateConfigurationContext = context.createConfigurationContext(new Configuration());
        Intrinsics.e(contextCreateConfigurationContext, "context.createConfigurat…nContext(Configuration())");
        super(contextCreateConfigurationContext, attributeSet);
    }

    public final void a() {
        setBackgroundColor(0);
        setFocusableInTouchMode(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setFocusable(false);
        getSettings().setDefaultTextEncodingName("UTF-8");
        setWebViewClient(new k(1));
        setOnLongClickListener(new g());
        setLongClickable(false);
        setHapticFeedbackEnabled(false);
    }
}