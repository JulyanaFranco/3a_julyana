/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 05010722259
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Label lblNumero1;
    @FXML
    private Label lblNumero2;
    @FXML
    private Label lblResultado;
    
    @FXML
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 + num2; 
        
        txtResultado.setText(resultado.toString());
    }
    @FXML
    private void subtracao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 - num2; 
        
        txtResultado.setText(resultado.toString());
    }
    @FXML
    private void multiplicacao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 * num2; 
        
        txtResultado.setText(resultado.toString());
    }
    @FXML
    private void divisao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = num1 / num2; 
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    private void limpar(ActionEvent event) {
      txtNumero1.setText("");
      txtNumero2.setText("");
      txtResultado.setText("");
    }
    @FXML
    private void fechar(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
