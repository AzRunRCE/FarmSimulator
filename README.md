# FarmSimulator
La vie à la campagne, c'est amusant ! Occupez-vous de vos animaux, récoltez des œufs, produisez et vendez vos propres produits.
Accomplissez de nombreuses missions ! 

## Lancemement du jeu 

1. Une nouvelle ferme avec une poule (nom, 5 points de faim, 1 jour, 15 pièces).
2. Un solde de 100 pièces.

## Gameplay 

- Action jour suivant :
  - Les poules pondent aléatoirement entre 0 et 2 œufs.
  - Les points de faim d'une poule diminuent de 1.
  - Les jours d'une poule augmentent de 1.

## Technique

- Une api qui permet d'atteindre le jour suivant.
- Une poule a :
  - Un nom unique
  - 5 points de faim (elle perd un point de faim à chaque début de journée)
  - Un jour (la durée de vie d'une poule est de 30 jours)
  - Un prix

## Roadmap

- [x] Créer un projet Java SE ainsi que son projet de test.
- [x] Ajouter le solde de pièce par défaut lors du lancement d'une partie.
- [x] Production des œufs 
- [x] Acheter une poule
- [x] Ajouter un nom aléatoire à une poule
- [ ] Vendre une poule

# Commentaires
Une factory pourrait etre utile


class FermeFactory {

contructor(config);
public Create();
{
return new Ferme(config.config)
}
}



extraire la partie random.

public interface irandomService {

public int GetRandom(int min , int max);
}
public class RandomService : irandomService {

public int GetRandom(int min , int max){
  return  (int) (Math.random() * max);
}


public class FakeRandomService : irandomService{

public int GetRandom(int min , int max){
return 1;
}
}



// en prod 

new PondreAction(new RandomService()).Execute()

new PondreAction(new FakeRandomService()).Execute()

randomService : irandomService
