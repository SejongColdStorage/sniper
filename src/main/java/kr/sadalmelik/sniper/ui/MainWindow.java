package kr.sadalmelik.sniper.ui;


import kr.sadalmelik.sniper.Main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by SejongPark on 15. 2. 9..
 */
public class MainWindow extends JFrame {
    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
    public static final String STATUS_JOINING = "Joining";
    public static final String STATUS_LOST = "Lost";

    private final JLabel sniperStatus = createLabel(STATUS_JOINING);


    public MainWindow(){
        super("Auction Sniper");
        setName(MAIN_WINDOW_NAME);
        add(sniperStatus);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static JLabel createLabel(String initialText){
        JLabel result = new JLabel(initialText);
        result.setName(Main.SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.black));
        return result;
    }
}
