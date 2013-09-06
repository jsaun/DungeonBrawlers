package com.example.brawlers;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.android.angle.AngleActivity;
import com.android.angle.FPSCounter;


public class Game extends AngleActivity
{
	GameUI mTheGame;
	MenuUI mTheMenu;
    Options mOptions;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		//This line is optional. It adds an FPSCounter object to main View to se the performance in frames per second using LogCat
		//>Esta linea es opcional. Añade un objeto FPSCounter directamente a la View principal
		//>Así podremos ver el rendimiento de nuestro juego a través de LogCat
		mGLSurfaceView.addObject(new FPSCounter());

		//STEP 3:
		//Don't forget to instantiate the objects you will use
		//>PASO 3:
		//>Importante. No olvidemos instanciar los objetos (esto debería ser obvio)
		mTheGame=new GameUI(this);
		mTheMenu=new MenuUI(this);
		mOptions=new Options(this);
		//STEP 4:
		//Set the active user interface. The menu in this case.
		//>PASO 4:
		//>Establecemos la interface de usuario activa. En este caso el menú.
		setUI(mTheMenu);
		
		//STEP 5:
		//All the engine run over a main View that is created by  AngleActivity (mGLSurfaceView)
		//Even so, instead of use this view directly, we will insert it into a FrameLayout.
		//This will be useful if we want to add standard API Views.
		//>PASO 5:
		//>Todo el motor corre sobre una View principal que crea AngleActivity (mGLSurfaceView)
		//>Aun así, en lugar de usar esta View directamente, la insertaremos dentro de un 
		//>FrameLayout por si queremos añadir Views de las API.
		FrameLayout mainLayout=new FrameLayout(this);
		mainLayout.addView(mGLSurfaceView);
		setContentView(mainLayout);
		
		//(Continues in MenuUI)
		//>(continua en MenuUI)
	}

}
