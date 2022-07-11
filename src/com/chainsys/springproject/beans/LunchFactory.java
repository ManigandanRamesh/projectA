package com.chainsys.springproject.beans;

public class LunchFactory {
	public Lunch createNonvegSouthIndianLunch() {
		Starters s1= new Chicken();
		s1.name="HoneyChicken";
		MainCourse m=new SouthIndian();
		m.name="Rice";
		Desert d = new Cakes();
		d.name="ChocoBrownie";
		Lunch l= new Lunch(s1,m,d);
		return l;
	}
	public Lunch createVegSouthIndianLunch() {
		Starters s1= new Vegroll();
		s1.name="Cabbageroll";
		MainCourse m=new SouthIndian();
		m.name="Rice";
		Desert d = new IceCream();
		d.name="Butterscotch";
		Lunch l= new Lunch(s1,m,d);
		return l;
	}
	public Lunch createNorthIndianLunch() {
		Starters s1= new Soup();
		s1.name="Sweetcorn";
		MainCourse m=new NorthIndian();
		m.name="Chappathi";
		Desert d = new Sweets();
		d.name="Rasagulla";
		Lunch l= new Lunch(s1,m,d);
		return l;
	}
	public Lunch createChineeseIndianLunch() {
		Starters s1= new Vegroll();
		s1.name="Springroll";
		MainCourse m=new Chinese();
		m.name="Noodles";
		Desert d = new IceCream();
		d.name="Snake";
		Lunch l= new Lunch(s1,m,d);
		return l;
	}

}
