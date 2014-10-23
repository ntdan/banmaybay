package vn.cusc.helpers;

import java.util.Timer;
import java.util.TimerTask;
import android.util.Log;

public class Game extends Thread {
	private boolean running;

	public void setRunning(boolean r) {
		running = r;
	}

	@Override
	public void run() {
		super.run();
		Timer mainTimer = new Timer();
		TimerTask Task = new TimerTask() {
			int dem;

			@Override
			public void run() {
				// cập nhật và vẽ lại đối tượng
				Log.d("testloop:", "loop " + dem++);
			}
		};
		mainTimer.scheduleAtFixedRate(Task, 0, 1000 / 30);
	}
}
