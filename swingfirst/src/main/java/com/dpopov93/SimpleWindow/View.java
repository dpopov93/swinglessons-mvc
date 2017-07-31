/*
 * Class for  View
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 31.07.17 17:57
 * @version 1.0
 */

package com.dpopov93.SimpleWindow;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ComponentListener;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame implements Observer {
    // TODO: add some interface elements

    private String WindowTitle;

    public View() {
        initUI("Unnamed", 200, 300);
    }

    public View(String title, int width, int height) {
        initUI(title, width, height);
    }

    private void initUI(String title, int width, int height) {
        setTitle(title);
        WindowTitle = title;
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void setTitle(String text) {
        super.setTitle(WindowTitle + " " + text);
    }

    public void update(Observable o, Object arg) {
        setTitle("(" + ((Integer) ((Rectangle) arg).width).toString() +
        "x" + ((Integer) ((Rectangle) arg).height).toString() + ") " +
                ((Integer) ((Rectangle) arg).x).toString() + "x" +
                ((Integer) ((Rectangle) arg).y).toString());
    }

    public void addController(ComponentListener controller) {
        this.addComponentListener(controller);
    }
}
