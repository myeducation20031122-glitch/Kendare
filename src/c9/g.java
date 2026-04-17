package c9;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.q;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;
import com.isprid.kendare.MyApplication;
import ec.j;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc9/g;", "Landroidx/fragment/app/q;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends q {
    public static final /* synthetic */ int Y = 0;
    public e9.d T;
    public l9 U;
    public Typeface V;
    public EditText W;
    public TextView X;

    @Override // androidx.fragment.app.q
    public final Dialog i() {
        yl0 yl0Var = new yl0(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(2131492929, (ViewGroup) null);
        yl0Var.n(viewInflate);
        View viewFindViewById = viewInflate.findViewById(2131296955);
        Intrinsics.e(viewFindViewById, "view.findViewById(R.id.title)");
        this.X = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131296707);
        Intrinsics.e(viewFindViewById2, "view.findViewById(R.id.name)");
        this.W = (EditText) viewFindViewById2;
        q6.b bVar = d9.a.f12363b;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.e(applicationContext, "requireContext().applicationContext");
        this.U = new l9(bVar.c(applicationContext));
        Typeface typefaceA = s9.d.a(requireContext());
        Intrinsics.e(typefaceA, "getTypeFace(requireConte…ontUtil.TypeFace.SINHALA)");
        this.V = typefaceA;
        n7.c cVar = MyApplication.f11640b;
        TextView textView = this.X;
        if (textView == null) {
            Intrinsics.n("title");
            throw null;
        }
        textView.setTypeface(typefaceA);
        EditText editText = this.W;
        if (editText == null) {
            Intrinsics.n("name");
            throw null;
        }
        Typeface typeface = this.V;
        if (typeface == null) {
            Intrinsics.n("mTypefaceSin");
            throw null;
        }
        editText.setTypeface(typeface);
        EditText editText2 = this.W;
        if (editText2 == null) {
            Intrinsics.n("name");
            throw null;
        }
        editText2.setHint(2131886736);
        TextView textView2 = this.X;
        if (textView2 == null) {
            Intrinsics.n("title");
            throw null;
        }
        textView2.setText(getString(2131886954));
        yl0Var.m(getString(2131886948), new DialogInterface.OnClickListener() { // from class: c9.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = g.Y;
                g this$0 = this.f2184b;
                Intrinsics.f(this$0, "this$0");
                this$0.l();
            }
        });
        yl0Var.l(getString(2131886314), new c(1));
        EditText editText3 = this.W;
        if (editText3 == null) {
            Intrinsics.n("name");
            throw null;
        }
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c9.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                int i11 = g.Y;
                g this$0 = this.f2185a;
                Intrinsics.f(this$0, "this$0");
                if (i10 != 6) {
                    return false;
                }
                this$0.l();
                return false;
            }
        });
        this.f1079t = true;
        Dialog dialog = this.O;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        return yl0Var.i();
    }

    public final void l() {
        EditText editText = this.W;
        if (editText == null) {
            Intrinsics.n("name");
            throw null;
        }
        String string = j.a0(editText.getText().toString()).toString();
        if (TextUtils.isEmpty(string)) {
            EditText editText2 = this.W;
            if (editText2 != null) {
                editText2.setError("Required");
                return;
            } else {
                Intrinsics.n("name");
                throw null;
            }
        }
        e9.d dVar = this.T;
        if (dVar == null) {
            Intrinsics.n("mKendare");
            throw null;
        }
        dVar.f12582c = string;
        l9 l9Var = this.U;
        if (l9Var == null) {
            Intrinsics.n("mSavingHoroscopeVM");
            throw null;
        }
        d9.a aVar = (d9.a) ((a9.d) l9Var.f10881e);
        aVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", dVar.f12582c);
        contentValues.put("lagna", Integer.valueOf(((e9.a) dVar.f12589j.get(0)).f12565d.f3242a));
        contentValues.put("birthPlace", dVar.f12586g);
        contentValues.put("birthDateTime", Long.valueOf(dVar.f12585f.getTimeInMillis()));
        contentValues.put("latitude", Double.valueOf(dVar.f12592m.f11292b));
        contentValues.put("longitude", Double.valueOf(dVar.f12592m.f11293e));
        contentValues.put("timeZone", Double.valueOf(dVar.f12602w));
        contentValues.put("createdAt", Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        contentValues.put("status", (Integer) 0);
        d9.b bVar = aVar.f12365a;
        bVar.getClass();
        bVar.getWritableDatabase().insert("horoscope", null, contentValues);
        n7.c cVar = MyApplication.f11640b;
        Toast.makeText(requireContext(), "කේන්දරය සුරකින ලදි", 0).show();
        h(false, false);
    }
}