package firstgradle;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.*;

public class Source{
	public static void main(String[] args){
		Battle b = new Battle();
		Lombre p1 = new Lombre("ДЖЕПЕГ", 100);
		Spearow p2 = new Spearow("ПЭДЭЭФ", 100);
		Lotad p3 = new Lotad("ЭСАШ", 100);
		Fearow p4 = new Fearow("ЦЭЭСВЭ", 100);
		Ludicolo p5  = new Ludicolo("ГРАДЛЕ", 100);
		Lugia p6 = new Lugia("Прост", 100);
		System.out.println(p1.getHP());
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addAlly(p5);
		b.addFoe(p6);
		b.go();
		System.out.println(p1.getCondition());
	}
}