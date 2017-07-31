/*
 * Class for  Controller
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 31.07.17 17:57
 * @version 1.0
 */

package com.dpopov93.SimpleWindow;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Controller implements ComponentListener {
    private Model model;
    private View view;

    public Controller() {

    }

    public void addModel(Model m) {
        this.model = m;
    }

    public void addView(View v) {
        this.view = v;
    }

    public void componentResized(ComponentEvent e) {
        Rectangle rect = new Rectangle();
        rect.setBounds(e.getComponent().getBounds());
        model.WindowMoved(rect);
    }

    public void componentMoved(ComponentEvent e) {
        Rectangle rect = new Rectangle();
        rect.setBounds(e.getComponent().getBounds());
        model.WindowMoved(rect);
    }

    public void componentShown(ComponentEvent e) {
        model.WindowShown();
    }

    public void componentHidden(ComponentEvent e) {
        model.WindowHidden();
    }
}
