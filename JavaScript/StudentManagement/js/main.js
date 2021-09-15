console.log("OK");
class main {
    constructor() {
        this.ui = new ui();
        this.ui.start("login");
        this.ui.onClick(() => {
            let usr = document.getElementById('name').value;
            let pwd = document.getElementById('pwd').value;
            if (usr == 'admin' && pwd == 'admin') {
                alert("Login successfully!");
                this.startAddsv();
            } else {
                alert("Enter the wrong account or password!\nTry it again!");
                window.location.reload();
                document.getElementById('name').value = "";
                document.getElementById('pwd').value = "";
            }

        });
        this.ui.onAdd(() => {
            let name = document.getElementsByName('name')[0].value;
            let mail = document.getElementsByName('mail')[0].value;
            let phone = document.getElementsByName('phone')[0].value;
            let address = document.getElementsByName('address')[0].value;
            let gender = '';

            if (document.getElementsByName('gender')[0].checked) {
                gender = document.getElementsByName('gender')[0].value;
            } else if (document.getElementsByName('gender')[1].checked) {
                gender = document.getElementsByName('gender')[1].value;
            } else gender = document.getElementsByName('gender')[2].value;

            if (check(name, mail, phone, address)) {
                let student = localStorage.getItem('student') ? JSON.parse(localStorage.getItem('student')) : [];
                student.push({
                    name: name,
                    mail: mail,
                    phone: phone,
                    address: address,
                    gender: gender,
                });
                localStorage.setItem('student', JSON.stringify(student));
                render();
            }
        });
    }
    startAddsv() {
        this.ui.start("addsv");
    }

}
var start = new main();

function check(para1, para2, para3, para4) {
    let arr = [para1, para2, para3, para4];
    let arrs = ['name', 'mail', 'phone', 'address'];
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] == '') {
            document.getElementsByClassName(arrs[i] + "_error")[0].innerHTML = "* No Empty";
            sum++;
        } else document.getElementsByClassName(arrs[i] + "_error")[0].innerHTML = "";
    }
    if (arr[0].length > 20) {
        document.getElementsByClassName(arrs[0] + "_error")[0].innerHTML = "* 20 char";
        sum++;
    }
    if (!/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(arr[1])) {
        document.getElementsByClassName(arrs[1] + "_error")[0].innerHTML = "* Format"; //Wrong format
        sum++;
    }
    if (!/^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/.test(arr[2])) {
        document.getElementsByClassName(arrs[2] + "_error")[0].innerHTML = "* Format"; //Wrong format
        sum++;
    }
    if (arr[3].length > 50) {
        document.getElementsByClassName(arrs[3] + "_error")[0].innerHTML = "* 50 char";
        sum++;
    }
    if (sum == 0) return true;
    else return false;
}

function render() {
    let student = localStorage.getItem('student') ? JSON.parse(localStorage.getItem('student')) : [];
    if (student.length === 0) {
        document.getElementsByClassName('table-hover')[0].style.display = 'none';
        return;
    } else document.getElementsByClassName('table-hover')[0].style.display = 'flex';
    let table = `
                <tr>
                    <th>Name</th>
                    <th>Mail</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>Gender</th>
                    <th>Action</th>
                </tr>`;
    let index = 0;
    student.forEach((students) => {
        let idstudent = index;
        index++;
        let genders;
        if (students.gender == 1) {
            genders = 'Male';
        } else if (students.gender == 2) {
            genders = 'Famale';
        } else genders = 'Custom';
        table += ` <tr>
                   <td>${students.name}</td>
                   <td>${students.mail}</td>
                   <td>${students.phone}</td>
                   <td>${students.address}</td>
                   <td>${genders}</td>
                   <td><a href="#" onclick="update(${idstudent});">Edit</a> | <a href="#" onclick="deletes(${idstudent});">Delete</a></td>
                   </tr>`
    });
    document.getElementsByClassName('table-hover')[0].innerHTML = table;
    document.getElementsByName('name')[0].value = "";
    document.getElementsByName('mail')[0].value = "";
    document.getElementsByName('phone')[0].value = "";
    document.getElementsByName('address')[0].value = "";
}

function deletes(id) {
    let student = localStorage.getItem('student') ? JSON.parse(localStorage.getItem('student')) : [];
    student.splice(id, 1);
    localStorage.setItem('student', JSON.stringify(student));
    render();
}

function update(id) {
    confirm('Developing!!');
}

function logout() {
    window.location.reload();
    document.getElementById('name').value = "";
    document.getElementById('pwd').value = "";
}