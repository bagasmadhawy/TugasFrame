/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Bagas
 */
public class Inputan extends JFrame {

    public Inputan() {
        //frame
        JFrame frame = new JFrame();
        frame.setTitle("INPUT BIODATA");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        //judul
        JLabel label = new JLabel("BIODATA");
        frame.add(label);
        label.setBounds(370, 20, 100, 20);

        //nama
        JLabel labelNama = new JLabel("Nama");
        frame.add(labelNama);
        labelNama.setBounds(50, 70, 150, 20);
        JLabel titikDua = new JLabel(" : ");
        frame.add(titikDua);
        titikDua.setBounds(185, 70, 150, 20);
        JTextField tfNama = new JTextField();
        frame.add(tfNama);
        tfNama.setBounds(200, 70, 280, 20);

        //ttl
        JLabel labelTtl = new JLabel("Tempat, Tanggal Lahir");
        frame.add(labelTtl);
        labelTtl.setBounds(50, 100, 150, 20);
        JLabel titikDuaA = new JLabel(" : ");
        frame.add(titikDuaA);
        titikDuaA.setBounds(185, 100, 150, 20);
        JTextField tfTtl = new JTextField();
        frame.add(tfTtl);
        tfTtl.setBounds(200, 100, 280, 20);

        //alamat
        JLabel labelAlamat = new JLabel("Alamat");
        frame.add(labelAlamat);
        labelAlamat.setBounds(50, 130, 150, 20);
        JLabel titikDuaB = new JLabel(" : ");
        frame.add(titikDuaB);
        titikDuaB.setBounds(185, 130, 150, 20);
        JTextArea taAlamat = new JTextArea();
        taAlamat.setLineWrap(true);
        taAlamat.setWrapStyleWord(true);
        frame.add(taAlamat);
        taAlamat.setBounds(200, 130, 280, 50);

        //jeniskelamin
        JLabel labelJk = new JLabel("Jenis Kelamin");
        frame.add(labelJk);
        labelJk.setBounds(50, 190, 150, 20);
        JLabel titikDuaC = new JLabel(" : ");
        frame.add(titikDuaC);
        titikDuaC.setBounds(185, 190, 150, 20);
        JRadioButton rbLk = new JRadioButton(" Laki-Laki ");
        frame.add(rbLk);
        rbLk.setBounds(200, 190, 100, 20);
        JRadioButton rbPr = new JRadioButton(" Perempuan ");
        frame.add(rbPr);
        rbPr.setBounds(300, 190, 100, 20);
        ButtonGroup bgJk = new ButtonGroup();
        bgJk.add(rbLk);
        bgJk.add(rbPr);

        //agama
        JLabel labelAgama = new JLabel("Agama");
        frame.add(labelAgama);
        labelAgama.setBounds(50, 220, 150, 20);
        JLabel titikDuaD = new JLabel(" : ");
        frame.add(titikDuaD);
        titikDuaD.setBounds(185, 220, 150, 20);
        String[] namaAgama
                = {" Islam ", " Kristen ", " Katholik ", " Hindu ", " Budha "};
        JComboBox cbAgama = new JComboBox(namaAgama);
        frame.add(cbAgama);
        cbAgama.setBounds(200, 220, 280, 20);

        //goldar
        JLabel labelGd = new JLabel("Golongan Darah");
        frame.add(labelGd);
        labelGd.setBounds(50, 250, 150, 20);
        JLabel titikDuaE = new JLabel(" : ");
        frame.add(titikDuaE);
        titikDuaE.setBounds(185, 250, 150, 20);
        String[] namaGoldar
                = {" O ", " AB ", " B ", " A "};
        JComboBox cbGoldar = new JComboBox(namaGoldar);
        frame.add(cbGoldar);
        cbGoldar.setBounds(200, 250, 280, 20);

        //bahasa
        JLabel labelBahasa = new JLabel("Bahasa Sehari-Hari");
        frame.add(labelBahasa);
        labelBahasa.setBounds(50, 280, 150, 20);
        JLabel titikDuaF = new JLabel(" : ");
        frame.add(titikDuaF);
        titikDuaF.setBounds(185, 280, 150, 20);
        JCheckBox cbBi = new JCheckBox(" B. Indonesia ");
        frame.add(cbBi);
        cbBi.setBounds(200, 280, 100, 20);
        JCheckBox cbBd = new JCheckBox(" B. Daerah ");
        frame.add(cbBd);
        cbBd.setBounds(300, 280, 100, 20);
        JCheckBox cbBin = new JCheckBox(" B. Inggris ");
        frame.add(cbBin);
        cbBin.setBounds(400, 280, 100, 20);

        //hobi
        JLabel labelHobi = new JLabel("Hobi");
        frame.add(labelHobi);
        labelHobi.setBounds(50, 310, 150, 20);
        JLabel titikDuaG = new JLabel(" : ");
        frame.add(titikDuaG);
        titikDuaG.setBounds(185, 310, 150, 20);
        JTextField tfHobi = new JTextField();
        frame.add(tfHobi);
        tfHobi.setBounds(200, 310, 280, 20);

        //btnsimpan
        JButton simpan = new JButton("Simpan");
        frame.add(simpan);
        simpan.setBounds(50, 360, 80, 30);
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfNama.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Nama Masih Kosong!!!");
                } else if (tfTtl.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Tempat Tanggal Lahir Masih Kosong!!!");
                } else if (taAlamat.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Alamat Masih Kosong!!!");
                } else if (bgJk.isSelected(null)) {
                    JOptionPane.showMessageDialog(rootPane, "Jenis Kelamin Belum Dipilih!!!");
                } else if (!cbBi.isSelected() && !cbBd.isSelected() && !cbBin.isSelected()) {
                    JOptionPane.showMessageDialog(rootPane, "Bahasa Sehari-Hari Belum Dipilih!!!");
                } else if (tfHobi.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Hobi Masih Kosong!!!");
                } else {
                    String nama = tfNama.getText();
                    String ttl = tfTtl.getText();
                    String alamat = taAlamat.getText();
                    String hobi = tfHobi.getText();
                    String jenkel = "";
                    if (rbLk.isSelected()) {
                        jenkel = "Laki-Laki";
                    } else if (rbPr.isSelected()) {
                        jenkel = "Perempuan";
                    }
                    String hA = cbAgama.getSelectedItem().toString();
                    String hG = cbGoldar.getSelectedItem().toString();
                    String bahasa = "";
                    if (cbBi.isSelected()) {
                        bahasa += " >" + cbBi.getText() + " ";
                    }
                    if (cbBd.isSelected()) {
                        bahasa += " >" + cbBd.getText() + " ";
                    }
                    if (cbBin.isSelected()) {
                        bahasa += " >" + cbBin.getText() + " ";
                    }
                    bahasa = bahasa.substring(0, bahasa.length());
                    Outputan out = new Outputan(nama, ttl, alamat, jenkel, hA, hG, bahasa, hobi);
                    frame.dispose();
                }
            }
        });

        //btnreset
        JButton reset = new JButton("Reset");
        frame.add(reset);
        reset.setBounds(150, 360, 80, 30);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNama.setText("");
                tfTtl.setText("");
                taAlamat.setText("");
                tfHobi.setText("");
                bgJk.clearSelection();
                cbAgama.setSelectedIndex(0);
                cbGoldar.setSelectedIndex(0);
                cbBi.setSelected(false);
                cbBd.setSelected(false);
                cbBin.setSelected(false);
            }
        });
    }
}
