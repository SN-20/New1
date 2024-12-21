FROM openjdk:latest

# Set the working directory to /app
WORKDIR /app

# Copy the Java application into the container
COPY  ./app .

RUN javac hello.java

CMD ["java", "hello"].
