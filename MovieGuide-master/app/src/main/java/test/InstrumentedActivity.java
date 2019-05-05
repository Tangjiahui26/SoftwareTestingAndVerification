package test;

import com.esoxjem.movieguide.listing.MoviesListingActivity;
import android.util.Log;


public class InstrumentedActivity extends MoviesListingActivity {
    public FinishListener finishListener ;
    public void setFinishListener(FinishListener finishListener){
        this.finishListener = finishListener;
    }

    @Override
    public void onDestroy() {
        if (this.finishListener !=null){
            finishListener.onActivityFinished();
        }
        super.onDestroy();
    }

}