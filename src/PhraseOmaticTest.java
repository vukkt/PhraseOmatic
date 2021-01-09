
public class PhraseOmaticTest {

	public static void main(String[] args) {
		String [] wordlistone = {"24/7" , "professional", "aquatic", "amphibious", "judgemental", "specific"};
		String [] worldlisttwo = {"husting", "witty", "chaotic", "mysterious", "decieving", "ingenious", "silent"};
		String [] worldlistthree = {"professor", "villain", "hero", "superman", "scientist"};
		
		int one = wordlistone.length;
		int two = worldlisttwo.length;
		int three = worldlistthree.length;
		
		int rand1 = (int) (Math.random() * one);
		int rand2 = (int) (Math.random() * two);
		int rand3 = (int) (Math.random() * three);
		
		String phrase = (wordlistone[rand1] + " " + worldlisttwo[rand2] + " " + worldlistthree[rand3]);
		
		System.out.println("What we need is a " + phrase);
		
	}

}
