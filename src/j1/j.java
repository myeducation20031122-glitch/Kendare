package j1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f13561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13563c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13564d;

    public j(int i10, int i11, long j10, long j11) {
        this.f13561a = i10;
        this.f13562b = i11;
        this.f13563c = j10;
        this.f13564d = j11;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f13561a);
            dataOutputStream.writeInt(this.f13562b);
            dataOutputStream.writeLong(this.f13563c);
            dataOutputStream.writeLong(this.f13564d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13562b == jVar.f13562b && this.f13563c == jVar.f13563c && this.f13561a == jVar.f13561a && this.f13564d == jVar.f13564d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13562b), Long.valueOf(this.f13563c), Integer.valueOf(this.f13561a), Long.valueOf(this.f13564d));
    }
}