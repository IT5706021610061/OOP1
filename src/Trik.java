import java.io.*;
public class Trik {
	public static void main (String[]args) throws IOException{
		int i=0,tmp;
		char t;
		int abc[]={1,0,0};
		
		InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader buffer = new BufferedReader(in);
	    System.out.print("Enter ABC :");
	    String x = buffer.readLine().toUpperCase();
		
        while (i != x.length())
        {
            t = x.charAt(i);
            if (t == 'A') {
                tmp = abc[0];
                abc[0] = abc[1];
                abc[1] = tmp;
            }
            else if (t == 'B')
            {
                tmp = abc[1];
                abc[1] = abc[2];
                abc[2] = tmp;
            }
            else if (t == 'C')
            {
                tmp = abc[0];
                abc[0] = abc[2];
                abc[2] = tmp;
            }
            i++;
        }
        for (i =0;i<3 ;i++)
        {
            if(abc[i] == 1)
                System.out.println(i+1);
        }
	
	
	}
}
