/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.CardLayout;
import javax.swing.JPanel;
import framework.presentation.*;

/**
 *
 * @author GEORGE
 */
public class Navigation {
    
    public static final String PANEL_MAIN = "PANEL_MAIN";
    public static final String DATACNatural = "dataCNatural";
    public static final String DATACJuridicos = "dataCJuridicos";
    public static final String REGISTROCNatural = "registroCNatural";
    public static final String REGISTROJuridico = "registroJuridico";
    public static final String EDITJuridico = "EDITJuridico";
    public static final String EDITNatural = "EDITNatural";
    public static final String REGISTRO_LECTURA_CN = "REGISTRO_LECTURA_CN";
    public static final String REGISTRO_LECTURA_CJ = "REGISTRO_LECTURA_CJ";
    public static final String LECTURAS = "LECTURAS";
    public static final String SERVICIO_CN = "SERVICIO_CN";
    public static final String SERVICIO_CJ = "SERVICIO_CJ";
    
    private static final JPanel paren = FrameMain.PANEL_MAIN;
    
    public static void toPanel(String panel) {
        CardLayout cl = (CardLayout) paren.getLayout();
        cl.show(paren, panel);
    }
}
