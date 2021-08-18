class ui {
    constructor() {
        // Dùng để hiển thị các screen trong cùng 1 trang web
    }
    start(screen) {
        let screens = document.querySelectorAll('#wapper > div');
        screens.forEach((s) => {
            s.style.display = 'none';
        });
        let cur_screen = document.getElementById(screen);
        cur_screen.style.display = 'flex';

    }
    onClick(callback) {
        let startBtn = document.getElementById('startBtn');
        startBtn.addEventListener('click', callback);
    }
    onAdd(callback) {
        let btnAdd = document.getElementById('btnAdd');
        btnAdd.addEventListener('click', callback);
    }
}