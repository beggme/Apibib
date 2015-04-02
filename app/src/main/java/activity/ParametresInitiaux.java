package activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mehdibeggas.apibib_apresreunion.R;

/**
 * Created by mehdibeggas on 25/03/2015.
 */
public class ParametresInitiaux extends MenuNavigation {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres_initiaux);

    }

    public boolean gotoParametrageAlertes(View v) {

        intent = new Intent(this, ParametrageAlertes.class);
        startActivity(intent);
        return false;

    }

    public boolean gotoStatistiques(View v) {

        intent = new Intent(this, Statistiques.class);
        startActivity(intent);
        return false;

    }

    public boolean gotoParametres(View v) {

        intent = new Intent(this, ParametresInitiaux.class);
        startActivity(intent);
        return false;

    }

}
