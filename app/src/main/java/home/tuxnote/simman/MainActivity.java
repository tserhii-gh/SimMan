package home.tuxnote.simman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout w = findViewById(R.id.win);
        w.setVisibility(View.GONE);
        ComponentName componentName = new ComponentName("com.android.phone", "com.android.phone.settings.RadioInfo");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
    }
}