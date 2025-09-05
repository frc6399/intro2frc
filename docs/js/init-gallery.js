// init-gallery.js

function initGallery() {
    const container = document.getElementById('lightgallery');
    if (!container || container.children.length === 0) return;


    if (container.dataset.masonryInitialized === 'true') return;
    container.dataset.masonryInitialized = 'true';

    const masonry = new Masonry(container, {
        itemSelector: 'a',
        columnWidth: 240,
        gutter: 20,
        fitWidth: true,
        stagger: 30,
        transitionDuration: '0.3s'
    });

    const lightbox = lightGallery(container, {
        plugins: [],
        speed: 500,
        download: true,
        zoom: true,
        thumbnail: true,
        share: false,
        selector: 'a',
        animateThumb: true,
        showThumbByDefault: true,

        onOpen: () => {
            console.log('LightGallery opened');
        },
        onCloseAfter: () => {
            setTimeout(() => masonry.layout(), 500);
        }
    });

    container.querySelectorAll('img').forEach(img => {
        if (img.complete) {
            masonry.layout();
        } else {
            img.addEventListener('load', () => {
                masonry.layout();
            });
        }
    });
}

document$.subscribe(() => {
    requestAnimationFrame(() => {
        initGallery();
    })
});