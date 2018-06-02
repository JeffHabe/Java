package com.lfs.GUI;

import com.jeff.util.Print;
import com.lfs.GUI.InvokeExample;
import com.lfs.GUI.InvokeExample.1;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;

class InvokeExample$1$1 extends Thread {
	InvokeExample$1$1(1 arg0) {
      this.this$1 = arg0;
   }

	public void run() {
      try {
         SimpleDateFormat sdFormat = new SimpleDateFormat("hh:mm:ss");
         Date date = new Date();
         Print.println(sdFormat.format(date));
         int i = 0;

         while(InvokeExample.access$2().isEnabled()) {
            Print.println(sdFormat.format(date) + " " + i++);
            Thread.sleep(1000L);
         }
      } catch (InterruptedException arg3) {
         ;
      }

      SwingUtilities.invokeLater(new com.lfs.GUI.InvokeExample.1.1.1(this));
   }
}