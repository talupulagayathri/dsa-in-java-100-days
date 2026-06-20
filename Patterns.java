// public class Patterns {
//     public static void main(String[] args){
//         int n=4;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//square
// public class Patterns {
//     public static void main(String[] args){
//         int n=4;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("* ");
//             }
//         System.out.println();
//     }
// }
// }
//reverse Right angle triangle
public class Patterns {
    public static void main(String[] args){
        int n=4;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
