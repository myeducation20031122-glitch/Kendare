package k9;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import java.text.ParseException;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(2);
        this.f14053b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ParseException {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        Log.d("TimePicker", "Selected time: " + iIntValue + ":" + iIntValue2);
        int i10 = f.O;
        f fVar = this.f14053b;
        fVar.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, iIntValue);
        calendar.set(12, iIntValue2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        fVar.M = calendar;
        o5.c cVar = fVar.f14054f;
        if (cVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        EditText editText = (EditText) cVar.f15713g;
        Context contextRequireContext = fVar.requireContext();
        Intrinsics.e(contextRequireContext, "requireContext()");
        editText.setText(f.k(contextRequireContext, calendar));
        if (fVar.f14059u) {
            String strK = j4.K(iIntValue + ":" + iIntValue2 + ":00");
            int iP = j4.p(strK);
            int iR = j4.r(strK);
            String string = fVar.getString(2131887087);
            Intrinsics.e(string, "getString(R.string.time_adjust_hint)");
            Toast.makeText(fVar.requireContext(), string, 0).show();
            iIntValue2 = iR;
            iIntValue = iP;
        }
        if (fVar.f14060w) {
            String strJ = j4.J(iIntValue + ":" + iIntValue2 + ":00");
            int iP2 = j4.p(strJ);
            int iR2 = j4.r(strJ);
            String string2 = fVar.getString(2131887087);
            Intrinsics.e(string2, "getString(R.string.time_adjust_hint)");
            Toast.makeText(fVar.requireContext(), string2, 0).show();
            iIntValue2 = iR2;
            iIntValue = iP2;
        }
        e9.d dVar = fVar.f14056m;
        if (dVar == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        dVar.f12585f.set(11, iIntValue);
        e9.d dVar2 = fVar.f14056m;
        if (dVar2 == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        dVar2.f12585f.set(12, iIntValue2);
        e9.d dVar3 = fVar.f14056m;
        if (dVar3 == null) {
            Intrinsics.n("mHoroscope");
            throw null;
        }
        dVar3.f12595p = null;
        fVar.n();
        fVar.m();
        return Unit.f14090a;
    }
}