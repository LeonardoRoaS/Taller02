package gui;

import controller.ProductoController;

import javax.swing.*;
import java.awt.event.*;

public class VentanaBienvenida extends Ventana {

    private JLabel textoMenu;
    private JButton botonGestionElecciones;
    private JButton botonRegistrarCandidatos;
    private JButton botonRegistrarVotantes;
    private JButton botonSalida;

    public VentanaBienvenida() {
        super("Menu", 655, 640);
        inicializarBotonesVentana();
    }

    public void inicializarBotonesVentana() {
        generarMensajeMenu();
        generarBotonGestionElecciones();
        generarBotonRegistroCandidatos();
        generarBotonRegistroVotantes();
        generarBotonSalida();
    }

    public void generarMensajeMenu() {
        String mensajeBienvenida = "Bienvenid@ al Menu";
        super.generarJLabelEncabezado(this.textoMenu, mensajeBienvenida, 200, 50, 700, 40);
    }

    private void generarBotonGestionElecciones() {
        String textoBoton = "Gestion de Elecciones";
        this.botonGestionElecciones = super.generarBoton(textoBoton, 230, 100, 175, 40);
        this.add(this.botonGestionElecciones);
        this.botonGestionElecciones.addActionListener(this);
    }

    private void generarBotonRegistroCandidatos() {
        String textoBoton = "Registrar Candidatos";
        this.botonRegistrarCandidatos = super.generarBoton(textoBoton, 230, 180, 175, 40);
        this.add(this.botonRegistrarCandidatos);
        this.botonRegistrarCandidatos.addActionListener(this);
    }

    private void generarBotonRegistroVotantes() {
        String textoBoton = "Registrar Votantes";
        this.botonRegistrarVotantes = super.generarBoton(textoBoton, 230, 260, 175, 40);
        this.add(this.botonRegistrarVotantes);
        this.botonRegistrarVotantes.addActionListener(this);
    }

    public void generarBotonSalida() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 230, 480, 175, 40);
        this.add(botonSalida);
        this.botonSalida.addActionListener(this);
    }


    // ACCIONES DE LOS BOTONES

    public void actionPerformed(ActionEvent e) {
        //ACCION BOTON AGREGAR PRODUCTO
        if (e.getSource() == this.botonGestionElecciones) {
            VentanaGestionarElecciones gestionElecciones = new VentanaGestionarElecciones();
            this.dispose();
        }
        //ACCION BOTON BUSCAR PRODUCTO
        if (e.getSource() == this.botonRegistrarCandidatos) {
                VentanaRegistrarCandidatos registrarCandidatos = new VentanaRegistrarCandidatos();
                this.dispose();
            }
            //ACCION BOTON ELIMINAR PRODUCTO
            if (e.getSource() == this.botonRegistrarVotantes) {
                    VentanaRegistrarVotantes registrarVotantes = new VentanaRegistrarVotantes();
                }
                this.dispose();
            }
            // ACCION BOTON SALIDA
            if (e.getSource() == this.botonSalida) {
                this.dispose();
                System.exit(0);
            }
        }
    }
}
