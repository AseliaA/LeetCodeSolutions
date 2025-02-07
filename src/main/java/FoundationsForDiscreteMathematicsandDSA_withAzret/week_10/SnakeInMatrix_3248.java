package FoundationsForDiscreteMathematicsandDSA_withAzret.week_10;

public class SnakeInMatrix_3248 {
    public static void main(String [] args) {
        System.out.println(snakeInMatrix_AzretVer2(3, new String []{"RIGHT", "RIGHT", "DOWN", "LEFT"}));
        System.out.println(snakeInMatrix_AzretVer1(3, new String []{"RIGHT", "RIGHT", "DOWN", "LEFT"}));
        System.out.println(snakeInMatrix(3, new String []{"RIGHT", "RIGHT", "DOWN", "LEFT"}));
    }

    //Azret ver2
    public static int snakeInMatrix_AzretVer2(int n, String [] commands) {
        int number = 0;
        for(String command : commands) {
            if(command.equals("UP")) {
                number -= n;
            } else if(command.equals("DOWN")) {
                number += n;
            } else if(command.equals("RIGHT")) {
                number++;
            } else if(command.equals("LEFT")) {
                number--;
            }
        }
        return number;
    }

    //Azret ver1
    public static int snakeInMatrix_AzretVer1(int n, String [] commands) {
        int row = 0;
        int col = 0;

        for(String command : commands) {
           if(command.equals("UP")) {
               row--;
           } else if(command.equals("DOWN")) {
               row++;
           } else if(command.equals("RIGHT")) {
               col++;
           } else if(command.equals("LEFT")) {
               col--;
           }
        }
        return row * n + col;
    }


    //my solution after watching lesson recoding and kinda looking at the solution
    public static int snakeInMatrix(int n, String [] commands) {
        int row = 0;
        int col = 0;

        for(String command : commands) {
            switch(command) {
                case "UP": row--; break;
                case "DOWN": row++; break;
                case "RIGHT": col++; break;
                case "LEFT": col--; break;
            }
        }
        return row * n + col;
    }
}
