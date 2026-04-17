package com.isprid.kendare.network.apis;

import com.isprid.kendare.network.model.ArticleResponse;
import com.isprid.kendare.network.model.ArticlesResponse;
import io.reactivex.Single;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'¨\u0006\t"}, d2 = {"Lcom/isprid/kendare/network/apis/ArticleApi;", "", "getArticle", "Lio/reactivex/Single;", "Lcom/isprid/kendare/network/model/ArticleResponse;", "id", "", "getArticles", "Lcom/isprid/kendare/network/model/ArticlesResponse;", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public interface ArticleApi {
    @GET("article/{id}")
    Single<ArticleResponse> getArticle(@Path("id") String str);

    @GET("articles")
    Single<ArticlesResponse> getArticles();
}