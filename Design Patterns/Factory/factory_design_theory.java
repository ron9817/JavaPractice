/*
To avoid common problems in software development as a solution we have design pattern.
Design pattern are just best practices
Principle of object oriented design pattern:-
1. Prefer composition over inheritance
2. Code for interface not for implementation
We have 3 types:
1. Creational--creating a object
a. Singleton
b. Factory
c. Abstract Factory
d. Builder
e. Prototype
2. Structural--compose object(a object needs to use other object)
a. Adapter
b. Composite 
c. Proxy
d. Fly weight
e. Facade
f. Bridge
g. Decorator

3. Behavioural--communication between two objects
a. Template method
b. Mediator
c. Chain of responsiblity
d. observer
e. stratergy
f. command
g. state
h. visitor
i. iterator
j. interpreteter
k. memento

The design pattern to be used depends on requirement.

total 23+++ design pattern
*/



//FACTORY DESIGN PATTERN
/*
Phones OS analogy
low coupling high cohesion
factory creates and gives u object as per your requirement
implemetnation-
You have a interface and have multiple implementaion of it

*/

class FactoryMain{
	public static void main(String args[]){}
}

public interface OS{
	void spec();
}

public class Android implements OS{
	void spec(){
		System.out.println("ANDROID");
	}
}

public class IOS implements OS{
	void spec(){
		System.out.println("IOS");
	}
}
public class Windows implements OS{
	void spec(){
		System.out.println("windows");
	}
}
//client knows which object you are creating and future changes needs to be recompiled
//wrong method

public class OperatingSystemFactory{
	public OS getInstance(String str){
		if(str.equals("OPEN"))
			return new Android();
		else if(str.equals("CLOSED"))
			return new IOS();
		else
			return new Windows();
	}
}

class FactoryMain{
	public static void main(String args[]){
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("CLOSED");
		obj.spec();
	}
}

// now the view(ie client oblect) need not be modified