import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSV_reader
{
    Scanner sc;

    {
        try
        {
            sc = new Scanner(new File("total_purged.csv"));
            sc.useDelimiter(",");
            while (sc.hasNext())
            {
                System.out.print(sc.next());
            }
            sc.close();  //closes the scanner

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}