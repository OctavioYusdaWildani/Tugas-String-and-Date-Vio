import java.util.Scanner;

public class Login {

    public String Code[] = {"GVM12","CVB34","FVR56"};
    public String capca;
    public int hitung =-1;
    public Login(){
        String id;
        String password;
        System.out.println("SELAMAT DATANG DI SUMMER MART");
        System.out.println("====================================");
        System.out.println("Log in  ");
            do{
                Scanner vio = new Scanner(System.in);
                System.out.print("Username         : ");
                id = vio.next();
                System.out.print("Password         : ");
                password = vio.next();
                if(id.equalsIgnoreCase("Octavio") && password.equals("vio1212")){
                    int random = 0;
                    String n;
                    do{
                        if(random>0){
                            System.out.println("Captcha Salah !!!");
                        }
                        random++;
                        hitung ++;
                        hitung %=3;
                        System.out.println("Kode Captcha     : " + Code[hitung]);
                        System.out.print("Entry Captcha    : ");
                        Scanner kode = new Scanner(System.in);
                        capca = kode.next();

                    }while(!capca.equals(Code[hitung]));


                    System.out.println("Akun Ditemukan");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!id.equals("Octavio") || !password.equals("admin123"));

        
    }
}
