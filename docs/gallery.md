<div id="lightgallery" class="masonry-grid">
    <script>
        for (let i = 4; i >= 1; i--) {
            let paddedNumber = i.toString().padStart(3, '0');
            document.write(`<a href="${paddedNumber}.jpg"><img src="${paddedNumber}.jpg" loading="lazy"></a>`);
        }
    </script>
</div>
