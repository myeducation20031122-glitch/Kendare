package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y0;
import com.isprid.kendare.model.DNotification;
import com.isprid.kendare.util.LollipopFixedWebView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f19784a;

    public l(ArrayList noticeList) {
        Intrinsics.f(noticeList, "noticeList");
        this.f19784a = noticeList;
    }

    @Override // androidx.recyclerview.widget.y0
    public final int getItemCount() {
        return this.f19784a.size();
    }

    @Override // androidx.recyclerview.widget.y0
    public final void onBindViewHolder(c2 c2Var, int i10) throws ParseException {
        j holder = (j) c2Var;
        Intrinsics.f(holder, "holder");
        DNotification dNotification = (DNotification) this.f19784a.get(i10);
        holder.f19779a.setText(dNotification.getNoticeTitle());
        holder.f19781c.loadDataWithBaseURL(null, n7.c.r(String.valueOf(dNotification.getNoticeDescription()), f0.f.b(holder.itemView.getContext(), 2131035300)), "text/html", "utf-8", null);
        holder.f19781c.setWebViewClient(new k(0));
        String strValueOf = String.valueOf(dNotification.getCreatedDate());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strValueOf);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm aaa");
            Intrinsics.c(date);
            String str = simpleDateFormat.format(date);
            Intrinsics.e(str, "{\n            val spf = …rmat(newDate!!)\n        }");
            strValueOf = str;
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
        holder.f19782d.setText(strValueOf);
        holder.f19780b.setVisibility(Intrinsics.a(dNotification.isNew(), "0") ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.y0
    public final c2 onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(2131492942, parent, false);
        Intrinsics.e(viewInflate, "from(parent.context)\n   …ow_notice, parent, false)");
        j jVar = new j(viewInflate);
        View viewFindViewById = viewInflate.findViewById(2131296944);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.text_title)");
        jVar.f19779a = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131296597);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.img_is_new)");
        jVar.f19780b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(2131296931);
        Intrinsics.e(viewFindViewById3, "view.findViewById(R.id.text_description)");
        LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) viewFindViewById3;
        jVar.f19781c = lollipopFixedWebView;
        View viewFindViewById4 = viewInflate.findViewById(2131296930);
        Intrinsics.e(viewFindViewById4, "view.findViewById(R.id.text_date)");
        jVar.f19782d = (TextView) viewFindViewById4;
        lollipopFixedWebView.a();
        return jVar;
    }
}