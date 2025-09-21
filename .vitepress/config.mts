import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  base: "/intro2frc/",
  head: [['link', { rel: 'icon', href: '/intro2frc/icon/frc6399.ico' }]],
  srcDir: "docs",

  title: "Introduction to FRC",
  description: "TBA",
  themeConfig: {
    // https://vitepress.dev/reference/default-theme-config
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Syllabus', link: '/syllabus' },
      { text: 'Java', link: '/java/1' },
      { text: 'Resources', link: '/resources' }
    ],

    sidebar: {
      '/': [
        {
          text: 'Getting Started',
          items: [
            { text: 'Syllabus', link: '/syllabus' },
            { text: 'Resources', link: '/resources' }
          ]
        }
      ],
      '/java/': [
        {
          text: 'Programming with Java',
          items: [
            { text: '1. Intro & Env Setup', link: '/java/1' },
            {
              text: '2. Syntax & Data Types', link: '/java/2', items: [
                { text: '2.1 Basic Program Structure', link: '/java/2.1' },
                { text: '2.2 Variables and Data Types', link: '/java/2.2' },
                { text: '2.3 Integer Operations', link: '/java/2.3' },
                { text: '2.4 Floating-Point Operations', link: '/java/2.4' },
                { text: '2.5 Boolean Operations', link: '/java/2.5' },
                { text: '2.6 Char and String Operations', link: '/java/2.6' }
              ],
              collapsed: true
            },
            { text: '3. Control Flow', link: '/java/3' },
            { text: '4. Loops & Arrays', link: '/java/4' },
            { text: '5. Methods & Functions', link: '/java/5' },
            { text: '6. Classes & Objects', link: '/java/6' },
            { text: '7. Inheritance & Polymorphism', link: '/java/7' },
            { text: '8. Interfaces & Abstract Classes', link: '/java/8' },
            { text: '9. Exception Handling', link: '/java/9' },
          ]
        }
      ],
    },

    search: {
      'provider': 'local',
    },

    socialLinks: [
      { icon: 'github', link: 'https://github.com/zzhangje/intro2frc' }
    ],

    outline: {
      level: [2, 3]
    }
  }
})
