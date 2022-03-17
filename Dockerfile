FROM ghcr.io/graalvm/graalvm-ce:latest

RUN gu install native-image

RUN mkdir /app
WORKDIR /app
COPY . /app
RUN ls
RUN ./gradlew nativeCompile

CMD ./build/native/nativeCompile/spring-native-graalvm