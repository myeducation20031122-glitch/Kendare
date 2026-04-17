package com.isprid.kendare.network.util;

import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/isprid/kendare/network/util/ResourceState;", "", "()V", "ERROR", "LOADING", "SUCCESS", "Lcom/isprid/kendare/network/util/ResourceState$ERROR;", "Lcom/isprid/kendare/network/util/ResourceState$LOADING;", "Lcom/isprid/kendare/network/util/ResourceState$SUCCESS;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class ResourceState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/isprid/kendare/network/util/ResourceState$ERROR;", "Lcom/isprid/kendare/network/util/ResourceState;", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class ERROR extends ResourceState {
        public static final ERROR INSTANCE = new ERROR();

        private ERROR() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/isprid/kendare/network/util/ResourceState$LOADING;", "Lcom/isprid/kendare/network/util/ResourceState;", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class LOADING extends ResourceState {
        public static final LOADING INSTANCE = new LOADING();

        private LOADING() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/isprid/kendare/network/util/ResourceState$SUCCESS;", "Lcom/isprid/kendare/network/util/ResourceState;", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
    public static final class SUCCESS extends ResourceState {
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }
    }

    private ResourceState() {
    }

    public /* synthetic */ ResourceState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}