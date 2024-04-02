import java.util.Scanner;

public class beak_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char arr[] = input.toCharArray();
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;

        for(int A=0 ; A< arr.length ; A++){
            if(arr[A] == 'a'){
                a++;
            }else if(arr[A] == 'b'){
                b++;
            }else if(arr[A] == 'c'){
                c++;
            }else if(arr[A] == 'd'){
                d++;
            }else if(arr[A] == 'e'){
                e++;
            }else if(arr[A] == 'f'){
                f++;
            }else if(arr[A] == 'g'){
                g++;
            }else if(arr[A] == 'h'){
                h++;
            }else if(arr[A] == 'i'){
                i++;
            }else if(arr[A] == 'j'){
                j++;
            }else if(arr[A] == 'k'){
                k++;
            }else if(arr[A] == 'l'){
                l++;
            }else if(arr[A] == 'm'){
                m++;
            }else if(arr[A] == 'n'){
                n++;
            }else if(arr[A] == 'o'){
                o++;
            }else if(arr[A] == 'p'){
                p++;
            }else if(arr[A] == 'q'){
                q++;
            }else if(arr[A] == 'r'){
                r++;
            }else if(arr[A] == 's'){
                s++;
            }else if(arr[A] == 't'){
                t++;
            }else if(arr[A] == 'u'){
                u++;
            }else if(arr[A] == 'v'){
                v++;
            }else if(arr[A] == 'w'){
                w++;
            }else if(arr[A] == 'x'){
                x++;
            }else if(arr[A] == 'y'){
                y++;
            }else if(arr[A] == 'z'){
                z++;
            }
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);
    }
}
