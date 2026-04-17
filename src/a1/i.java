package a1;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i {
    public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }
}