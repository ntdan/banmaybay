package vn.cusc.games;

import vn.cusc.helpers.GamePanel;
import vn.cusc.lab01.R;
import vn.cusc.lab01.R.id;
import vn.cusc.lab01.R.layout;
import vn.cusc.lab01.R.menu;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class GameScreen extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//đầy màn hình
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	    		WindowManager.LayoutParams.FLAG_FULLSCREEN);       
	    //tạo đối tượng quản lý các thành phần game
	    GamePanel d=new GamePanel(this);
	    setContentView(d);	    
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_screen, menu);
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
}
