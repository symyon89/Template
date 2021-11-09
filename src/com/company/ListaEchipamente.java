package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ListaEchipamente extends Echipamente {

    private List<Echipamente> echipamente = new  ArrayList<>();

    public void adaugaEchipamente() {


        echipamente.add(new Echipamente("cardio","Banda de alergare","Banda 100xForce",LocalDate.now().minusDays(20),20,LocalDate.now(),7));
        echipamente.add(new Echipamente("forta","gantere","gantere 20kg",LocalDate.now(),1000,LocalDate.now(),7));
        echipamente.add(new Echipamente("forta","Haltere","haltere 100kg",LocalDate.now(),1000,LocalDate.now(),7));
        echipamente.add(new Echipamente("cardio","Banda de alergare","Banda 100xForce",LocalDate.now().minusDays(20),20,LocalDate.now(),7));
    }

    public void afisareEchipamente() {
        AtomicInteger index = new AtomicInteger();
        index.set(1);
        echipamente.forEach(echipament -> {
            System.out.println(index + "." + echipament);
            index.incrementAndGet();
        });
    }
    public void afisareDupaTip() {
        AtomicInteger index = new AtomicInteger();
        index.set(1);
        echipamente.stream().filter(echipament -> echipament.getGrup().equals("forta"))
                .forEach(echipament -> {
                    System.out.println(index + "." + echipament);
                    index.incrementAndGet();
                });
    }
    public void afisareDupaNume() {
        AtomicInteger index = new AtomicInteger();
        index.set(1);
        Comparator<Echipamente> comparator = Comparator.comparing(Echipamente::getNume);
        echipamente.sort(comparator);
        echipamente.forEach(echipament -> {
            System.out.println(index + "." + echipament);
            index.incrementAndGet();
        });
    }
    public void afisareDupaData() {
        AtomicInteger index = new AtomicInteger();
        index.set(1);
        Comparator<Echipamente> comparatordata = Comparator.comparing(Echipamente::getDataReparatie);
        echipamente.sort(comparatordata);
        echipamente.forEach(echipament -> {
            System.out.println(index + "." + echipament);
            index.incrementAndGet();
        });
    }

}
