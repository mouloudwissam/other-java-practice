package practice;

public class JavaPractice {
	public static void main(String[] args) {
		int a =1;
		int b = 12;
		System.out.println("The Integer numbers are :"+""+ a);
		System.out.println(" the sum of a and b  is :"+ (a+b));
		System.out.println("-----------------------------");
		String word ="hassanjamal";
		System.out.println(word.length());
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(8));
		System.out.println("-------");
		for(int i=0;i<11;i++) {
			System.out.println(word.charAt(i));
		} 
		if( word.startsWith("h")) {
			System.out.println(" THIS IS TRUE");

		} else {
			System.out.println("This Not TRUE");
		}
		System.out.println("----------");
		if(word.endsWith("j")) {
			System.out.println("THE END SIFIX IS TRUE");	
		}else {
			System.out.println("THE END SIFFEX IS NOT TURE AND IT IS L ");
		}
		System.out.println("-------------------------------------------");
		String Sentence ="LEARNING JAVA IS ONE MY CHAllanges This DAYS";
		System.out.println(Sentence);
		System.out.println(Sentence.length());
		System.out.println("Captila Letters of Sentence:"+Sentence.toLowerCase());
		System.out.println("-------");

		System.out.println("lower Letters of Sentence:"+Sentence.toUpperCase());

		System.out.println("the size of senetence:"+ Sentence.length());
		System.out.println("-_-_-__-__---___--");
		if(word.equals(Sentence)) {
			System.out.println("Both are the same");
		} else {
			System.out.println("Both are not The same");
		}
		System.out.println(Sentence.length());
		System.out.println(word.length());
		System.out.println(Sentence.trim().length());



	}


}
