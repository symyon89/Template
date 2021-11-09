package com.company;

import java.time.LocalDate;

public class Echipamente {
    private String grup;
    private String tip;
    private String nume;
    private LocalDate dataReparatie;
    private int intervalReparatie;
    private LocalDate dataCuratare;
    private int intervalCuratare;

    public Echipamente(String grup, String tip, String nume, LocalDate dataReparatie, int intervalReparatie, LocalDate dataCuratare, int intervalCuratare) {
        this.grup = grup;
        this.tip = tip;
        this.nume = nume;
        this.dataReparatie = dataReparatie;
        this.intervalReparatie = intervalReparatie;
        this.dataCuratare = dataCuratare;
        this.intervalCuratare = intervalCuratare;
    }

    public Echipamente() {
    }

    public boolean verificaDacaAreNevoieDeReparatii() {
        LocalDate dataUrmataoreiRaparatii = this.dataReparatie.plusDays(intervalReparatie);
        return !dataUrmataoreiRaparatii.isAfter(LocalDate.now());
//        if(dataUrmataoreiRaparatii.isAfter(LocalDate.now())){
//            return true;
//        }else {
//            return false;
//        }
    }
    public String returneazaStatusReparatiiInRomana(){
        return verificaDacaAreNevoieDeReparatii() ? " Are nevoie de reparatii" : " Nu are nevoie de reparatii";
    }

    public boolean verificaDacaAreNevoieDeCuratare() {
        LocalDate dataUrmataoreiCuratari = this.dataCuratare.plusDays(intervalCuratare);
        return !dataUrmataoreiCuratari.isAfter(LocalDate.now());
    }
    public String returneazaStatusCuratareInRomana(){
        return verificaDacaAreNevoieDeCuratare() ? "Are nevoie de curatare" : " Nu are nevoie de curatare";
    }


    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public LocalDate getDataReparatie() {
        return dataReparatie;
    }

    public void setDataReparatie(LocalDate dataReparatie) {
        this.dataReparatie = dataReparatie;
    }

    public int getIntervalReparatie() {
        return intervalReparatie;
    }

    public void setIntervalReparatie(int intervalReparatie) {
        this.intervalReparatie = intervalReparatie;
    }

    public LocalDate getDataCuratare() {
        return dataCuratare;
    }

    public void setDataCuratare(LocalDate dataCuratare) {
        this.dataCuratare = dataCuratare;
    }

    public int getIntervalCuratare() {
        return intervalCuratare;
    }

    public void setIntervalCuratare(int intervalCuratare) {
        this.intervalCuratare = intervalCuratare;
    }

    @Override
    public String toString() {
        return "Equipment : " +
                "grup='" + grup + '\'' +
                ", tip='" + tip + '\'' +
                ", nume='" + nume + '\'' +
                ", dataReparatie=" + dataReparatie +
                ", intervalReparatie=" + intervalReparatie + returneazaStatusReparatiiInRomana() +
                ", dataCuratare=" + dataCuratare +
                ", intervalCuratare=" + intervalCuratare + returneazaStatusCuratareInRomana();
    }
}
