package com.sda.amalia.advanced.recapitulare;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {


        Professor prof1 = new Professor(32, "Vlad", Gender.MALE, 3500, "Franceza");
        Professor prof2 = new Professor(37, "David", Gender.MALE, 4500, "Istorie");
        Professor prof3 = new Professor(32, "Maria", Gender.FEMALE, 4700, "Engleza");

        List<Professor> professors = new ArrayList<>();
        professors.add(prof1);
        professors.add(prof2);
        professors.add(prof3);

        System.out.println(professors);

        //afisam ultimul prof din lista

       System.out.println(professors.get(professors.size() - 1));

       //sterg profesor din lista

       // professors.remove(0);

      //  Arrays.sort(professors.toArray()); // sortam lista de profesori

        //declaram un SET in care punem toti profesorii din lista

        Set<Professor> teachers = new HashSet<>();
        teachers.addAll(professors);

        System.out.println(teachers);

        // facem un MAP in care punem elementele unul cate unul(map e format din cheie si valoare) cheia(string) e orasul, si valoarea profesorul

        Map<String, Professor> professorMap = new HashMap<>();
        professorMap.put("Cluj-Napoca", prof1);
        professorMap.put("Bucuresti", prof2);
        professorMap.put("Brasov", prof3);
        professorMap.put("Brasov", prof2); // la operatia de put cheia e aceeasi(brasov) dar se printeaza ultima valoare adaugata

        System.out.println(professorMap);

        //sa luam un element dintr-un map

        professorMap.get("Brasov"); //citim elementul cand stim cheia

        //cand vrem sa parcurgem elementele si nu stim pe care il vrem(nu stiu cheia)
        //Entry = un element din map de forma cheie si valoare. de exemplu pentru elementul "cluj-napoca" prof1:
        //entry.getKey = "cluj-napoca"
        //entry.getValue = prof1;
        for  (Map.Entry<String, Professor> entry : professorMap.entrySet() ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
