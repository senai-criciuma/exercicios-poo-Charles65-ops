package Animal;

public class Gato extends Animal {

    public void arranharMoveis(){
        System.out.println("arranhando Moveis.");
    }

    @Override
    public void EmitirSom(){
        System.out.println("Miaw Miaw Miaw");
    }
}
