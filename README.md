## Subscription-API
Spring Boot API Project containing an API end point '/subscription'.
Appropriate validations are applied to the request payload.

Run the project by using the Sprint Boot's embedded server.

Sample API End Point: http://localhost:8080/subscription

Request Payload: 
{
    "name" : "John",
    "email": "John28@gmail.com",
    "userType": "dev",
    "company": "walmart",
    "applicationType": "web"
}

The project also contains a test case which triggers the '/subscription' API with the sample payload.