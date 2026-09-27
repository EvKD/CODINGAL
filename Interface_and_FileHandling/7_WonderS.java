// Parent class
class SevenWonders {
    void displayInfo() {
        System.out.println("These are the Seven Wonders of the World!");
    }
}

// Subclasses for each wonder
class TajMahal extends SevenWonders {
    void displayInfo() {
        System.out.println("Taj Mahal - Located in India, made of white marble.");
    }
}

class GreatWall extends SevenWonders {
    void displayInfo() {
        System.out.println("Great Wall of China - A long wall built for protection.");
    }
}

class Petra extends SevenWonders {
    void displayInfo() {
        System.out.println("Petra - Ancient city carved into red rock in Jordan.");
    }
}

class Colosseum extends SevenWonders {
    void displayInfo() {
        System.out.println("Colosseum - Roman amphitheatre in Italy used for gladiator fights.");
    }
}

class MachuPicchu extends SevenWonders {
    void displayInfo() {
        System.out.println("Machu Picchu - Ancient Incan city high in the Andes Mountains.");
    }
}

class ChristRedeemer extends SevenWonders {
    void displayInfo() {
        System.out.println("Christ the Redeemer - Giant statue of Jesus in Rio de Janeiro, Brazil.");
    }
}

class ChichenItza extends SevenWonders {
    void displayInfo() {
        System.out.println("Chichen Itza - Mayan pyramid in Mexico.");
    }
}

// Main class
class WondersMain {
    public static void main(String[] args) {
        // Array of SevenWonders objects
        SevenWonders[] wonders = {
                new TajMahal(),
                new GreatWall(),
                new Petra(),
                new Colosseum(),
                new MachuPicchu(),
                new ChristRedeemer(),
                new ChichenItza()
        };

        // Using polymorphism to call each displayInfo()
        for (SevenWonders w : wonders) {
            w.displayInfo();
        }
    }
}
