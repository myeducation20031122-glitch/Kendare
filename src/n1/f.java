package n1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f15278a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15279b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f15280c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f15281d;

    public f(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f15278a = str;
        this.f15279b = Collections.unmodifiableMap(map);
        this.f15280c = Collections.unmodifiableSet(hashSet);
        this.f15281d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static f a(q1.b bVar, String str) {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        Cursor cursorD = bVar.d("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorD.getColumnCount() > 0) {
                int columnIndex = cursorD.getColumnIndex("name");
                int columnIndex2 = cursorD.getColumnIndex("type");
                int columnIndex3 = cursorD.getColumnIndex("notnull");
                int columnIndex4 = cursorD.getColumnIndex("pk");
                int columnIndex5 = cursorD.getColumnIndex("dflt_value");
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(columnIndex);
                    map.put(string, new b(cursorD.getInt(columnIndex4), 2, string, cursorD.getString(columnIndex2), cursorD.getString(columnIndex5), cursorD.getInt(columnIndex3) != 0));
                }
            }
            cursorD.close();
            HashSet hashSet = new HashSet();
            cursorD = bVar.d("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorD.getColumnIndex("id");
                int columnIndex7 = cursorD.getColumnIndex("seq");
                int columnIndex8 = cursorD.getColumnIndex("table");
                int columnIndex9 = cursorD.getColumnIndex("on_delete");
                int columnIndex10 = cursorD.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorD);
                int count = cursorD.getCount();
                int i13 = 0;
                while (i13 < count) {
                    cursorD.moveToPosition(i13);
                    if (cursorD.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = arrayListB;
                        i12 = count;
                    } else {
                        int i14 = cursorD.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayListB.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = arrayListB;
                            d dVar = (d) it.next();
                            int i15 = count;
                            if (dVar.f15271b == i14) {
                                arrayList2.add(dVar.f15273f);
                                arrayList3.add(dVar.f15274j);
                            }
                            arrayListB = arrayList4;
                            count = i15;
                        }
                        arrayList = arrayListB;
                        i12 = count;
                        hashSet.add(new c(cursorD.getString(columnIndex8), cursorD.getString(columnIndex9), cursorD.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i13++;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    arrayListB = arrayList;
                    count = i12;
                }
                cursorD.close();
                cursorD = bVar.d("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorD.getColumnIndex("name");
                    int columnIndex12 = cursorD.getColumnIndex("origin");
                    int columnIndex13 = cursorD.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorD.moveToNext()) {
                        if ("c".equals(cursorD.getString(columnIndex12))) {
                            e eVarC = c(bVar, cursorD.getString(columnIndex11), cursorD.getInt(columnIndex13) == 1);
                            if (eVarC == null) {
                                break;
                            }
                            hashSet3.add(eVarC);
                        }
                    }
                    cursorD.close();
                    hashSet2 = hashSet3;
                    return new f(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new d(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getString(columnIndex4), cursor.getInt(columnIndex2)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static e c(q1.b bVar, String str, boolean z7) {
        Cursor cursorD = bVar.d("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorD.getColumnIndex("seqno");
            int columnIndex2 = cursorD.getColumnIndex("cid");
            int columnIndex3 = cursorD.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorD.moveToNext()) {
                    if (cursorD.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorD.getInt(columnIndex)), cursorD.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                e eVar = new e(str, arrayList, z7);
                cursorD.close();
                return eVar;
            }
            cursorD.close();
            return null;
        } catch (Throwable th) {
            cursorD.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = fVar.f15278a;
        String str2 = this.f15278a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = fVar.f15279b;
        Map map2 = this.f15279b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = fVar.f15280c;
        Set set3 = this.f15280c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f15281d;
        if (set4 == null || (set = fVar.f15281d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f15278a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f15279b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f15280c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f15278a + "', columns=" + this.f15279b + ", foreignKeys=" + this.f15280c + ", indices=" + this.f15281d + '}';
    }
}