package gui;

import controller.CandidatoController;
import controller.ProductoController;

public class VentanaRegistrarCandidatos extends Ventana {
    private JLabel textoEncabezado, textoNombre, textoPartidoPolitico, textoCargo;
    private JTextField campoNombre, campoPartidoPolitico, campoCargo;
    private JButton botonRegistrar, botonCancelar;


    public VentanaAgregarProducto(){
        super("Agregar Producto", 500, 520);
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoNombre();
        generarCampoPartidoPolitico();
        generarCampoCargo();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de Productos";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 100, 10, 290, 50);

    }
    // BOTONES YA HECHOS
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Candidato";
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
        String textoNombre= "Nombre del Candidato:";
        super.generarJLabel(this.textoNombre,textoNombre,20,80,150,20);
        this.campoNombre= super.generarJTextField(200,80,250,20);
        this.add(this.campoNombre);
    }
    private void generarCampoPartidoPolitico(){
        String textoPartido= "Partido Politico :";
        super.generarJLabel(this.textoPartidoPolitico,textoPartido,20,130,150,20);
        this.campoPartidoPolitico = super.generarJTextField(200,130,250,20);
        this.add(this.campoPartidoPolitico);
    }
    private void generarCampoCargo(){
        String textoCargo = "Cargo aspirante :";
        super.generarJLabel(this.campoCargo,textoCargo,20,180,150,20);
        this.campoCargo = super.generarJFormattedTextField(super.generarFormato(0),200,180,250,20);
        this.add(this.campoCargo);
    }

    private boolean registrarCandidato() throws ClassNotFoundException {
        if(this.campoNombre.getText().length()==0 || this.campoPartidoPolitico.getText().length()==0 || this.campoCargo.getText().length()==0){
            return false;
        }
        else{
            return CandidatoController.registrarCandidato(this.campoNombre.getText(),this.campoPartidoPolitico.getText(),this.campoCargo.getText());
        }
    }





    //ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == this.botonRegistrar) {
            try {
                if(agregarProducto()) {
                    JOptionPane.showMessageDialog(this,"Producto registrado correctamente");
                    VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Producto ya ingresado o datos incorrectos");
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
