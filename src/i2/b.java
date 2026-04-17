package i2;

import android.os.Build;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import kc.r;
import l1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends l1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, p pVar, int i10) {
        super(pVar);
        this.f13242d = i10;
        this.f13243e = obj;
    }

    @Override // l1.t
    public final String b() {
        switch (this.f13242d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case QueueFuseable.SYNC /* 1 */:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01d7 -> B:99:0x01f1). Please report as a decompilation issue!!! */
    @Override // l1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(q1.g gVar, Object obj) throws Throwable {
        int i10;
        int i11;
        int i12;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        HashSet hashSet;
        int i13 = 2;
        switch (this.f13242d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f13240a;
                if (str == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str);
                }
                String str2 = aVar.f13241b;
                if (str2 == null) {
                    gVar.d(2);
                    return;
                } else {
                    gVar.e(2, str2);
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                d dVar = (d) obj;
                String str3 = dVar.f13246a;
                if (str3 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str3);
                }
                Long l10 = dVar.f13247b;
                if (l10 == null) {
                    gVar.d(2);
                    return;
                } else {
                    gVar.c(2, l10.longValue());
                    return;
                }
            case 2:
                String str4 = ((e) obj).f13248a;
                if (str4 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str4);
                }
                gVar.c(2, r0.f13249b);
                return;
            case 3:
                f fVar = (f) obj;
                String str5 = fVar.f13250a;
                if (str5 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str5);
                }
                String str6 = fVar.f13251b;
                if (str6 == null) {
                    gVar.d(2);
                    return;
                } else {
                    gVar.e(2, str6);
                    return;
                }
            case 4:
                g gVar2 = (g) obj;
                String str7 = gVar2.f13252a;
                if (str7 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str7);
                }
                byte[] bArrC = z1.g.c(gVar2.f13253b);
                if (bArrC == null) {
                    gVar.d(2);
                    return;
                } else {
                    gVar.a(bArrC, 2);
                    return;
                }
            case y4.g.INVALID_ACCOUNT /* 5 */:
                j jVar = (j) obj;
                String str8 = jVar.f13258a;
                if (str8 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str8);
                }
                gVar.c(2, com.bumptech.glide.e.N(jVar.f13259b));
                String str9 = jVar.f13260c;
                if (str9 == null) {
                    gVar.d(3);
                } else {
                    gVar.e(3, str9);
                }
                String str10 = jVar.f13261d;
                if (str10 == null) {
                    gVar.d(4);
                } else {
                    gVar.e(4, str10);
                }
                byte[] bArrC2 = z1.g.c(jVar.f13262e);
                if (bArrC2 == null) {
                    gVar.d(5);
                } else {
                    gVar.a(bArrC2, 5);
                }
                byte[] bArrC3 = z1.g.c(jVar.f13263f);
                if (bArrC3 == null) {
                    gVar.d(6);
                } else {
                    gVar.a(bArrC3, 6);
                }
                gVar.c(7, jVar.f13264g);
                gVar.c(8, jVar.f13265h);
                gVar.c(9, jVar.f13266i);
                gVar.c(10, jVar.f13268k);
                int i14 = jVar.f13269l;
                int iB = v.h.b(i14);
                if (iB == 0) {
                    i10 = 0;
                } else {
                    if (iB != 1) {
                        throw new IllegalArgumentException("Could not convert " + r.u(i14) + " to int");
                    }
                    i10 = 1;
                }
                gVar.c(11, i10);
                gVar.c(12, jVar.f13270m);
                gVar.c(13, jVar.f13271n);
                gVar.c(14, jVar.f13272o);
                gVar.c(15, jVar.f13273p);
                gVar.c(16, jVar.f13274q ? 1L : 0L);
                int i15 = jVar.f13275r;
                int iB2 = v.h.b(i15);
                if (iB2 == 0) {
                    i11 = 0;
                } else {
                    if (iB2 != 1) {
                        throw new IllegalArgumentException("Could not convert " + r.v(i15) + " to int");
                    }
                    i11 = 1;
                }
                gVar.c(17, i11);
                z1.c cVar = jVar.f13267j;
                if (cVar != null) {
                    z1.p pVar = cVar.f19459a;
                    int iOrdinal = pVar.ordinal();
                    if (iOrdinal == 0) {
                        i13 = 0;
                    } else if (iOrdinal == 1) {
                        i13 = 1;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            i13 = 3;
                        } else if (iOrdinal == 4) {
                            i13 = 4;
                        } else {
                            if (Build.VERSION.SDK_INT < 30 || pVar != z1.p.f19487n) {
                                throw new IllegalArgumentException("Could not convert " + pVar + " to int");
                            }
                            i13 = 5;
                        }
                    }
                    gVar.c(18, i13);
                    gVar.c(19, cVar.f19460b ? 1L : 0L);
                    gVar.c(20, cVar.f19461c ? 1L : 0L);
                    gVar.c(21, cVar.f19462d ? 1L : 0L);
                    gVar.c(22, cVar.f19463e ? 1L : 0L);
                    gVar.c(23, cVar.f19464f);
                    gVar.c(24, cVar.f19465g);
                    z1.e eVar = cVar.f19466h;
                    byte[] byteArray = null;
                    objectOutputStream = null;
                    ObjectOutputStream objectOutputStream2 = null;
                    if (eVar.f19469a.size() != 0) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            try {
                                try {
                                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                    hashSet = eVar.f19469a;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            } catch (IOException e11) {
                                e = e11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            objectOutputStream.writeInt(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                z1.d dVar2 = (z1.d) it.next();
                                objectOutputStream.writeUTF(dVar2.f19467a.toString());
                                objectOutputStream.writeBoolean(dVar2.f19468b);
                            }
                            try {
                                objectOutputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                            byteArrayOutputStream.close();
                        } catch (IOException e13) {
                            e = e13;
                            objectOutputStream2 = objectOutputStream;
                            e.printStackTrace();
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            i12 = 25;
                            if (byteArray != null) {
                            }
                            gVar.d(i12);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            objectOutputStream2 = objectOutputStream;
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e16) {
                                e16.printStackTrace();
                                throw th;
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    i12 = 25;
                    if (byteArray != null) {
                        gVar.a(byteArray, 25);
                        return;
                    }
                } else {
                    gVar.d(18);
                    gVar.d(19);
                    gVar.d(20);
                    gVar.d(21);
                    gVar.d(22);
                    gVar.d(23);
                    gVar.d(24);
                    i12 = 25;
                }
                gVar.d(i12);
                return;
            default:
                l lVar = (l) obj;
                String str11 = lVar.f13277a;
                if (str11 == null) {
                    gVar.d(1);
                } else {
                    gVar.e(1, str11);
                }
                String str12 = lVar.f13278b;
                if (str12 == null) {
                    gVar.d(2);
                    return;
                } else {
                    gVar.e(2, str12);
                    return;
                }
        }
    }
}