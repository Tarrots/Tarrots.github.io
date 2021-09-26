/*
- File này nằm ở phía server
- Mở port và cấu hình đường dẫn website khi lấy data
- Định hướng trang khi người dùng truy cập
- Tạo api khi get post ..
*/
var express = require("express");
var app = express();
app.use(express.static("pub"));
app.set("view engine", "ejs");
app.set("views", "./views");
app.listen(3000);

app.get("/", (req, res) => {
    res.render("homepage");
})