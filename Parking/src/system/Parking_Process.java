package system;

import db.List_DB;
import java.util.Scanner;

public class Parking_Process {
    private static final int ALREDY_CAR = 1;
    private static final int NO_CAR = 0;
    Scanner scanner;
    Graphics graphics;
    int floor;
    public Parking_Process(){
        scanner = new Scanner(System.in);
    }

    //차량 정보 리턴
    private String return_car_num(){
        System.out.print("차량 번호 입력 : \n >>>>");
        String car_number = scanner.nextLine();
        return car_number;
    }

    //차량 번호 중복 확인
    private int check_car_num(String car_num){
        for(int i=0; i <List_DB.getInstance().parking_area.length; i++){
            for(int j=0; j < List_DB.getInstance().parking_area.length; j++){
                if(List_DB.getInstance().parking_area[i][j].equals(car_num)){
                    System.out.println("이미 주차되어있는 차량번호 입니다.");
                    return ALREDY_CAR;
                }
            }
        }
        return NO_CAR;
    }
    //배열의 요소 개수 확인
    private int check_array(){
        int cnt = 0;
        for(int i=0; i < List_DB.getInstance().parking_area.length; i++){
            for(int j=0; j < List_DB.getInstance().parking_area.length; j++){
                if(!List_DB.getInstance().parking_area[i][j].equals("Empty")){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    //차량 삽입
    public void input_car() {

        String car_num = return_car_num();

        //차량번호 중복 검사
        int result = check_car_num(car_num);

        //1. 0,0 자리가 비었는지 검사 자리가 비었다면 주차
        //2. 첫번째 자리가 차있으면 그 다음 자리에 주차
        try {
            if(result == ALREDY_CAR){
                menu();
            }else if(result == NO_CAR){
                if (List_DB.getInstance().parking_area[0][0].equals("Empty")) {
                    List_DB.getInstance().parking_area[0][0] = car_num;
                    System.out.println("Parking Success");
                }else if(check_array() >= 16){
                    input_car_two(car_num);
                    System.out.println("Parking Success");
                }
                else {
                    for (int i = 0; i < List_DB.getInstance().parking_area.length; i++) {
                        for (int j = 0; j < List_DB.getInstance().parking_area.length; j++) {
                            if (List_DB.getInstance().parking_area[i][j].equals("Empty")) {
                                List_DB.getInstance().parking_area[i][j] = car_num;
                                //주차에 성공하면 반복문 탈출
                                System.out.println("Parking Success");
                                menu();
                            }
                        }
                    }
                }
            }else{
                System.out.println("Error");
                menu();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //두번째 주차장에 차량 삽입
    private void input_car_two(String car_num){
        for(int i=0; i < List_DB.getInstance().parking_area_two.length; i++){
            for(int j=0; j < List_DB.getInstance().parking_area_two.length; j++){
                if(List_DB.getInstance().parking_area_two[i][j].equals("Empty")){
                    List_DB.getInstance().parking_area_two[i][j] = car_num;

                    System.out.println("Success Parking");
                    menu();
                }
            }
        }
    }
    //차량 삭제 번호를 받아 삭제
    public void out_car(){
        String car_num = return_car_num();

        try{
            for(int i=0; i < List_DB.getInstance().parking_area.length; i++){
                for(int j=0; j < List_DB.getInstance().parking_area.length; j++){
                    if(List_DB.getInstance().parking_area[i][j].equals(car_num)){
                        List_DB.getInstance().parking_area[i][j] = "Empty";
                        menu();
                    }else{
                        System.out.println("잘못된 차량 번호를 입력했습니다.");
                        menu();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //주차된 차량 확인
    private void show_parking_car(int floor){

        if(floor == 1) {
            for (int i = 0; i < List_DB.getInstance().parking_area.length; i++) {
                for (int j = 0; j < List_DB.getInstance().parking_area.length; j++) {
                    if (!List_DB.getInstance().parking_area[i][j].equals("Empty")) {
                        System.out.println(List_DB.getInstance().parking_area[i][j]);
                    }
                }
            }
        }else if(floor == 2){
            for (int i = 0; i < List_DB.getInstance().parking_area_two.length; i++) {
                for (int j = 0; j < List_DB.getInstance().parking_area_two.length; j++) {
                    if (!List_DB.getInstance().parking_area_two[i][j].equals("Empty")) {
                        System.out.println(List_DB.getInstance().parking_area_two[i][j]);
                    }
                }
            }
        }
    }

    //menu
    public void menu(){
        while (true){
            System.out.print("1. 입차 || 2. 출차 || 3. 종료 || 4. 주차된 차량 확인 \n >>>>>");

            int state = Integer.parseInt(scanner.nextLine());

            switch (state){
                case 1 :
                    input_car();
                    break;
                case 2 :
                    out_car();
                    break;
                case 3 :
                    System.exit(0);
                    break;
                case 4 :
                    System.out.print("층 수 입력 \n >>>>");
                    floor = Integer.parseInt(scanner.nextLine());
                    graphics = new Graphics();
                    graphics.draw_line(floor);
                    show_parking_car(floor);
                    break;
                default :
                    System.out.println("잘못입력했습니다.");
                    break;
            }
        }
    }
}
