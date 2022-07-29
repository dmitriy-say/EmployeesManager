package org.example.controller;

import org.example.view.EmployeeView;
import org.example.view.MainView;
import org.example.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainController extends Controller {

    public MainController() {}


    @Override
    public int execute(int action) {


        List<Controller> controllers = new ArrayList<>();
        controllers.add(new MenuController());
        controllers.add(new EmployeeController());
        controllers.add(new AddEmployeeController());
        controllers.add(new RemoveEmployeeController());

        do {
            for (Controller controller : controllers) {
                if (controller.canDo(action)) {
                    controller.execute(action);
                    action = controller.execute(action);
                }


            }
        } while (action != FINISH_ACTION);
        return action;
    }
}
