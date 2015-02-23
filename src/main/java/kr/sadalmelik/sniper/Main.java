package kr.sadalmelik.sniper;

import kr.sadalmelik.sniper.ui.MainWindow;

import javax.swing.*;

/**
 * Created by SejongPark on 15. 2. 9..
 */
public class Main {
    public static final String SNIPER_STATUS_NAME = "sniper status";
    private MainWindow ui;

    public Main() throws Exception{
        startUserInterface();
    }

    public static void main(String... args) throws Exception {
        Main main = new Main();
    }

    private void startUserInterface() throws Exception{
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                ui = new MainWindow();
            }
        });
    }

}


