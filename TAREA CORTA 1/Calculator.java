/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRUNO
 */
public class Calculator {

    public int number1 = 0;
    public int digitsNumber1 = 0;
    public int digitsNumber2 = 0;
    public int number2 = 0;
    public Functions functions = new Functions();
    
    // 1 sum
    // 2 subtraction
    // 3 multiplication
    // 4 pow
    // 5 division
    int operation = 0;
    
    public int selectOperation(int pOperation)
    {
        operation = pOperation;
        return number2;
    }
    
    public int executeOperation()
    {
        int n1 = number1;
        int n2 = number2;
        int op = operation;
        reset();
        
        if(op==0)
            return -1;
        if(op==1)
            return functions.sum(n1,n2);
        if(op==2)
            return functions.subtraction(n1,n2);
        if(op==3)
            if(functions.multiplication(n1,n2)<0)
                return -1;
            else
                return functions.multiplication(n1,n2);
        if(op==4)
            return functions.pow(n1,n2);
        if(op==5)
            return functions.division(n1,n2);
        return -1;
    }
    
    public int reset()
    {   
        operation = 0;
        number1 = 0;
        number2 = 0;
        digitsNumber1 = 0;
        digitsNumber2 = 0;
        return number1;
    }
    
    public int addNumber(int digit)
    {
        if(operation==0)
        {
            if(digitsNumber1 < 9)
            {
                number1 = number1*10 + digit;
                digitsNumber1++;
            }
            return number1;
        }
        else
        {
            if(digitsNumber2 < 9 )
            {
                number2 = number2*10 + digit;
                digitsNumber2++;
            }
            return number2;
        }
    }
    
}
