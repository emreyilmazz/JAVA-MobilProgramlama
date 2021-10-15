package tr.edu.medipol.ybs95180053;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        ListView lessonlist = findViewById(R.id.lessonsList);

        String[] lessons = {"Mobil Programlama", "Lojistik Yönetimi", "Sağlık Turizmi ile Kazanalım" , "İşletmelerde Nicel Karar Verme Yöntemleri", "Pazarlamanın İlkeleri", "İş ve Sosyal Güvenlik Hukuku", "Sistem Analizi ve Tasarımı", "Veri Tabanı Yönetim Sistemleri"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lessons);

        lessonlist.setAdapter(adapter);

        lessonlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(CoursesActivity.this, lessons[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}