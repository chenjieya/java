create table user(
                     uname VARCHAR(20),
                     upassword VARCHAR(20)
);

ALTER TABLE USER add PRIMARY KEY(uname);


CREATE table category(
                         cid INT(4),
                         cname VARCHAR(20)
)

ALTER TABLE category add PRIMARY KEY(cid);

CREATE TABLE product(
                        pid INT(4),
                        pname VARCHAR(20),
                        price FLOAT(10,2),
	cid INT(4)
)

ALTER TABLE product add PRIMARY KEY(pid);

ALTER table product add constraint fk_product_category FOREIGN KEY(cid) REFERENCES category(cid);
