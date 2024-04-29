
CREATE TABLE customers (
  customer_id INT PRIMARY KEY AUTO_INCREMENT,
  customer_name VARCHAR(255) NOT NULL,
  city VARCHAR(100) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL
);
INSERT INTO customers (customer_name, city, email)
VALUES ('Rishi Kapoor', 'Mumbai', 'rishi.kapoor@example.com'),
       ('Priyanka Chopra', 'Delhi', 'priyanka.chopra@example.com'),
       ('Virat Kohli', 'Delhi', 'virat.kohli@example.com'),
       ('Aishwarya Rai Bachchan', 'Mumbai', 'aishwarya.bachchan@example.com'),
       ('Amitabh Bachchan', 'Mumbai', 'amitabh.bachchan@example.com'),
       ('Sania Mirza', 'Hyderabad', 'sania.mirza@example.com'),
       ('Sachin Tendulkar', 'Mumbai', 'sachin.tendulkar@example.com'),
       ('Lata Mangeshkar', 'Mumbai', 'lata.mangeshkar@example.com'),
       ('Shah Rukh Khan', 'Delhi', 'shah.rukh.khan@example.com'),
       ('Deepika Padukone', 'Bangalore', 'deepika.padukone@example.com');
       
CREATE TABLE orders (
  order_id INT PRIMARY KEY AUTO_INCREMENT,
  customer_id INT NOT NULL,
  order_date DATE NOT NULL,
  order_total DECIMAL(10,2) NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO orders (customer_id, order_date, order_total)
SELECT customer_id, DATE_SUB(CURDATE(), INTERVAL (RAND() * 10) DAY),  
       RAND() * 1000 + 50  -- Generate random order totals between $50 and $1050
FROM customers
ORDER BY customer_id
LIMIT 10;

          





