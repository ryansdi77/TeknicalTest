import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            File myObj = new File("D:\\WORKSPACE\\LATIHAN\\Test\\untitled\\input\\DataAlert.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                HashMap<String, String> hash_map = new HashMap<>();
                String data = myReader.nextLine();
                String[] arrOfStr = data.split(";");
                int i=0;
                for (String a : arrOfStr){
                    i++;
                    switch (i){
                        case 1:
                            hash_map.put("1",a);
                            break;
                        case 2:
                            hash_map.put("2",a);
                            break;
                        case 3:
                            hash_map.put("3",a);
                            break;
                        case 4:
                            hash_map.put("4",a);
                            break;
                        case 5:
                            hash_map.put("5",a);
                            break;
                    }
                };
                System.out.println(hash_map);

                StringBuilder salam = new StringBuilder();
                salam.append("Selamat siang rekan ");
                salam.append(hash_map.get("4"));
                System.out.println(salam);
                System.out.println("Mohon bantuan untuk Sign on pada envi berikut");

                StringBuilder str = new StringBuilder();
                str.append("Envi ");
                str.append(hash_map.get("2"));
                str.append(" port ");
                str.append(hash_map.get("3"));
                str.append(" terpantau ");
                str.append(hash_map.get("5"));
                System.out.println(str);
                System.out.println("Terima Kasih");
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}