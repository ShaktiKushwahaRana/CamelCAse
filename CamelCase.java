/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelcase;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CamelCAse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a string");
        String s=sc.nextLine();
        char []a=s.toCharArray();
        int l=a.length;
        if((char)a[0]>96){int y=(char)a[0]-97;
            a[0]=(char)(65+y);};
            if((char)a[0]<95 && (char)a[0]>64){int y=(char)a[0]-65;
            a[0]=(char)(97+y);}
        for(int i=0;i<l;i++){
        if((int)a[i]==32){int g=a[i+1];
            if(g>96){int y=g-97;
            a[i+1]=(char)(65+y);};
            if(g<95 && g>64){int y=g-65;
            a[i+1]=(char)(97+y);}
        for(int j=i+1;j<a.length;j++){
            
            
        a[j-1]=a[j];
        
        }l=l-1;}}
        for(int p=0;p<l;p++){System.out.print(a[p]);}
    }
    
}
