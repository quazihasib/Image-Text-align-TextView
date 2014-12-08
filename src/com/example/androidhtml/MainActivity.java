package com.example.androidhtml;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.*;
import android.widget.*;

public class MainActivity extends Activity 
{

	TextView message;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String text = "There are som many thing in this world. You need to prepare yourself for it." +
				" You also need to discover new things and overcome all the obstacles like you have" +
				" done before. I know you are confident and you have the capabilty to conqure it all.";

        Drawable dIcon = getResources().getDrawable(R.drawable.ic_launcher);
        int leftMargin = dIcon.getIntrinsicWidth() + 10;

        ImageView icon = (ImageView) findViewById(R.id.icon);
        icon.setBackgroundDrawable(dIcon);
//        icon.setImageDrawable(getResources().getDrawable(R.drawable.download));
        TextView messageView = (TextView) findViewById(R.id.message_view);

        float textLineHeight = messageView.getPaint().getTextSize();
        int lines = (int)Math.round(dIcon.getIntrinsicHeight() / textLineHeight);
        SpannableString ss = new SpannableString(text);
        ss.setSpan(new MyLeadingMarginSpan2(lines, leftMargin), 0, ss.length(), 0);

        messageView.setText(ss);

	}

}