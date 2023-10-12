package week14;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class GameExample extends JWindow {
	public GameExample() {
		this.setSize(680,350);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point centerPoint = ge.getCenterPoint();
		int leftTopX = centerPoint.x - this.getWidth()/2;
		int leftTopY = centerPoint.y - this.getHeight()/2;
		this.setLocation(leftTopX, leftTopY);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource("a.jpg")));
		getContentPane().add(label, BorderLayout.CENTER);
		
		this.addMouseListener(new MouseListener() {


			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GameExample jWindow = new GameExample();
				jWindow.setVisible(true);
			}
		});
	}
	
}
