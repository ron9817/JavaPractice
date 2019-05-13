
public class Factoryy{
	OS getInstance(int i){
		if(i==1){
			return new Android();
		}
		else
			return new IOS();
	}
}