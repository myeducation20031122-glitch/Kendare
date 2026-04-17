package z1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19471b = o.t("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final g f19472c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19473a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f19472c = gVar;
    }

    public g(Map map) {
        this.f19473a = new HashMap(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e10;
        String str = f19471b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e11) {
                Log.e(str, "Error in Data#fromByteArray: ", e11);
            }
            try {
                for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                    map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#fromByteArray: ", e12);
                }
                byteArrayInputStream.close();
            } catch (IOException e13) {
                e10 = e13;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e14) {
                        Log.e(str, "Error in Data#fromByteArray: ", e14);
                    }
                }
                byteArrayInputStream.close();
                return new g(map);
            } catch (ClassNotFoundException e15) {
                e10 = e15;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new g(map);
            }
        } catch (IOException e16) {
            e = e16;
            Throwable th2 = e;
            objectInputStream = null;
            e10 = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e10);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new g(map);
        } catch (ClassNotFoundException e17) {
            e = e17;
            Throwable th22 = e;
            objectInputStream = null;
            e10 = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e10);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new g(map);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e18) {
                    Log.e(str, "Error in Data#fromByteArray: ", e18);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e19) {
                Log.e(str, "Error in Data#fromByteArray: ", e19);
                throw th;
            }
        }
        return new g(map);
    }

    public static byte[] c(g gVar) {
        ObjectOutputStream objectOutputStream;
        String str = f19471b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(gVar.f19473a.size());
            for (Map.Entry entry : gVar.f19473a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e16) {
                    Log.e(str, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(str, "Error in Data#toByteArray: ", e17);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f19473a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f19473a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((g) obj).f19473a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 != obj3) {
                    return false;
                }
            } else {
                if (!(((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f19473a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f19473a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public g(g gVar) {
        this.f19473a = new HashMap(gVar.f19473a);
    }
}