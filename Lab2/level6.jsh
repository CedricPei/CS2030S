public void serveCruises(Cruise[] cruises) {
    List<Loader> loaderList = new ArrayList<Loader>();
    int loaderIdentifier = 1;

    for (Cruise cruise : cruises) {
        int servedLoaderCount = 0;
        int numOfLoaders = cruise.getNumOfLoadersRequired();
        for (int i=0;i<loaderList.size();i++) {
            Loader loader = loaderList.get(i);
            if (loader.canServe(cruise)) {
                Loader newLoader = loader.serve(cruise);
                loaderList.set(i,newLoader);
                System.out.println(newLoader);
                servedLoaderCount++;
                if(servedLoaderCount == numOfLoaders) {
                    break;
                }
            }
        }
        while (servedLoaderCount < numOfLoaders) {
            if( (loaderList.size() + 1) % 3 == 0) {
                Loader buyNewLoader = new RecycledLoader(loaderIdentifier,cruise);
                loaderIdentifier++;
                loaderList.add(buyNewLoader);
                System.out.println(buyNewLoader);
                servedLoaderCount++;
            } else {
                Loader buyNewLoader = new Loader(loaderIdentifier,cruise);
                loaderIdentifier++;
                loaderList.add(buyNewLoader);
                System.out.println(buyNewLoader);
                servedLoaderCount++;
            }
        }
    }
}