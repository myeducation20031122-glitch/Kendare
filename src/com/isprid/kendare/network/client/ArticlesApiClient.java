package com.isprid.kendare.network.client;

import com.isprid.kendare.model.ConverterKt;
import com.isprid.kendare.model.DArticle;
import com.isprid.kendare.network.NetworkConfig;
import com.isprid.kendare.network.apis.ArticleApi;
import com.isprid.kendare.network.model.Article;
import com.isprid.kendare.network.model.ArticleResponse;
import com.isprid.kendare.network.model.ArticlesResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/isprid/kendare/network/client/ArticlesApiClient;", "", "()V", "articleApi", "Lcom/isprid/kendare/network/apis/ArticleApi;", "getArticle", "Lio/reactivex/Single;", "Lcom/isprid/kendare/model/DArticle;", "id", "", "getArticles", "", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ArticlesApiClient {
    private final ArticleApi articleApi;

    public ArticlesApiClient() {
        Object objCreate = NetworkConfig.INSTANCE.getRetrofitInstance().create(ArticleApi.class);
        Intrinsics.e(objCreate, "NetworkConfig.getRetrofi…e(ArticleApi::class.java)");
        this.articleApi = (ArticleApi) objCreate;
    }

    private static final DArticle getArticle$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (DArticle) tmp0.invoke(obj);
    }

    private static final List getArticles$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.f(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    public final Single<DArticle> getArticle(String id) {
        Intrinsics.f(id, "id");
        Single<DArticle> map = this.articleApi.getArticle(id).map(new a(new Function1<ArticleResponse, DArticle>() { // from class: com.isprid.kendare.network.client.ArticlesApiClient.getArticle.1
            @Override // kotlin.jvm.functions.Function1
            public final DArticle invoke(ArticleResponse it) {
                Intrinsics.f(it, "it");
                Article payload = it.getPayload();
                if (payload != null) {
                    return ConverterKt.mapToDomain(payload);
                }
                return null;
            }
        }, 0));
        Intrinsics.e(map, "articleApi.getArticle(id…?.mapToDomain()\n        }");
        return map;
    }

    public final Single<List<DArticle>> getArticles() {
        Single<List<DArticle>> map = this.articleApi.getArticles().map(new a(new Function1<ArticlesResponse, List<DArticle>>() { // from class: com.isprid.kendare.network.client.ArticlesApiClient.getArticles.1
            @Override // kotlin.jvm.functions.Function1
            public final List<DArticle> invoke(ArticlesResponse it) {
                Intrinsics.f(it, "it");
                return ConverterKt.mapToDomainServiceList(it.getPayload());
            }
        }, 1));
        Intrinsics.e(map, "articleApi.getArticles()…inServiceList()\n        }");
        return map;
    }
}