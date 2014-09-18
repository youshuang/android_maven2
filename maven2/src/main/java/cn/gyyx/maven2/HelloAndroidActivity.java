package cn.gyyx.maven2;

import cn.gyyx.common.MathUtil;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv_welcome);
        System.out.println("----------------"+tv);
      
    MathUtil mathUtil = new MathUtil() ;
    int sum = mathUtil.getSum(2, 5);
    Toast.makeText(this, sum+"", 0).show();
    tv.setText(sum+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(cn.gyyx.maven2.R.menu.main, menu);
	return true;
    }

}

