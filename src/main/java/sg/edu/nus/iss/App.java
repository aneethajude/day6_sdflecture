package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().getName()+"\t Runnable...."+i);
                }
            }
        });
       // thread1.start();
         MyRunnableImplementation mRI1 = new MyRunnableImplementation();
         MyRunnableImplementation mRI2 = new MyRunnableImplementation();
         MyRunnableImplementation mRI3 = new MyRunnableImplementation();
         MyRunnableImplementation mRI4 = new MyRunnableImplementation();
         MyRunnableImplementation mRI5 = new MyRunnableImplementation();

        // Thread thread2 = new Thread(mRI);
        //thread2.start();

        // Thread thread3 = new Thread(mRI);
        // thread3.start();

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI1);
        //  executorService.execute(mRI2);
        //  executorService.execute(mRI3);
        //  executorService.execute(mRI4);
        //  executorService.execute(mRI5);
        //  executorService.shutdown();

        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.shutdown();

        MyMessageInterface printString = (a) ->{
            System.out.println(a);
        };

        MyRunnableInterface<Integer> addOperation = (a,b)->{
             return a+b;
        };
         MyRunnableInterface<Integer> multiplyOperation = (a,b)->{
             return a*b;
         };
         MyRunnableInterface<Integer> subtractOperation = (a,b)->{
             return a-b;
         };
         MyRunnableInterface<String> concatenateString = (a,b)->{
            return a+b;
         };
         System.out.println("addOperation   "+addOperation.process(1,1));
         System.out.println("MultiplicationOperation   "+multiplyOperation.process(2,5));
          System.out.println("SubtractOperation   "+subtractOperation.process(5,2));
         System.out.println("Concatenate String"+concatenateString.process("The quick brownfox","jumps"));
        printString.printMessage("Lets take a break");
    }
}
