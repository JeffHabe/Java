package com.lfs.GUI;

import com.jeff.util.Print;
import com.lfs.GUI.InvokeExample;
import com.lfs.GUI.InvokeExample.3.1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

class InvokeExample$3 implements ActionListener {
	public void actionPerformed(ActionEvent ev) {
      InvokeExample.access$0().setText("Working . . . ");
      InvokeExample.setEnabled(false);
      Print.println("Bad2");
      SwingUtilities.invokeLater(new 1(this));
   }
}