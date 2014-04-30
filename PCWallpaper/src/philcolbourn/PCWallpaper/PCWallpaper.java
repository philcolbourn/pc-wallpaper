package philcolbourn.PCWallpaper;

//import android.app.Activity;
//import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
//import android.view.MotionEvent;
//import android.view.SurfaceHolder;

public class PCWallpaper extends WallpaperService
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    
    @Override
    public Engine onCreateEngine() {
        return new PCWallpaperEngine();
    }

    class PCWallpaperEngine extends Engine {

        PCWallpaperEngine() {
        }

        //@Override
        //public void onCreate(SurfaceHolder surfaceHolder) {
        //    super.onCreate(surfaceHolder);

            // By default we don't get touch events, so enable them.
            //setTouchEventsEnabled(true);
        //}

        @Override
        public void onDestroy() {
            super.onDestroy();
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
        }

        //@Override
        //public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        //    super.onSurfaceChanged(holder, format, width, height);
        //}

        //@Override
        //public void onSurfaceCreated(SurfaceHolder holder) {
        //    super.onSurfaceCreated(holder);
        //}

        //@Override
        //public void onSurfaceDestroyed(SurfaceHolder holder) {
        //    super.onSurfaceDestroyed(holder);
        //}

        @Override
        public void onOffsetsChanged(float xOffset, float yOffset,
                float xStep, float yStep, int xPixels, int yPixels) {
            super.onOffsetsChanged(xOffset, yOffset, xStep, yStep, xPixels, yPixels);
        }

        //@Override
        //public void onTouchEvent(MotionEvent event) {
        //    super.onTouchEvent(event);
        //}
    }
}
