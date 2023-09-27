Les classes sont constituées de :
- champs
- méthodes

Il y a trois concepts clés qu'il faudra bien comprendre d'ici la fin de la semaine : 
- Encapsulation 
- Héritage 
- Polymorphisme 

## Encapsulation 

Permet de cacher ce qui n'est pas nécessaire pour l'utilisation d'un objet.
Les éléments visibles depuis l'extérieur de la classe sont appelé l'interface de la classe.

## L'héritage

L'héritage permet de créer une classe à partir d'une autre classe. La classe héritée est appelée la classe mère (ou classe de base ou superclass) , la classe qui hérite est appelée la classe fille (ou classe dérivée ou sous classe).
## Le polymorphisme

Le polymorphisme permet d'utiliser plusieurs classes différentes de façon interchangeable (ce qui implique que l'interface des objets soient similaires) dans un programme.



## En Java
Les classes sont représentée sous forme de diagramme UML (Unified Modeling Language).
UML ⇒ Langage graphique qui permet de représenter les concepts de la POO.
### La création d'une classe
La déclaration d'une classe par la déclaration de la classe elle-même et de tous les éléments la constituant. 

#### La déclaration d'une classe
``` java
[modificateur] class NomDeLaClasse [extends NomDeLaClasseDeBase] [implements NomDeLInterface1, NomInterface2...] {
	code de la classe
}
```
*note : quand c'est entre crochet c'est optionnel*

#### Les modificateurs

Ils permettent de modifier la visibilité de la classe. Il y a plusieurs modificateurs de visibilité/portée :

- **public** : indique que la classe peut être utilisée par toutes les autres classe. Sans ce modificateurs, la classe ne sera utilisable que par les autres classes faisant partie du même package.

- **private** : indique que la classe ne peut être utilisée que par les autres classes faisant partie du même package.

- **protected** : indique que la classe ne peut être utilisée que par les autres classe faisant partie du même package ou par les autres classes file de cette classe.

#### Les autres modificateurs

- **package** : indique que la classe ne peut être utilisée que par les autres classes faisant partie du même package. Ce modificateur est implicite, c'est-à-dire qu'il est utilisé par défaut si aucun autre modificateur n'est spécifié.

- **abstract** : indique que la classe est une classe abstraite. Une classe abstraite ne peut pas être instanciée. Elle ne peut pas être utilisée que comme une classe de base pour d'autres classes.

- **final** : indique que la classe ne peut pas être utilisée comme classe de base.

#### Les champs 

La création de champs fait une syntaxe particulière.

Sachez qu'il est possible de créer des variables de classe avec le mot `static` et des constantes avec `final`.

Les portées : 
- **private** : la variable est visible uniquement dans la classe.
- **protected** : la variable est visible dans la classe et dans els classes filles, ainsi que dans le package.
- **public** : la variable est visible partout.

Si on oublie de préciser une portée , la portée par défaut est package. 
#### Les méthodes

Voici la syntaxe de la création de méthode Java : 
```java
[modificateurs] typeRetour nomMethode ([listeParamètres]) [throws listException]{
	
}
```

Les modificateurs de visibilité sont les mêmes que pour les champs :

- **private** : la méthode est visible uniquement dans la classe.
- **protected** : la méthode est visible dans la classe et dans els classes filles, ainsi que dans le package.
- **public** : la méthode est visible partout.

Des modificateurs supplémentaire sont disponibles :

- **static** : indique que la méthode est une méthode de classe.
- **abstract** : indique que la méthode est abstraite et qu'elle ne contient pas de code (défini dans une classe abstraite et défini dans la classe fille).
- **final** : indique que la méthode ne peut être redéfinie dans les classes filles.
- **native** : indique que la méthode se trouve dans un fichier externe écrit dans un autre langage que java.
- **synchronized** : le code ne peut être exécuté que sur un thread à la fois.


#### Création d'accesseurs (getter et setter)

```java
class Personne {
	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom.toUpperCase();
	}
}
```

#### Les constructeurs et destructeurs 

```java
class Personne {
	//...
	public Personne() {
		//...
	}
}
```

#### Les packages

La portée par défaut en Java.

Comment créer un package ?

- On lui donne un nom ⇒ unique et représentatif des éléments stockés à l'intérieur.
- Par convention on va utiliser le nom de domaine de l'entreprise en inversant l'ordre des éléments comme première partie pour le nom du package.

```java
	isitech.fr
	fr.isitech
	
	ecole-isitech.fr
	fr.ecole_isitech.compta.Client
	fr.ecole_isitech.reseau.Client
```
*Permet d'avoir des classes du même nom de  package différents*

Pour importer la classe Client dans une autre classe il faut utiliser l'instruction import.

```java
	import fr.ecole_isitech.compta.Client;
	import fr.ecole_isitech.compta.*; // importe tous le contenus de compta 
	import fr.* // importe tous les dossiers et sous-rep de fr
```
