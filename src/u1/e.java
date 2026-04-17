package u1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import fc.t;
import g0.q;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends g implements Animatable {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f18156t = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f18158f;

    /* renamed from: j, reason: collision with root package name */
    public m.d f18159j = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18160m = null;

    /* renamed from: n, reason: collision with root package name */
    public final h.f f18161n = new h.f(this);

    /* renamed from: e, reason: collision with root package name */
    public final c f18157e = new c();

    public e(Context context) {
        this.f18158f = context;
    }

    @Override // u1.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            i0.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return i0.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f18157e;
        cVar.f18151a.draw(canvas);
        if (cVar.f18152b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getAlpha() : this.f18157e.f18151a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f18157e.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18163b;
        return drawable != null ? i0.a.c(drawable) : this.f18157e.f18151a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18163b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f18163b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f18157e.f18151a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f18157e.f18151a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.getOpacity() : this.f18157e.f18151a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.isAutoMirrored() : this.f18157e.f18151a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f18163b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f18157e.f18152b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.isStateful() : this.f18157e.f18151a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f18157e.f18151a.setBounds(rect);
        }
    }

    @Override // u1.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.setLevel(i10) : this.f18157e.f18151a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18163b;
        return drawable != null ? drawable.setState(iArr) : this.f18157e.f18151a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f18157e.f18151a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f18157e.f18151a.setAutoMirrored(z7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18157e.f18151a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            t.G(drawable, i10);
        } else {
            this.f18157e.f18151a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            t.H(drawable, colorStateList);
        } else {
            this.f18157e.f18151a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            t.I(drawable, mode);
        } else {
            this.f18157e.f18151a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z10) {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            return drawable.setVisible(z7, z10);
        }
        this.f18157e.f18151a.setVisible(z7, z10);
        return super.setVisible(z7, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f18157e;
        if (cVar.f18152b.isStarted()) {
            return;
        }
        cVar.f18152b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f18157e.f18152b.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
    
        if (r8.f18152b != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0187, code lost:
    
        r8.f18152b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        r8.f18152b.playTogether(r8.f18153c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0195, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        XmlResourceParser xmlResourceParser;
        XmlResourceParser animation;
        Animator animatorI;
        p pVar;
        int next;
        Drawable drawable = this.f18163b;
        if (drawable != null) {
            i0.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c cVar = this.f18157e;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayX = g5.a.x(resources, theme, attributeSet, a.f18143e);
                    int resourceId = typedArrayX.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = p.M;
                        if (Build.VERSION.SDK_INT >= 24) {
                            pVar = new p();
                            ThreadLocal threadLocal = q.f12975a;
                            pVar.f18163b = g0.j.a(resources, resourceId, theme);
                            new o(pVar.f18163b.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                pVar = new p();
                                pVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException | XmlPullParserException e10) {
                                Log.e("VectorDrawableCompat", "parser error", e10);
                                pVar = null;
                            }
                        }
                        pVar.f18224n = false;
                        pVar.setCallback(this.f18161n);
                        p pVar2 = cVar.f18151a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        cVar.f18151a = pVar;
                    }
                    typedArrayX.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f18144f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f18158f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorI = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    xmlResourceParser = context;
                                }
                            } catch (IOException e11) {
                                e = e11;
                            } catch (XmlPullParserException e12) {
                                e = e12;
                            } catch (Throwable th2) {
                                th = th2;
                                xmlResourceParser = null;
                            }
                            try {
                                animatorI = com.bumptech.glide.e.i(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                animation.close();
                            } catch (IOException e13) {
                                e = e13;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e14) {
                                e = e14;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = animation;
                                if (xmlResourceParser != null) {
                                    xmlResourceParser.close();
                                }
                                throw th;
                            }
                        }
                        animatorI.setTarget(cVar.f18151a.f18220e.f18208b.f18206o.getOrDefault(string, null));
                        if (cVar.f18153c == null) {
                            cVar.f18153c = new ArrayList();
                            cVar.f18154d = new t.b();
                        }
                        cVar.f18153c.add(animatorI);
                        cVar.f18154d.put(animatorI, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}