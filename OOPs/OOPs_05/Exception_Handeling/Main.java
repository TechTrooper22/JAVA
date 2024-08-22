package OOPs.OOPs_05.Exception_Handeling;

public class Main {
    public static void main(String[] args) throws Exception {
        int a=5, b=0, c;
        try {
            c = a/b;
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        throw new Exception("Please do not divide by zero");

//        finally {
//            System.out.println("This will always execute");
//        }


//     SYNTAX :
/*
          void function(parameters) throws Exception {
              try {}
              catch {}
              throw new Exception("");
          }
*/


    }
}
