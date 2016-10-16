rm -rf build
rm main.jar
mkdir build
javac -d ./build -cp "hello.jar" Main.java
cd build
jar cvf ../main.jar *