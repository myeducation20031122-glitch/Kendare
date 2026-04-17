package i5;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.sx0;
import com.google.android.gms.internal.ads.to0;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xx0;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t1.d0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f13390a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f13391b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Java16SealedRecordLoader.Cache f13392c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f13393d = true;

    public static void a(Appendable appendable, Object obj, Function1 function1) {
        CharSequence charSequenceValueOf;
        Intrinsics.f(appendable, "<this>");
        if (function1 == null) {
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = function1.invoke(obj);
        charSequenceValueOf = (CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }

    public static Java16SealedRecordLoader.Cache b() {
        Java16SealedRecordLoader.Cache cache = f13392c;
        if (cache == null) {
            try {
                cache = new Java16SealedRecordLoader.Cache(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Java16SealedRecordLoader.Cache((Method) null, (Method) null, (Method) null, (Method) null);
            }
            f13392c = cache;
        }
        return cache;
    }

    public static void c(ViewGroup viewGroup, boolean z7) {
        if (Build.VERSION.SDK_INT >= 29) {
            d0.b(viewGroup, z7);
        } else if (f13393d) {
            try {
                d0.b(viewGroup, z7);
            } catch (NoSuchMethodError unused) {
                f13393d = false;
            }
        }
    }

    public static String d(String str) {
        Intrinsics.f(str, "<this>");
        if (!(!ec.h.w("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listY = SequencesKt.y(SequencesKt.w(ec.j.N(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new k9.c(str, 29)));
        int length = str.length();
        listY.size();
        int iJ = dq0.j(listY);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listY) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                dq0.v();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iJ) || !ec.h.w(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!dq0.n(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && ec.h.B(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb = new StringBuilder(length);
        fa.g.v3(arrayList, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        Intrinsics.e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static Bundle f(JSONObject jSONObject) {
        String strValueOf;
        String str;
        String strConcat;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else {
                    if (objOpt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() != 0) {
                            int length = jSONArray.length();
                            int i10 = 0;
                            Object objOpt2 = null;
                            for (int i11 = 0; objOpt2 == null && i11 < length; i11++) {
                                objOpt2 = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                            }
                            if (objOpt2 == null) {
                                strValueOf = String.valueOf(next);
                                str = "Expected JSONArray with at least 1 non-null element for key:";
                                strConcat = str.concat(strValueOf);
                            } else if (objOpt2 instanceof JSONObject) {
                                Bundle[] bundleArr = new Bundle[length];
                                while (i10 < length) {
                                    bundleArr[i10] = !jSONArray.isNull(i10) ? f(jSONArray.optJSONObject(i10)) : null;
                                    i10++;
                                }
                                bundle.putParcelableArray(next, bundleArr);
                            } else if (objOpt2 instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i10 < length) {
                                    dArr[i10] = jSONArray.optDouble(i10);
                                    i10++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (objOpt2 instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i10 < length) {
                                    strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                    i10++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (objOpt2 instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i10 < length) {
                                    zArr[i10] = jSONArray.optBoolean(i10);
                                    i10++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                strConcat = String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next);
                            }
                        }
                    } else if (objOpt instanceof JSONObject) {
                        bundle.putBundle(next, f((JSONObject) objOpt));
                    } else {
                        strValueOf = String.valueOf(next);
                        str = "Unsupported type for key:";
                        strConcat = str.concat(strValueOf);
                    }
                    wr.g(strConcat);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader g() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        g gVar;
        if (f13390a == null) {
            Thread thread2 = f13391b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f13391b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                    }
                }
                f13390a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        gVar = new g(threadGroup, "GmsDynamite");
                                    } catch (SecurityException e12) {
                                        e10 = e12;
                                    }
                                    try {
                                        gVar.setContextClassLoader(null);
                                        gVar.start();
                                        thread = gVar;
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                        thread = gVar;
                                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                        thread2 = thread;
                                        f13391b = thread2;
                                        if (thread2 != null) {
                                        }
                                        f13390a = contextClassLoader;
                                        return f13390a;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } finally {
                        }
                    }
                    thread2 = thread;
                }
                f13391b = thread2;
                if (thread2 != null) {
                }
                f13390a = contextClassLoader;
            }
        }
        return f13390a;
    }

    public static sx0 h(xx0 xx0Var) {
        return new sx0(xx0Var);
    }

    public static List i(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }

    public static ArrayList j(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray k(JsonReader jsonReader) throws JSONException, IOException {
        Object objK;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objK = k(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objK = m(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objK = jsonReader.nextString();
            }
            jSONArray.put(objK);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject l(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject m(JsonReader jsonReader) throws JSONException, IOException {
        Object objK;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objK = k(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objK = m(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objK = jsonReader.nextString();
            }
            jSONObject.put(strNextName, objK);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void n(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    o(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    n(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static void o(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    o(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    n(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static String p(to0 to0Var) throws JSONException, IOException {
        if (to0Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            r(jsonWriter, to0Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            wr.e("Error when writing JSON.", e10);
            return null;
        }
    }

    public static JSONObject q(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    public static void r(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof to0) {
            o(jsonWriter, ((to0) obj).f8824d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                r(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                r(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public abstract void e();
}