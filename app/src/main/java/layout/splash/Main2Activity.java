package layout.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import java.util.logging.Handler;

import kejar.android.bebas.MainActivity;
import kejar.android.bebas.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        }, 3000);
    }
}
