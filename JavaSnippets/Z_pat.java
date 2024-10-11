package palgm;

public class Z_pat {
    public static void main(String [] args) {
        String s = "zohocorporationteam";
        int grid;
        int i = 0;
        boolean flag = false;

        for (grid = 1; grid < s.length(); grid++) {
            int condition1 = s.length() - (grid * 2);
            int condition2 = grid - 2;

            if (condition1 == condition2) {
                flag = true;
                System.out.println("The String " + s + " forms Z pattern in " + grid + "*" + grid);
                System.out.println();

                for (int row = 0; row < grid; row++) {
                    for (int col = 0; col < grid; col++) {
                        if (row == 0 || row == grid - 1 || row + col == grid - 1) {
                            System.out.print(s.charAt(i) + " ");
                            i++;
                        } else {
                            System.out.print("  "); 
                        }
                    }
                    System.out.println();
                }
            }
            
        }

        if (!flag) {
            System.out.println("The String " + s + " cannot form a Z pattern in an n*n grid.");
        }
    }
}
