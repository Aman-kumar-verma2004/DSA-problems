package JavaPrograms.Multithreading;

class Mythread extends Thread{

}


 class TestDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Mythread m = new Mythread();
        System.out.println(m.getName());
    }
}
