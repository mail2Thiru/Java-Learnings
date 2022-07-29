package com.lao.javaLearning;

public class Draw {
	String draw;
//Constructor OverLoadding
	Draw(){
		System.out.println("Draw Object Created");
	}
	Draw(String toDraw){
		draw=toDraw;
		System.out.println("Drawing"+toDraw);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw = new Draw();
		Draw draw1 = new Draw("circle");

	}

}
