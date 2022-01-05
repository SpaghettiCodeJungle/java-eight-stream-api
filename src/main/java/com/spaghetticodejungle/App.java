package com.spaghetticodejungle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class App 
{
    public static void main( String[] args )
    {
        List<Pasta> pastas = getPastas();
        //Filter
        List<Pasta> longMediums =  pastas.stream()
            .filter(pasta -> pasta.getVariety().equals(Variety.LONG_AND_MEDIUM))
            .collect(Collectors.toList());
        longMediums.forEach(System.out::println);

        //Sort
        List<Pasta> sortedPasta = pastas.stream()
            .sorted(Comparator.comparing(Pasta::getVariety).thenComparing(Pasta::getOrigin))
            .collect(Collectors.toList());
        //sortedPasta.forEach(System.out::println);

        //All Match
        boolean allMatch = pastas.stream()
            .allMatch(pasta -> pasta.getOrigin().equals("Sicily"));
        //System.out.println(allMatch);

        //Any Match
        boolean anyMatch = pastas.stream()
            .anyMatch(pasta -> pasta.getOrigin().equals("Sicily"));
        //System.out.println(anyMatch);

        //None Match
       boolean noneMatch = pastas.stream()
           .noneMatch(pasta -> pasta.getOrigin().equals("USA"));
        //System.out.println(noneMatch);

        //Max
        pastas.stream()
            .max(Comparator.comparing(Pasta::getSize));
        //.ifPresent(System.out::println);

        //Min
        pastas.stream()
            .min(Comparator.comparing(Pasta::getSize));
        //.ifPresent(System.out::println);

        //Group
        Map<Variety, List<Pasta>> groupByVariety = pastas.stream()
            .collect(Collectors.groupingBy(Pasta::getVariety));
        //System.out.println(groupByVariety);
    }

    private static List<Pasta> getPastas() {
        List<Pasta> pastas = new ArrayList<>();

            pastas.add(new Pasta(Variety.LONG_AND_MEDIUM,"Barbine","Thin strands, often coiled into nests.",6.25,"Little beards","Barbina","Italy"));
            pastas.add(new Pasta(Variety.SHORT_CUT,"Anelli", "Short tubular, or annular-shaped, pasta sometimes with ridges on the inside or outside.",1.5,"Small rings","Anelloni, anellini, anelletti, anelloni d'Africa (large rings)", "Sicily"));
            pastas.add(new Pasta(Variety.STRETCHED, "Cencioni","Petal shaped, slightly curved with rough convex side", 2.5,"Little rags", "Mischiglio (Basilicata)", "Southern Italy"));
            pastas.add(new Pasta(Variety.LONG_AND_MEDIUM,"Bavette","Narrower version of tagliatelle",20.0,"Bibs","Baverine, bavettine, lasagneddi (in Sicily)","Liguria"));

        return pastas;
    }
}
