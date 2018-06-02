package com.lfs.GUI;

import com.lfs.GUI.InvokeExample;
import com.lfs.GUI.InvokeExample.3;

class InvokeExample$3$1 implements Runnable {
	InvokeExample$3$1(3 arg0) {
      this.this$1 = arg0;
   }

	public void run() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException arg1) {
			;
		}

		InvokeExample.access$0().setText("Ready");
		InvokeExample.setEnabled(true);
	}
}