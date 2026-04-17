package a2;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f254a = z1.o.t("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f255b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || !databasePath.exists()) {
            return;
        }
        String str = f254a;
        z1.o.r().p(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        HashMap map = new HashMap();
        if (i10 >= 23) {
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            File databasePath3 = i10 < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath2, databasePath3);
            for (String str2 : f255b) {
                map.put(new File(databasePath2.getPath() + str2), new File(databasePath3.getPath() + str2));
            }
        }
        for (File file : map.keySet()) {
            File file2 = (File) map.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    z1.o.r().u(str, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                z1.o.r().p(str, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }
}