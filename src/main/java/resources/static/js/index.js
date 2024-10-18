let currentSlide = 0;

function showSlide(index) {
    const slides = document.querySelector('.slides');
    const totalSlides = document.querySelectorAll('.slide').length;

    currentSlide = (index + totalSlides) % totalSlides;

    const offset = -currentSlide * 100;
    slides.style.transform = `translateX(${offset}%)`;
}

function changeSlide(direction) {
    showSlide(currentSlide + direction);
}

function autoSlide() {
    changeSlide(1);
    setTimeout(autoSlide, 30000); // Tự động chuyển ảnh sau mỗi 30 giây
}

document.addEventListener('DOMContentLoaded', (event) => {
    autoSlide();
});

window.addEventListener('scroll', function() {
    const navbar = document.getElementById('navbar');
    const scrollPosition = window.scrollY;
    
    if (scrollPosition > 50) {
        navbar.style.opacity = '0.5';
    } else {
        navbar.style.opacity = '1';
    }
});
