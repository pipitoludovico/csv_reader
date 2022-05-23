public class Main
    {
        public static void main(String[] args) throws Exception
            {


                Writer cane = new Writer();
                cane.bw.write("Line 1\n");
                cane.bw.write("Line 2\n");
                cane.bw.write("Line 3\n");
                cane.bw.write("Line 4\n");
                cane.bw.write("END");
                cane.bw.close();

                new Reader();

                new CSV_reader();
            }
    }