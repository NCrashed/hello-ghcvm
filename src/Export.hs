{-# LANGUAGE MagicHash #-}
module Export where

import Primes
import GHC.Base
import GHC.Pack

data {-# CLASS "hello.Export" #-} Export = Export (Object# Export)

foreign export java takePrime :: Int -> Java Export Int
foreign export java sayHello :: JString -> Java Export JString

takePrime i = return . fromIntegral $ primes !! i
sayHello n = return . mkJString $ "Hello, " ++ unpackCString n ++ "!"