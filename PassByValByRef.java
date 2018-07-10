package sampleProj;

public class PassByValByRef {
	public PassByValByRef() {
	}
	public void moveCircle(Circle circle, int deltaX, int deltaY) {
	    // code to move origin of circle to x+deltaX, y+deltaY
	    circle.setX(circle.getX() + deltaX);
	    circle.setY(circle.getY() + deltaY);
	        
	    // code to assign a new reference to circle
	    circle = new Circle(0, 0);
	    System.out.println("inside the method:\n x:"+circle.getX()+"\n y:"+circle.getY());
	}
	public void passMethod(int p) {
		p=100;
		System.out.println("Inside the method:"+p);
	}
	public static void main(String[] args) {
		PassByValByRef pvr=new PassByValByRef();
		Circle circle=new Circle();
		pvr.moveCircle(circle, 23, 23);
		System.out.println("After invoking the method: \n x:"+circle.getX()+"\n y:"+circle.getY());
		int mp=200;
		pvr.passMethod(mp);
		System.out.println("After invoking the method:"+mp);
	}

}
