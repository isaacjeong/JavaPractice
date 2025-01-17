public class RunningAThreadByExtendingTheThreadClass extends Thread {
    public static void main(String[] args) {
        RunningAThreadByExtendingTheThreadClass thread = new RunningAThreadByExtendingTheThreadClass();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
