/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framejava;

import javax.swing.*;

/**
 *
 * @author Bagas
 */
public class Outputan extends JFrame {

    public Outputan(String tfNama, String tfTtl, String taAlamat, String jenkel, String hA, String hG, String bahasa, String tfHobi) {
        //frame
        JFrame frame2 = new JFrame();
        frame2.setTitle("TAMPILAN BIODATA");
        frame2.setSize(800, 500);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.setLayout(null);

        //judul
        JLabel label = new JLabel("BIODATA");
        frame2.add(label);
        label.setBounds(370, 20, 100, 20);

        //nama
        JLabel labelNama = new JLabel("Nama");
        frame2.add(labelNama);
        labelNama.setBounds(50, 70, 150, 20);
        JLabel titikDua = new JLabel(" : ");
        frame2.add(titikDua);
        titikDua.setBounds(185, 70, 150, 20);
        JLabel hasilNama = new JLabel(tfNama);
        frame2.add(hasilNama);
        hasilNama.setBounds(200, 70, 280, 20);

        //ttl
        JLabel labelTtl = new JLabel("Tempat, Tanggal Lahir");
        frame2.add(labelTtl);
        labelTtl.setBounds(50, 100, 150, 20);
        JLabel titikDuaA = new JLabel(" : ");
        frame2.add(titikDuaA);
        titikDuaA.setBounds(185, 100, 150, 20);
        JLabel hasilTtl = new JLabel(tfTtl);
        frame2.add(hasilTtl);
        hasilTtl.setBounds(200, 100, 280, 20);

        //alamat
        JLabel labelAlamat = new JLabel("Alamat");
        frame2.add(labelAlamat);
        labelAlamat.setBounds(50, 130, 150, 20);
        JLabel titikDuaB = new JLabel(" : ");
        frame2.add(titikDuaB);
        titikDuaB.setBounds(185, 130, 150, 20);
        JLabel hasilAlamat = new JLabel(taAlamat);
        frame2.add(hasilAlamat);
        hasilAlamat.setBounds(200, 130, 580, 20);

        //jeniskelamin
        JLabel labelJk = new JLabel("Jenis Kelamin");
        frame2.add(labelJk);
        labelJk.setBounds(50, 160, 150, 20);
        JLabel titikDuaC = new JLabel(" : ");
        frame2.add(titikDuaC);
        titikDuaC.setBounds(185, 160, 150, 20);
        JLabel hasilJk = new JLabel(jenkel);
        frame2.add(hasilJk);
        hasilJk.setBounds(200, 160, 280, 20);

        //agama
        JLabel labelAgama = new JLabel("Agama");
        frame2.add(labelAgama);
        labelAgama.setBounds(50, 190, 150, 20);
        JLabel titikDuaD = new JLabel(" : ");
        frame2.add(titikDuaD);
        titikDuaD.setBounds(185, 190, 150, 20);
        JLabel hasilAgama = new JLabel(hA);
        frame2.add(hasilAgama);
        hasilAgama.setBounds(200, 190, 280, 20);

        //goldar
        JLabel labelGd = new JLabel("Golongan Darah");
        frame2.add(labelGd);
        labelGd.setBounds(50, 220, 150, 20);
        JLabel titikDuaE = new JLabel(" : ");
        frame2.add(titikDuaE);
        titikDuaE.setBounds(185, 220, 150, 20);
        JLabel hasilGoldar = new JLabel(hG);
        frame2.add(hasilGoldar);
        hasilGoldar.setBounds(200, 220, 280, 20);

        //bahasa
        JLabel labelBahasa = new JLabel("Bahasa Sehari-Hari");
        frame2.add(labelBahasa);
        labelBahasa.setBounds(50, 250, 150, 20);
        JLabel titikDuaF = new JLabel(" : ");
        frame2.add(titikDuaF);
        titikDuaF.setBounds(185, 250, 150, 20);
        JLabel hasilBahasa = new JLabel(bahasa);
        frame2.add(hasilBahasa);
        hasilBahasa.setBounds(200, 250, 280, 20);

        //hobi
        JLabel labelHobi = new JLabel("Hobi");
        frame2.add(labelHobi);
        labelHobi.setBounds(50, 280, 150, 20);
        JLabel titikDuaG = new JLabel(" : ");
        frame2.add(titikDuaG);
        titikDuaG.setBounds(185, 280, 150, 20);
        JLabel hasilHobi = new JLabel(tfHobi);
        frame2.add(hasilHobi);
        hasilHobi.setBounds(200, 280, 280, 20);
    }
}
