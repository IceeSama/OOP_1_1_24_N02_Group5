const seats = document.querySelectorAll('.seat');
        const countDisplay = document.getElementById('count');
        let selectedCount = 0;

        seats.forEach(seat => {
            seat.addEventListener('click', () => {
                if (seat.classList.contains('selected')) {
                    seat.classList.remove('selected');
                    selectedCount--;
                } else {
                    seat.classList.add('selected');
                    selectedCount++;
                }
                countDisplay.textContent = selectedCount;
            });
        });
        document.addEventListener('DOMContentLoaded', function () {
            let showButtons = document.querySelectorAll('.container__navbar3-timeselect');
            let ShowModal = document.getElementById('modal');
            let closeButton = document.getElementById('pay-button');

            // Lắng nghe sự kiện click trên tất cả các nút "Show Login" để hiển thị bảng đăng nhập
            showButtons.forEach(button => {
                button.addEventListener('click', () => {
                    ShowModal.style.display = 'flex';
                });
            });

            // Lắng nghe sự kiện click trên nút "X" để ẩn bảng đăng nhập
            closeButton.addEventListener('click', () => {
                ShowModal.style.display = 'none';
            });
        });