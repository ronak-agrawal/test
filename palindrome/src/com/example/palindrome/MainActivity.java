package com.example.palindrome;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView t1 = (TextView) findViewById(R.id.textView1);
        final Button b1 = (Button) findViewById(R.id.button1);
        final Button b2 = (Button) findViewById(R.id.button2);
        final TextView t2 = (TextView) findViewById(R.id.editText1);
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String word = t2.getText().toString().toLowerCase();
			char[] arr = new char[word.length()];
			int cnt=0;
			int len = word.length()-1;
			char[] alpha = word.toCharArray();
			for(int i=len;i>=0;i--)
			{
				arr[cnt]=alpha[i];
				System.out.println("Alpha is :"+arr[cnt]);
				cnt++;
			}
			int flag=1;
			for(int i=0;i<len;i++)
			{

			if(arr[i]==alpha[i])
			{
				flag=1;
			}
			else
			{
				flag=0;
				t1.setText("Not Palindrome!");
				break;
			}
			}
			if(flag==1)
			{
				t1.setText("String is Palindrome");
			}
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				t1.setText("");
				t2.setText("");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
