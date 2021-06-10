import java.util.Scanner;

public class pertm4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int panjang,lebar,tinggi,luas,volume,a,b,c;
        int pilih;
        int sisi,s;
        double pi = 3.14;
        int paksa = (int) pi;
        int jari,j,t;
        char yn;

        do{

            System.out.println("Menghitung volume dan luas kubus,balok,dan tabung");
            System.out.println("=========================================================");

            System.out.println("Pilih 1 : Kubus");
            System.out.println("Pilih 2 : Tabung");
            System.out.println("Pilih 3 : Balok\n");

            System.out.print("Pilih no : ");
            pilih = masukan.nextInt();
            
            if (pilih == 1){

                System.out.println("Hitung kubus : \n");
                System.out.print("Input sisi : ");
                sisi = masukan.nextInt();
                s = sisi;
                System.out.println("Panjang : "+  s  + "\n");

                System.out.println("Rumus luas : 6*(s^2)");
                System.out.println("Rumus luas : 6*(" + s + "^2)");
                luas = 6*(s*s); 
                System.out.println("Luas : "+  luas  + " m^2" + "\n");

                System.out.println("Rumus volume : s*s*s");
                System.out.println("Rumus volume : " + s + "*" + s + "*" + s);
                volume = s*s*s; 
                System.out.println("Volume : "+  volume  + " m^3" + "\n");

            }
            else if(pilih == 2){

                System.out.println("Hitung balok : \n");
                System.out.print("Input panjang : ");
                panjang = masukan.nextInt();
                a = panjang;
                System.out.println("Panjang : "+  a  + "\n");

                System.out.print("Input lebar : ");
                lebar = masukan.nextInt();
                b = lebar;
                System.out.println("Lebar : "+  b  + "\n");

                System.out.print("Input tinggi : ");
                tinggi = masukan.nextInt();
                c = tinggi;
                System.out.println("Tinggi : "+  c  + "\n");
                
                System.out.println("Rumus luas : (2*a*b)+(2*a*c)+(2*b*c)");
                System.out.println("Rumus luas : (2*" + a + "*" + b + ")" + "+" + "(2*" + a + "*" + c + ")" + "+" + "(2*" + b + "*" + c + ")");
                luas = (2*a*b)+(2*a*c)+(2*b*c); 
                System.out.println("Luas : "+  luas  + " m^2" + "\n");

                System.out.println("Rumus volume : a*b*c");
                System.out.println("Rumus volume : " + a + "*" + b + "*" + c);
                volume = a*b*c; 
                System.out.println("Volume : "+  volume  + " m^3" + "\n");
            }
            else if(pilih == 3){

                System.out.println("Hitung tabung : \n");
                System.out.print("Input jari-jari : ");
                jari = masukan.nextInt();
                j = jari;
                System.out.println("Jari-jari : "+  j  + "\n");

                System.out.print("Input tinggi : ");
                tinggi = masukan.nextInt();
                t = tinggi;
                System.out.println("Tinggi : "+  t  + "\n");

                System.out.println("Rumus luas : pi*(r^2)");
                System.out.println("Rumus luas : " + paksa + "*(" + j + "^2)");
                luas = paksa*(j*j); 
                System.out.println("Luas : "+  luas  + " m^2" + "\n");

                System.out.println("Rumus volume : pi*(r^2)*t");
                System.out.println("Rumus volume : " + paksa + "*(" + j + "^2)" + "*" + t );
                volume = paksa*(j*j)*t; 
                System.out.println("Volume : "+  volume  + " m^3" + "\n");

            }

            System.out.print("Ulang menghitung ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();
    }
}