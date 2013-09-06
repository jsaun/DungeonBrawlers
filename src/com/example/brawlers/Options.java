package com.example.brawlers;

import android.graphics.Typeface;
import android.view.MotionEvent;

import com.android.angle.AngleActivity;
import com.android.angle.AngleFont;
import com.android.angle.AngleObject;
import com.android.angle.AngleSprite;
import com.android.angle.AngleSpriteLayout;
import com.android.angle.AngleString;
import com.android.angle.AngleUI;

public class Options extends AngleUI {

	private AngleObject ogMenuTexts2;
	private AngleString strHeader2;
	private AngleString strSound;
	private AngleString strExit2;
	
	public Options(AngleActivity activity) {
		super(activity);
		
		ogMenuTexts2 = new AngleObject();
		addObject(new AngleSprite(160, 240, new AngleSpriteLayout(mActivity.mGLSurfaceView, 320, 480, com.android.tutorial.R.drawable.bg_menu)));

		addObject(ogMenuTexts2);
		AngleFont fntCafe=new AngleFont(mActivity.mGLSurfaceView, 25, Typeface.createFromAsset(mActivity.getAssets(),"cafe.ttf"), 222, 0, 0, 30, 200, 255, 255);
		AngleFont fnfCafe=new AngleFont(mActivity.mGLSurfaceView, 45, Typeface.createFromAsset(mActivity.getAssets(),"cafe.ttf"), 222, 0, 0, 30, 200, 255, 255);
		
		strHeader2 = (AngleString) ogMenuTexts2.addObject(new AngleString(fnfCafe, "Options", 160, 100, AngleString.aCenter));
		strSound = (AngleString) ogMenuTexts2.addObject(new AngleString(fntCafe, "Sound", 160, 210, AngleString.aCenter));
		strExit2 = (AngleString) ogMenuTexts2.addObject(new AngleString(fntCafe, "Exit", 160, 300, AngleString.aCenter));
	}
		public boolean onTouchEvent(MotionEvent event)
		{
			if (event.getAction() == MotionEvent.ACTION_DOWN)
			{
				float eX = event.getX();
				float eY = event.getY();

			
				if (strExit2.test(eX, eY))
					mActivity.finish();
				
				return true;
			}
			return false;
		}

		
		
	}


