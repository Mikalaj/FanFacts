package mikalaj.fanfacts.ui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import mikalaj.fanfacts.R;
import mikalaj.fanfacts.model.RandomColor;


public class FanFactsActivity extends Activity {


    public static final String TAG = FanFactsActivity.class.getSimpleName();

    private RandomColor mRandomColor = new RandomColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fan_facts);

        //Declare our View variables & assign them the Views from the layout file

        final TextView textFact = (TextView) findViewById(R.id.txtViewFanFact);
        final Button buttonNext = (Button) findViewById(R.id.btnNextFact);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.FirstLayout);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toastlayout, (ViewGroup) findViewById(R.id.llToast));

       // final Toast toat = new Toast(getApplicationContext());
        //toat.setGravity(Gravity.CENTER_VERTICAL,0, 0);
        //toat.setDuration(Toast.LENGTH_LONG);
        //toat.setView(layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The button was clicked, so update the fact with a new one
                textFact.setText(R.string.fact2);
                int bgColor = Color.parseColor(mRandomColor.getColor());
                relativeLayout.setBackgroundColor(bgColor);
                buttonNext.setTextColor(bgColor);
               // toat.show();
            }
        };
        buttonNext.setOnClickListener(listener);

        //
        // Toast.makeText(this, "Праграма запушчана! "+TAG, Toast.LENGTH_LONG).show();
        Log.d(TAG, "!!!!!!!!!!!!!!!1Again!");
    }

}
