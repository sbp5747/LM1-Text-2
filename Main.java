public class Main {
    public static void main(String[] args) {
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog();
        NewSkullHead yourNewNameYourObject = new NewSkullHead();


        System.out.println("Green Ogre: " + greenOgre.name + " HP: " + greenOgre.hp + " Damage: " + greenOgre.damage);
        System.out.println("Red Ogre: " + redOgre.name + " HP: " + redOgre.hp + " Damage: " + redOgre.damage);
        System.out.println("Slow Zombie: " + slowZombie.name + " HP: " + slowZombie.hp + " Damage: " + slowZombie.damage);
        System.out.println("Fast Zombie: " + fastZombie.name + " HP: " + fastZombie.hp + " Damage: " + fastZombie.damage);
        System.out.println("Spot Dog: " + spotDog.name + " HP: " + spotDog.hp + " Damage: " + spotDog.damage);
        System.out.println("New Skull Head: " + yourNewNameYourObject.name + " HP: " + yourNewNameYourObject.hp + " Damage: " + yourNewNameYourObject.damage);

    }
}
