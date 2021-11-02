public Logger<Integer> add(Logger<Integer> a, int b) {
    return a.map(x -> x + b); 
}


public Logger<Integer> sum(int n) {
    Logger<Integer> logger = Logger.of(0);

    for (int i = 1; i <= n; i++) {
        logger = add(logger, i);
    }

    return logger;
}


public Logger<Integer> f(int n) {
    Logger<Integer> logger = Logger.of(n);

    while (logger.test(x -> x != 1)) {
        if (logger.test(x -> x % 2 == 0)) {
            logger = logger.map(x -> x / 2);
        } else {
            logger = logger.map(x -> 3 * x);
            logger = logger.map(x -> x + 1);
        }
    }
    return logger;
}


