package L1100_1200.L1114;

class Foo {
    private volatile int flag = 0;
    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        while(flag == 0){
            // printSecond.run() outputs "second". Do not change or remove this line.
            printFirst.run();
            flag++;
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(flag == 1){
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            flag++;
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        while(flag == 2){
        // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            flag++;
        }
    }
}