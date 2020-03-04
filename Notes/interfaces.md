## Abstract Classes 
Only Use Abstract at the start of the code
    Public class Abstract Animal
Can't create a new animal, but can declare as Animal a = newAnimal();
Abstract class if you don't want to declare the class

Parent class always have Object included with it,
Animal a = newAnime();
    a.toString();                   ~ toString();
    a.equals();                     ~ equals(Object o)

                                    ~ compareTo(Object o)
                                      Always return with either -1 , 0 , 1
                                      1 means they're in order 
                                      -1 mean they're out of order
                                      0 means they're even it doesn't matter 

## Interface 
~ System for communication
    EX: Xbox: What each button on the Xbox Controller does and can do
~ Public Function
~ Creating a set of functions that can be shared on dispurate (Not related) classes  
Tight Coupling
~ D.R.Y(Don't Repeat Yourself) 
Create two things
~~~~~~~~~~~~~~~~~
*Constants
*function Signatures

*NEVER allowed to put implementation 

EX: 
    Greetable.java

    public interface Greetable{
        public static final int GRAVITY_EARTH = -90
        public void greet();
    }

    Dog.java

    public class Dog extends Animal implements Greetable, Agreeable, Likeable{
        public void greet(){

        }
        
    }

    Greetable gr = new Animal ();
    Greetable grd = new Dog)_;
    greetable[] greets = new greetable[2]l
    greets[0] = gr;
    greets[1] = grd;

    for(Greetable g; greets) { 
        g.greet();
    }

~ Java built in image panel 
    - JFrame
    - Jpanel -> JImagepanel
    - JButton
    - Mouse listener interface
        * MousePressed()
        * MouseReleased()
        * MouseClicked()
        * and Many More
    EX: class MyButton extends Button implment MouseListener 
    