/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC 03
 */
public class Conversoes {

    public static Date converterData(String data) {
        try {
            if (data != null || !data.trim().equals("")) {
                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                return fmt.parse(data);
            } else {
                return null;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao converter Data! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }
}
