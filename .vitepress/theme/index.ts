// https://vitepress.dev/guide/custom-theme
import { h } from 'vue'
import type { Theme } from 'vitepress'
import DefaultTheme from 'vitepress/theme'

const isDev = process.env.NODE_ENV === 'development'

export default {
    extends: DefaultTheme,
    Layout: () => {
        return h(DefaultTheme.Layout, null, {
            'layout-bottom': () =>
                isDev ? null : [
                    h('script', {
                        defer: true,
                        src: 'https://cloud.umami.is/script.js',
                        'data-website-id': '61765fc4-2042-401e-801b-d8032e948a83',
                        style: 'display:none'
                    })
                ]
        })
    },
    enhanceApp({ app, router, siteData }) {
    }
} satisfies Theme
