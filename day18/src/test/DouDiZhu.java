package test;
/**
 * 李云涛程序改错
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class DouDiZhu {
	public static void main(String[] args) {
		HashSet<Pai> set = new HashSet<Pai>();
		cunPai(set);
		Iterator<Pai> iterator = set.iterator();
		
		System.out.println(set.size());
		HashSet<String> hashSet = new HashSet<>();
		
		while (iterator.hasNext()) {
			Pai pai = (Pai) iterator.next();
			
			hashSet.add(pai.getPokerPoints() + pai.getPokerSuit());
			
//			System.out.println(pai);
		}
		
		System.out.println(hashSet.size());
		
		
		
	}

	public static void cunPai(HashSet<Pai> set) {
		while (set.size() < 52) {
//			int a = (int) Math.floor(Math.random() * 13 + 1);
			Random random = new Random();
			int a = random.nextInt(13)+1;
			
			switch (a) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				String string = a + "";
				set.add(new Pai(ppp(), string));
				break;
			case 11:
				set.add(new Pai(ppp(), "J"));
				break;
			case 12:
				set.add(new Pai(ppp(), "Q"));
				break;
			case 13:
				set.add(new Pai(ppp(), "K"));
				break;
			default:
				break;
			}
		}
		System.out.println(set.size());
		set.add(new Pai("RED", "JOKER"));
		set.add(new Pai("BLACK", "JOKER"));

	}

	public static String ppp() {
		int b = (int) Math.floor(Math.random() * 4 + 1);
		if (b == 1) {
			return "黑桃";
		} else if (b == 2) {
			return "红桃";
		} else if (b == 3) {
			return "方块";
		} else {
			return "梅花";
		}
	}
}

class Pai {
	String pokerSuit;
	String pokerPoints;
	

	public String getPokerSuit() {
		return pokerSuit;
	}

	public void setPokerSuit(String pokerSuit) {
		this.pokerSuit = pokerSuit;
	}

	public String getPokerPoints() {
		return pokerPoints;
	}

	public void setPokerPoints(String pokerPoints) {
		this.pokerPoints = pokerPoints;
	}

	

	/**
	 * @param pokerSuit
	 * @param pokerPoints
	 */
	public Pai(String pokerSuit, String pokerPoints) {
		super();
		this.pokerSuit = pokerSuit;
		this.pokerPoints = pokerPoints;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pokerSuit + " " + pokerPoints;
	}

	public int hashCode() {
//		return (pokerPoints+ pokerSuit).hashCode();
		return 0;
	}

	@Override
	public boolean equals(Object pai) {
		if (!(pai instanceof Pai)) {
			throw new ClassCastException();
		}
		Pai pai2 = (Pai) pai;
		String suit = pai2.pokerSuit;
		String points = pai2.pokerPoints;

		return pokerPoints.equals(points) && pokerSuit.equals(suit);
	}

}
