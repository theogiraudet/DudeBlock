package fr.to_om.dudeblock;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class JFrameExample extends JFrame implements KeyListener {
	
	private static final long serialVersionUID = 1L;

	public static void main(String... args) {
		JFrameExample jframe = new JFrameExample();
		jframe.setSize(300, 300);
		jframe.setVisible(true);
		jframe.addKeyListener(jframe);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			System.out.println("Clic à gauche");
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			System.out.println("Clic à droite");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
