package com.company;

import java.time.LocalDate;


public class Persoana {
    String nume;
    LocalDate dataInregistrareAbonament;
    TipAbonament tipAbonament;


    public String verificare1Luna(){
        String rezultatul;
        if (tipAbonament.equals(TipAbonament.lunar)){
            LocalDate dataExpirare =  dataInregistrareAbonament.plusMonths(1);
            if(dataExpirare.isAfter(LocalDate.now())){
                 rezultatul = " Nu are acces";
            }else {
                rezultatul = " Are acces";
            }
            
        }else {
            rezultatul = " nu are abonament lunar";
        }
        return rezultatul;
    }
}
