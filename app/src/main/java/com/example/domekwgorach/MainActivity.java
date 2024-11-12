package com.example.domekwgorach;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView nazwa;
    private Button like;
    private Button delete;
    private Button save;
    private TextView count;
    private int county = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nazwa = findViewById(R.id.nazwa);
        like = findViewById(R.id.like);
        delete = findViewById(R.id.delete);
        save = findViewById(R.id.save);
        count = findViewById(R.id.count);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               county++;
                updatecounty();
            }
        });
        delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(county > 0){
                    county--;
                }
                updatecounty();
            }
        });
    }
    public void updatecounty(){
        count.setText(county + " Polubień");
    }
}
