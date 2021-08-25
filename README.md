# monitoring-app
1. mvn clean
2. mvn test
3. mvn clean install
4. Go to the target folder
5. java -jar monitoring-app.jar
6. Create a measurement: curl -d '{"gas_measumement":100,"hot_water_measumement":100, "cold_water_measumement":100, "userId" : "1"}' -H 'Content-Type: application/json' http://localhost:8080/measurement/create
7. List the measurement by User id = "1": curl -v http://localhost:8080/measurement/1
