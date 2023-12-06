/*
* File: App.java
* Author: Pásztor István
* Copyright: 2023, Pásztor István
* Date: 2023-12-05
* Licenc: MIT
*
*/

import controllers.MainController;
import views.MainWindow;


    public class App { 
        public static void main(String[] args)throws Exception {
            MainWindow mainWindow = new MainWindow();
            new MainController(mainWindow); mainWindow.setVisible(true);
        }
    }
