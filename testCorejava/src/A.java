class A {
    int m = 4;

    A(int x) {
        System.out.println("In A");
    }

    void test() {
        System.out.println("Test method of A");
    }
}

class B extends A {
    int m = 5;

    B(int x) {
        super(x);
        System.out.println("In B");
    }

    void test() {
        System.out.println("Test method of B");
    }
}

class C {
    public static void main(String[] args) {
        A p = new B(5);
        System.out.println(p.m);
        p.test();
    }
}
