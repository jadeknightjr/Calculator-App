package protodesu.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//NOTE: I already created a similar calculator in HoosApps, but I though I should recreate the work process to Github with more flash & functionality!
public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button_plus;
    Button button_minus;
    Button button_multiply;
    Button button_divide;
    Button button_neg;
    Button button_clear;
    Button button_c;
    Button button_exp;
    Button button_sqrt;
    Button button_equals;

    int operation;
    static final int plus  = 0;
    static final int minus = 1;
    static final int multiply = 2;
    static final int divide =3;
    //static final int neg =4; neg doesn't ned another number
    static final int exp =4;
    //static final int sqrt =5; sqrt doesn't need another number

    Integer leftNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_divide = (Button) findViewById(R.id.button_divide);
        button_neg = (Button) findViewById(R.id.button_neg);
        button_clear = (Button) findViewById(R.id.button_clear);
        button_c = (Button) findViewById(R.id.button_c);
        button_exp = (Button) findViewById(R.id.button_exp);
        button_sqrt = (Button) findViewById(R.id.button_sqrt);
        button_equals = (Button) findViewById(R.id.button_equals);

        for (int i = 0; i <= 9; i++) {
            final int finalI = i;
            findViewById(getResources().getIdentifier("button"+String.valueOf(i), "id", getPackageName())).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(textView.getText().toString() + finalI);
                }
            });
        }

        //PLUS
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString());
                    textView.setText("");
                    operation = plus;
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //MINUS
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString());
                    textView.setText("");
                    operation = minus;
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //MULTIPLY
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString());
                    textView.setText("");
                    operation = multiply;
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //DIVIDE
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString());
                    textView.setText("");
                    operation = divide;
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //negate
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString()) * -1;
                    textView.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //exponent
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString()) * -1;
                    textView.setText("");
                    operation = exp;
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //sqrt       //MUST FIX THIS
        button_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make sure that there is a number first present
                if (textView.getText().length() > 0) {
                    leftNum = Integer.valueOf(textView.getText().toString()) * -1;
                    textView.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "You must input a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // MUST FIX THIS
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(leftNum != null && textView.getText().length() > 0) {
                    int secondNumber = Integer.valueOf(textView.getText().toString());

                    //will have to do some cases down here....






                } else {
                    Toast.makeText(MainActivity.this, "You must hit plus with a number first!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leftNum = null;
                textView.setText("");
            }
        });

        //NEED TO ADD button_c!!!!

    }

}
