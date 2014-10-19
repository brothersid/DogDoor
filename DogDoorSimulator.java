public class DogDoorSimulator {

    public static void main(String[] args){
	DogDoor door = new DogDoor();
	BarkRecognizer recognizer = new BarkRecognizer(door);
	Remote remote = new Remote (door);
	// Begin Fake Hardware 
	System.out.println("Fido Starts Barking.");
	recognizer.recognize("Woof");
	System.out.println("\nFido has gone outside...");
	System.out.println("\nFido's all done...");

	try { 
	    Thread.currentThread().sleep(10000);
	} catch (InterruptedException e) { }
	System.out.println("... But he is stuck outside!");

	//Fake Hardware (again) 
 	System.out.println("Fido Starts Barking.");
	recognizer.recognize("Woof");
	System.out.println("\nFido's back inside...");
    }
}
    
