package Ex3dot3dot12;

public class Main {

    public static void main(String[] args) {
        Human firstHuman = new Human();
        Human secondHuman = new Human((byte) 99,"Vitek", "Orlov", "Football");
        Human thirdHuman = new Human((byte) 1,"Olegek", "Orlov");
    }

    public static class Human {
        private byte age;
        private String name, secondName, favoriteSport;
        public Human () {
            age = 18;
            name = "User";
            secondName = "SecondNameUser";
            favoriteSport = "&&&";
        }
        public Human (byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
        public Human (byte age, String name, String secondName, String favoriteSport) {
            this(age, name, secondName);
            this.favoriteSport = favoriteSport;
        }
    }
}
