DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);


DROP TABLE IF EXISTS user;

CREATE TABLE IF NOT EXISTS user(id varchar(32) unsigned not null primary key,name varchar(32),age int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO user(id, name, age, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES
('1', '苹果1', 20, null, null, null, null, null, 0),
('2', '梨1', 10, null, null ,null, null, null, 0),
('3', '桃子1', 123, null, null ,null, null, null, 0),
('4', '香蕉1', 11, null, null ,null, null, null, 0),
('5', '猕猴桃1', 50, null, null ,null, null, null, 0),
('6', '桔子2', 33, null, null ,null, null, null, 0),
('7', '菠萝2', 90, null, null ,null, null, null, 0),
('8', '芒果2', 766, null, null ,null, null, null, 0),
('9', '红枣2', 29, null, null ,null, null, null, 0),
('10', '榴莲2', 990, null, null ,null, null, null, 0),
('11', '柚子2', 291, null, null ,null, null, null, 0),
('12', '小番茄2', 200, null, null ,null, null, null, 0);