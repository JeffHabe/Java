package com.lfs.GUI;

import com.jeff.util.Print;
import com.lfs.GUI.InvokeExample;
import com.lfs.GUI.InvokeExample.1.1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InvokeExample$1 implements ActionListener {
	public void actionPerformed(ActionEvent ev) {
      InvokeExample.access$0().setText("Working . . .");
      InvokeExample.access$1().setEnabled(false);
      Print.println("Good");
      1 worker = new 1(this);
      worker.start();
   }
}