package com.pradnya.java.diffpackage;
import com.pradnya.java.acessspecifier.Sample;

public class ChildFromDiffpackage extends Sample
{
public static void main(String[]args)
{
Sample p =new Sample();
p.method4();
ChildFromDiffpackage c=new ChildFromDiffpackage();
c.method2();
c.method4();
}
}
