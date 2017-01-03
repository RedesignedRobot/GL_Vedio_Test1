package com.aaxs.nitrov17.gl_vedio_test1;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by NitroV17 on 1/3/2017.
 */
class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
    }
}
