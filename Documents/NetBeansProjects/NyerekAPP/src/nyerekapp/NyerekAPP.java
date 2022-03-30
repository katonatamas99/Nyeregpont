/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyerekapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tomi
 */
public class NyerekAPP {

public static void main(String args[]) throws Exception {
Scanner x = new Scanner(new BufferedReader(new FileReader("matrix.txt")));
int i,j,k;
int n=3;
int max = 0;// oszlopmaximum
int min;   //sornimum
       
 int [][] mread = new int[n][n];
while(x.hasNextLine()) {
for (i=0; i<mread.length; i++) {
String [] line = x.nextLine().trim().split(" ");
for (j=0; j<line.length; j++) {
mread[i][j] = Integer.parseInt(line[j]);
                                }
                                }
                        }
int [][]matrix = new int[n][n];  
System.out.print("A mátrix: \n");  
for (i = 0; i < n; i++)  
{   
for (j = 0; j < n; j++)  
    {  
System.out.print(mread[i][j] + " " );  
    }   
System.out.println();  
}  

for (i = 0; i < n; i++)  
{  
min = mread[i][0];  
for (j = 0; j < n; j++)  
        {  
if (min >= mread[i][j])  
    {  
min = mread[i][j];  
matrix[0][0] = i;  
matrix[0][1] = j;  
    }  
        }
j = matrix[0][1];  
max = mread[0][j];  
for (k = 0; k < n; k++)  
{  
if (max <= mread[k][j])  
    {  
max = mread[i][j];  
matrix[1][0] = k;  
matrix[1][1] = j;  
    }  
} 
if (min == max)   
        {  
if (matrix[0][0] == matrix[1][0] && matrix[0][1] == matrix[1][1])  
    {  
System.out.print("\nVan benne nyeregpont méghozzá : " + max + "\n");  
    }
if (matrix[0][0] != matrix[1][0] && matrix[0][1] != matrix[1][1])
    System.out.print("\nNincs benne nyeregpont");  
        }  
}  
                                                }  
                        }  
    
        
    

    

