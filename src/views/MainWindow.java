/*
* File: MainWindow.java
* Author: Pásztor István
* Copyright: 2023, Pásztor István
* Date: 2023-12-05
* Licenc: MIT
*
*/
package views;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    public JButton startBtn;
    public JButton stopBtn;
    public JButton nextBtn;
    public JPanel tablePanel;
    public JButton flop1Btn;
    public JButton flop2Btn;
    public JButton flop3Btn;
    public JPanel handPanel;
    public JButton humanCard1Btn;
    public JButton humanCard2Btn ;
    public JPanel buttonPanel;
    public JButton turnButton;
    public JButton riverButton;


    public MainWindow() {
        componentVisible();
        initComponents();
        addPanelComponent();
        panelFrame();
        addComponent();
        initFrame();
    }

    private void componentVisible() {
        this.flop1Btn.setVisible(false);
        this.flop2Btn.setVisible(false);
        this.flop3Btn.setVisible(false);
        this.turnButton.setVisible(false);
        this.riverButton.setVisible(false);
    }

    private void initComponents() {
        this.startBtn = new JButton("Start");
        this.stopBtn = new JButton("Stop");
        this.nextBtn = new JButton("Következő");
        this.tablePanel = new JPanel();
        this.flop1Btn = new JButton("");
        this.flop2Btn = new JButton("");
        this.flop3Btn = new JButton("");
        this.handPanel = new JPanel();
        this.humanCard1Btn = new JButton();
        this.humanCard2Btn = new JButton();
        this.buttonPanel = new JPanel();
        this.turnButton = new JButton();
        this.riverButton = new JButton();
    }

    private void addPanelComponent() {
        this.tablePanel.add(flop1Btn);
        this.tablePanel.add(flop2Btn);
        this.tablePanel.add(flop3Btn);
        this.handPanel.add(this.humanCard1Btn);
        this.handPanel.add(this.humanCard2Btn);
        this.buttonPanel.add(startBtn);
        this.buttonPanel.add(nextBtn);
        this.buttonPanel.add(stopBtn);
        this.tablePanel.add(turnButton);
        this.tablePanel.add(riverButton);
    }

    private void panelFrame() {
        this.tablePanel.setSize(100, 100);
        this.tablePanel.setBackground(Color.LIGHT_GRAY);
    }

    private void addComponent() {
        this.add(buttonPanel);
        this.add(tablePanel);
        this.add(handPanel);
    }

    private void initFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setSize(300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
