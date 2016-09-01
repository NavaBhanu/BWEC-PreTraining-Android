import java.io.*;

class longsubstr
{
	public static void main(String args[]) throws IOException
		{
			System.out.println("Enter a String :");
            		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            		String s=br.readLine();

			int strLen = s.length();

			int flag=0;
    			for (int i = 1; i < strLen; i++) {
        			if (s.substring(0, i).equals(s.substring(strLen-i, strLen) )) {
            				System.out.println("Substring :" +s.substring(0, i));
					flag = 1;
					
				}
			}
			if(flag==0)
				System.out.println("There is no Pal_Substring!!!");
		}

}