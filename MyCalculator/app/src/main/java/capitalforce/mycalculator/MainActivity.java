package capitalforce.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v)
    {
         // 2 text fields - Edit text
        EditText a1 = (EditText)findViewById(R.id.TFnum1);
        EditText a2 = (EditText)findViewById(R.id.TFnum2);

    // 1 resluts labe 1  - TextView

        TextView tv = (TextView)findViewById(R.id.Lans);
        boolean flag = false;  // so division by 0 error
        double num1, num2, an;
        num1 = Double.parseDouble(a1.getText().toString());
        num2 = Double.parseDouble(a2.getText().toString());

        an = 0;
        if(v.getId() == R.id.Badd)
            an = num1 + num2;
        if(v.getId() == R.id.Bsubtract)
            an = num1 - num2;
        if(v.getId() == R.id.Bmult)
            an = num1*num2;
        if(v.getId() == R.id.Bdivide)
           // division by 0
            if(num2 == 0)
            flag = true;
                else
                  an = num1/num2;

        tv.setText(an+"");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
