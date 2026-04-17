package v7;

import a0.h;
import a2.n;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import r7.f;
import t7.f0;
import u7.c;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f18501d = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    public static final int f18502e = 15;

    /* renamed from: f, reason: collision with root package name */
    public static final c f18503f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final l0.b f18504g = new l0.b(3);

    /* renamed from: h, reason: collision with root package name */
    public static final f f18505h = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18506a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final b f18507b;

    /* renamed from: c, reason: collision with root package name */
    public final n f18508c;

    public a(b bVar, n nVar) {
        this.f18507b = bVar;
        this.f18508c = nVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f18501d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18501d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f18507b;
        arrayList.addAll(b.k(((File) bVar.f18513m).listFiles()));
        arrayList.addAll(b.k(((File) bVar.f18514n).listFiles()));
        l0.b bVar2 = f18504g;
        Collections.sort(arrayList, bVar2);
        List listK = b.k(((File) bVar.f18512j).listFiles());
        Collections.sort(listK, bVar2);
        arrayList.addAll(listK);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.k(((File) this.f18507b.f18511f).list())).descendingSet();
    }

    public final void d(f0 f0Var, String str, boolean z7) {
        b bVar = this.f18507b;
        int i10 = ((x7.a) ((AtomicReference) this.f18508c.f275u).get()).f19094a.f15644b;
        f18503f.getClass();
        int i11 = 1;
        try {
            f(bVar.g(str, h.w("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f18506a.getAndIncrement())), z7 ? "_" : "")), c.f18296a.l(f0Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        f fVar = new f(i11);
        bVar.getClass();
        File file = new File((File) bVar.f18511f, str);
        file.mkdirs();
        List<File> listK = b.k(file.listFiles(fVar));
        Collections.sort(listK, new l0.b(2));
        int size = listK.size();
        for (File file2 : listK) {
            if (size <= i10) {
                return;
            }
            b.j(file2);
            size--;
        }
    }
}