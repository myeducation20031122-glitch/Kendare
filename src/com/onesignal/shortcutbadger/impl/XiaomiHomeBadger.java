package com.onesignal.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import ba.a;
import ba.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import t5.j4;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class XiaomiHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    public ResolveInfo f12148a;

    @Override // ba.a
    public final List a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // ba.a
    public final void b(Context context, ComponentName componentName, int i10) throws IllegalAccessException, NoSuchFieldException, InstantiationException, SecurityException, IllegalArgumentException, b, InvocationTargetException {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i10 == 0 ? "" : Integer.valueOf(i10)));
            if (j4.d(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            if (this.f12148a == null) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.HOME");
                this.f12148a = context.getPackageManager().resolveActivity(intent2, 65536);
            }
            if (this.f12148a != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Notification notificationBuild = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f12148a.getIconResource()).build();
                try {
                    Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                    obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                    notificationManager.notify(0, notificationBuild);
                } catch (Exception e10) {
                    throw new b("not able to set badge", e10);
                }
            }
        }
    }
}