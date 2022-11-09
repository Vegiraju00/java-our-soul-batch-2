import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
public class PickRandomName
{

	public static void main(String[] args) throws Exception{
			//String[] names={"Marawan", "David", "Ashwin", "Daniel", "Jeevitha", "Murgeshwari", "Timothy", "Xinyi"};

			List<String> namesList=Files.lines(Paths.get("namelist.txt")).collect(Collectors.toList());
			

			//ArrayList<String> namesList1= new ArrayList(namesList);
			//ArrayList<String> namesList = new ArrayList(Arrays.asList(names));

			int number=(int) (Math.random() * namesList.size());
			String name=namesList.get(number);

			System.out.println(name);

				




	}


}