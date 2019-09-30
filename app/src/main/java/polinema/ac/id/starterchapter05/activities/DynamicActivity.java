package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handleClickLoadRedFragment(View view) {

        RedFragment redFragment = (RedFragment) getSupportFragmentManager().findFragmentByTag("Red_Fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(redFragment != null && redFragment.isVisible()){
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"Red_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void handleClickLoadBlueFragment(View view) {
        BlueFragment blueFragment = (BlueFragment) getSupportFragmentManager().findFragmentByTag("Blue_Fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(blueFragment != null && blueFragment.isVisible()){
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"Blue_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
