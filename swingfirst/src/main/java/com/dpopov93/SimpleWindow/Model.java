/*
 * Class for  Model
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 31.07.17 17:57
 * @version 1.0
 */

package com.dpopov93.SimpleWindow;

import java.awt.Rectangle;
import java.util.Observable;

public class Model extends Observable {
    Rectangle rectangle;

    public Model() {
        rectangle = new Rectangle();
    }

    public void WindowMoved(Rectangle rectangle) {
        setChanged();
        this.rectangle.setBounds(rectangle.getBounds());
        notifyObservers(rectangle);
    }

    public void WindowResized(Rectangle rectangle) {
        setChanged();
        this.rectangle.setBounds(rectangle.getBounds());
        notifyObservers(rectangle);
    }

    public void WindowHidden() {
        setChanged();
        notifyObservers(true);
    }

    public void WindowShown() {
        setChanged();
        notifyObservers(true);
    }
}