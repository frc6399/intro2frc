<template>
    <div id="giscus-container"></div>
</template>

<script>
import { onMounted } from 'vue';

export default {
    name: 'GiscusComponent',
    setup() {
        onMounted(() => {
            loadGiscusScript();
        });

        function loadGiscusScript() {
            const script = document.createElement('script');
            script.src = 'https://giscus.app/client.js';
            script.async = true;
            script.crossOrigin = 'anonymous';
            script.onload = () => {
                console.log('Giscus script loaded');
            };
            script.onerror = () => {
                console.error('Failed to load Giscus script');
            };
            script.dataset.repo = 'frc6399/intro2frc';
            script.dataset.repoId = 'R_kgDOPqSTzw';
            script.dataset.category = 'General';
            script.dataset.categoryId = 'DIC_kwDOPqSTz84CvGXk';
            script.dataset.mapping = 'pathname';
            script.dataset.strict = '1';
            script.dataset.reactionsEnabled = '1';
            script.dataset.emitMetadata = '0';
            script.dataset.inputPosition = 'top';
            script.dataset.theme = 'preferred_color_scheme';
            script.dataset.lang = 'en';
            script.dataset.loading = 'lazy';

            document.getElementById('giscus-container').appendChild(script);
        }

        return {};
    },
};
</script>
