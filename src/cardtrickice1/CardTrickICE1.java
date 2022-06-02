/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(2);//use a method to generate random *13
            c1.setSuits("hearts");//random method suit 
        }
        //step 2:take input 
        Card c2= new Card();
        String suit;
        int value;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the card number of your choice");
        value=ob.nextInt();
        c2.setValue(value);
        System.out.println(c2.getValue());
        
        //step 3: match with array
        for(int j=0;j<magicHand.length;j++){
            if(c1.getValue()==c2.getValue()){
                System.out.println("ok");
            }
            else 
                System.out.println("no");
        
     
        Card luckyCard= new Card();
        luckyCard.setValue(3);
        luckyCard.setSuits("Spade");
        // naman sharma 
        // student id:991666397
    }
    
}
