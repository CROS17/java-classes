/*Abstraccion
//clase abstracta
abstract class Animal{
    //metodo abstracto
    abstract void makeSound();
}

//clases concretas
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Ladra");
    }
}

//clase concreta
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Maullar");
    }
}
*/


/*Encapsulacion
//clase y attributos
class Person{
    private String name;
    private int age;

    public String getName(){return name;}
    public void setName(String name){ this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
}*/


/*Herencia
//clase base -> atributos
class Vehicle{
    String marca;
    String modelo;

    Vehicle(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    void detailsVehicle(){
        System.out.println("Es de la marca: " + marca + ", y del modelo: " + modelo);
    }
}
//clase derivada -> herada de la clase base
class Coche extends Vehicle{
    int numPuertas;

    Coche(String marca, String modelo, int numPuertas){
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    void detailsVehicle(){
        super.detailsVehicle();
        System.out.println(" Numero de puertas: " + numPuertas);
    }
}*/


/*polimorfismo
//interfaz, metodo
interface Operacion{
    int realizarOperacion(int num1, int num2);
}

//clases implementan la interfaz
class Suma implements Operacion{
    @Override
    public int realizarOperacion(int num1, int num2) {
        return num1 + num2;
    }
}

class Multiplicacion implements Operacion{
    @Override
    public int realizarOperacion(int num1, int num2) {
        return num1 * num2;
    }
}*/

//ejecucion
public class Main {
    public static void main(String[] args) {
        /*Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); //Output: Ladra
        myCat.makeSound(); //Output: Maullar*/

        /*encapsulacion
        Person per = new Person();
        per.setName("Juan");
        per.setAge(23);

        System.out.println("Mi nombre es " + per.getName() + " con edad "+ per.getAge());*/

        /* herencia
        Coche coche = new Coche("Toyota", "Corolla", 4);
        coche.detailsVehicle(); //Output*/

        /*polimorfismo
        Operacion suma = new Suma();
        Operacion multiplicacion = new Multiplicacion();

        System.out.println("Suma: " + suma.realizarOperacion(5,8)); //Output: 13
        System.out.println("Multiplicando dio: " + multiplicacion.realizarOperacion(5, 10)); //Output 50*/
    }
}
