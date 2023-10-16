class Animal {
    public String som() {
        return "Som produzido pelo animal";
    }
}

class Sapo extends Animal {
    @Override
    public String som() {
        return "coaxar";
    }
}

class Cachorro extends Animal {
    @Override
    public String som() {
        return "latir";
    }
}

class Boi extends Animal {
    @Override
    public String som() {
        return "berrar";
    }
}

public class TestaAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Cachorro();
        animais[2] = new Boi();

        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }
}