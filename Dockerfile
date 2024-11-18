# Użyj obrazu Javy
FROM openjdk:21-jdk-slim

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj plik jar aplikacji do obrazu
COPY build/libs/api-gateway-domain-0.0.1-SNAPSHOT.jar api-gateway-domain.jar

# Ustaw domyślną komendę do uruchomienia aplikacji
ENTRYPOINT ["java", "-jar", "api-gateway-domain.jar"]