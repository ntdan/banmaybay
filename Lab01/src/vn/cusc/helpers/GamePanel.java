package vn.cusc.helpers;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {
	Game game;

	public GamePanel(Context context) {
		super(context);
		// nhận các các sự kiện trên giao diện game
		getHolder().addCallback(this);
		setFocusable(true);

		game = new Game();// 2. tạo khung chung cho trò chơi
		setFocusable(true);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}

	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// 3. gán trạng thái cho game và kích cho game chay
		game.setRunning(true);
		game.start();
	}

	public void surfaceCreated(SurfaceHolder arg0) {
	}

	public void surfaceDestroyed(SurfaceHolder arg0) {
		// 4. hủy game
		game.setRunning(false);
	}
}
