import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava8Numbers {

	public static void main(String[] args) {

	Stream<Integer> number = Stream.of(1, 2, 2, 3, 3, 42, 45,12);

	List<Integer> changedList = number.filter(n -> n % 2 == 0)
			 .filter(n->n%2==1)
			 .filter(n -> n>5)
			 .filter(n -> n % 3== 0)
			.skip(2).limit(3)
			.distinct()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());

	changedList.forEach(c -> System.out.println(c));

	System.out.println("Max: " + changedList.stream().max(Integer::max).get());
	System.out.println("Min: " + changedList.stream().min(Integer::min).get()+"\n");
	
    System.out.println("Sum: "+changedList.stream().mapToInt(i->i).sum());
    System.out.println("Avg: "+changedList.stream().mapToInt(i->i).average()+"\n");

    
    new Random().ints(6, 1, 49).sorted().forEach(System.out::println);
	
	
}
}

/*
* Miniprogramik, pokazujący kilka ciekawych funkcji Javy 8, czyli jak w prosty
* sposób wykonać podstawowe operacje na liczbach: korzystając ze strumeni np: 
* 1. Opuścić 2 pierwsze elementy i nie brać ich pod uwagę 
* 2. Ograniczyć wydrukowanie tylko do 3 pierwszych wyników 
* 3. Wybrać tylko parzyste lub nieparzyste 
* 4. Wybrać większe niż>5 etc. 
* 5. Podzielne przez 3,4,5 etc. 
* 6. Usunąć duplikaty 
* 7. Posortować w odwrotnej kolejności 
* 8. Wyszukanie min i max
* 9. Sumowanie przesortowanych liczb
* 10. Średnia z przesortowanych liczb
* 11. Losowanie liczb z ograniczajac ilosc wylosowanych liczb i zakres
* 
* 
*/

