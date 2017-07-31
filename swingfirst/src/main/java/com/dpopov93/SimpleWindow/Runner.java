/*
 * Class for  Runner
 * @author dpopov93 (mailto:d.popov93@mail.ru)
 * @since 31.07.17 18:01
 * @version 1.0
 */

package com.dpopov93.SimpleWindow;

public class Runner {
    private Model model;
    private View view;
    private Controller controller;

    public Runner() {
        this.model = new Model();
        this.view = new View("The Window", 400, 200);
        this.controller = new Controller();
    }

    public void run() {
        model.addObserver(view);
        controller.addModel(model);
        controller.addView(view);
        view.addController(controller);
    }
}
