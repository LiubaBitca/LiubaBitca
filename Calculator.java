public class Calculator{
  // this is a constructor
public Calculator(){
}
     //this is a method for adding two numbers
    public int add(int a, int b ){
    int r=a+b;
    return r;
    }
     //this is a method for subtracting two numbers
    public int subtract(int a, int b ){
    int r=a-b;
    return r;
    }
     //this is a method is used to multiply
    public int multiply(int a, int b ){
    int r=a*b;
    return r;
    }
    //this is a method is used to divide
    public int divide(int a, int b ){
    int r=a/b;
    return r;
    }
    //this is a method is used to find modulo
    public int modulo(int a, int b ){
    int r=a%b;
    return r;
    }
    // main class
    public static void main(String[]args){
      //new object
      Calculator myCalculator= new Calculator();
      //calling method inside printing function
      System.out.println(myCalculator.add(5,6));
      //declaring the numbers in a variable and then printing the result
      int subtraction=myCalculator.subtract(45,11);
      System.out.println(subtraction);
    }
}