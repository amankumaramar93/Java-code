public class RevStr
{
    public static void main(String args[])
    {
        String originalString="Hellow";
        String revString="";
        for(int i=0;i<originalString.length();i++)
        {
            revString=originalString.charAt(i) + revString;
        }
        System.out.println("Reversed String: "+revString);
    }
}