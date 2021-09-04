/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JFrame;

/**
 *
 * @author IRVIN
 */
public class Tools {

    public static final void createFrm(Class<? extends JFrame> frame, JFrame frameSuper, boolean onTop) {
        try {
            JFrame f = frame.newInstance();
            f.setLocationRelativeTo(frameSuper);
            f.setAlwaysOnTop(onTop);
            f.setVisible(true);
        } catch (InstantiationException ex) {
            ex.printStackTrace(System.out);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
