// main() berada di satu class khusus yg akan digunakan
// class-class yg lain
public class App {
    // entry point method (pintu masuk)
    public static void main (String[] args){
        //create object
        Car ferrari = new Car();
        ferrari.numOfDoors = 2;
        ferrari.color = "red"; // mesti "" x boleh ''
        // '' hanya  utk char sahaja
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
    }
    
}
