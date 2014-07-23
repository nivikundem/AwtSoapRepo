package com.bridgecrossing.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import com.qe2.crossing.CrossingDetailsMessageSender;

public class BridgeCrossingFrame extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JButton sendCrossingDetailsBtn = new JButton("Send");	
	private JLabel vrnLbl = new JLabel("VRN");
	private JLabel directionLbl = new JLabel("DIRECTION");
	private JLabel gateLbl = new JLabel("GATE NUMBERS");
	private JTextField vrnField = new JTextField(15);	
	private JRadioButton north = new JRadioButton("North");
	private JRadioButton south = new JRadioButton("South");		
	private JComboBox gatesCombo = new JComboBox(getGateNumbers());
	private ButtonGroup directionSelectGroup = new ButtonGroup();		
	private String direction = "SOUTH";
	
	/**
	 * BridgeCrossingFrame
	 */
	public BridgeCrossingFrame()
	{
		setupFrame();
		setupControls();
		addComponentsToPane(this.getContentPane());
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	/**
	 * setupFrame
	 */
	private void setupFrame()
	{
		setTitle("Bridge Crossing Applet");
		setSize(300,300); // default size is 0,0
		setLocation(20,300); // default is 0,0 (top left corner)
	}
	
	/**
	 * Adding Event listeners to the button
	 */
	private void setupControls()
	{
		sendCrossingDetailsBtn.setEnabled(true);
		sendCrossingDetailsBtn.addActionListener(new ActionListener() {		         
			@Override
			public void actionPerformed(ActionEvent e) {
				String vrn = "UNIDENTIFIED";
				if(vrnField.getText().trim().length()>0){
					vrn = vrnField.getText().replaceAll("[^A-Za-z0-9]", "").toUpperCase();
				}			
				String chosenGate = (String) gatesCombo.getSelectedItem();
				CrossingDetailsMessageSender.CrossingDetails(vrn, chosenGate,direction);
			}
        });
		
		north.addActionListener(new ActionListener() {		         
			@Override
			public void actionPerformed(ActionEvent e) {
				direction = "NORTH";
			}
		});
		
		south.addActionListener(new ActionListener() {		         
			@Override
			public void actionPerformed(ActionEvent e) {
				direction = "SOUTH";
			}
		}); 
	}
	
	/**
	 * Add components to the container
	 * @param pane
	 */
	private void addComponentsToPane(Container pane)
	{
				
		JPanel content = new JPanel();		
		content.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
		content.setBackground(Color.BLACK);
		content.setLayout(new BoxLayout(content,
				BoxLayout.PAGE_AXIS));        
        JPanel crossingPnl = new JPanel(false);
        crossingPnl.setLayout(new BoxLayout(crossingPnl,
					BoxLayout.PAGE_AXIS));        
        Border appletBorder = BorderFactory.createLineBorder(Color.BLACK);
        appletBorder = BorderFactory.createTitledBorder(
        		appletBorder, "Bridge Crossing Applet");        
        crossingPnl.setBorder(appletBorder);        
        JPanel vrnPnl = new JPanel();       
        vrnPnl.add(vrnLbl);
        vrnPnl.add(vrnField);        
        JPanel directionPnl = new JPanel(new GridLayout(0, 1));        
        directionPnl.add(directionLbl);
        directionPnl.add(north);
        directionSelectGroup.add(north);
        directionPnl.add(south);
        directionSelectGroup.add(south);
	   	Border directionBdr = BorderFactory.createEmptyBorder(0, 70, 5, 70);
		directionPnl.setBorder(directionBdr);
	   	JPanel gatePnl = new JPanel(new GridLayout(0, 1));
        gatePnl.add(gateLbl);
		gatePnl.add(gatesCombo);		
		Border gateBdr = BorderFactory.createEmptyBorder(0, 70, 5, 70);
		gatePnl.setBorder(gateBdr);
        JPanel sendBtnPnl = new JPanel();
        sendBtnPnl.add(sendCrossingDetailsBtn);		
        crossingPnl.add(vrnPnl);
        crossingPnl.add(directionPnl);       
        crossingPnl.add(gatePnl);
        crossingPnl.add(sendBtnPnl);      
		content.add(crossingPnl);
        pane.add(content);		
	}
	
	/**
	 * Get gatenumbers
	 * @return String[]
	 */
	private String[] getGateNumbers(){
		  String[] gateNumbers = new String[3];
	        gateNumbers[0] = "GATE 1";
	        gateNumbers[1] = "GATE 2";
	        gateNumbers[2] = "GATE 3";
	        return gateNumbers;
	}	
}
