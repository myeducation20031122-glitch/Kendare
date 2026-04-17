package a1;

import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: m, reason: collision with root package name */
    public static final ByteOrder f181m = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: n, reason: collision with root package name */
    public static final ByteOrder f182n = ByteOrder.BIG_ENDIAN;

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f183b;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f184e;

    /* renamed from: f, reason: collision with root package name */
    public int f185f;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f186j;

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f183b;
            int i12 = i10 - i11;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f186j == null) {
                    this.f186j = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f186j, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(ic1.m("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f185f += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f183b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f185f++;
        return this.f183b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f185f++;
        return this.f183b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f185f++;
        int i10 = this.f183b.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f185f += 2;
        return this.f183b.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f185f += bArr.length;
        this.f183b.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f185f += 4;
        DataInputStream dataInputStream = this.f183b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f184e;
        if (byteOrder == f181m) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f182n) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f184e);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f185f += 8;
        DataInputStream dataInputStream = this.f183b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f184e;
        if (byteOrder == f181m) {
            return (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f182n) {
            return (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8) + i17;
        }
        throw new IOException("Invalid byte order: " + this.f184e);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f185f += 2;
        DataInputStream dataInputStream = this.f183b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f184e;
        if (byteOrder == f181m) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == f182n) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f184e);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f185f += 2;
        return this.f183b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f185f++;
        return this.f183b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f185f += 2;
        DataInputStream dataInputStream = this.f183b;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f184e;
        if (byteOrder == f181m) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == f182n) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f184e);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f184e = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f183b = dataInputStream;
        dataInputStream.mark(0);
        this.f185f = 0;
        this.f184e = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f183b.read(bArr, i10, i11);
        this.f185f += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f185f += i11;
        this.f183b.readFully(bArr, i10, i11);
    }

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }
}