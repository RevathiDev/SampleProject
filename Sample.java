package com.sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class Sample {
	/*
	 * public static void main(String args[]) { String a = ""; String link =
	 * "<a href=\"http://abcd.efg.com\" target=\"_blank\">http://abcd.efg.com</a>";
	 * a = a + link; System.out.println("Link is" + a);
	 * 
	 * 
	 * }
	 */
	  public static void main(String[] args) throws URISyntaxException {
		    final URI uri = new URI("https://www.youtube.com/mycodeschool/");
		    class OpenUrlAction implements ActionListener {
		      @Override public void actionPerformed(ActionEvent e) {
		        open(uri);
		      }
		    }
		    JFrame frame = new JFrame("Links");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(100, 400);
		    Container container = frame.getContentPane();
		    container.setLayout(new GridBagLayout());
		    JButton button = new JButton();
		    button.setText("<HTML>Click the <FONT color=\"#000099\"><U>link</U></FONT>"
		        + " to go to the website.</HTML>");
		    button.setHorizontalAlignment(SwingConstants.LEFT);
		    button.setBorderPainted(false);
		    button.setOpaque(false);
		    button.setBackground(Color.WHITE);
		    button.setToolTipText(uri.toString());
		    button.addActionListener(new OpenUrlAction());
		    container.add(button);
		    frame.setVisible(true);
		  }

		  private static void open(URI uri) {
		    if (Desktop.isDesktopSupported()) {
		      try {
		        Desktop.getDesktop().browse(uri);
		      } catch (IOException e) { /* TODO: error handling */ }
		    } else { /* TODO: error handling */ }
		  }

}
