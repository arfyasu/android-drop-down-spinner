package com.example;

import android.content.Context;
import android.util.AttributeSet;
import com.actionbarsherlock.internal.widget.IcsSpinner;

public class DropDownSpinner extends IcsSpinner {

    public DropDownSpinner(Context context, AttributeSet attrs) {
        super(context, attrs, com.actionbarsherlock.R.attr.actionDropDownStyle);

    }

    public DropDownSpinner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }
}
