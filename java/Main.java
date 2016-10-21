import ghcvm.runtime.Rts;
import ghcvm.runtime.RtsConfig;

import hello.Export;
import ghczmprim.ghc.Types;

public class Main {
    public static void main(String[] args) {
        Rts.hsInit(new String[0], RtsConfig.getDefault());
        Export export = new Export();

        long startTime = System.currentTimeMillis();

        String v = Integer.toString(export.constAnswer());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(v);
        System.out.println(elapsedTime);
    }
}