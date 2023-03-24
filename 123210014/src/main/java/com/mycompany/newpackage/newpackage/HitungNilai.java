/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newpackage.newpackage;

/**
 *
 * @author Lab Informatika
 */
public class HitungNilai implements MenghitungNilai {

    double akhir, numnilai1, numnilai2, numnilai3;

    public HitungNilai(double numnilai1, double numnilai2, double numnilai3) {
        this.numnilai1 = numnilai1;
        this.numnilai2 = numnilai2;
        this.numnilai3 = numnilai3;
    }

    public void HitungProgrammer() {
        akhir = (0.6 * numnilai1) + (0.15 * numnilai2) + (0.25 * numnilai3);
    }

    public void HitungDesigner() {
        akhir = (0.3 * numnilai1) + (0.45 * numnilai2) + (0.25 * numnilai3);
    }

    public double GetNilai() {
        return akhir;
    }
}
