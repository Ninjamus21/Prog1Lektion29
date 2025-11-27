# Opgaver lektion 29

## Opgave 1

In main metoden i Opgave01Main klassen finder I to variabler gryffindors og slytherins der
begge indeholder liste af typen Character. Begge er sorteret i alfabetisk orden på name
attributten.

Lav en statisk metode der givet to ArrayList<Character> fletter de to lister sammer og
returnerer den sammenflettede liste.

Test din metode ved at udskrive resultatet til konsollen.

## Opgave 2

I main metoden i Opgave02Main klassen finder i to variabler teamA og teamB. De indeholder
begge et array af Teams som er sorteret efter hvor mange point et team har, med flest point
først. Ved pointlighed er de derefter sorteret efter målforskel, med højest målforskel først.

Lav en statisk metode der givet to arrays af Team returnerer et nyt array af Team, hvor ordnet
efter overstående beskrivelse.

Brug skabelonen for en generel fletning til at løse denne opgave.

Ekstra opgave: Løs opgaven ved at implementere Comparable interface i Team klassen.

## Opgave 3

I denne opgave skal I finde fællesmængden af de to arrays af int.

```java
/**
* Returnerer et sorteret array der indeholder alle
* elementer 11 og 12 har til fælles
* Krav: 11 og 12 er sorterede, indeholder ikke dubletter og
* indeholder ikke tomme pladser
*/
public static int[] fællesTal(int[] 11, int[] 12)
```

Fællesmængden af intArray1 og intArray2 er {2, 4, 6, 12}

Ekstra opgave: Kan I også finde de tal som de to lister ikke har til fælles?

## Opgave 4

I main metoden for opgave 4 finder I to variabler peoplel og people2 af typen
ArrayList<Person>, der indeholder 20 Person objekter sorteret efter først efternavn og i
tilfælde af at efternavnene er ens dernæst på fornavn.

Implementer metoden merge, så I kan flette de to lister sammen. For at dette kan lade sig gøre
har I behov for at implementerer compareTo metoden i Person klassen.

compareTo metoden skal returnere et negativt tal hvis den person der sammenlignes med, har
et navn der kommer tidligere i alfabetet, 0 hvis de to navne er ens og et positivt tal ellers.
Hint: String har en compareTo metode.
