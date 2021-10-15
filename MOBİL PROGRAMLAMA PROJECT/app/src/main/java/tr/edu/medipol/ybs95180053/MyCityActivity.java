package tr.edu.medipol.ybs95180053;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MyCityActivity extends AppCompatActivity {
    String[] citys = {"Mamure Kalesi","Alahan Manastırı","Astım Mağarası","Adam Kayalar"};
    ImageView pictures;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_city01);

        pictures = findViewById(R.id.picture);
        pictures.setImageResource(R.drawable.mamure);

        Spinner spinners = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1, this.citys
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinners.setAdapter(adapter);

        spinners.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        pictures.setImageResource(R.drawable.mamure);
                        break;

                    case 1:
                        pictures.setImageResource(R.drawable.manastir);
                        break;

                    case 2:
                        pictures.setImageResource(R.drawable.astm);
                        break;
                    case 3:
                        pictures.setImageResource(R.drawable.adam);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}