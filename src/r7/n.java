package r7;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import m.s3;
import t7.c1;
import t7.j0;
import t7.l0;
import t7.n0;
import t7.q1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f16612e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f16613f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16614a;

    /* renamed from: b, reason: collision with root package name */
    public final r f16615b;

    /* renamed from: c, reason: collision with root package name */
    public final s3 f16616c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.a f16617d;

    static {
        HashMap map = new HashMap();
        f16612e = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f16613f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.12");
    }

    public n(Context context, r rVar, s3 s3Var, g0.d dVar) {
        this.f16614a = context;
        this.f16615b = rVar;
        this.f16616c = s3Var;
        this.f16617d = dVar;
    }

    public static j0 c(n8.s sVar, int i10) {
        String str = (String) sVar.f15436e;
        String str2 = (String) sVar.f15435b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f15437f;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        n8.s sVar2 = (n8.s) sVar.f15438j;
        if (i10 >= 8) {
            n8.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (n8.s) sVar3.f15438j;
                i11++;
            }
        }
        q.d dVar = new q.d(9);
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        dVar.f16087b = str;
        dVar.f16088e = str2;
        dVar.f16089f = new q1(d(stackTraceElementArr, 4));
        dVar.f16091m = Integer.valueOf(i11);
        if (sVar2 != null && i11 == 0) {
            dVar.f16090j = c(sVar2, i10 + 1);
        }
        return dVar.d();
    }

    public static q1 d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            q.d dVar = new q.d(10);
            dVar.f16091m = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            dVar.f16087b = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            dVar.f16088e = str;
            dVar.f16089f = fileName;
            dVar.f16090j = Long.valueOf(lineNumber);
            arrayList.add(dVar.e());
        }
        return new q1(arrayList);
    }

    public static l0 e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        o5.d dVar = new o5.d(14);
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        dVar.f15721e = name;
        dVar.f15722f = Integer.valueOf(i10);
        dVar.f15723j = new q1(d(stackTraceElementArr, i10));
        return dVar.j();
    }

    public final q1 a() {
        c1[] c1VarArr = new c1[1];
        n8.s sVar = new n8.s(10);
        sVar.f15436e = 0L;
        sVar.f15437f = 0L;
        s3 s3Var = this.f16616c;
        String str = (String) s3Var.f14930j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        sVar.f15435b = str;
        sVar.f15438j = (String) s3Var.f14928e;
        c1VarArr[0] = sVar.a();
        return new q1(Arrays.asList(c1VarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n0 b(int i10) {
        boolean z7;
        Float fValueOf;
        Intent intentRegisterReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.f16614a;
        int i11 = 2;
        boolean z10 = false;
        try {
            intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e10) {
            e = e10;
            z7 = false;
        }
        if (intentRegisterReceiver != null) {
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            z7 = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                if (fValueOf != null) {
                }
                if (z7) {
                    i11 = 1;
                }
                if (!e.g()) {
                    z10 = true;
                }
                long jE = e.e();
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                long j10 = jE - memoryInfo.availMem;
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                v7.b bVar = new v7.b(6);
                bVar.f18509b = dValueOf;
                bVar.f18510e = Integer.valueOf(i11);
                bVar.f18511f = Boolean.valueOf(z10);
                bVar.f18512j = Integer.valueOf(i10);
                bVar.f18513m = Long.valueOf(j10);
                bVar.f18514n = Long.valueOf((r6.getBlockCount() * blockSize) - (blockSize * r6.getAvailableBlocks()));
                return bVar.b();
            }
            fValueOf = (intExtra == -1 || intExtra2 == -1) ? null : Float.valueOf(intExtra / intExtra2);
        } else {
            fValueOf = null;
            z7 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (z7 || fValueOf == null) {
            i11 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i11 = 3;
        }
        if (!e.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z10 = true;
        }
        long jE2 = e.e();
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        long j102 = jE2 - memoryInfo2.availMem;
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        v7.b bVar2 = new v7.b(6);
        bVar2.f18509b = dValueOf;
        bVar2.f18510e = Integer.valueOf(i11);
        bVar2.f18511f = Boolean.valueOf(z10);
        bVar2.f18512j = Integer.valueOf(i10);
        bVar2.f18513m = Long.valueOf(j102);
        bVar2.f18514n = Long.valueOf((r6.getBlockCount() * blockSize2) - (blockSize2 * r6.getAvailableBlocks()));
        return bVar2.b();
    }
}