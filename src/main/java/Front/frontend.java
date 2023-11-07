package Front;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import dao.DaoWhatsAPP;
import twilio.PrincipalWhatsAPP;

public class frontend extends JFrame{
	
	private JPanel panel;
	private JLabel pestana;
	private Image  imagen;
	private ImageIcon fondo,fondo2,salir2,salir3;
	private JLabel acepta;
	private JButton salirB;
	private JTextArea area;
	private DaoWhatsAPP twwath;
	private int xMouse, yMouse;
	
	public frontend() {
	
	  twwath= new DaoWhatsAPP();	
      panel= new JPanel();
      panel.setLayout(null);
      this.setIconImage(getImageIcon());
      this.setLayout(null);
      this.setBounds(0,0,400,600);
      this.setResizable(true);
      this.setLocationRelativeTo(null);
      this.setUndecorated(true);
      this.getContentPane().add(panel);
      this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      
      panel.setBounds(0,0,400,600);
   
      pestana= new JLabel();
      pestana.setBounds(0,0,400,600);
      pestana.setIcon(fondo("/image/fondore.png"));
      panel.add(pestana);
      
      acepta= new JLabel("<-- < Aceptar > -->");
      acepta.setHorizontalAlignment(SwingConstants.CENTER);
      acepta.setBounds(136,523,210,40);
      acepta.setOpaque(true);
      acepta.setBackground(Color.ORANGE);
      
      salirB= new JButton();
      salirB.setBounds(66,510,50,60);
      salirB.setHorizontalAlignment(SwingConstants.CENTER);
      salirB.setVerticalAlignment(SwingConstants.CENTER);
      salirB.setPressedIcon((Icon) salir2("/image/salir.png"));
      salirB.setIcon(salir("/image/salir.png"));
      salirB.setContentAreaFilled(false);
     
      pestana.add(salirB);
      
      area= new JTextArea();
      area.setLineWrap(true);
      area.setBackground(Color.black);
      area.setForeground(Color.pink);
      area.setFont(new Font("Times New Roman",Font.BOLD,16));
      
      JScrollPane scroll= new JScrollPane(area);
      scroll.setBounds(39,389,320,64);
      
      pestana.add(scroll);
      pestana.add(acepta);
        movePanel();
        accionar();
		salirPantalla();
	}

	private void salirPantalla() {
		
		ActionListener salir= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(salirB == e.getSource()) {
					System.exit(0);
				}}};
				
				salirB.addActionListener(salir);
	}

	private Image getImageIcon() {
		
		return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/logo.png"));
	}
	
	private ImageIcon fondo(String ima) {
		
		fondo= new ImageIcon(new ImageIcon(getClass().getResource(ima)).getImage());
		fondo2= new ImageIcon(fondo.getImage().getScaledInstance(pestana.getWidth(), pestana.getHeight(), Image.SCALE_SMOOTH));
		return fondo2;
	}
	
    private ImageIcon salir(String ima) {
		
		salir2= new ImageIcon(new ImageIcon(getClass().getResource(ima)).getImage());
		salir3= new ImageIcon(salir2.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH));
		return salir3;
	}
    
    private ImageIcon salir2(String ima) {
		
		salir2= new ImageIcon(new ImageIcon(getClass().getResource(ima)).getImage());
		salir3= new ImageIcon(salir2.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH));
		return salir3;
	}
    
	private void accionar() {
		
		MouseListener acciona= new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			    twwath.mensajeIn(area.getText());
				JOptionPane.showMessageDialog(rootPane, "Mensaje enviado.");
				area.setText("");	
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
					
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				acepta.setBackground(new Color(255,224,178));
				acepta.setForeground(new Color(239,108,0));	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				acepta.setBackground(Color.ORANGE);
				acepta.setForeground(Color.BLACK);	
				
			}};
			acepta.addMouseListener(acciona);
	}
	
	     @SuppressWarnings("unused")
		private void headerMousePressed(java.awt.event.MouseEvent evt) {
	        xMouse = evt.getX();
	        yMouse = evt.getY();
	    }//GEN-LAST:event_headerMousePressed
	    @SuppressWarnings("unused")
		private void headerMouseDragged(java.awt.event.MouseEvent evt) {
	        int x = evt.getXOnScreen();
	        int y = evt.getYOnScreen();
	        this.setLocation(x - xMouse, y - yMouse);
	    }
	    
	    public void movePanel() {
	    	MouseMotionListener call= new MouseMotionListener() {

				@Override
				public void mouseDragged(MouseEvent e) {
					headerMouseDragged(e);	
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					headerMousePressed(e);
				}};
				panel.addMouseMotionListener(call);
	    }

}
