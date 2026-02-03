package ex_22_OOPs_Super_Abstraction.abstraction;

public class Lab192_Interview_Q {
}

interface I11{}
interface I12{}
class A1{}
class B1{}

//class Test2 extends A1, B1{} => Not allowed

class Test3 implements I11{}
class Test4 implements I11, I12{}

class Test5 extends A1 implements I11, I12{}

//class Test6 implements I11 extends A1{} => Not allowed

//interface I3 extends A1{} => Not allowed