package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class Fitness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }

    public void handleClickPushupFragment(View view) {
        FragmentTransaction pushupFragment = getSupportFragmentManager().beginTransaction();
        pushupFragment.replace(R.id.pushups_fragment, new PushupFragment());
        pushupFragment.addToBackStack(null);
        pushupFragment.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_from_right);
        pushupFragment.commit();
    }
}
