package com.lfs.GUI;

import com.jeff.util.Print;
import com.lfs.GUI.InvokeExample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InvokeExample$2 implements ActionListener {
	public void actionPerformed(ActionEvent ev) {
		InvokeExample.access$0().setText("Working . . .");
		InvokeExample.setEnabled(false);
		Print.println("bad");

		try {
			Thread.sleep(1000L);
		} catch (InterruptedException arg2) {
			;
		}

		InvokeExample.access$0().setText("Ready");
		InvokeExample.setEnabled(true);
	}
}