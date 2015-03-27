package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends Activity{
	
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	Button bd, bs;
	ImageButton call, cancel, backspace;
	EditText number;
	
	private class Ascultator implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (v instanceof Button) {
				switch (v.getId()) {
					case R.id.buttonS:
						number.setText(number.getText().toString() + "*");
						break;
					case R.id.buttonD:
						number.setText(number.getText().toString() + "#");
						break;
					case R.id.button0:
						number.setText(number.getText().toString() + "0");
						break;
					case R.id.button1:
						number.setText(number.getText().toString() + "1");
						break;
					case R.id.button2:
						number.setText(number.getText().toString() + "2");
						break;
					case R.id.button3:
						number.setText(number.getText().toString() + "3");
						break;
					case R.id.button4:
						number.setText(number.getText().toString() + "4");
						break;
					case R.id.button5:
						number.setText(number.getText().toString() + "5");
						break;
					case R.id.button6:
						number.setText(number.getText().toString() + "6");
						break;
					case R.id.button7:
						number.setText(number.getText().toString() + "7");
						break;
					case R.id.button8:
						number.setText(number.getText().toString() + "8");
						break;
					case R.id.button9:
						number.setText(number.getText().toString() + "9");
						break;
				}
			}
			else {
				switch (v.getId()) {
				
					case R.id.buttonBackspace:
						String num = number.getText().toString();
						if (num.length() > 0)
							number.setText(num.subSequence(0, num.length() - 1));
						break;
					case R.id.buttonCancel:
						finish();
						break;
					case R.id.buttonCall:
						Intent intent = new Intent(Intent.ACTION_CALL);
						intent.setData(Uri.parse("tel:"+number.getText().toString()));
						startActivity(intent);
						break;
	 			
				}
			}
			
		}
		
	}
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        b0 = (Button)findViewById(R.id.button0);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        bd = (Button)findViewById(R.id.buttonD);
        bs = (Button)findViewById(R.id.buttonS);
        
        call = (ImageButton)findViewById(R.id.buttonCall);
        cancel = (ImageButton)findViewById(R.id.buttonCancel);
        backspace = (ImageButton)findViewById(R.id.buttonBackspace);
        
        number = (EditText)findViewById(R.id.etNumber);
        
        Ascultator asculta = new Ascultator();
        b0.setOnClickListener(asculta);
        b1.setOnClickListener(asculta);
        b2.setOnClickListener(asculta);
        b3.setOnClickListener(asculta);
        b4.setOnClickListener(asculta);
        b5.setOnClickListener(asculta);
        b6.setOnClickListener(asculta);
        b7.setOnClickListener(asculta);
        b8.setOnClickListener(asculta);
        b9.setOnClickListener(asculta);
        bs.setOnClickListener(asculta);
        bd.setOnClickListener(asculta);
        
        call.setOnClickListener(asculta);
        cancel.setOnClickListener(asculta);
        backspace.setOnClickListener(asculta);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }		
    
}
