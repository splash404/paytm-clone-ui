package ddw.splash404.paytm_clone.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomBlackTextView extends TextView {
    public CustomBlackTextView(Context context) {
        super(context);
        init();
    }

    public CustomBlackTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomBlackTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Black.ttf");
        setTypeface(tf);
    }
}
