package kejar.android.bebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton tambah = (ImageButton)findViewById(R.id.tambah);
        ImageButton kurang = (ImageButton)findViewById(R.id.kurang);
        ImageButton reset = (ImageButton)findViewById(R.id.reset);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView angka = (TextView)findViewById(R.id.angka);

                String b = angka.getText().toString();
                Integer a =  Integer.valueOf(b);

                a+=1;

                angka.setText(a.toString());

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView angka = (TextView)findViewById(R.id.angka);


                String b = angka.getText().toString();
                Integer a =  Integer.valueOf(b);

                a-=1;


                if(a<0){
                    a = 0;
                }

                angka.setText(a.toString());


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView angka = (TextView)findViewById(R.id.angka);

                angka.setText("0");
            }
        });



    }
}
