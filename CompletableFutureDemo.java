

import java.util.concurrent.*;

public class CompletableFutureDemo {

    // @Test
    public void runAsync() {}
        Future future=CompletableFuture.runAsync( ()->System.out.println("hello world"), ForkJoinPool.commonPool() );
    }

public void exceptional() {
    
    CompletableFuture.supplyAsync( () -> {System.out.println("Hello World"); return 1; })
        .exceptional( throwable-> {
                                    throwable.printStackTrace(); 
                                    return 0; 
                                   }  );
    
    
      Thread.sleep(3000);//let the stages complete
      System.out.println("-- checking exceptions --");
      boolean b = completableFuture.isCompletedExceptionally();
      System.out.println("completedExceptionally: " + b);
      System.out.println("-- getting results --");
      int result = completableFuture.get();
      System.out.println(result);
    
    
}

}
