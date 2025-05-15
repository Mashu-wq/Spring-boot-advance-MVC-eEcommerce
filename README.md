# 🛒 E-Commerce REST API (Spring Boot)

A full-featured **E-Commerce Backend REST API** developed using **Spring Boot 3**, supporting category and product management, file/image upload, pagination, sorting, and exception handling.

## 🚀 Current Features

- CRUD operations for **Categories** and **Products**
- Image upload for products
- Keyword-based product search
- Category-wise product filtering
- Pagination & sorting for listing endpoints
- Centralized exception handling
- DTO mapping using `ModelMapper`
- Custom exceptions with proper API responses

## 🧱 Future Enhancements
 - Add user authentication and roles (JWT + Spring Security)
 - Cart & Order Management
 - Payment Gateway Integration
 - Swagger API documentation
 - Dockerization
 - Deployment on cloud (Heroku)
---

## 📁 Project Structure

<details>
<summary><strong>📂 Click to Expand</strong></summary>

```bash
src/
├── config         # Application constants and config beans (like ModelMapper)
├── controller     # REST controllers for API endpoints
├── exception      # Custom exceptions and global exception handler
├── model          # JPA entity models
├── payload        # DTOs and response payloads
├── repositories   # JPA Repositories
├── service        # Service interfaces and implementations
├── resources
│   └── application.properties
 ```
</details>

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- MySQL (or any other JPA-compatible DB)
- ModelMapper
- Maven

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL Database
- (Optional) Postman for API testing

### Clone the Repository

```bash
git clone https://github.com/yourusername/e-commerce.git
cd e-commerce
```
## 🔑 API Endpoints
### 🔷 Categories
| Method | Endpoint                      | Description                 |
| ------ | ----------------------------- | --------------------------- |
| GET    | `/api/public/categories`      | List all categories (paged) |
| POST   | `/api/public/categories`      | Create new category         |
| PUT    | `/api/public/categories/{id}` | Update existing category    |
| DELETE | `/api/admin/categories/{id}`  | Delete category             |
### 🔷 Products
| Method | Endpoint                                 | Description                        |
| ------ | ---------------------------------------- | ---------------------------------- |
| GET    | `/api/public/products`                   | List all products (paged)          |
| GET    | `/api/public/categories/{id}/products`   | List products by category (paged)  |
| GET    | `/api/public/products/keyword/{keyword}` | Search products by keyword (paged) |
| POST   | `/api/admin/categories/{id}/product`     | Add product to category            |
| PUT    | `/api/admin/products/{id}`               | Update product                     |
| DELETE | `/api/admin/products/{id}`               | Delete product                     |
| PUT    | `/api/products/{id}/image`               | Upload/update product image        |
#### 📦 Sample JSON (ProductDTO)
```
{
  "productName": "iPhone 14 Pro",
  "description": "Latest Apple iPhone",
  "quantity": 10,
  "price": 1500,
  "discount": 10,
  "specialPrice": 1350
}
```
#### ⚠️ Exception Handling
Handled by MyGlobalExceptionHandler:

 - MethodArgumentNotValidException → 400 (validation errors)

 - ResourceNotFoundException → 404

 - ApiException → 400
#### 🧪 Testing the API
You can test the API using:
- Postman
- Curl
- Any REST Client
#### 📂 Image Upload
- Product image is uploaded using a MultipartFile through:
```
PUT /api/products/{productId}/image
```
### 🧑‍💻 Author
#### Mayesha Marzia Zaman
🔗 https://www.linkedin.com/in/marzia88/
