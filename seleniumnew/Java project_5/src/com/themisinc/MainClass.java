package com.themisinc;

class Ax
{
    int i;
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    Ax()
    {
        System.out.println("Class A Constructor");
    }
}
 
class Bx extends Ax
{
    int j;
}
 
class MainClass
{
    public static void main(Practice[] args)
    {
        Bx b1 = new Bx();
        Bx b2 = new Bx();
    }
}
