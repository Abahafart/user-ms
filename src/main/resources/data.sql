DELETE FROM tbl_status WHERE id > 0;
INSERT INTO tbl_status (id, description, type, created_at) VALUES (1, 'ACTIVE', 'USER', current_timestamp);
INSERT INTO tbl_status (id, description, type, created_at) VALUES (2, 'INACTIVE', 'USER', current_timestamp);