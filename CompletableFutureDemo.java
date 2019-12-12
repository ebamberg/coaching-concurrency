

import java.util.concurrent.*;

public class CompletableFutureDemo {

    // @Test
    public void runAsync() {}
        Future future=CompletableFuture.runAsync( ()->System.out.println("hello world"), ForkJoinPool.commonPool() );
    }

}