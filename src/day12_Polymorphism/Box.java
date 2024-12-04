package day12_Polymorphism;

public class Box {

	double width,height,depth;
	
	Box(){
		width=height=depth=0;
	}
	
	Box(double x,double y, double z){
		width=x;
		height=y;
		depth=z;
	}
	Box(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return width*height*depth;
	}
}
