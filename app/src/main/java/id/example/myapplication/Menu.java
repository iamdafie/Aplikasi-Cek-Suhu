package id.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
public class Menu extends AppCompatActivity {
    CardView cdFitur1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cdFitur1 = findViewById(R.id.cdFitur1);
        cdFitur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, DetailSuhuActivity.class) )  ;
            }
        });
    }
}