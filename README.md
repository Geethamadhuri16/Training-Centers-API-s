# Training-Centers-API-s

## Setup Instructions

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to build the project.
4. Run `mvn spring-boot:run` to start the application.
5. The application will be available at `http://localhost:8080`.

## API Endpoints

### Create Training Center
- URL:POST `http://localhost:8080/traini8`
- Request Body:
```json
{
  "centerName": "Example Center",
  "centerCode": "ABCD1234EFGH",
  "address": {
    "detailedAddress": "123 Example Street",
    "city": "Example City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course1", "Course2"],
  "contactEmail": "example@example.com",
  "contactPhone": "+1234567890"
}
```
- Response:
```json
{
  "id": 1,
  "centerName": "Example Center",
  "centerCode": "ABCD1234EFGH",
  "address": {
    "detailedAddress": "123 Example Street",
    "city": "Example City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course1", "Course2"],
  "createdOn": 1616625267,
  "contactEmail": "example@example.com",
  "contactPhone": "+1234567890"
}
```
### Get All Training Centers
- URL: GET `http://localhost:8080/traini8`
- Response:
```
[
    {
        "id": 1,
        "centerName": "Sample Training Center",
        "centerCode": "CTR123456789",
        "address": {
            "detailedAddress": "123 Main St",
            "city": "Sample City",
            "state": "Sample State",
            "pincode": "123456"
        },
        "studentCapacity": 100,
        "coursesOffered": [
            "Java",
            "Spring Boot"
        ],
        "createdOn": 1716220497,
        "contactEmail": "contact@example.com",
        "contactPhone": "+1234567890"
    }
]
```
