package x7;

import a2.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r7.e;
import t5.j4;
import x5.j;
import x5.k;
import x5.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Object f19100b;

    public /* synthetic */ b(Object obj) {
        this.f19100b = obj;
    }

    public final a a(JSONObject jSONObject) {
        c bVar;
        int i10 = jSONObject.getInt("settings_version");
        int i11 = 3;
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new n7.c(i11);
        } else {
            bVar = new q6.b(4);
        }
        return bVar.f((q6.b) this.f19100b, jSONObject);
    }

    public final JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f19100b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(e.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        e.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    e.a(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            e.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            e.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // x5.j
    public final k then(Object obj) throws Throwable {
        JSONObject jSONObjectR;
        FileWriter fileWriter;
        n nVar = (n) this.f19100b;
        o5.d dVar = (o5.d) nVar.f273n;
        d dVar2 = (d) nVar.f269e;
        dVar.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap mapP = o5.d.p(dVar2);
            q6.b bVar = (q6.b) dVar.f15722f;
            String str = (String) dVar.f15721e;
            bVar.getClass();
            o5.d dVar3 = new o5.d(str, mapP);
            ((Map) dVar3.f15723j).put("User-Agent", "Crashlytics Android SDK/18.2.12");
            ((Map) dVar3.f15723j).put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            o5.d.f(dVar3, dVar2);
            ((o7.c) dVar.f15723j).b("Requesting settings from " + ((String) dVar.f15721e));
            ((o7.c) dVar.f15723j).c("Settings query params were: " + mapP);
            jSONObjectR = dVar.r(dVar3.m());
        } catch (IOException e10) {
            if (((o7.c) dVar.f15723j).a(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            }
            jSONObjectR = null;
        }
        if (jSONObjectR != null) {
            a aVarA = ((b) nVar.f270f).a(jSONObjectR);
            b bVar2 = (b) nVar.f272m;
            long j10 = aVarA.f19096c;
            bVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectR.put("expires_at", j10);
                fileWriter = new FileWriter((File) bVar2.f19100b);
                try {
                    try {
                        fileWriter.write(jSONObjectR.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        e.a(fileWriter, "Failed to close settings writer.");
                        n.d("Loaded settings: ", jSONObjectR);
                        String str2 = ((d) nVar.f269e).f19106f;
                        SharedPreferences.Editor editorEdit = ((Context) nVar.f268b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        editorEdit.putString("existing_instance_identifier", str2);
                        editorEdit.apply();
                        ((AtomicReference) nVar.f275u).set(aVarA);
                        ((l) ((AtomicReference) nVar.f276w).get()).d(aVarA);
                        return j4.i(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    e.a(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                e.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            e.a(fileWriter, "Failed to close settings writer.");
            n.d("Loaded settings: ", jSONObjectR);
            String str22 = ((d) nVar.f269e).f19106f;
            SharedPreferences.Editor editorEdit2 = ((Context) nVar.f268b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit2.putString("existing_instance_identifier", str22);
            editorEdit2.apply();
            ((AtomicReference) nVar.f275u).set(aVarA);
            ((l) ((AtomicReference) nVar.f276w).get()).d(aVarA);
        }
        return j4.i(null);
    }

    public b(v7.b bVar) {
        this.f19100b = new File((File) bVar.f18510e, "com.crashlytics.settings.json");
    }
}