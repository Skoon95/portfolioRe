var menu = document.querySelector('.intro > .container > .row > .media > .menu');


var menuOffsetTop = menu.offsetTop;


function handleScroll() {

    var scrollPosition = window.pageYOffset || document.documentElement.scrollTop;


    if (scrollPosition > menuOffsetTop) {

        menu.classList.add('fixed');
    } else {

        menu.classList.remove('fixed');
    }
}


window.addEventListener('scroll', handleScroll);