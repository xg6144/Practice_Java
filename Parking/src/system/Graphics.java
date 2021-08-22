package system;

import db.List_DB;

public class Graphics {
    //List_DB list_db;
    String x1, x2, x3, x4, x5 ,x6, x7, x8;
    String y1, y2, y3, y4, y5, y6, y7, y8;

    private void draw_number(int floor){

        if(floor == 1) {
            if (List_DB.getInstance().parking_area[0][0].equals("Empty")) {
                x1 = "1";
                System.out.println("1");
            } else {
                System.out.println("X");
                x1 = "X";
            }

            if (List_DB.getInstance().parking_area[0][1].equals("Empty")) {
                x2 = "2";
            } else {
                x2 = "X";
            }

            if (List_DB.getInstance().parking_area[0][2].equals("Empty")) {
                x3 = "3";
            } else {
                x3 = "X";
            }

            if (List_DB.getInstance().parking_area[0][3].equals("Empty")) {
                x4 = "4";
            } else {
                x4 = "X";
            }

            if (List_DB.getInstance().parking_area[1][0].equals("Empty")) {
                x5 = "5";
            } else {
                x5 = "X";
            }

            if (List_DB.getInstance().parking_area[1][1].equals("Empty")) {
                x6 = "6";
            } else {
                x6 = "X";
            }

            if (List_DB.getInstance().parking_area[1][2].equals("Empty")) {
                x7 = "7";
            } else {
                x7 = "X";
            }

            if (List_DB.getInstance().parking_area[1][3].equals("Empty")) {
                x8 = "8";
            } else {
                x8 = "X";
            }

            if (List_DB.getInstance().parking_area[2][0].equals("Empty")) {
                y1 = "9";
            } else {
                y1 = "X";
            }

            if (List_DB.getInstance().parking_area[2][1].equals("Empty")) {
                y2 = "10";
            } else {
                y2 = "X";
            }

            if (List_DB.getInstance().parking_area[2][2].equals("Empty")) {
                y3 = "11";
            } else {
                y3 = "X";
            }

            if (List_DB.getInstance().parking_area[2][3].equals("Empty")) {
                y4 = "12";
            } else {
                y4 = "X";
            }

            if (List_DB.getInstance().parking_area[3][0].equals("Empty")) {
                y5 = "13";
            } else {
                y5 = "X";
            }

            if (List_DB.getInstance().parking_area[3][1].equals("Empty")) {
                y6 = "14";
            } else {
                y6 = "X";
            }

            if (List_DB.getInstance().parking_area[3][2].equals("Empty")) {
                y7 = "15";
            } else {
                y7 = "X";
            }

            if (List_DB.getInstance().parking_area[3][3].equals("Empty")) {
                y8 = "16";
            } else {
                y8 = "X";
            }
        }

        else if(floor == 2){
            if (List_DB.getInstance().parking_area_two[0][0].equals("Empty")) {
                x1 = "1";
                System.out.println("1");
            } else {
                System.out.println("X");
                x1 = "X";
            }

            if (List_DB.getInstance().parking_area_two[0][1].equals("Empty")) {
                x2 = "2";
            } else {
                x2 = "X";
            }

            if (List_DB.getInstance().parking_area_two[0][2].equals("Empty")) {
                x3 = "3";
            } else {
                x3 = "X";
            }

            if (List_DB.getInstance().parking_area_two[0][3].equals("Empty")) {
                x4 = "4";
            } else {
                x4 = "X";
            }

            if (List_DB.getInstance().parking_area_two[1][0].equals("Empty")) {
                x5 = "5";
            } else {
                x5 = "X";
            }

            if (List_DB.getInstance().parking_area_two[1][1].equals("Empty")) {
                x6 = "6";
            } else {
                x6 = "X";
            }

            if (List_DB.getInstance().parking_area_two[1][2].equals("Empty")) {
                x7 = "7";
            } else {
                x7 = "X";
            }

            if (List_DB.getInstance().parking_area_two[1][3].equals("Empty")) {
                x8 = "8";
            } else {
                x8 = "X";
            }

            if (List_DB.getInstance().parking_area_two[2][0].equals("Empty")) {
                y1 = "9";
            } else {
                y1 = "X";
            }

            if (List_DB.getInstance().parking_area_two[2][1].equals("Empty")) {
                y2 = "10";
            } else {
                y2 = "X";
            }

            if (List_DB.getInstance().parking_area_two[2][2].equals("Empty")) {
                y3 = "11";
            } else {
                y3 = "X";
            }

            if (List_DB.getInstance().parking_area_two[2][3].equals("Empty")) {
                y4 = "12";
            } else {
                y4 = "X";
            }

            if (List_DB.getInstance().parking_area_two[3][0].equals("Empty")) {
                y5 = "13";
            } else {
                y5 = "X";
            }

            if (List_DB.getInstance().parking_area_two[3][1].equals("Empty")) {
                y6 = "14";
            } else {
                y6 = "X";
            }

            if (List_DB.getInstance().parking_area_two[3][2].equals("Empty")) {
                y7 = "15";
            } else {
                y7 = "X";
            }

            if (List_DB.getInstance().parking_area_two[3][3].equals("Empty")) {
                y8 = "16";
            } else {
                y8 = "X";
            }
        }
    }
    public void draw_line(int floor){
        draw_number(floor);
        System.out.println("---------");
        System.out.printf("|%s|%s|%s|%s|", x1, x2, x3, x4);
        System.out.println(" ");
        System.out.println("---------");
        System.out.printf("|%s|%s|%s|%s|", x5, x6, x7, x8);
        System.out.println(" ");
        System.out.println("-------------");
        System.out.printf("|%s|%s|%s|%s|", y1, y2, y3, y4);
        System.out.println(" ");
        System.out.println("-------------");
        System.out.printf("|%s|%s|%s|%s|", y5, y6, y7, y8);
        System.out.println(" ");
        System.out.println("-------------");
    }
}
