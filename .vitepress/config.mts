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
    logo: '/hammer.png',
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Syllabus', link: '/syllabus' },
      { text: 'Discussion', link: '/discussion' },
      { text: 'Resources', link: '/resources' }
    ],

    sidebar: {
      '/': [
        {
          text: 'Getting Started',
          items: [
            { text: 'Syllabus', link: '/syllabus' },
            { text: 'Discussion', link: '/discussion' },
            { text: 'Resources', link: '/resources' }
          ]
        },
        {
          text: 'Programming with Java',
          items: [
            {
              text: '1. Intro & Env Setup', link: '/java/1', items: [
                { text: '1.1. Java History', link: '/java/1/1' },
                { text: '1.2. Installing JDK', link: '/java/1/2' },
                { text: '1.3. Setting Up VS Code', link: '/java/1/3' },
                { text: '1.4. Hello World Program', link: '/java/1/4' }
              ], collapsed: true
            },
            {
              text: '2. Syntax & Data Types', link: '/java/2', items: [
                { text: '2.1. Basic Program Structure', link: '/java/2/1' },
                { text: '2.2. Variables and Data Types', link: '/java/2/2' },
                { text: '2.3. Integer Operations', link: '/java/2/3' },
                { text: '2.4. Floating-Point Operations', link: '/java/2/4' },
                { text: '2.5. Boolean Operations', link: '/java/2/5' },
                { text: '2.6. Char Operations', link: '/java/2/6' }
              ],
              collapsed: true
            },
            {
              text: '3. Control Flow', link: '/java/3', items: [
                { text: '3.1. If Statements', link: '/java/3/1' },
                { text: '3.2. Switch Statements', link: '/java/3/2' },
                { text: '3.3. Loops', link: '/java/3/3' },
                { text: '3.4. Break and Continue', link: '/java/3/4' },
                { text: '3.5. Nested Control Structures', link: '/java/3/5' }
              ],
              collapsed: true
            },
            {
              text: '4. Arrays & Strings', link: '/java/4', items: [
                { text: '4.1. Array Initialization', link: '/java/4/1' },
                { text: '4.2. Accessing Array Elements', link: '/java/4/2' },
                { text: '4.3. Multi-dimensional Arrays', link: '/java/4/3' },
                { text: '4.4. String Manipulation', link: '/java/4/4' }
              ],
              collapsed: true
            },
            {
              text: '5. Methods & Functions', link: '/java/5', items: [
                // { text: '5.1. Defining Methods', link: '/java/5.1' },
                // { text: '5.2. Method Overloading', link: '/java/5.2' },
                // { text: '5.3. Recursion', link: '/java/5.3' },
                // { text: '5.4. Passing Arguments', link: '/java/5.4' }
              ],
              collapsed: true
            },
            {
              text: '6. Classes & Objects', link: '/java/6', items: [
                // { text: '6.1. Defining Classes', link: '/java/6.1' },
                // { text: '6.2. Constructors', link: '/java/6.2' },
                // { text: '6.3. Object-Oriented Principles', link: '/java/6.3' },
                // { text: '6.4. Static Members', link: '/java/6.4' },
                // { text: '6.5. Enumerations', link: '/java/6.5' }
              ],
              collapsed: true
            },
            {
              text: '7. Inheritance & Polymorphism', link: '/java/7', items: [
                // { text: '7.1. Basics of Inheritance', link: '/java/7.1' },
                // { text: '7.2. Method Overriding', link: '/java/7.2' },
                // { text: '7.3. Polymorphism in Java', link: '/java/7.3' },
                // { text: '7.4. Abstract Classes', link: '/java/7.4' }
              ],
              collapsed: true
            },
            {
              text: '8. Interfaces & Abstract Classes', link: '/java/8', items: [
                // { text: '8.1. Defining Interfaces', link: '/java/8.1' },
                // { text: '8.2. Implementing Interfaces', link: '/java/8.2' },
                // { text: '8.3. Abstract vs Interfaces', link: '/java/8.3' }
              ],
              collapsed: true
            },
            {
              text: '9. Exception Handling', link: '/java/9', items: [
                { text: '9.1. Try-Catch Blocks', link: '/java/9/1' },
                { text: '9.2. Multiple Catch Blocks', link: '/java/9/2' },
                { text: '9.3. Finally Block', link: '/java/9/3' },
                { text: '9.4. Throwing Exceptions', link: '/java/9/4' },
                { text: '9.5. Custom Exceptions', link: '/java/9/5' }
              ],
              collapsed: true
            },
            {
              text: '10. Supplier & Lambdas', link: '/java/10', items: [
                { text: '10.1. Supplier Interface', link: '/java/10/1' },
                { text: '10.2. Method References', link: '/java/10/2' },
                { text: '10.3. Lambda Expressions', link: '/java/10/3' },
                { text: '10.4. Supplier with Streams', link: '/java/10/4' }
              ],
              collapsed: true
            }
          ]
        },
        {
          text: 'Advanced FRC Programming',
          items: [
            {
              text: '0. FRC Environment Setup', link: '/wpilib/0',
              items: [
                { text: '0.1 Installing WPILib VS Code', link: '/wpilib/0.1' },
                { text: '0.2 Installing FRC Game Tools', link: '/wpilib/0.2' },
                { text: '0.3 Creating a WPILib Project', link: '/wpilib/0.3' }
              ],
              collapsed: true
            }, {
              text: '1. Time-based Programming',
              link: '/wpilib/1',
            },
            {
              text: '2. Advanced Motor Control',
              link: '/wpilib/2'
            },
            { text: '3. Creating a Subsystem', link: 'https://zzhangje.github.io/ddocc/tutorial/2.html' },
            { text: '4. Creating a Command', link: 'https://zzhangje.github.io/ddocc/tutorial/3.html' },
            { text: '5. Command-Based Programming', link: 'https://zzhangje.github.io/ddocc/tutorial/4.html' },
            { text: '6. Autonomous Programming', link: 'https://zzhangje.github.io/ddocc/tutorial/5.html' },
            { text: '7. Tuning & Optimization', link: '/wpilib/7' },
          ]
        }
      ],
    },

    search: {
      'provider': 'local',
    },

    socialLinks: [
      { icon: 'github', link: 'https://github.com/zzhangje/intro2frc' }
    ]
  }
})
