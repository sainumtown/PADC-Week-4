package xz.sainumtown.week_4_execrise.components.textviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import xz.sainumtown.week_4_execrise.utils.MMFontUtils;


/**
 * Created by asus on 6/26/2016.
 */
public class MMTextView extends TextView {
    public MMTextView(Context context) {
        super(context);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }

    public MMTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }

    public MMTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }
}
