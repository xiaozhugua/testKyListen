package com.example.testkeylisten;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnKeyListener {

	public static final String TAG = "zds";
	
	Button button1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnKeyListener(this);
    }
    
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		switch (keyCode) {

		case KeyEvent.KEYCODE_ENTER: // 确定键enter
			Log.d(TAG, "KEYCODE_ENTER--->");
		case KeyEvent.KEYCODE_DPAD_CENTER:
			Log.d(TAG, "KEYCODE_DPAD_CENTER--->");

			break;

		case KeyEvent.KEYCODE_BACK: // 返回键
			Log.d(TAG, "back--->");

			return true; // 这里由于break会退出，所以我们自己要处理掉 不返回上一层

		case KeyEvent.KEYCODE_SETTINGS: // 设置键
			Log.d(TAG, "setting--->");

			break;

		case KeyEvent.KEYCODE_DPAD_DOWN: // 向下键

			/*
			 * 实际开发中有时候会触发两次，所以要判断一下按下时触发 ，松开按键时不触发 exp:KeyEvent.ACTION_UP
			 */
			if (event.getAction() == KeyEvent.ACTION_DOWN) {

				Log.d(TAG, "down--->");
			}

			break;

		case KeyEvent.KEYCODE_DPAD_UP: // 向上键
			Log.d(TAG, "up--->");

			break;

		case KeyEvent.KEYCODE_0: // 数字键0
			Log.d(TAG, "0--->");

			break;

		case KeyEvent.KEYCODE_DPAD_LEFT: // 向左键

			Log.d(TAG, "left--->");

			break;

		case KeyEvent.KEYCODE_DPAD_RIGHT: // 向右键
			Log.d(TAG, "right--->");
			break;

		case KeyEvent.KEYCODE_INFO: // info键
			Log.d(TAG, "info--->");

			break;

		case KeyEvent.KEYCODE_PAGE_DOWN: // 向上翻页键
		case KeyEvent.KEYCODE_MEDIA_NEXT:
			Log.d(TAG, "page down--->");

			break;

		case KeyEvent.KEYCODE_PAGE_UP: // 向下翻页键
		case KeyEvent.KEYCODE_MEDIA_PREVIOUS:
			Log.d(TAG, "page up--->");

			break;

		case KeyEvent.KEYCODE_VOLUME_UP: // 调大声音键
			Log.d(TAG, "voice up--->");

			break;

		case KeyEvent.KEYCODE_VOLUME_DOWN: // 降低声音键
			Log.d(TAG, "voice down--->");

			break;
		default:
			break;
		}

		return super.onKeyDown(keyCode, event);

	}

//	@Override
//	public boolean onKey(View v, int keyCode, KeyEvent event) {
//		// TODO Auto-generated method stub
//		
//		
//		if (event.getAction() == KeyEvent.ACTION_DOWN) {
//			
//			// 66
//			if (keyCode == KeyEvent.KEYCODE_ENTER) {
//				return true;
//			}
//		}
//		return false;
//	}
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		Log.v(TAG, "event.getAction()    " + event.getAction());
		Log.v(TAG, "onkey    " + keyCode);
		
		return false;
	}
}
