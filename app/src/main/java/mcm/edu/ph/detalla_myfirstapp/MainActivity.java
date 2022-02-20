package mcm.edu.ph.detalla_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton bottun = (ImageButton) findViewById(R.id.imageButton9);
        bottun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView abra = findViewById(R.id.text2);
                TextView cadabra = findViewById(R.id.text);
                abra.setVisibility(View.VISIBLE);
                cadabra.setVisibility(View.INVISIBLE);
            }
        });}}