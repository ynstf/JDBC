import java.sql.Connection;
class Main{
    public static void main(String args[]){
        System.out.println("hiiii");
        Connection conn = DBCon.getConnection();
        if (conn==null){
            System.out.println("faild !");
        }else{
            System.out.println("connected !");
        }
    }
}