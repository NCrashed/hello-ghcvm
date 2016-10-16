import ghcvm.runtime.Rts;
import ghcvm.runtime.RtsConfig;

import hello.Export;
import ghczmprim.ghc.Types;

public class Main {
    public static void main(String[] args) {
        Rts.hsInit(new String[0], RtsConfig.getDefault());
        String v = Integer.toString(new Export().takePrime(100));
        System.out.println(v);
    }
}