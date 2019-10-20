package ejt.edu.tesoem.genita212.itic.p6eugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mensaje(View v){
        Toast.makeText(this,"Mensaje Emergente",Toast.LENGTH_SHORT).show();
    }
}
