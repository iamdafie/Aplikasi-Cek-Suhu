package id.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailSuhuActivity extends AppCompatActivity {
    Spinner spSuhu;
    EditText edInputSuhu;
    TextView txtHasilSuhu;
    Button tbHitung;
    float hasilConversi = 0;
    int posConversi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_suhu);
        //Deklarasi komponen
        edInputSuhu = findViewById(R.id.edInputSuhu);
        txtHasilSuhu = findViewById(R.id.txtHasilSuhu);
        spSuhu = findViewById(R.id.spSuhu);
        tbHitung = findViewById(R.id.tbHitung);

        /*
        Data ARRAY suhu
        0 = Cel to re, rumus 4/5*cel
        1 = cel to far, rumusnya (9/5xcel)+32;
         */
        //Data Array Suhu
        String[]dataSuhu = new String[]{"Cel to Re", "Cel to Far", "Re to Cel", "Re to Far"};
        spSuhu = findViewById(R.id.spSuhu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataSuhu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSuhu.setAdapter(adapter);
    }
}