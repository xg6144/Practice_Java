package db;

public class List_DB {
    private static List_DB instance = new List_DB();
    private List_DB(){
        System.out.println("Success");
        reset_list();
    }
    public static List_DB getInstance() {
        return instance;
    }
    public String[][] parking_area = new String[4][4];
    public String[][] parking_area_two = new String[4][4];
    private void reset_list(){
        for(int i=0; i < parking_area.length; i++){
            for(int j=0; j < parking_area.length; j++){
                parking_area[i][j] = "Empty";
            }
        }

        for(int i=0; i < parking_area_two.length; i++){
            for(int j=0; j < parking_area_two.length; j++){
                parking_area_two[i][j] = "Empty";
            }
        }
    }
}
