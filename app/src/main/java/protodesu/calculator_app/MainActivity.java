package protodesu.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

//NOTE: I already created a similar calculator in HoosApps, but I though I should recreate the work process to Github with more flash & functionality!
public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button neg;
    Button clear;
    Button c;
    Button exp;
    Button sqrt;

    Integer leftNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.button_plus);
        Button minus = (Button) findViewById(R.id.button_minus);
        Button multiply = (Button) findViewById(R.id.button_multiply);
        Button divide = (Button) findViewById(R.id.button_divide);
        Button neg = (Button) findViewById(R.id.button_neg);
        Button clear = (Button) findViewById(R.id.button_clear);
        Button c = (Button) findViewById(R.id.button_c);
        Button exp = (Button) findViewById(R.id.button_exp);
        Button sqrt = (Button) findViewById(R.id.button_sqrt);



    }

}
