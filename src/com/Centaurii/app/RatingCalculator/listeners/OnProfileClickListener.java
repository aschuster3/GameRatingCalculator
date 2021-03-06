package com.Centaurii.app.RatingCalculator.listeners;

import com.Centaurii.app.RatingCalculator.R;
import com.Centaurii.app.RatingCalculator.fragments.ProfileViewerFragment;
import com.Centaurii.app.RatingCalculator.util.Tags;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class OnProfileClickListener implements OnClickListener
{
    FragmentActivity activity;
    
    public OnProfileClickListener(FragmentActivity activity)
    {
        this.activity = activity;
    }
    
    @Override
    public void onClick(View view)
    {
        activity.getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_left, R.anim.slide_in_right, R.anim.slide_out_right)
                .replace(R.id.main_frame, new ProfileViewerFragment(), Tags.PROFILE_FRAGMENT)
                .addToBackStack(null)
                .commit();
    }

}
