public class Patterns {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        int m=4, n=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==m || j==n) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        int p = 5;
        for(int i=1; i<=p; i++){
            for(int j=1; j<=(p-i); j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();


        int number = 1;;
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(number++ +"  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                int sum = i+j;
                if((sum % 2) == 0){
                    System.out.print("1  ");
                }
                else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
        System.out.println();


        int a = 4;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            int spaces = 2*(a-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            int spaces = 2*(a-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=1; i<=5; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();


        int z = 5;
        for(int i=1; i<=z; i++){
            for(int j=1; j<=z-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=1; i<=z; i++) {
            for (int j=1; j<=z-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();


        for(int i=1; i <= 4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int i=4; i >= 1; i--){
            for(int j=1; j<=4-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
