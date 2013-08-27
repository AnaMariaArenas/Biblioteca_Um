package co.edu.um.BibliotecaUM.Vista;

import co.edu.um.BibliotecaUM.Modelo.LEG;
import co.edu.um.BibliotecaUM.Modelo.Libro;
import co.edu.um.BibliotecaUM.Modelo.NodoLEG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaPrincipal extends JFrame implements ActionListener {

    //Creo una nueva lista

    public LEG milistica = new LEG();

    //Declaro los componentes de la ventana

    private JList jlLibros;
    private JButton  btnInsertar, btnInsertarEnFin, btnConsultar, btnBuscar, btnEliminar, btnCancelar;
    private JTextField txtIsbn, txtTitulo, txtAutor, txtFechaPub, txtNumEjem,txtBuscar;
    private JLabel lblIsbn, lblTitulo, lblAutor, lblFechaPub, lblNumEjem,tituloPrograma;

    //Declaro dos variables de tipo LEG
    LEG lstLibrosAux, lstBiblioteca;


    //Creo el get y set del componente Jlist
    public JList getJlist() {
        return jlLibros;
    }

    public void setJlist(String jlist) {
        //this.jlLibros = jlLibros;
    }

    @Override
    public String toString() {
        return "ventanaPrincipal{" +
                "jlist=" + jlLibros +
                '}';
    }

    //Declaro el constructor
    public ventanaPrincipal()
    {

    // El initComponents, me permite utlizar el model List
        initComponents();


        setLayout(null);
        // Creo instancias de cada uno de los componentes
        tituloPrograma = new JLabel("BIENVENIDO A LA LIBRERÍA UNIVERSIDAD DE MANIZALES");
        //Defino estilo y tipo
        tituloPrograma.setFont(new java.awt.Font("Comic Sans MS",1,14));
        jlLibros = new JList();
        lblIsbn = new JLabel("Isbn");
        lblIsbn.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblAutor = new JLabel("Autor");
        lblAutor.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblTitulo = new JLabel("Titulo");
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblFechaPub = new JLabel("Fecha de Publicación");
        lblFechaPub.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblNumEjem = new JLabel("Número de Ejemplares");
        lblNumEjem.setFont(new java.awt.Font("Comic Sans MS",1,14));
        txtIsbn = new JTextField("");
        txtAutor = new JTextField("");
        txtTitulo = new JTextField("");
        txtFechaPub = new JTextField("");
        txtNumEjem = new JTextField("");
        txtBuscar = new JTextField("");
        btnInsertar = new JButton("Insertar");
        btnInsertar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        btnInsertarEnFin = new JButton("Insertar al Final");
        btnInsertarEnFin.setFont(new java.awt.Font("Comic Sans MS",1,14));
        btnConsultar = new JButton("Consultar");
        btnConsultar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        btnCancelar = new JButton("Salir");
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS",1,14));

        //Defino las posiciones de los componentes, con su ancho y alto

        //Componentes del label
        tituloPrograma.setBounds(20,30,450,30);
        lblIsbn.setBounds(20,110,180,30);
        lblAutor.setBounds(20,140,180,30);
        lblTitulo.setBounds(20,170,180,30);
        lblFechaPub.setBounds(20,200,180,30);
        lblNumEjem.setBounds(20,230,180,30);
        //Componentes de cuadro de texto
        txtIsbn.setBounds(180,110,180,30);
        txtAutor.setBounds(180,140,180,30);
        txtTitulo.setBounds(180,170,180,30);
        txtFechaPub.setBounds(180,200,180,30);
        txtNumEjem.setBounds(180,230,180,30);
        //Componentes de botones
        btnInsertar.setBounds(20,280,180,40);
        btnInsertarEnFin.setBounds(180,280,180,40);
        btnConsultar.setBounds(20,420,180,40);
        btnBuscar.setBounds(240,360,150,40);
        txtBuscar.setBounds(20,360,200,40);
        btnEliminar.setBounds(20,360,180,40);
        btnCancelar.setBounds(180,420,180,40);
        jlLibros.setBounds(400,80,370,300);

        //Adiciono cada componente
        add(tituloPrograma);
        add(lblIsbn);
        add(lblTitulo);
        add(lblAutor);
        add(lblFechaPub);
        add(lblNumEjem);
        add(jlLibros);
        add(txtIsbn);
        add(txtTitulo);
        add(txtAutor);
        add(txtFechaPub);
        add(txtNumEjem);
        add(txtBuscar);
        add(btnInsertar);
        add(btnInsertarEnFin);
        //add(btnEliminar);
        add(btnConsultar);
        add(btnBuscar);
        add(btnCancelar);

        //Defino el ActionListener de cada boton

        btnInsertar.addActionListener(this);
        btnInsertarEnFin.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnCancelar.addActionListener(this);





        //lstLibrosAux = lstLibros;
        lstBiblioteca = null;


    }

    private void initComponents() {
    }


    public void llenarList()
    {
        Libro libro = new Libro();
        NodoLEG NAux;

        for (int i=0; i < lstBiblioteca.getTalla(); i++){
            NAux = lstBiblioteca.consultar(i);
            libro = (Libro)NAux.getDato();
            modelo.addElement(libro.getIsbn() + "   " + libro.getAutor());
            jlLibros.setModel(modelo);
        }
    }
    public void llenarList2()
    {
        Libro libro = new Libro();
        NodoLEG NAux;

        for (int i=0; i < lstBiblioteca.getTalla(); i++){
            NAux = lstBiblioteca.insertarEnFin(i);
            libro = (Libro)NAux.getDato();
            modelo.addElement(libro.getIsbn() + "   " + libro.getAutor());
            jlLibros.setModel(modelo);
        }
    }




    DefaultListModel modelo = new DefaultListModel();

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnCancelar)
        {
            //cierro la ventana
            this.setVisible(false);
        }
        if (e.getSource()==btnInsertarEnFin){

            /*if (this.txtIsbn.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe ingresar el Isbn del libro");
                this.txtIsbn.grabFocus();
            }
            else {   */


            jlLibros.setModel(modelo);
            modelo.addElement(txtIsbn.getText()+"    "+txtTitulo.getText()
                    +"    "+txtAutor.getText()+"    "+txtFechaPub.getText()
                    +"    "+txtNumEjem.getText());


            lstBiblioteca.insertarEnFin(jlLibros);
            //this.llenarList2();
            }

            if (e.getSource()==btnInsertar){
            System.out.println("holaaa");
            jlLibros.setModel(modelo);
            //lstBiblioteca.insertar(jlLibros);
            modelo.addElement(txtIsbn.getText()+"    "+txtTitulo.getText()
                +"    "+txtAutor.getText()+"    "+txtFechaPub.getText()
                            +"    "+txtNumEjem.getText());

            lstBiblioteca.insertar(jlLibros);
            //this.llenarList();


                }
        if (e.getSource()==btnConsultar){
            ventanaConsulta ventanaConsulta = new ventanaConsulta();
            ventanaConsulta.setLocationRelativeTo(null);
            ventanaConsulta.setSize(600,400);
            ventanaConsulta.getContentPane().setBackground(new Color(216, 230, 243));
            ventanaConsulta.setVisible(true);
        }
        if (e.getSource()==btnEliminar){
            String Nombre=txtTitulo.getText();
            JOptionPane.showMessageDialog(this, Nombre);
        }


        }






    }


