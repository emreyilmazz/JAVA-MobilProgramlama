package tr.edu.medipol.ybs95180053;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callPhone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: 05052081928"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void SendMail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "yunus.yilmaz@std.medipol.edu.tr");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Vize Ödevi");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void MyCityActivity(View view) {
        Intent intent = new Intent(this, MyCityActivity.class);
        startActivity(intent);
    }

    public void CoursesActivity(View view) {
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }
}
