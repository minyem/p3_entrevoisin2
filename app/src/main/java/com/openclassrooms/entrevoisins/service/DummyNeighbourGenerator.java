package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "https://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "caroline@hotmail.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot.."),
            new Neighbour(2, "Jack", "https://i.pravatar.cc/150?u=a042581f4e29026704e", "Saint-Pierre-du-Mont ; 6km",
                    "+33 6 56 54 92 84",  "jack@hotmail.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime le football"),
            new Neighbour(3, "Chloé", "https://i.pravatar.cc/150?u=a042581f4e29026704f", "Saint-Pierre-du-Mont ; 4km",
                    "+33 6 62 44 90 42",  "chloe@inet.com","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime le football"),
            new Neighbour(4, "Vincent", "https://i.pravatar.cc/150?u=a042581f4e29026704a", "Saint-Pierre-du-Mont ; 3km",
                    "+33 6 82 67 90 20",  "vincent@easynet.us","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime faire la fête"),
            new Neighbour(5, "Elodie", "https://i.pravatar.cc/150?u=a042581f4e29026704b", "Saint-Pierre-du-Mont ; 2km",
                    "+33 6 28 78 97 52",  "elodie@gmail.it","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime faire la fête"),
            new Neighbour(6, "Sylvain", "https://i.pravatar.cc/150?u=a042581f4e29026704c", "Saint-Pierre-du-Mont ; 2km",
                    "+33 6 78 57 35 74",  "sylvain@gmail.com","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime faire la fête"),
            new Neighbour(7, "Laetitia", "https://i.pravatar.cc/150?u=a042581f4e29026703d", "Saint-Pierre-du-Mont ; 1km",
                    "+33 6 47 69 74 14",  "laetitia@facebook.com","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime le rugby"),
            new Neighbour(8, "Dan", "https://i.pravatar.cc/150?u=a042581f4e29026703b", "Saint-Pierre-du-Mont ; 1km",
                    "+33 6 74 57 87 15",  "dan@faceook.com","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime le rugby"),
            new Neighbour(9, "Joseph", "https://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint-Pierre-du-Mont ; 6km",
                    "+33 6 78 48 90 98",  "joseph@hotmail.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les sports de combat"),
            new Neighbour(10, "Emma", "https://i.pravatar.cc/150?u=a042581f4e29026706d", "Saint-Pierre-du-Mont ; 6km",
                    "+33 6 74 55 87 18",  "emma@lui.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les sports de combat"),
            new Neighbour(11, "Patrick", "https://i.pravatar.cc/150?u=a042581f4e29026702d", "Saint-Pierre-du-Mont ; 6km",
                    "+33 6 47 59 70 18",  "patrick@lognet.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les maths"),
            new Neighbour(12, "Ludovic", "https://i.pravatar.cc/150?u=a042581f3e39026702d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 55 74 95 48",  "ludovic@network.fr","Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les maths")
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
