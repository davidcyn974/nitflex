package uqac.dim.nitflex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void afficherHello(View v){
        Log.i("DIM", "HELLO!");
        TextView texteHello = (TextView)findViewById(R.id.texte_hello);
        ((Button)v).setText(texteHello.getText());
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView tv = (TextView) layout.findViewById(R.id.txtvw);
        tv.setText("Coucou ceci est un message");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(200,Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu_preferences:
                Toast.makeText(MainActivity.this, "Les pref ",
                        Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_apropos:
                Toast.makeText(MainActivity.this, "aaa PPP",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}