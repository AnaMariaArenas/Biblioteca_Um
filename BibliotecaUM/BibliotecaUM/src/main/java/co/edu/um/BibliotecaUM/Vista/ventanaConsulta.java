package co.edu.um.BibliotecaUM.Vista;

import co.edu.um.BibliotecaUM.Controlador.consultaControlador;
import co.edu.um.BibliotecaUM.Modelo.LEG;
import co.edu.um.BibliotecaUM.Modelo.Libro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventanaConsulta extends JFrame implements ActionListener{
    private JPanel panel;
    private JLabel lblIsbn, lblTitulo, lblAutor, lblFechaPub, lblNumEjem,tituloPrograma ;
    private JTextField  txtIsbn, txtTitulo, txtAutor, txtFechaPub, txtNumEjem;
    public JButton aceptar, cancelar;
    public JButton modificar, guardar;
    public JButton eliminar;
    String unidad;

    ventanaConsulta (){
        super("Probando");
        //instanciamos un objeto Jpanel
        panel=new JPanel();
        add(panel);
        setSize(400, 300);
        setLocation(200,200);
        lblIsbn= new JLabel ("Isbn");
        lblIsbn.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblTitulo= new JLabel ("Título");
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblAutor= new JLabel ("Autor");
        lblAutor.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblFechaPub= new JLabel ("Fecha publicación");
        lblFechaPub.setFont(new java.awt.Font("Comic Sans MS",1,14));
        lblNumEjem= new JLabel ("Número ejemplares");
        lblNumEjem.setFont(new java.awt.Font("Comic Sans MS",1,14));
        txtIsbn= new JTextField("");
        txtTitulo= new JTextField ("");
        txtAutor= new JTextField ("");
        txtFechaPub= new JTextField("");
        txtNumEjem = new JTextField ("");
        aceptar = new JButton ("Aceptar");
        aceptar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        cancelar = new JButton ("Cancelar");
        cancelar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        modificar = new JButton ("Modificar");
        modificar.setFont(new java.awt.Font("Comic Sans MS",1,14));
        eliminar = new JButton ("Eliminar");
        eliminar.setFont(new java.awt.Font("Comic Sans MS",1,14));

        panel.setLayout(null);

        lblIsbn.setBounds(20,20, 180, 30);
        txtIsbn.setBounds(160,20, 180, 30);

        lblTitulo.setBounds(20,60, 180, 30);
        txtTitulo.setBounds(160,60, 180, 30);

        lblAutor.setBounds(20,100,180,30);
        txtAutor.setBounds(160,100, 180, 30);

        lblFechaPub.setBounds(20, 140, 180, 30);
        txtFechaPub.setBounds(160, 140, 180, 30);

        lblNumEjem.setBounds(20, 180, 180, 30);
        txtNumEjem.setBounds(160,180, 180, 30);

        aceptar.setBounds(20,280,180,40);
        cancelar.setBounds(180,280,180,40);
        modificar.setBounds(20,320,180,40);
        eliminar.setBounds(180,320,180,40);


        panel.add(lblIsbn);
        panel.add(lblTitulo);
        panel.add(lblAutor);
        panel.add(lblFechaPub);
        panel.add(lblNumEjem);
        panel.add(txtIsbn);
        panel.add(txtTitulo);
        panel.add(aceptar);
        panel.add(cancelar);
        panel.add(modificar);
        panel.add(eliminar);
        panel.add(txtAutor);
        panel.add(txtFechaPub);
        panel.add(txtNumEjem);

        consultaControlador ctrEvento = new consultaControlador();
       aceptar.addActionListener(this);
       modificar.addActionListener(this);
       cancelar.addActionListener(this);
       eliminar.addActionListener(this);



    }

    public JLabel getLblIsbn() {
        return lblIsbn;
    }

    public void setLblIsbn(JLabel lblIsbn) {
        this.lblIsbn = lblIsbn;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public JLabel getLblFechaPub() {
        return lblFechaPub;
    }

    public void setLblFechaPub(JLabel lblFechaPub) {
        this.lblFechaPub = lblFechaPub;
    }

    public JLabel getLblNumEjem() {
        return lblNumEjem;
    }

    public void setLblNumEjem(JLabel lblNumEjem) {
        this.lblNumEjem = lblNumEjem;
    }



    public JTextField getTxtIsbn() {
        return txtIsbn;
    }

    public void setTxtIsbn(JTextField txtIsbn) {
        this.txtIsbn = txtIsbn;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JTextField getTxtFechaPub() {
        return txtFechaPub;
    }

    public void setTxtFechaPub(JTextField txtFechaPub) {
        this.txtFechaPub = txtFechaPub;
    }

    public JTextField getTxtNumEjem() {
        return txtNumEjem;
    }

    public void setTxtNumEjem(JTextField txtNumEjem) {
        this.txtNumEjem = txtNumEjem;
    }
    DefaultListModel modelo = new DefaultListModel();


    @Override
    public void actionPerformed(ActionEvent e) {
        Libro art = new Libro();
        modelo.addElement(txtIsbn.getText()+"    "+txtTitulo.getText()
                +"    "+txtAutor.getText()+"    "+txtFechaPub.getText()
                +"    "+txtNumEjem.getText());

        if (e.getSource().equals(aceptar)){

        LEG listaBiblioteca;
        listaBiblioteca=null;
        listaBiblioteca.insertar(txtIsbn.getText());


    }
        if(e.getSource() == cancelar)
        {
            //cierro la ventana
            this.setVisible(false);
        }
}
}
