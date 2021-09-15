create database banhang;
use banhang;
CREATE TABLE role(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name VARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE sanpham(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  code VARCHAR(6) NOT NULL,
   name VARCHAR(255)  NULL,
   size VARCHAR(255)  NULL,
	image VARCHAR(255)  NULL,
mainprice int null,
currentprice int null,
amount int  null,
loaisanpham_id bigint null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE loaisanpham(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    code VARCHAR(255),
    name varchar(255),
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE khachhang(
  id bigint NOT NULL PRIMARY KEY auto_increment,
   name VARCHAR(255)  NULL,
	phone varchar(10)  null,
    email varchar(100) null,
	status int not null,
    point int null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE nhanvien(
  id bigint NOT NULL PRIMARY KEY auto_increment,
   name VARCHAR(255)  NULL,
	phone varchar(10)  null,
	status int not null,
    cmnd char(12) null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE lichlamtuan(
  nhanvien_id bigint not null PRIMARY KEY,
	thu2 varchar(12) null,
    thu3 varchar(12) null,
    thu4 varchar(12) null,thu5 varchar(12) null,thu6 varchar(12) null,thu7 varchar(12) null,CN varchar(12) null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE lichdangkytuan(
  nhanvien_id bigint not null PRIMARY KEY,
	thu2 varchar(12) null,
    thu3 varchar(12) null,
    thu4 varchar(12) null,thu5 varchar(12) null,thu6 varchar(12) null,thu7 varchar(12) null,CN varchar(12) null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE giolamtheoca(
id bigint NOT NULL PRIMARY KEY auto_increment,
  nhanvien_id bigint not null,
	ngay timestamp null,
    ca int null,
    giolam int null,
    luong1h int null,
    
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE truluong(
id bigint NOT NULL PRIMARY KEY auto_increment,
  nhanvien_id bigint not null,
	ngay timestamp null,
    ca int null,
    luongbitru int null,
    note text null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE chamcong(
id bigint NOT NULL PRIMARY KEY auto_increment,
  nhanvien_id bigint not null,
	thang int  null,
    nam int null,
    luongnhanduoc int null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE hoadon(
  id bigint NOT NULL PRIMARY KEY auto_increment,
	khachhang_id bigint not  null,
    nhanvien_id bigint not null,
    tongtien int null,
    khuyenmai_id bigint null,
    diachi_id bigint null,
    phiship int null,
    ngay timestamp null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE chitiethoadon(
	hoadon_id bigint not null,
	sanpham_id bigint not  null,
    soluong int null,
    giasanpham int null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp,
    PRIMARY KEY(hoadon_id, sanpham_id)
);
CREATE TABLE khuyenmai(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    content text null,
	ngaybatdau timestamp null,
    ngayketthuc timestamp null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE chitietkhuyenmai(
	khuyenmai_id bigint not null,
    loaikhuyenmai_code varchar(6) not null,
	sanpham_id bigint UNIQUE,
    soluong int null,
    giasanpham int null,
    PRIMARY KEY(khuyenmai_id, sanpham_id)
);
CREATE TABLE loaikhuyenmai(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    code varchar(6),
    name varchar(6)
);
CREATE TABLE dieukienkhuyenmai(
	khuyenmai_id bigint not null,
    loaikhuyenmai_code varchar(6) not null,
	sanpham_id bigint UNIQUE,
    soluong int null,
    giasanpham int null,
    PRIMARY KEY(khuyenmai_id, sanpham_id)
);
CREATE TABLE taikhoannhanvien(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	username varchar(255) not null,
    password varchar(6) not null,
	nhanvien_id bigint not  null,
    role_code varchar(6) not null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE taikhoankhachhang(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	username varchar(255) not null,
    password varchar(6) not null,
	khachhang_id bigint not  null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE nhacungcap(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	name varchar(255) not null,
	address varchar(255) null,
    phone varchar(10) null,
    email varchar(10) null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE nccsanpham(
	nhacungcap_id bigint not null,
    sanpham_id bigint not null,
    PRIMARY KEY(nhacungcap_id, sanpham_id)
);
CREATE TABLE comment(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	sanpham_id bigint not null,
    khachhang_id bigint not null,
    danhgia int null,
    content text null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
  
);
CREATE TABLE hoadonnhap(
  id bigint NOT NULL PRIMARY KEY auto_increment,
	nhacungcap_id bigint not null,
    nhanvien_id bigint not null,
    tongtien int null,
    ngay timestamp null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
CREATE TABLE chitiethoadonnhap(
	hoadonnhap_id bigint not null,
	sanpham_id bigint not null,
    soluong int null,
    giasanpham int null,
    PRIMARY KEY(hoadonnhap_id,sanpham_id)
);
create table donhang(
	id bigint not null primary key auto_increment,
    nhanvien_id bigint not null,
    khachhang_id bigint not null,
    khuyenmai_id bigint null,
    diachi_id bigint not null,
    phiship int null,
    tongtien int null,
    ngaylapdonhang timestamp not null,
    trangthai int null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
create table chitietdonhang(
	donhang_id bigint not null,
    sanpham_id bigint not null,
    soluong int null,
    giatien int null,
    PRIMARY KEY(donhang_id,sanpham_id)
);
create table diachi(
	id bigint not null PRIMARY KEY auto_increment,
    phone varchar(10) null,
    khachhang_id bigint not null,
    province_id bigint not null,
    district_id bigint not null,
    ward_street varchar(100) not null,
    address varchar(255) null,
  modifiedby varchar(255),
  modifieddate timestamp,
  createdby varchar(255),
  createddate timestamp
);
create table province(
	id bigint not null PRIMARY KEY auto_increment,
    name varchar(50) not null
);
create  table district(
	id bigint not null PRIMARY KEY auto_increment,
    province_id bigint	not null,
    name varchar(50)
);
-- diachi
ALTER TABLE diachi ADD constraint fk_diachi_province foreign key (province_id) references province(id);
ALTER TABLE diachi ADD constraint fk_diachi_district foreign key (district_id) references district(id);
-- don hang
ALTER TABLE hoadon ADD constraint fk_hoadon_diachi foreign key (diachi_id) references diachi(id);
ALTER TABLE donhang ADD constraint fk_donhang_diachi foreign key (diachi_id) references diachi(id);
ALTER TABLE donhang ADD constraint fk_donhang_nhanvien foreign key (nhanvien_id) references nhanvien(id);
ALTER TABLE donhang ADD constraint fk_donhang_khachhang foreign key (khachhang_id) references khachhang(id);
ALTER TABLE chitietdonhang ADD constraint fk_chitietdonhang_donhang foreign key (donhang_id) references donhang(id);
ALTER TABLE chitietdonhang ADD constraint fk_chitietdonhang_sanpham foreign key (sanpham_id) references sanpham(id);
-- tạo khóa ngoại
-- role
-- sanpham
ALTER TABLE sanpham ADD CONSTRAINT fk_sanpham_loaisanpham FOREIGN KEY (loaisanpham_id) REFERENCES loaisanpham(id);
-- loaisanpham
-- khachhang
-- nhanvien
-- lichlamtuan
ALTER TABLE lichlamtuan ADD CONSTRAINT fk_lichlamtuan_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
-- lichdangkytuan
ALTER TABLE lichdangkytuan ADD CONSTRAINT fk_lichdangkytuan_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
-- truluong
ALTER TABLE truluong ADD CONSTRAINT fk_truluong_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
-- chamcong
ALTER TABLE chamcong ADD CONSTRAINT fk_chamcong_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
-- hoadon
ALTER TABLE hoadon ADD CONSTRAINT fk_hoadon_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
ALTER TABLE hoadon ADD CONSTRAINT fk_hoadon_khachhang FOREIGN KEY (khachhang_id) REFERENCES khachhang(id);
ALTER TABLE hoadon ADD CONSTRAINT fk_hoadon_khuyenmai FOREIGN KEY (khuyenmai_id) REFERENCES khuyenmai(id);
-- chitiethoadon
ALTER TABLE chitiethoadon ADD CONSTRAINT fk_chitiethoadon_hoadon FOREIGN KEY (hoadon_id) REFERENCES hoadon(id);
ALTER TABLE chitiethoadon ADD CONSTRAINT fk_chitiethoadon_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);
-- khuyenmai
-- chitietkhuyenmai
CREATE UNIQUE INDEX loaikhuyenmai_code
ON loaikhuyenmai (code);
ALTER TABLE chitietkhuyenmai ADD CONSTRAINT fk_chitietkhuyenmai_khuyenmai FOREIGN KEY (khuyenmai_id) REFERENCES khuyenmai(id);
ALTER TABLE chitietkhuyenmai ADD CONSTRAINT fk_chitietkhuyenmai_loaikhuyenmai FOREIGN KEY (loaikhuyenmai_code) REFERENCES loaikhuyenmai(code);
ALTER TABLE chitietkhuyenmai ADD CONSTRAINT fk_chitietkhuyenmai_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);
-- dieukienkhuyenmai
ALTER TABLE dieukienkhuyenmai ADD CONSTRAINT fk_dieukienkhuyenmai_khuyenmai FOREIGN KEY (khuyenmai_id) REFERENCES khuyenmai(id);
ALTER TABLE dieukienkhuyenmai ADD CONSTRAINT fk_dieukienkhuyenmai_loaikhuyenmai FOREIGN KEY (loaikhuyenmai_code) REFERENCES loaikhuyenmai(code);
ALTER TABLE dieukienkhuyenmai ADD CONSTRAINT fk_dieukienkhuyenmai_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);
-- taikhoannhanvien
CREATE UNIQUE INDEX role_code
ON role (code);
ALTER TABLE taikhoannhanvien ADD CONSTRAINT fk_taikhoannhanvien_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
ALTER TABLE taikhoannhanvien ADD CONSTRAINT fk_taikhoannhanvien_role FOREIGN KEY (role_code) REFERENCES role(code);
-- taikhoankhachhang
ALTER TABLE taikhoankhachhang ADD CONSTRAINT fk_taikhoankhachhang_khachhang FOREIGN KEY (khachhang_id) REFERENCES khachhang(id);
-- nhacungcap
-- nccsanpham
ALTER TABLE nccsanpham ADD CONSTRAINT fk_nccsanpham_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);
ALTER TABLE nccsanpham ADD CONSTRAINT fk_nccsanpham_nhacungcap FOREIGN KEY (nhacungcap_id) REFERENCES nhacungcap(id);
-- comment
ALTER TABLE comment ADD CONSTRAINT fk_comment_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_khachhang FOREIGN KEY (khachhang_id) REFERENCES khachhang(id);
-- hoadonnhap
ALTER TABLE hoadonnhap ADD CONSTRAINT fk_hoadonnhap_nhacungcap FOREIGN KEY (nhacungcap_id) REFERENCES nhacungcap(id);
ALTER TABLE hoadonnhap ADD CONSTRAINT fk_hoadonnhap_nhanvien FOREIGN KEY (nhanvien_id) REFERENCES nhanvien(id);
-- chitiethoadonnhap
ALTER TABLE chitiethoadonnhap ADD CONSTRAINT fk_chitiethoadonnhap_hoadonnhap FOREIGN KEY (hoadonnhap_id) REFERENCES hoadonnhap(id);
ALTER TABLE chitiethoadonnhap ADD CONSTRAINT fk_chitiethoadonnhap_sanpham FOREIGN KEY (sanpham_id) REFERENCES sanpham(id);