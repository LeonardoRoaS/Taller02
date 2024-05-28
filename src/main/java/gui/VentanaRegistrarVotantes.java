package gui;

import controller.CandidatoController;
import controller.ProductoController;
import controller.VotanteController;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaRegistrarVotantes extends Ventana{
    private JLabel textoEncabezado, textoRUT;
    private JTextField campoRUT;
    private JButton botonRegistrar, botonCancelar;


    public VentanaRegistrarVotantes(){
        super("registro de votantes", 500, 520);
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoRUT();
    }
    private void generarEncabezado() {
        String textoCabecera = "Ingreso de Votante";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 100, 10, 290, 50);

    }
    // BOTONES YA HECHOS
    private void generarBotonRegistrar() {
        String textoBoton= "Ingresar";
        this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonRegistrar);
        this.botonRegistrar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }


    // CAMPOS
    private void generarCampoRUT(){
        String textoRUT= "Ingrese su RUT: ";
        super.generarJLabel(this.textoRUT,textoRUT,20,80,150,20);
        this.campoRUT= super.generarJTextField(200,80,250,20);
        this.add(this.campoRUT);
    }

    private boolean ingresoVotante() throws ClassNotFoundException {
        if(this.campoRUT.getText().length()==0){
            return false;
        }
        else{
            return VotanteController.validarVotante(this.campoRUT.getText());
        }
    }

    //ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == this.botonRegistrar) {
            try {
                if(ingresoVotante()) {
                    JOptionPane.showMessageDialog(this,"Votante habilitado... entrando a pagina para votar");
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Usted no está habilitado para votar");
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == this.botonCancelar){
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
            this.dispose();
        }
    }

}
