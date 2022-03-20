
docker build -t pantaklabs/spring-native-app:1.0.0 .

docker rm mycontainer

docker run --name mycontainer docker.io/pantaklabs/spring-native-app:1.0.0

docker cp mycontainer:/app/build/native/nativeCompile/spring-native-graalvm app/spring-native-graalvm

gradlew distZip

aws lambda update-function-code --function-name native-app-graal --zip-file fileb://build/distributions/spring-native-graalvm-1.0-SNAPSHOT.zip

