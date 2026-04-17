package n2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ic1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class p implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private b mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private r mErrorListener;
    private final z mEventLog;
    private final Object mLock;
    private final int mMethod;
    private n mRequestCompleteListener;
    private q mRequestQueue;
    private boolean mResponseDelivered;
    private u mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public p(String str, r rVar) {
        Uri uri;
        String host;
        this.mEventLog = z.f15346c ? new z() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        int iHashCode = 0;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = 0;
        this.mUrl = str;
        this.mErrorListener = rVar;
        setRetryPolicy(new e(2500, 1.0f, 1));
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.mDefaultTrafficStatsTag = iHashCode;
    }

    public static byte[] c(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(a0.h.v("Encoding not supported: ", str), e10);
        }
    }

    public void addMarker(String str) {
        if (z.f15346c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(x xVar) {
        r rVar;
        synchronized (this.mLock) {
            rVar = this.mErrorListener;
        }
        if (rVar != null) {
            rVar.onErrorResponse(xVar);
        }
    }

    public abstract void deliverResponse(Object obj);

    public void finish(String str) {
        q qVar = this.mRequestQueue;
        if (qVar != null) {
            synchronized (qVar.f15328b) {
                qVar.f15328b.remove(this);
            }
            synchronized (qVar.f15336j) {
                Iterator it = qVar.f15336j.iterator();
                if (it.hasNext()) {
                    ic1.v(it.next());
                    throw null;
                }
            }
            qVar.b();
        }
        if (z.f15346c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new m(this, str, id, 0));
            } else {
                this.mEventLog.a(id, str);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return c(getParamsEncoding(), params);
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public b getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public r getErrorListener() {
        r rVar;
        synchronized (this.mLock) {
            rVar = this.mErrorListener;
        }
        return rVar;
    }

    public abstract Map getHeaders();

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return c(getPostParamsEncoding(), postParams);
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public o getPriority() {
        return o.f15325e;
    }

    public u getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((e) getRetryPolicy()).f15303a;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z7;
        synchronized (this.mLock) {
            z7 = this.mResponseDelivered;
        }
        return z7;
    }

    public boolean isCanceled() {
        boolean z7;
        synchronized (this.mLock) {
            z7 = this.mCanceled;
        }
        return z7;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        n nVar;
        synchronized (this.mLock) {
            nVar = this.mRequestCompleteListener;
        }
        if (nVar != null) {
            ((b0) nVar).b(this);
        }
    }

    public void notifyListenerResponseReceived(t tVar) {
        n nVar;
        synchronized (this.mLock) {
            nVar = this.mRequestCompleteListener;
        }
        if (nVar != null) {
            ((b0) nVar).c(this, tVar);
        }
    }

    public x parseNetworkError(x xVar) {
        return xVar;
    }

    public abstract t parseNetworkResponse(j jVar);

    public void sendEvent(int i10) {
        q qVar = this.mRequestQueue;
        if (qVar != null) {
            qVar.b();
        }
    }

    public p setCacheEntry(b bVar) {
        this.mCacheEntry = bVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(n nVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = nVar;
        }
    }

    public p setRequestQueue(q qVar) {
        this.mRequestQueue = qVar;
        return this;
    }

    public p setRetryPolicy(u uVar) {
        this.mRetryPolicy = uVar;
        return this;
    }

    public final p setSequence(int i10) {
        this.mSequence = Integer.valueOf(i10);
        return this;
    }

    public final p setShouldCache(boolean z7) {
        this.mShouldCache = z7;
        return this;
    }

    public final p setShouldRetryConnectionErrors(boolean z7) {
        this.mShouldRetryConnectionErrors = z7;
        return this;
    }

    public final p setShouldRetryServerErrors(boolean z7) {
        this.mShouldRetryServerErrors = z7;
        return this;
    }

    public p setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(p pVar) {
        o priority = getPriority();
        o priority2 = pVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - pVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}