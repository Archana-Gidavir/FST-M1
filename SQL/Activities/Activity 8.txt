--Activity 8

select customer_id, MAX(purchase_amount) from orders group by customer_id order by customer_id;

select * from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD');

select salesman_id, order_date, MAX(purchase_amount) from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select customer_id, order_date, MAX(purchase_amount) from orders GROUP BY customer_id, order_date
having ROUND(MAX(purchase_amount)) in(2030, 3450, 5760, 6000);
