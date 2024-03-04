//Using your files. Don't fix what ain't broke.
public class Animal {

    // Animal Class attributes
    private String animalName;
    private String species;
    private int age;

    // Create a static attribute that belongs to the Animal class.
    public static int numOfAnimals = 0;

    // Animal Class constructors.
    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new Animal object was created.\n");

        // Create initial values for the class attributes.
        animalName = name;
        species = aSpecies;
        age = anAge;
        numOfAnimals++;
    }

    public Animal() {
        System.out.println("\n A new Animal object was created.\n");
        numOfAnimals++;
    }

    // Getters and Setters for each attribute (optional, but recommended for good practice)
    public String getName() {
        return animalName;
    }

    public void setName(String name) {
        this.animalName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}

 class Hyena extends Animal{

    public static void sound() {
        System.out.println("Hyena laughing"); // just an animal noise
    }

}

class Lion extends Animal{

    public static void sound() {
        System.out.println("Lion roaring");// just an animal noise
    }

}

class Tiger extends Animal{

    public static void sound() {
        System.out.println("Tiger growling");// just an animal noise
    }

}

class Bear extends Animal{

    public static void sound() {
        System.out.println("Bear growling");
    }// just an animal noise

}
