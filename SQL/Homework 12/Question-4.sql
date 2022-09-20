SELECT first_name, last_name, customer_id FROM customer
WHERE customer_id = ANY
(SELECT customer_id FROM(
SELECT MAX(count), customer_id FROM 
	(SELECT COUNT(payment.customer_id), payment.customer_id 
	 FROM customer
	 INNER JOIN payment ON payment.customer_id = customer.customer_id
	GROUP BY payment.customer_id) AS count
	GROUP BY customer_id
	ORDER BY MAX(count) DESC
	LIMIT 1) AS BestCustomer_id);