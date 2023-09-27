Java existe depuis 20 ans. Créé en 1995 par Sun Microsystem et racheté par Oracle (petite boîte à l'époque)
# Qu'est-ce que JAVA ?
- Langage orienté objet qui permet d'écrire des programmes.
- C'est aussi une plateforme de développement (environnement qui permet au développeur de programmer). Elle est composée d'un ensemble de librairies et d'un ensemble de spécifications (JSR - Java Specification Request) qui décrivent les APIs constituant la plateforme et les outils qui permettent de **compiler**, **debugger** et **exécuter** les programme écrits en Java.

En réalité, il y a plusieurs plateformes :
	La plateforme Java SE

- c'est aussi un **environnement d'exécution** (JRE - Java Runtime Environment). Permet d'exécuter des programme à travers la **JVM** (Java Virtual Machine). L'installation de JRE est nécessaire pour exécuter des programme Java. (Un développeur aura besoin d'installer le JDK)

## Petite histoire 
Jusqu'à récemment, Java était présent dans les navigateurs Web (jeux flash).

Bill Joy, fondateur de Sun Microsystem. 
Ils voulaient mettre du C++ partout mais problème de compatibilité machine → demande à 2 développeur de créer un langage. 

*Anecdote : Java s'appelait C++-- (C++ sans les défauts de C++). Java s'était un argot pour café.*

## Les objectifs de conception de JAVA
-> L'objectif principal : obtenir un langage et une plateforme simple et performants dont le but est le déploiement et le développement d'application.

*Portabilité d'un logiciel : on a rien a installé → on le déplace et il s'exécute ailleurs.*

Java est :
- simple : trois types primitifs qui sont les numériques, le caractère et le booléen.
- Les tableaux et les string sont des objets.
- Le développeur ne s'occupe de la mémoire. Un système de garbage collector est présent pour libérer la mémoire. (Par rapport à C++)

En Java tout est objet, à l'exception des types primitifs.

Java est :
- distribué
- interprété
- robuste
- sécurisé
- portable

Les avantages de la programmation objet : 
- une bonne maitrise des codes et projets complexes

# La plateforme JAVA SE
![[Pasted image 20230925101605.png]]

La plateforme installée sur le poste d’un développeur est le JDK (Java Development Kit). Il propose des API spécifiques, mais surtout des outils d’aide au développement comme le compilateur javac. Le JDK embarque le JRE (Java Runtime Environment). La plateforme installée sur le poste cible (sur lequel doit s’exécuter le programme) est le JRE. Il propose l’API Java et des outils nécessaires dans l’environnement d’exécution comme l’outil java permettant de lancer l’exécution de programme Java. La JVM (Java Virtual Machine) fait partie intégrante du JRE. Elle permet l’exécution effective du programme Java passé en paramètre de l’outil java.

### Les implémentations de la plateforme JAVA SE
Il y en a deux principales : 
- Oracle JDK (Oracle JAVA SE)
- Open JDK

## Les outils de développement
Installation sur Windows:
- https://jdk.java.net/archive/

Installation sur Mac avec brew:
```zsh
brew install openjdk@17
```

### Configuration des variables d'environnement
Sur Windows :

Admettons que le répertoire d'installation de Java soit 
```sh
"C:\Java\jdk-11.0.2"
```

Vous allez créer une variable d'environnement JAVA_HOME qui pointe vers ce répertoire. 
Ensuite vous allez modifier la variable d'environnement PATH pour ajouter le répertoire bin de Java.

```sh
%JAVA_HOME%\bin
```

## La Javadoc
https://docs.oracle.com/en/java/javase/17/docs/api/ 

A l'intérieur de chaque module → package

## Mon premier programme Java
### Compilation
Afin d'être exécuté correctement un programme Java → cmd **javac**. Elle permet de transformer le code source java en bytecode ou langage intermédiaire.

### Définitions
Signature d'une méthode : nom, paramètre

```java
public class Main {
	public static void main(String[] args) { //signature de méthode
		System.out.print("Hello word");
	}
}
```

#### Les variables
Les variables permettent de mémoriser pendant l'exécution d'une application différentes valeurs utiles à son bon fonctionnement. Avant d'utiliser des variables dans un programme, il convient de savoir où les déclarer, quel nom leur donner et quel type leur donne.

Le nom des variables : 
- doit commencer par une lettre ou par un underscore
- ne doit pas contenir d'espace
- ne doit pas contenir de caractères spéciaux
- ne doit pas être un mot clé du langage
- CamelCase ou PascalCase

Le type des variables : 
``` java

```

Différentes catégories de type de variables : 
- les types valeurs → il y en a 7 organisé en 4 catégories :
	- les num entiers
	- les décimaux
	- les caractères
	- les booléens
- les types références : pointe vers une adresse

La déclaration des variables :
```java
[modificateur] type nomVariable
```

```java
type variable, variable2, variable3
```


Quelques exemples de déclaration de variables : 
```java
init i; //declaration
Date today;
String name, firstName
```

### L'initialisation des variables

```java
init i; //declaration
i = 0; //declaration
```

### L'affectation 
Permet de changer la valeur d'une variable initialisée

```java
nomVariable = nouvelleValeur
```

## Les types de valeurs en Java
### [Les types entiers](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-types-entiers)

Il existe 4 types entiers signés en Java :

- byte **8 bits** la valeur minimale est de -128 et la valeur maximale est de 127
- short 16 bits
- int 32 bits
- long 64bits

Quand vous choisissez un type d'entier prenez en compte la valeur minimale et maximale que vous pouvez stocker dans la variable.

Vous pouvez aussi travailler avec des entiers non signees en utilisant des classes telles que **Integer** ou **Long**. Valeur max pour Long : 18 446 744 073 709 551 616

### [Les types decimaux](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-types-decimaux)

Il existe 2 types decimaux en Java :

- float 32 bits
- double 64 bits

### [Les types caracteres](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-types-caracteres)

Le type char est utilisé pour stocker un caractère unique. Une variable de type char utilise deux octets pour stocker le code Unicode du caractère. Dans le jeu de caractères Unicode, les 128 premiers caractères sont identiques au jeu de caractères ASCII, les caractères suivants, jusqu’à 255, correspondent aux caractères spéciaux de l’alphabet latin (par exemple les caractères accentués), le reste est utilisé pour les symboles ou les caractères d’autres alphabets.

Les caractères spécifiques ou ceux ayant une signification particulière pour le langage Java sont représentés par une séquence d’échappement. Elle est constituée du caractère \ suivi d’un autre caractère indiquant la signification de la séquence d’échappement. Le tableau suivant présente la liste des séquences d’échappement et leurs significations.

Sequence d'échappement

```java
    \b  Retour arrière
    \t  Tabulation horizontale
    \n  Saut de ligne
    \f  Saut de page
    \r  Retour chariot
    \"  Guillemet
    \'  Apostrophe
    \\  Antislash

    String s = "Ceci est une chai \" ne de caracteres";
```

Les caractères Unicode non accessibles au clavier sont eux aussi représentés par une séquence d’échappement constituée des caractères \u suivis de la valeur hexadécimale du code Unicode du caractère. Le symbole euro est par exemple représenté par la séquence \u20AC.

```java
char euro = '\u20AC';
```

Lien wiki : [https://fr.wikipedia.org/wiki/Table_des_caract%C3%A8res_Unicode](https://fr.wikipedia.org/wiki/Table_des_caract%C3%A8res_Unicode)

## [Les types references en Java](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-types-references-en-java)

Les tableaux, les chaînes de caractères, les variables complexes sont des variables de types références. Les tableaux permettent de gérer des ensembles de variables (souvent de même type). Les chaînes de caractères permettent de gérer des ensembles de caractères. Les variables complexes permettent elles aussi de gérer un ensemble de variables. Le type des variables complexes est souvent une classe. Par exemple, une classe Personne permet de caractériser une personne en regroupant différentes informations dans autant de variables que nécessaire : le nom (de type String), le prénom (de type String), l’âge (de type int).

### Les tableaux

La manipulation de tableau est découpée en trois étapes:

- Declaration
- Creation (instanciation, allocation de memoire)
- Stockage des valeurs, manipulation des valeurs du tableau

#### [Declaration](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#declaration)

int[] tableauEntier;

#### Creation

```java
tableauEntier = new int[10];
// ou encore
tableauEntier = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
```

[![Alt text](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/raw/main/image-3.png)](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/image-3.png)

Si on tente d'accéder a un element du tableau qui n'existe pas on obtient une erreur de type **ArrayIndexOutOfBoundsException**

### [Les chaines de caracteres](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-chaines-de-caracteres)

Les chaines de caractères sont des tableaux de caractères.

```java
String chaine = "Ceci est une chaine de caracteres";

String nomDuCapitaine = "Crochet";
```

[![Alt text](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/raw/main/image-4.png)](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/image-4.png)

Pour declarer une chaine de caractères on utilise la syntaxe suivante:

```java
String chaineVide;
```

On peut l'initialiser de deux manières:

```java
chaineVide = "";
//
chaineVide = new String();
```

Java met a disposition des methodes pour manipuler les chaines de caracteres:

```java
String chaine = "Ceci est une chaine de caracteres";
char c = chaine.charAt(0);
```

### [Les dates et les heures](https://github.com/bendahmanem/ISITECH-BTS-2224-Java/blob/main/260923.md#les-dates-et-les-heures)

Java met a disposition de nombreuses classes pour manipuler les dates et les heures. Les classes les plus utilisees sont:

- **LocalDate** pour manipuler une date
- **LocalDateTime** pour manipuler une date et une heure
- **LocalTime** pour manipuler une heure
- **OffsetDateTime** pour manipuler une date et une heure avec un decalage par rapport a l'heure UTC
- **Duration** represente une duree en heures, minutes, secondes et millisecondes



## Les boucles
### while / do-while
La différence entre while et do-while c'est que while va vérifier la condition au début alors que do-while attends que les déclarations ont été exécutés au moins une fois.


## [[Programmation orienté objet]]
