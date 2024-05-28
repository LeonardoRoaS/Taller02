package gui;

import controller.CandidatoController;
import controller.VotanteController;
import modelo.data.Eleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaGestionarElecciones extends Ventana{
    private JLabel textoEncabezado, textoNombre, textoFecha, textoLugar;
    private JTextField campoNombre, campoFecha, campoLugar;
    private JButton botonRegistrar, botonCancelar;


    public VentanaGestionarElecciones(){
        super("gestion de elecciones", 500, 520);
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoNombre();
        generarCampoFecha();
        generarCampoLugar();
    }
    private void generarEncabezado() {
        String textoCabecera = "Gestion de Elecciones";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 100, 10, 290, 50);

    }
    // BOTONES YA HECHOS
    private void generarBotonRegistrar() {
        String textoBoton= "Buscar Candidato";
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
    private void generarCampoNombre(){
        String textoNombre= "Nombre de la elección :";
        super.generarJLabel(this.textoNombre,textoNombre,20,80,150,20);
        this.campoNombre= super.generarJTextField(200,80,250,20);
        this.add(this.campoNombre);
    }
    private void generarCampoFecha(){
        String textoFecha= "Fecha de la eleccion :";
        super.generarJLabel(this.textoFecha,textoFecha,20,130,150,20);
        this.campoFecha= super.generarJTextField(200,130,250,20);
        this.add(this.campoFecha);
    }
    private void generarCampoLugar(){
        String textoLugar = "Lugar de la eleccion :";
        super.generarJLabel(this.textoLugar,textoLugar,20,180,150,20);
        this.campoLugar= super.generarJTextField(200,180,250,20);
        this.add(this.campoLugar);
    }

    private boolean buscarCandidatos() throws ClassNotFoundException {
        if(this.campoNombre.getText().length()==0 || this.campoLugar.getText().length()==0 || this.campoFecha.getText().length()==0){
            return false;
        }
        else{
            //return CandidatoController.buscarCandidatos(new Eleccion(this.campoNombre.getText(),this.campoFecha.getText(), this.campoLugar.getText()))
            return true;
        }
    }





    //ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == this.botonRegistrar) {
            try {
                if(buscarCandidatos()) {
                    //Mostrar candidatos
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Candidato no encontrado o datos incorrectos");
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