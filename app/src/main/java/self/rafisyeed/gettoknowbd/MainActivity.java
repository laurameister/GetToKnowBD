package self.rafisyeed.gettoknowbd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
                //setContentView(R.layout.dhaka);
                //Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Intent j = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(j);
                //setContentView(R.layout.chittagong);
                //Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent k = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(k);
                //setContentView(R.layout.khulna);
                //Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Intent l = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(l);
                //setContentView(R.layout.sylhet);
                //Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                new AlertDialog.Builder(this).setTitle("Exit App").setMessage("Are you sure you want to quit?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setIcon(android.R.drawable.ic_delete).setCancelable(false).show();
                break;
            case R.id.button6:
                new AlertDialog.Builder(this).setTitle("About").setMessage("Created by: rafiSyeed\nBuild No: 1").setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setIcon(android.R.drawable.ic_menu_info_details).show();
                break;

        }
    }
}
