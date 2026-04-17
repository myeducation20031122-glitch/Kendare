package s2;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public static final StackTraceElement[] f16681n = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public final List f16682b;

    /* renamed from: e, reason: collision with root package name */
    public q2.j f16683e;

    /* renamed from: f, reason: collision with root package name */
    public q2.a f16684f;

    /* renamed from: j, reason: collision with root package name */
    public Class f16685j;

    /* renamed from: m, reason: collision with root package name */
    public final String f16686m;

    public a0(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof a0)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((a0) th).f16682b.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, z zVar) {
        try {
            c(list, zVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, z zVar) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            zVar.append("Cause (");
            int i11 = i10 + 1;
            zVar.append(String.valueOf(i11));
            zVar.append(" of ");
            zVar.append(String.valueOf(size));
            zVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof a0) {
                ((a0) th).f(zVar);
            } else {
                d(th, zVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) throws IOException {
        d(this, appendable);
        b(this.f16682b, new z(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f16686m);
        String str4 = "";
        if (this.f16685j != null) {
            str = ", " + this.f16685j;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f16684f != null) {
            str2 = ", " + this.f16684f;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f16683e != null) {
            str4 = ", " + this.f16683e;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        f(System.err);
    }

    public a0(String str, List list) {
        this.f16686m = str;
        setStackTrace(f16681n);
        this.f16682b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        f(printWriter);
    }
}