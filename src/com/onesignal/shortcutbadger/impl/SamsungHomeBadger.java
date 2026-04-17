package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import ba.a;
import ba.b;
import java.util.Arrays;
import java.util.List;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class SamsungHomeBadger implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12144b = {"_id", "class"};

    /* renamed from: a, reason: collision with root package name */
    public final DefaultBadger f12145a = new DefaultBadger();

    public static ContentValues c(ComponentName componentName, int i10, boolean z7) {
        ContentValues contentValues = new ContentValues();
        if (z7) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // ba.a
    public final List a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // ba.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        DefaultBadger defaultBadger = this.f12145a;
        if (defaultBadger != null && j4.d(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            defaultBadger.b(context, componentName, i10);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f12144b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z7 = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")))) {
                        z7 = true;
                    }
                }
                if (!z7) {
                    contentResolver.insert(uri, c(componentName, i10, true));
                }
            }
            if (cursorQuery == null || cursorQuery.isClosed()) {
                return;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}