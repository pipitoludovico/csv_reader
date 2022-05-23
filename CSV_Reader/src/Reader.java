import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader
{
    BufferedReader br;

    {
        try
        {
            br = new BufferedReader(new FileReader("output.txt"));
            String s;
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}