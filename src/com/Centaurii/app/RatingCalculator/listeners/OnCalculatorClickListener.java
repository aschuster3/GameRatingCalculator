package com.Centaurii.app.RatingCalculator.listeners;

import com.Centaurii.app.RatingCalculator.R;
import com.Centaurii.app.RatingCalculator.fragments.CalculatorFragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class OnCalculatorClickListener implements OnClickListener
{
    FragmentActivity act;
    
    public OnCalculatorClickListener(FragmentActivity act)
    {
        this.act = act;
    }
    
    
    @Override
    public void onClick(View v)
    {
        act.getSupportFragmentManager()
           .beginTransaction()
           .replace(R.id.main_frame, new CalculatorFragment())
           .addToBackStack(null)
           .commit();
    }

}
